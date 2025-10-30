package org.hausmeisterfixbe.model.dto.response;

import java.util.UUID;

public record PropertyViewResponse(
        UUID id,
        String name,
        String city,
        String zip
) {
}
