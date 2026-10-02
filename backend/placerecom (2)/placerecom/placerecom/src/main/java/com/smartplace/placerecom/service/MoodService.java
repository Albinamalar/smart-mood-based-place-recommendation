package com.smartplace.placerecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartplace.placerecom.entity.MoodEntity;
import com.smartplace.placerecom.repository.MoodRepo;

@Service
public class MoodService {

    @Autowired
    MoodRepo moodrepo;

    public MoodEntity getMoodById(Long id) {

        Optional<MoodEntity> mood = moodrepo.findById(id);

        if (mood.isPresent()) {
            return mood.get();
        }

        return null;
    }

    public List<MoodEntity> getAllMoods() {

        return moodrepo.findAll();

    }

    public String addMood(MoodEntity mood) {

        moodrepo.save(mood);

        return "Mood Added Successfully";

    }

}