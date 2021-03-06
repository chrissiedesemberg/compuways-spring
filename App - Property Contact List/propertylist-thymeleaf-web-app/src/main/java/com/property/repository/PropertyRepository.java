package com.property.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.property.entity.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {

	List<Property> findByName(String name);

}
