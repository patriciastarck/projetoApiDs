package com.devs.proj.dto;

import com.devs.proj.entities.Game;

public class GameMinDto {

	private Long id;
	
	private String title;	
	
	private Integer year;	
	
	private String imgUrl;
	
	private String shortDescription;

	public GameMinDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GameMinDto(Game entity) {
		super();
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
}
