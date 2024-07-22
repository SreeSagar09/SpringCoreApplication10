package com.app.config;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.Products;

@Configuration
public class AppConfig {
	
	@Bean
	public List<String> getNamesLsit(){
		List<String> namesList = new ArrayList<>();
		namesList.add("IPhone");
		namesList.add("Oppo");
		
		return namesList;
	}
	
	@Bean
	public Set<String> getModelsSet(){
		Set<String> modelsList = new LinkedHashSet<>();
		modelsList.add("15Pro");
		modelsList.add("OP13");
		
		return modelsList;
	}
	
	@Bean
	public Map<String, Double> getPriceMap(){
		Map<String, Double> priceMap = new LinkedHashMap<>();
		priceMap.put("IPhone", 1200.00);
		priceMap.put("Oppo", 1000.00);
		
		return priceMap;
	}
	
	@Bean
	public Properties getNotesProperties() {
		Properties notesProperties = new Properties();
		notesProperties.put("3", "Bad");
		notesProperties.put("2", "Good");
		notesProperties.put("1", "Very Good");
		
		return notesProperties;
	}
	
	@Bean Products getProducts() {
		Products products = new Products(getNamesLsit(), getModelsSet(), getPriceMap(), getNotesProperties());
		
		return products;
	}
}
