package org.hausmeisterfixbe.service;

import org.hausmeisterfixbe.model.dto.response.UnitViewResponse;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UnitService {
     Optional<UnitViewResponse> viewUnit(UUID uuid);
     List<UnitViewResponse> viewAllUnitsInProperty(UUID propertyId);

}
