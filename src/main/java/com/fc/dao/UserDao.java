package com.fc.dao;

import com.fc.bean.User;
import java.util.List;


public interface UserDao {
    List<User> findAll();
}
