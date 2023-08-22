package com.example.userlocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userlocation.entity.UserLocation;

@SuppressWarnings("unused")
public interface UserLocationRepository extends JpaRepository {

	UserLocation save(UserLocation userLocation);
    // Add any custom query methods if needed

	Object findById(Long id);

	List<UserLocation> findAll();
}
