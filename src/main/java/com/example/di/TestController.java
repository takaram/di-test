package com.example.di;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
	@Autowired
	private FirstComponent firstComponent;

	@Autowired
	private SecondComponent secondComponent;

	public TestController() {
		System.out.println("TestController(): firstComponent=" + firstComponent
				+ ", secondComponent=" + secondComponent);
	}

	@PostConstruct
	public void init() {
		System.out.println("TestController.init(): firstComponent=" + firstComponent
				+ ", secondComponent=" + secondComponent);
		System.out.println(firstComponent == secondComponent.getFirstComponent());
	}
}
