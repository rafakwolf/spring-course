package com.rafakwolf.location.controllers;

import com.rafakwolf.location.entities.Location;
import com.rafakwolf.location.repos.LocationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationRestController {

    private LocationRepository locationRepository;

    public LocationRestController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping
    public List<Location> getLocations(){
        return locationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Location getLocation(@PathVariable("id") int id){
        return locationRepository.findById(id).get();
    }

    @PostMapping
    public Location createLocation(@RequestBody Location location){
        return locationRepository.save(location);
    }

    @PutMapping
    public Location updateLocation(@RequestBody Location location){
        return locationRepository.save(location);
    }

    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable("id") int id){
        locationRepository.deleteById(id);
    }
}
