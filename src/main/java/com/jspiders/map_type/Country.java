package com.jspiders.map_type;

import java.util.Map;

public class Country 
{
    private String name;
    @Override
	public String toString() {
		return "Country [name=" + name + ", stateandlanguage=" + stateandlanguage + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getStateandlanguage() {
		return stateandlanguage;
	}
	public void setStateandlanguage(Map<String, String> stateandlanguage) {
		this.stateandlanguage = stateandlanguage;
	}
	private Map<String, String> stateandlanguage;
}
