package com.smartplace.placerecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smartplace.placerecom.entity.RecommendationEntity;
import com.smartplace.placerecom.service.RecommendationService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class RecommendationController {

    @Autowired
    RecommendationService recommendationService;

    @GetMapping("/getrecom")
    public List<RecommendationEntity> getRecom() {

        return recommendationService.getAllRecommendations();

    }

    @GetMapping("/getrecom/{id}")
    public RecommendationEntity getRecomByID(@PathVariable Long id) {

        return recommendationService.getRecommendationById(id);

    }

    @PostMapping("/addrecom")
    public String addRecom(@RequestBody RecommendationEntity recommendation) {

        return recommendationService.addRecommendation(recommendation);

    }

    @GetMapping("/getrecom/mood/{moodname}")
    public List<RecommendationEntity> getRecomByMood(@PathVariable String moodname) {

        return recommendationService.getRecommendationByMood(moodname);

    }

}