package com.erp.security.model;

import com.erp.security.DESEDE;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "token",
        uniqueConstraints= @UniqueConstraint(columnNames={"username"}))
public class Token implements Serializable {
	
	
	private static final long serialVersionUID = -2020752748932592756L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tokenId;
	private String username;
	private String password;

    @OneToOne(mappedBy = "token")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getTokenId() {
		return tokenId;
	}
	public void setTokenId(Long tokenId) {
		this.tokenId = tokenId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
        DESEDE desede = new DESEDE(this.username);
        this.password = desede.encrypt(password);
	}

}
