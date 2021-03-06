package com.javaee.luizhmpassos.mongodb.services;

import java.util.Set;

import com.javaee.luizhmpassos.mongodb.domain.Garage;

public interface GarageService {

	Set<Garage> getAll();

	Garage getGarageById(String id);

	Garage createNewGarage(Garage garage);

	Garage saveGarage(String id, Garage garage);

	void deleteGarageById(String id);
}