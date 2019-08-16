/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.samples.spring;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/pets")
public class PetController {
	@Autowired
	private PetRepository petRepository;

	@GetMapping
	public @ResponseBody Iterable<Pet> getAllPets() {
		return petRepository.findAll();
	}

	@GetMapping("/{id}")
	public @ResponseBody Optional<Pet> getPet(@PathVariable Integer id) {
		return Optional.ofNullable(petRepository.findById(id));
	}

	@DeleteMapping("/{id}")
	public @ResponseBody String deletePet(@PathVariable Integer id) {
		petRepository.deleteById(id);
		return "Deleted " + id;
	}
}
