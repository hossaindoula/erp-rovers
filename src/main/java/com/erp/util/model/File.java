package com.erp.util.model;

import com.erp.security.model.User;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/30/13
 * Time: 6:57 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "file_type", discriminatorType = DiscriminatorType.STRING)
public abstract class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String prefix;
    private String generatedName;
    private String postfix;
    private String extension;
    private String mimeType;
    private Date addedDate;
    private User uploadedBy;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    public String getGeneratedName() {
        return generatedName;
    }
    public void setGeneratedName(String generatedName) {
        this.generatedName = generatedName;
    }
    public String getPostfix() {
        return postfix;
    }
    public void setPostfix(String postfix) {
        this.postfix = postfix;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public String getMimeType() {
        return mimeType;
    }
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
    public Date getAddedDate() {
        return addedDate;
    }
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }
    public User getUploadedBy() {
        return uploadedBy;
    }
    public void setUploadedBy(User uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

}
