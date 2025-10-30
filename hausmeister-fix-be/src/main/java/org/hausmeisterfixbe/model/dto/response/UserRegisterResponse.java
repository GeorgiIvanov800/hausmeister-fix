package org.hausmeisterfixbe.model.dto.response;

import org.hausmeisterfixbe.model.enums.Role;

import java.time.Instant;
import java.util.UUID;

public record UserRegisterResponse(
        UUID id,
        String firstName,
        String lastName,
        String phoneNumber,
        String email,
        Role role,
        Instant createdAt
) {
}
