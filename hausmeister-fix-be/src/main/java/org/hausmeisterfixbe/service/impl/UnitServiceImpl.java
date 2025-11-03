package org.hausmeisterfixbe.service.impl;

import lombok.AllArgsConstructor;
import org.hausmeisterfixbe.mapper.UnitMapper;
import org.hausmeisterfixbe.model.dto.response.UnitViewResponse;
import org.hausmeisterfixbe.model.entity.Unit;
import org.hausmeisterfixbe.repository.UnitRepository;
import org.hausmeisterfixbe.service.UnitService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
@AllArgsConstructor
public class UnitServiceImpl implements UnitService {

    private final UnitRepository unitRepository;
    private final UnitMapper unitMapper;

    @Override
    public Optional<UnitViewResponse> viewUnit(UUID uuid) {
        return unitRepository.findById(uuid)
                .map(unitMapper::toResponse);
    }

    @Override
    public List<UnitViewResponse> viewAllUnitsInProperty(UUID propertyId) {
        List<Unit> unitsInProperty =
                unitRepository.findAllByPropertyId(propertyId);

        return  unitsInProperty.stream()
                .map(unitMapper:: toResponse)
                .toList();
    }
}
