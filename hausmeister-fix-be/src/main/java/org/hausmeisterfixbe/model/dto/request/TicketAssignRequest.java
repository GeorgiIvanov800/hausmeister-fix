package org.hausmeisterfixbe.model.dto.request;

import java.util.UUID;

public record TicketAssignRequest(
        UUID technicianId
) {
}
