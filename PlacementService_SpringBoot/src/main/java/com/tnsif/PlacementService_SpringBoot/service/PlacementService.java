package com.tnsif.PlacementService_SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.PlacementService_SpringBoot.Placement;
import com.tnsif.PlacementService_SpringBoot.repository.PlacementRepository;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository repo;

    // To get all placement records
    public List<Placement> listAll() {
        return repo.findAll();
    }

    // To save a placement record
    public void save(Placement p) {
        repo.save(p);
    }

    // To get a specific placement record by ID
    public Placement get(Integer placementId) {
        return repo.findById(placementId).get();
    }

    // To delete a placement record by ID
    public void delete(Integer placementId) {
        repo.deleteById(placementId);
    }

    // To update a placement record
    public void update(Placement p) {
        repo.save(p);
    }
}
