package org.hausmeisterfixbe.mapper;

import org.hausmeisterfixbe.model.dto.response.UnitViewResponse;
import org.hausmeisterfixbe.model.entity.Unit;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UnitMapper {

    UnitViewResponse toResponse(Unit unit);
}
