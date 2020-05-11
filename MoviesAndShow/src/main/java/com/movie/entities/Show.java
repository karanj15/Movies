package com.movie.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@Table(name="shows")
@DynamicUpdate
@DynamicInsert
//@JsonIgnoreProperties("show")

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="showId",scope=Show.class)
public class Show {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="show_id")
	private Integer showId;
	
	
	@Column(name="show_start_time")
	private LocalDateTime showStartTime;
	
	@Column(name="show_end_time")
	private LocalDateTime showEndTime;
	
	
	
	
	@Column(name="show_name")
	private String showName;
	
	@OneToOne
	@JoinColumn(name="movie_id",referencedColumnName="movie_id")
	private Movie movie;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="screen_id")
	private Screen screen;
	
	

	public Show() {
		super();
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(LocalDateTime showStartTime) {
		this.showStartTime = showStartTime;
	}

	public LocalDateTime getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(LocalDateTime showEndTime) {
		this.showEndTime = showEndTime;
	}

	
	

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	@JsonIgnore
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@JsonIgnore
	public Screen getScreen() {
		return screen;
	}

	public String getScreenName() {
		return screen.getScreenName();
	}
	
	public Integer getScreenId()
	{
		return screen.getScreenId();
	}

	public void setScreen(Screen screenId) {
		this.screen = screenId;
	}


	
	
	
	
}
