package com.example.di;

import org.springframework.stereotype.Component;

@Component
public class FirstComponent {
	public FirstComponent() {
		System.out.println("FirstComponent()");
	}

	@Override
	public String toString() {
		return "FirstComponent []";
	}
}
