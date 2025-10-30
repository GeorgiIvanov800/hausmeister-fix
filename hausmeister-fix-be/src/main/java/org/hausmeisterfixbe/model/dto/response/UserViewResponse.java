package org.hausmeisterfixbe.model.dto.response;



import org.hausmeisterfixbe.model.enums.Role;

import java.time.Instant;
import java.util.UUID;

public record UserViewResponse(
        UUID id,
        String firstName,
        String lastName,
        Role role,
        String phoneNumber,
        String email,
        Instant createdAt,
        boolean active

) {
}
