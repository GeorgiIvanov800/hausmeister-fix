package org.hausmeisterfixbe.model.dto.response;

import java.util.UUID;

public record TechnicianViewResponse(
        UUID id,
        String firstName,
        String lastName,
        String email
) {
}
