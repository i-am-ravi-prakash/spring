package com.ravi.springlearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ravi.springlearning.scope.PersonDAO;

@SpringBootApplication
public class SpringLearningScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringLearningScopeApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringLearningScopeApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("PersonDAO: " + personDAO);
		LOGGER.info("PersonDAO JDBC Connection: " + personDAO.getJdbcConnection());
		
		LOGGER.info("PersonDAO2: " + personDAO2);
		LOGGER.info("PersonDAO2 JDBC Connection: " + personDAO2.getJdbcConnection());
	}
}
