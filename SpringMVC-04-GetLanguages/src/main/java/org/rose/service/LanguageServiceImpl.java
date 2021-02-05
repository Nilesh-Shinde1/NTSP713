package org.rose.service;

import java.util.Locale;

public class LanguageServiceImpl implements ILanguageService {

	public Locale[] getAllLanguages() {
		Locale[] locale = Locale.getAvailableLocales();
//		System.out.println("locale : "+locale);
		return locale;
	}

}
