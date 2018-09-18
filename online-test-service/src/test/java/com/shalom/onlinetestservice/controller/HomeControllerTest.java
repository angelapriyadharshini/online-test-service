package com.shalom.onlinetestservice.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shalom.onlinetestservice.service.ILanguageService;

public class HomeControllerTest {

	@Autowired
	private ILanguageService languageServiceMock;
	public HomeControllerTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void should_ReturnAllLanguages_When_GetLanguagesMethodCalled() {
		
	}
}
