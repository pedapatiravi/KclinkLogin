package com.infy.loginservice;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.bean.User;
import com.infy.dataaccess.LoginDaoImpl;
import com.infy.entity.UserEntity;

@Service
public class LoginServiceImpl {
	Logger logger=Logger.getLogger(LoginServiceImpl.class);

	@Autowired
	LoginDaoImpl loginDaoImpl;

	public boolean loginCheck(User user) {
	 logger.info("service @ loginCheck()");
		List<UserEntity> entity = loginDaoImpl.getUser();
		return verifyUser(entity, user);
	}

	public boolean verifyUser(List<UserEntity> entity, User user) {
		logger.info("service @ verifyUser()");
		boolean flag = false;

		for (UserEntity ravi : entity) {
			if (ravi.getUser_name().equals(user.getUser_name())
					&& ravi.getUser_password().equals(user.getUser_password())) {
				flag = true;
			}
		}

		return flag;
	}

}
