/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.security.service;

import com.erp.security.model.AuthorizedGroups;
import com.erp.security.model.Token;
import com.erp.security.model.User;
import java.util.List;

/**
 *
 * @author ronnie
 */
public interface UserDetailsService{
    
    public User getUser(int userID);

    public User getUserByEmail(String emailAddress);
    
    public boolean saveUser(Token token);
    
    public boolean saveUser(User user);
    
    public boolean updateToken(Token token);
    
    public boolean updateToken(User user);

    public User findByUserCodeAndPassword(String username, String password);       
    
    public List<User> getAllUsers();
    
    public User findUserByUserCode(String userCode);
    
    public AuthorizedGroups findByAuthorizedGroupsName(String authorizedGroupsName);
    
    public boolean saveAuthorizedGroups(AuthorizedGroups authorizedGroups);
    
    public int count();
    
    public User findByUsernameAndPassword(String username, String password);
    
    public User findByUsername(String username);
    
}
