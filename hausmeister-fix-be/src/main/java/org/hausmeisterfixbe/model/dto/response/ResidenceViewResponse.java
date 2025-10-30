package org.hausmeisterfixbe.model.dto.response;

import java.util.UUID;

public record ResidenceViewResponse(
        UUID propertyId,
        String propertyName,
        UUID unitId,
        String unitNumber,
        Integer floor
) {
}
