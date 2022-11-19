package com.ravi.springlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ravi.springlearning.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringLearningBasicApplication {
	private static int[] arr = { 6, 16, 4, 10, 1, 9 };
	private static int key = 4;

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringLearningBasicApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		// System.out.println(binarySearch);

		int resultIndex = binarySearch.binarySearch(arr, key);
		System.out.println(resultIndex);
	}
}
