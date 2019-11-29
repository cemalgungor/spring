package com.cemal.loginproject1.dao.repo;

import java.util.List;

import javax.persistence.EntityManager;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.cemal.loginproject1.dao.model.User;


import org.hibernate.Session;
import org.hibernate.query.Query;

@Repository
public class UserDAOImpl implements UserDAO {
  @Autowired
  private EntityManager entityMenager;
    
	@Override
	public List<User> get() {
	          Session currentSession=entityMenager.unwrap(Session.class);
	     
	          
			Query<User> query=(Query<User>) ((EntityManager) currentSession).createQuery("from User"  , User.class);
			List<User> list=query.getResultList();
			
		
			return list;
	
	}
	
    //find user from database
	@Override
	public boolean findUser(String uname, String upwd) {
		// TODO Auto-generated method stub
		boolean isValidUser = false;
		Session currentSession=entityMenager.unwrap(Session.class);
		String hql = "from User u where u.username= :uname and u.password= :upwd";
		 Query<User> query=(Query<User>) ((EntityManager) currentSession).createQuery(hql  , User.class).setParameter("uname", uname).setParameter("upwd", upwd);
	     List<User> list=query.getResultList();
	     if(list.size() > 0) {
           
             isValidUser = true;
         }
	     System.out.println(list.size());
	     
	     return isValidUser;
	}


	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
    //save user to database
	@Override
	public boolean save(String username,String password) {
		
		boolean isValidUser = false;
		System.out.println(username);
		Session currentSession=entityMenager.unwrap(Session.class);
		String hql = "from User u where u.username= :username";
		Query<User> query=(Query<User>) ((EntityManager) currentSession).createQuery(hql  , User.class).setParameter("username", username);
	    List<User> list=query.getResultList();
		
		if(list.size()>0) {
			return false;
		}
	        
	        //Add new Employee object
	        User us = new User();
	        us.setUsername(username);
	        us.setPassword(password);
	        currentSession.save(us);
	       
	         isValidUser=findUser(username,password);
		 System.out.println(isValidUser);
		if(isValidUser) {
			isValidUser = true;
		}
	     
	     return isValidUser;
		

	   
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
