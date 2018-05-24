package com.rafakwolf.location.service;

import com.rafakwolf.location.entities.Location;
import com.rafakwolf.location.repos.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository repository;

    public LocationServiceImpl(LocationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Location saveLocation(Location location) {
        return this.repository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return this.repository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        this.repository.delete(location);
    }

    @Override
    public Location getLocationById(Integer id) {
        return this.repository.findById(id).get();
    }

    @Override
    public List<Location> getAllLocations() {
        return this.repository.findAll();
    }
}
