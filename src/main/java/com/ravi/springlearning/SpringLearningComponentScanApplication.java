package com.ravi.springlearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ravi.springlearning.componentscope.ComponentDAO;
import com.ravi.springlearning.scope.PersonDAO;

@SpringBootApplication
public class SpringLearningComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringLearningComponentScanApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringLearningComponentScanApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("ComponentDAO: " + componentDAO);
	}
}
