package com.movie.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name="screens")
//@JsonIgnoreProperties("listOfScreens")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="screenId")
public class Screen {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="screen_id")
	private Integer screenId;
	

	
	@Column(name="screen_name")
	private String screenName;
	
	@Column(name="hall_width")
	private int hallWidth;
	
	@Column(name="hall_height")
	private int hallHeight;

	
	@OneToMany(mappedBy="screen",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Show> show;

	
	
	
	public Screen() {
		super();
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getHallWidth() {
		return hallWidth;
	}

	public void setHallWidth(int hallWidth) {
		this.hallWidth = hallWidth;
	}

	public int getHallHeight() {
		return hallHeight;
	}

	public void setHallHeight(int hallHeight) {
		this.hallHeight = hallHeight;
	}

	@JsonIgnore
	public List<Show> getShow() {
		return show;
	}

	public List<Show> getActiveShows() {
		List<Show> show=new ArrayList<Show>();
		for (Iterator<Show> iterator = this.show.iterator(); iterator.hasNext();) {
			Show object = (Show) iterator.next();
			if(object.getShowStartTime().isAfter(LocalDateTime.now())) {
				show.add(object);
			}
			return show;
			
		}
		return show;
	}

	public void setShow(List<Show> show) {
		this.show = show;
	}

	
	
	
	
}
