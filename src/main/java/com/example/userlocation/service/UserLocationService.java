package com.example.userlocation.service;

import java.util.List;
import com.example.userlocation.entity.UserLocation;

public interface UserLocationService {

    UserLocation createLocation(UserLocation userLocation);
    
    UserLocation updateLocation(Long id, UserLocation userLocation);
    
    List<UserLocation> getNearestUsers(int n);

	List<UserLocation> getNearestUsers();
}
