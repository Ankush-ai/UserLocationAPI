package com.example.userlocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.userlocation.entity.UserLocation;
import com.example.userlocation.service.UserLocationService;

import java.util.List; // Import List

@RestController
public class UserLocationController {

    @Autowired
    private UserLocationService userLocationService;

    @PostMapping("/create_data")
    public UserLocation createData(@RequestBody UserLocation userLocation) {
        return userLocationService.createLocation(userLocation);
    }

    @PatchMapping("/update_data/{id}")
    public UserLocation updateData(@PathVariable Long id, @RequestBody UserLocation userLocation) {
        return userLocationService.updateLocation(id, userLocation);
    }

    @GetMapping("/get_users/{n}")
    public List<UserLocation> getUsers(@PathVariable int n) {
        return userLocationService.getNearestUsers(n);
    }
}
