package org.hausmeisterfixbe.repository;

import org.hausmeisterfixbe.model.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UnitRepository extends JpaRepository<Unit, UUID> {
}
