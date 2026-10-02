package com.smartplace.placerecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="recommendations")
public class RecommendationEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String moodName;
	private String placeType;
	public RecommendationEntity() {
		super();
	}
	public RecommendationEntity(Long id, String moodName, String placeType) {
		super();
		this.id = id;
		this.moodName = moodName;
		this.placeType = placeType;
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
	public String getPlaceType() {
		return placeType;
	}
	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}
	@Override
	public String toString() {
		return "RecommendationEntity [id=" + id + ", moodName=" + moodName + ", placeType=" + placeType + "]";
	}
    
}
