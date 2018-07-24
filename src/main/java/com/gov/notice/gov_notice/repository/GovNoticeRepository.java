package com.gov.notice.gov_notice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.gov.notice.gov_notice.entity.GovNotice;
@RestResource(path = "notices")
public interface GovNoticeRepository extends JpaRepository<GovNotice, Long>{

	
}
