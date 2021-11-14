package com.chaima.users.service;

import com.chaima.users.entities.Role;
import com.chaima.users.entities.User;
public interface UserService {
 User saveUser(User user);
 User findUserByUsername (String username);
  Role addRole(Role role);
  User addRoleToUser(String username, String rolename);
}