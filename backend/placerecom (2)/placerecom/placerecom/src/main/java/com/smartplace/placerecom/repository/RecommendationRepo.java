package com.smartplace.placerecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartplace.placerecom.entity.RecommendationEntity;

public interface RecommendationRepo extends JpaRepository<RecommendationEntity, Long> {

	List<RecommendationEntity> findByMoodName(String moodname);
}
