package com.cemal.loginproject1.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cemal.loginproject1.dao.model.User;
import com.cemal.loginproject1.dao.repo.UserDAO;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	@Transactional
	@Override
	public List<User> get() {

		return userDAO.get();
	}

	@Transactional
	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public boolean findUser(String uname, String upwd) {
		// TODO Auto-generated method stub
		return userDAO.findUser(uname,upwd);
	}

	@Transactional
	@Override
	public boolean save(String username, String password){
		 return userDAO.save(username,password);

	}

	@Transactional
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
