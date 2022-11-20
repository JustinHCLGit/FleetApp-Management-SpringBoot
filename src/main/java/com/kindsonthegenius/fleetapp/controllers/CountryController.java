package com.kindsonthegenius.fleetapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.services.CountryService;

@Controller
public class CountryController {
	
	@Autowired//autowiring service into the controller
	private CountryService countryService;
	
	@GetMapping("/countries")
	public String getCountries(Model model)//function to return html page
	{
		List<Country> countryList = countryService.getCountries();//passes country list from service to html page
		model.addAttribute("countries", countryList);
		return "country";
	};
	
	@PostMapping("/countries/addNew")
	public String addNew(Country country)
	{
		countryService.save(country);
		return "redirect:/countries";
	}
}
