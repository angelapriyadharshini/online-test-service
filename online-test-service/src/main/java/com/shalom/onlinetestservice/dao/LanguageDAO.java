package com.shalom.onlinetestservice.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shalom.onlinetestservice.entity.Language;

@Repository
public class LanguageDAO implements ILanguageDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Language> getLanguages() {
		Session session = sessionFactory.getCurrentSession();
		Query<Language> query = session.createQuery("from Language",Language.class);
		List<Language> languages = query.getResultList();
		return languages;
	}

}
