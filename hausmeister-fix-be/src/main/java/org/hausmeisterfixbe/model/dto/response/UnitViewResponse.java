package org.hausmeisterfixbe.model.dto.response;

import java.util.UUID;

public record UnitViewResponse(
        UUID id,
        String number,
        Integer floor,
        UUID propertyId,
        String propertyName
) {
}
