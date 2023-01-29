package com.isaalves.consumoAPI.dtos;

public class NutritionDTO {

	private Double carbohydrates;
	private Double protein;
	private Double fat;
	private Double calories;
	private Double sugar;
	
	public NutritionDTO() {
	}

	public NutritionDTO(Double carbohydtares, Double protein, Double fat, Double calories, Double sugar) {
	this.carbohydrates = carbohydtares;
	this.protein = protein;
	this.fat = fat;
	this.calories = calories;
	this.sugar = sugar;
	}
	
	public Double getCarbohydtares() {
	return carbohydrates;
	}
	
	public void setCarbohydtares(Double carbohydtares) {
	this.carbohydrates = carbohydtares;
	}
	
	public Double getProtein() {
	return protein;
	}
	
	public void setProtein(Double protein) {
	this.protein = protein;
	}
	
	public Double getFat() {
	return fat;
	}
	
	public void setFat(Double fat) {
	this.fat = fat;
	}
	
	public Double getCalories() {
	return calories;
	}
	
	public void setCalories(Double calories) {
	this.calories = calories;
	}
	
	public Double getSugar() {
	return sugar;
	}
	
	public void setSugar(Double sugar) {
	this.sugar = sugar;
	}

}
