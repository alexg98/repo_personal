package com.example.activitydemo;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ActivityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivityDemoApplication.class, args);
	}
	
	@RestController
	public static class MyRestController {
		
		@Autowired
		private RuntimeService runtimeService;
		
		@RequestMapping(value="/start-my-process", method = RequestMethod.GET)
		public void startMyProcess() {
			runtimeService.startProcessInstanceByKey("TestProcess");
			System.out.println("We have now " + runtimeService.createProcessInstanceQuery().count() + " processes instances");
		}
	} 
}
