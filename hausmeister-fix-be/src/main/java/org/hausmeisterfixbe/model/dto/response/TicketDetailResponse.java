package org.hausmeisterfixbe.model.dto.response;


import java.time.Instant;

public record TicketDetailResponse(
        TicketSummaryResponse summary,

        String description,

        String createdByName,

        Instant closedAt
) {
}
