package org.hausmeisterfixbe.model.dto.response;


import jakarta.annotation.Nullable;

import java.time.Instant;

public record TicketDetailResponse(
        TicketSummaryResponse summary,

        String description,

        String createdByName,

        @Nullable
        Instant closedAt
) {
}
