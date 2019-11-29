package com.cemal.loginproject1.dao.repo;



import java.util.List;

import javax.transaction.Transactional;

import com.cemal.loginproject1.dao.model.User;

public interface UserDAO {
 public boolean findUser(String uname, String upwd);
List<User> get();
User get(int id);
User save(User user);
void delete(int id);
public boolean save(String username, String password);
}
