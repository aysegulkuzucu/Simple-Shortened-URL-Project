package com.project.shortenedurl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.shortenedurl.entity.Url;
import com.project.shortenedurl.service.UrlService;

@RestController
@RequestMapping("url/create")
@CrossOrigin(origins = "http://localhost:8080")
public class UrlController {

    @Autowired
    private  UrlService urlService;

    @GetMapping("/{id}")
    public String getOriginlUrl(@PathVariable String id) {
        return urlService.getOriginlUrl(id);
    }

    @PostMapping
    public Url generateShortUrl(@RequestBody String url) {
        return urlService.generateShortUrl(url);
    }
    

    

	@DeleteMapping("/id") // birisi sipesifik bir user icin delete istegi attiginda
	public void deleteOneUrl(@PathVariable String id) {
		urlService.deleteById(id);
	}

}
