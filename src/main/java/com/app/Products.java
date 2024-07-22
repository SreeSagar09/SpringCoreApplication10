package com.app;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Products {
	private List<String> names;
	private Set<String> models;
	private Map<String, Double> price;
	private Properties notes;
	
	public Products() {
		super();
	}

	public Products(List<String> names, Set<String> models, Map<String, Double> price, Properties notes) {
		super();
		this.names = names;
		this.models = models;
		this.price = price;
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Products [names=" + names + ", models=" + models + ", price=" + price + ", notes=" + notes + "]";
	}
	
}
