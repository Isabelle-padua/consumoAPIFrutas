package com.isaalves.consumoAPI.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.isaalves.consumoAPI.dtos.FruitDTO;
import com.isaalves.consumoAPI.services.FruitsService;

@Controller
@RequestMapping("fruit")
public class FruitsResource {

	@Autowired
	private FruitsService service;
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	    public ResponseEntity<FruitDTO> GetFruitByName(@PathVariable(value = "name") String name)
	    {
	        FruitDTO fruit = service.getFruitByName(name);
	        return new ResponseEntity<FruitDTO>(fruit, HttpStatus.OK);
	    }
	
	@RequestMapping(value = "/family/{name}", method = RequestMethod.GET)
	    public ResponseEntity<List<FruitDTO>> GetFruitsByFamily(@PathVariable(value = "name") String name)
	    {
	        List<FruitDTO> fruits = service.getFruitsByFamily(name);
	        return new ResponseEntity<List<FruitDTO>>(fruits, HttpStatus.OK);
	    }
}