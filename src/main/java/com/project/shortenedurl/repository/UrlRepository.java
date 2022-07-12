package com.project.shortenedurl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.shortenedurl.entity.Url;

public interface UrlRepository extends JpaRepository<Url, Integer>{
	
	 @Query(value = "select originalurl from Url where shorturl = ?1", nativeQuery = true)
	 String findByShortUrl(String id);



}
