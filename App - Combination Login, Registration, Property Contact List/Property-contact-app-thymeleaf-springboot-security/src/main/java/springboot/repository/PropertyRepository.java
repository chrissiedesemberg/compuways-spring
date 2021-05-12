package springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {

	List<Property> findByName(String name);

}