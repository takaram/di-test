package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondComponent {
	@Autowired
	private FirstComponent firstComponent;

	public SecondComponent() {
		System.out.println("SecondComponent()");
	}

	@Override
	public String toString() {
		return "SecondComponent [firstComponent=" + firstComponent + "]";
	}

	public FirstComponent getFirstComponent() {
		return firstComponent;
	}
}
