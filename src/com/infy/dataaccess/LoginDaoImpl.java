package com.infy.dataaccess;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.infy.entity.UserEntity;

@Repository
public class LoginDaoImpl {
	
	Logger logger=Logger.getLogger(LoginDaoImpl.class);

	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Transactional(propagation=Propagation.REQUIRED)
	public List<UserEntity> getUser() {
		logger.info("LoginDaoImpl@getUser()");
		List<UserEntity> entity = new ArrayList<UserEntity>();
		try {
			
			Criteria criteria = sessionFactory.openSession().createCriteria(UserEntity.class);
			entity = criteria.list();

		} catch (HibernateException e) {
			logger.error("error message is:"+e);
			e.printStackTrace();
		}
		return entity;
	}
}
