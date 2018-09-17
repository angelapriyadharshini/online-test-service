package com.shalom.onlinetestservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shalom.onlinetestservice.dao.ILanguageDAO;
import com.shalom.onlinetestservice.entity.Language;

@Service
public class LanguageService implements ILanguageService {

	@Autowired
	private ILanguageDAO languageDAO;
	
	@Override
	@Transactional
	public List<Language> getLanguages() {
		return languageDAO.getLanguages();
	}

}
