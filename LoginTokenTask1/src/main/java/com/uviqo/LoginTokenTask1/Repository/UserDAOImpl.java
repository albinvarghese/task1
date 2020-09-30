package com.uviqo.LoginTokenTask1.Repository;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uviqo.LoginTokenTask1.Model.UserDTO;



@Repository
public class UserDAOImpl {

    @Autowired
    private EntityManager em;

    public UserDTO save(UserDTO user) {
    	
        Session session = em.unwrap(Session.class);
        
        session.persist(user);
        
        return user;
    }

 }
