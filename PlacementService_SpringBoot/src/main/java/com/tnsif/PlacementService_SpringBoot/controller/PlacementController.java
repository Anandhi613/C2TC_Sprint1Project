package com.tnsif.PlacementService_SpringBoot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.PlacementService_SpringBoot.Placement;
import com.tnsif.PlacementService_SpringBoot.service.PlacementService;

import jakarta.persistence.NoResultException;

@RestController
public class PlacementController {

    @Autowired
    private PlacementService p; // creating object for PlacementService class

    // Get all placements
    @GetMapping("/placementservice")
    public List<Placement> list() {
        return p.listAll();
    }

    // Add new placement
    @PostMapping("/placementservice")
    public void add(@RequestBody Placement p1) {
        p.save(p1);
    }

    // Get placement by ID
    @GetMapping("/placementservice/{id}")
    public ResponseEntity<Placement> get(@PathVariable Integer id) {
        try {
            Placement p2 = p.get(id);
            return new ResponseEntity<Placement>(p2, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete placement by ID
    @DeleteMapping("/placementservice/{id}")
    public void delete(@PathVariable Integer id) {
        p.delete(id);
    }

    // Update placement by ID
    @PutMapping("/placementservice/{id}")
    public ResponseEntity<Placement> update(@PathVariable Integer id, @RequestBody Placement update_p) {
        try {
            Placement exist_p = p.get(id);
            exist_p.setCompanyName(update_p.getCompanyName());
            exist_p.setJobRole(update_p.getJobRole());
            exist_p.setPackageOffered(update_p.getPackageOffered());
            exist_p.setLocation(update_p.getLocation());
            exist_p.setEligibilityCriteria(update_p.getEligibilityCriteria());
            exist_p.setInterviewDate(update_p.getInterviewDate());
            p.update(exist_p);
            return new ResponseEntity<Placement>(exist_p, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
        }
    }

}
