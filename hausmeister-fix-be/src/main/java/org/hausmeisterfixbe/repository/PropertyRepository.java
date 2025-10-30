package org.hausmeisterfixbe.repository;

import org.hausmeisterfixbe.model.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PropertyRepository extends JpaRepository<Property, UUID> {
}
