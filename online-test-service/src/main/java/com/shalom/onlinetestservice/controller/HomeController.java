package com.shalom.onlinetestservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shalom.onlinetestservice.entity.Language;
import com.shalom.onlinetestservice.service.ILanguageService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private ILanguageService languageService;
	
	@GetMapping("/languages")
	public List<Language> getLanguages(){
		return languageService.getLanguages();
	}

}
