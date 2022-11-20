package com.kindsonthegenius.fleetapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired//autowiring bean into service
	private CountryRepository countryRepository; //Repository name
	
	//return list of countries
	public List<Country> getCountries() //List<Country> is model file name
	{
		return countryRepository.findAll();
	}
	//save new country
	public void save(Country country)
	{
		countryRepository.save(country);
	}

}
