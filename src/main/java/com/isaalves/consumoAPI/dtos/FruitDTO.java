package com.isaalves.consumoAPI.dtos;

public class FruitDTO {

	private String name;
	private String family;
	private NutritionDTO nutritions;
	
	public FruitDTO() {
	}
	
	public FruitDTO(String name, String family, NutritionDTO nutritions) {
	this.name = name;
	this.family = family;
	this.nutritions = nutritions;
	}
	
	public String getName() {
	return name;
	}
	
	public void setName(String name) {
	this.name = name;
	}
	
	public String getFamily() {
	return family;
	}
	
	public void setFamily(String family) {
	this.family = family;
	}
	
	public NutritionDTO getNutritions() {
	return nutritions;
	}
	
	public void setNutritions(NutritionDTO nutritions) {
	this.nutritions = nutritions;
	}
}
