package com.hcl.hackathon.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Multimap;
import com.hcl.hackathon.model.Slot;

@RestController()
public class SlotController {

	@GetMapping("/slots")
	public List<Integer> getAllSLots(@RequestParam String name) {
		
		return (List<Integer>) Slot.getSlotsMap().get(name);
		
	}
	/*
	 * @GetMapping("/available_slots") public Multimap<String, Integer>
	 * getAllAvailableSlots(){ return }
	 */
	
}
