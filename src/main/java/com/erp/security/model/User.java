package com.erp.security.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("admin")
@Table(name = "user_auth")
public class User implements Serializable {
	
	private static final long serialVersionUID = 7389991231663740924L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long authorizeId;
	
	@OneToOne
	private Token token;
	private boolean active;
	
	@ManyToMany
	private List<AuthorizedGroups> authorizedGroups; 
	
	
	public List<AuthorizedGroups> getAuthorizedGroups() {
		return authorizedGroups;
	}
	public void setAuthorizedGroups(List<AuthorizedGroups> authorizedGroups) {
		this.authorizedGroups = authorizedGroups;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Long getAuthorizeId() {
		return authorizeId;
	}
	public void setAuthorizeId(Long authorizeId) {
		this.authorizeId = authorizeId;
	}
	public Token getToken() {
		return token;
	}
	public void setToken(Token token) {
		this.token = token;
	}
	
	
	
}
