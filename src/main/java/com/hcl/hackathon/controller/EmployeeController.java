package com.hcl.hackathon.controller;

import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.hackathon.model.Employee;
import com.hcl.hackathon.model.Slot;

@RestController
public class EmployeeController {
	
	static List<Employee> employeesWaiting;
	@Scheduled(cron = "0 28 8 * * * ?")
	public List<Integer> updateWaitingList() {
		
		//return (List<Integer>) Slot.getSlotsMap().get(name);
		System.out.println("Print.......");
		return null;
		
		
	}

}
