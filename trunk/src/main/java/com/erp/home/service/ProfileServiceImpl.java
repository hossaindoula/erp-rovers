package com.erp.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Rony
 * Date: 12/27/13
 * Time: 9:33 PM
 * To change this template use File | Settings | File Templates.
 */
@Service("springService")
@RemoteProxy(name="profileService")
@Transactional
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private MomentDao momentsDao;

    private HttpSession userSession;

    private final LinkedList messages = new LinkedList();

    @Override
    @RemoteMethod
    public String save(final String momentText) {
        userSession = SessionUtil.getSession();
        final User user = (User)userSession.getAttribute(DMConstants.SESSION_USER);
        final Moment moment = new Moment();
        moment.setText(momentText);
        moment.setMomentDate(new Date());
        moment.setUser(user);

        momentsDao.save(moment);

        Util.setValue("tapost", "");


        // For all the browsers on the current page:

        Browser.withCurrentPage(new Runnable() {
            public void run() {
                String momentBox = "";

                List<Moment> moments = momentsDao.findAllMomentsByUser(user);
                Collections.reverse(moments);

                momentBox = "";
                for(Moment momentObj : moments){
                    momentBox+=     "<div class='tl-post'>";
                    momentBox+=         "<div class='tl-author'>";
                    momentBox+=             "<div class='tl-thumb'><img src='/damoments/resources/images/photos/thumb2.png' alt=''></div>";
                    momentBox+=             "<h5><a href=''>"+user.getToken().getUsername()+"</a> <small>25 minutes ago</small></h5>";
                    momentBox+=         "</div>";
                    momentBox+=         "<div class='tl-body'>";
                    momentBox+=             "<p id='userMomentText_"+momentObj.getId()+"'>"+momentObj.getText()+"</p>";
                    momentBox+=         "</div>";
                    momentBox+=         "<div class='tl-action'>";
                    momentBox+=             "<a href='#'><i class='iconfa-heart'></i> Like</a>";
                    momentBox+=             "<a href='#'><i class='iconfa-comment'></i> Comment</a>";
                    momentBox+=             "<a href='#'><i class='iconfa-share-alt'></i> Share</a>";
                    momentBox+=         "</div>";
                    momentBox+=         "<div class='tl-comments'>";
                    momentBox+=             "<ul>";
                    momentBox+=                 "<li class=\"c-input\">";
                    momentBox+=                     "<div class=\"c-thumb\"><img src=\"/damoments/resources/images/photos/thumb2.png\" alt=\"\" /></div>";
                    momentBox+=                     "<div class=\"c-text\">";
                    momentBox+=                     "<input type=\"text\" class=\"span7\" placeholder=\"Write a comment\" />";
                    momentBox+=                     "</div>";
                    momentBox+=                 "</li>";
                    momentBox+=             "</ul>";
                    momentBox+=         "</div>";
                    momentBox+=     "</div>";
                }

                Util.setValue("newMoment", momentBox, false);
            }
        });



        return momentText;
    }

    @Override
    public String save(Moment moment) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean save(Album album) {
        //return momentsDao.save(album);
        return false;
    }

    @Override
    public boolean delete(Moment moment) {
        return momentsDao.delete(moment);
    }

    @Override
    public boolean update(Moment moment) {
        return momentsDao.update(moment);
    }

    @Override
    public Moment getMomentById(int moment) {
        return momentsDao.get(moment);
    }

    @Override
    public List<Moment> findAllMoments() {
        return momentsDao.findAllMoments();
    }

    @Override
    @RemoteMethod
    public String findAllMomentsBySessionUser() {
        userSession = SessionUtil.getSession();
        final User user = (User)userSession.getAttribute(DMConstants.SESSION_USER);
        String momentText = "";



        Browser.withCurrentPage(new Runnable() {
            public void run() {
                String momentBox = "";

                List<Moment> moments = momentsDao.findAllMomentsByUser(user);
                Collections.reverse(moments);

                momentBox = "";
                for(Moment momentObj : moments){
                    momentBox+=     "<div class='tl-post'>";
                    momentBox+=         "<div class='tl-author'>";
                    momentBox+=             "<div class='tl-thumb'><img src='/damoments/resources/images/photos/thumb2.png' alt=''></div>";
                    momentBox+=             "<h5><a href=''>"+user.getToken().getUsername()+"</a> <small>25 minutes ago</small></h5>";
                    momentBox+=         "</div>";
                    momentBox+=         "<div class='tl-body'>";
                    momentBox+=             "<p id='userMomentText_"+momentObj.getId()+"'>"+momentObj.getText()+"</p>";
                    momentBox+=         "</div>";
                    momentBox+=         "<div class='tl-action'>";
                    momentBox+=             "<a href='#'><i class='iconfa-heart'></i> Like</a>";
                    momentBox+=             "<a href='#'><i class='iconfa-comment'></i> Comment</a>";
                    momentBox+=             "<a href='#'><i class='iconfa-share-alt'></i> Share</a>";
                    momentBox+=         "</div>";
                    momentBox+=         "<div class='tl-comments'>";
                    momentBox+=             "<ul>";
                    momentBox+=                 "<li class=\"c-input\">";
                    momentBox+=                     "<div class=\"c-thumb\"><img src=\"/damoments/resources/images/photos/thumb2.png\" alt=\"\" /></div>";
                    momentBox+=                     "<div class=\"c-text\">";
                    momentBox+=                     "<input type=\"text\" class=\"span7\" placeholder=\"Write a comment\" />";
                    momentBox+=                     "</div>";
                    momentBox+=                 "</li>";
                    momentBox+=             "</ul>";
                    momentBox+=         "</div>";
                    momentBox+=     "</div>";
                }

                Util.setValue("newMoment", momentBox, false);
            }
        });



        return momentText;
    }

    @Override
    public List<Moment> findAllMomentsByUser(User user) {
        return momentsDao.findAllMomentsByUser(user);
    }
}