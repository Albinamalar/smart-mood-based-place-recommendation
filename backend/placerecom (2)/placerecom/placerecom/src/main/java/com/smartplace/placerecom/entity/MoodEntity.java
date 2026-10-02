package com.smartplace.placerecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="moods")
public class MoodEntity {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id;
     private String moodName;
     private String description;
	 public MoodEntity() {
		super();
	 }
	 public MoodEntity(Long id, String moodName, String description) {
		super();
		this.id = id;
		this.moodName = moodName;
		this.description = description;
	 }
	 public Long getId() {
		 return id;
	 }
	 public void setId(Long id) {
		 this.id = id;
	 }
	 public String getMoodName() {
		 return moodName;
	 }
	 public void setMoodName(String moodName) {
		 this.moodName = moodName;
	 }
	 public String getDescription() {
		 return description;
	 }
	 public void setDescription(String description) {
		 this.description = description;
	 }
	 @Override
	 public String toString() {
		return "MoodEntity [id=" + id + ", moodName=" + moodName + ", description=" + description + "]";
	 }
	 
     
}
