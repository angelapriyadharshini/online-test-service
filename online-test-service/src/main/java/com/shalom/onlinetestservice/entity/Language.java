package com.shalom.onlinetestservice.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="language")
public class Language {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String languageTitle;
	
	@Column(name="logo")
	private byte[] logo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguageTitle() {
		return languageTitle;
	}

	public void setLanguageTitle(String languageTitle) {
		this.languageTitle = languageTitle;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "Language [id=" + id + ", languageTitle=" + languageTitle + ", logo=" + Arrays.toString(logo) + "]";
	}
}
