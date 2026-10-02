package com.smartplace.placerecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smartplace.placerecom.entity.MoodEntity;
import com.smartplace.placerecom.service.MoodService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class MoodController {

    @Autowired
    MoodService moodService;

    @GetMapping("/mood/{id}")
    public MoodEntity getMood(@PathVariable Long id) {

        return moodService.getMoodById(id);

    }

    @GetMapping("/moods")
    public List<MoodEntity> getAllMoods() {

        return moodService.getAllMoods();

    }

    @PostMapping("/addmood")
    public String addMood(@RequestBody MoodEntity mood) {

        return moodService.addMood(mood);

    }

}