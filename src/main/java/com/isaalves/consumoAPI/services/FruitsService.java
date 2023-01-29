package com.isaalves.consumoAPI.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.isaalves.consumoAPI.dtos.FruitDTO;

@Service
public class FruitsService {

	public FruitDTO getFruitByName(String name) {
	String fooResourceUrl = "https://fruityvice.com/api/fruit/";
	
	RestTemplate restTemplate = new RestTemplate();
	return restTemplate.getForEntity(fooResourceUrl + "/" + name, FruitDTO.class).getBody();
	}
	
	public List<FruitDTO> getFruitsByFamily(String name) {
	String fooResourceUrl = "https://fruityvice.com/api/fruit/family/";
	
	RestTemplate restTemplate = new RestTemplate();
	FruitDTO[] fruit =  restTemplate.getForEntity(fooResourceUrl + "/" + name, FruitDTO[].class).getBody();
	return Arrays.asList(fruit);
	}
}