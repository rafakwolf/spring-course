package com.rafakwolf.location.service;

import com.rafakwolf.location.entities.Location;

import java.util.List;

public interface LocationService {

    Location saveLocation(Location location);

    Location updateLocation(Location location);

    void deleteLocation(Location location);

    Location getLocationById(Integer id);

    List<Location> getAllLocations();
}
