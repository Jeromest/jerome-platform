package com.jerome.jeromeplatform.system.service.impl;

import com.jerome.jeromeplatform.system.dao.UserDao;
import com.jerome.jeromeplatform.system.entity.User;
import com.jerome.jeromeplatform.system.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements UserService {

}