package com.smartplace.placerecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartplace.placerecom.entity.RecommendationEntity;
import com.smartplace.placerecom.repository.RecommendationRepo;

@Service
public class RecommendationService {

    @Autowired
    RecommendationRepo recomrepo;

    public List<RecommendationEntity> getAllRecommendations() {
        return recomrepo.findAll();
    }

    public RecommendationEntity getRecommendationById(Long id) {

        Optional<RecommendationEntity> recommendation = recomrepo.findById(id);

        if(recommendation.isPresent()) {
            return recommendation.get();
        }

        return null;
    }

    public String addRecommendation(RecommendationEntity recommendation) {

        recomrepo.save(recommendation);

        return "Added Successfully";
    }

    public List<RecommendationEntity> getRecommendationByMood(String moodName) {

        return recomrepo.findByMoodName(moodName);

    }

}