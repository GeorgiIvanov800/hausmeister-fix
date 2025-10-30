package org.hausmeisterfixbe.model.dto.response;

import jakarta.annotation.Nullable;


import org.hausmeisterfixbe.model.enums.TicketCategory;
import org.hausmeisterfixbe.model.enums.Priority;
import org.hausmeisterfixbe.model.enums.Status;

import java.time.Instant;
import java.util.UUID;

public record TicketSummaryResponse(
        UUID id,
        String title,
        Status status,
        Priority priority,
        Instant createdAt,
        UUID propertyId,
        UUID unitId,
        String propertyName,
        String unitNumber,
        @Nullable
        String currentTechnicianName,
        Instant updatedAt,
        TicketCategory ticketCategory
) {
}
