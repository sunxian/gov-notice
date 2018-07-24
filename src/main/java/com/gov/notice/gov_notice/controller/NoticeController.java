package com.gov.notice.gov_notice.controller;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gov.notice.gov_notice.entity.GovNotice;
import com.gov.notice.gov_notice.repository.GovNoticeRepository;


@RestController
public class NoticeController {
	@Autowired
	GovNoticeRepository govNoticeRepository;
	
	@GetMapping("notice")
	public List<GovNotice> list() {
		
		List<GovNotice> users=govNoticeRepository.findAll();

		return users;
        
		  
		
	}
}
