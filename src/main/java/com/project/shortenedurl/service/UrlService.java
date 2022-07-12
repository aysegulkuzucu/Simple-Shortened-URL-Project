package com.project.shortenedurl.service;

import static com.project.shortenedurl.logic.GenerateShortUrl.getShortUrl;
import static com.project.shortenedurl.logic.GenerateShortUrl.isUrlValid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shortenedurl.entity.Url;
import com.project.shortenedurl.repository.UrlRepository;

@Service
public class UrlService {
    @Autowired
    private UrlRepository urlRepository;


    public String getOriginlUrl(String id) {
        return urlRepository.findByShortUrl(id);
    }

    public Url generateShortUrl(String url) {
        if(! isUrlValid(url)) {
            System.out.println("URL is not valid");
            return null;
        }

        Url urlObject = new Url();
        urlObject.setOriginalurl(url);
        urlObject.setShorturl(getShortUrl(url));

        return urlRepository.save(urlObject);
    }


	public void deleteById(String id) {
		urlRepository.deleteById(null);		
	}
	



}