package com.rafakwolf.location.controllers;

import com.rafakwolf.location.entities.Location;
import com.rafakwolf.location.repos.LocationRepository;
import com.rafakwolf.location.service.LocationService;
import com.rafakwolf.location.util.ReportUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import java.util.List;

@Controller
public class LocationController {

    private LocationService locationService;
    private LocationRepository locationRepository;

    private ReportUtil reportUtil;
    private ServletContext servletContext;

    public LocationController(LocationService locationService,
                              LocationRepository locationRepository,
                              ReportUtil reportUtil,
                              ServletContext servletContext) {
        this.locationService = locationService;
        this.locationRepository = locationRepository;
        this.reportUtil = reportUtil;
        this.servletContext = servletContext;
    }

    private void createLocationList(ModelMap modelMap) {
        List<Location> locations = locationService.getAllLocations();
        modelMap.addAttribute("locations", locations);
    }

    private String redirect(String toPage) {
        return "redirect:/" + toPage;
    }

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
        Location savedLocation = locationService.saveLocation(location);
        String msg = "Location saved (" + savedLocation.getName() + ")";
        modelMap.addAttribute("msg", msg);
        return "createLocation";
    }

    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap) {
        createLocationList(modelMap);
        return "displayLocations";
    }

    @RequestMapping("/deleteLocation")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
        Location location = new Location();
        location.setId(id);
        locationService.deleteLocation(location);
        createLocationList(modelMap);
        return redirect("displayLocations");
    }

    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
        Location location = locationService.getLocationById(id);
        modelMap.addAttribute("location", location);
        return "editLocation";
    }

    @RequestMapping("/updateLoc")
    public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
        locationService.updateLocation(location);
        createLocationList(modelMap);
        return redirect("displayLocations");
    }

    @RequestMapping("/generateReport")
    public String generateReport() {
        String reportPath = servletContext.getRealPath("/");
        List<Object[]> data = locationRepository.findTypeAndTypeCount();
        reportUtil.generatePieChart(reportPath, data);
        return "report";
    }

}
