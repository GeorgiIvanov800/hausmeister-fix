package org.hausmeisterfixbe.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hausmeisterfixbe.model.enums.TicketCategory;
import org.hausmeisterfixbe.model.enums.Priority;

import java.util.UUID;

public record TicketCreateRequest(
        @NotNull(message = "You must provide a category please select one of the following.")
        TicketCategory ticketCategory,
        @NotBlank(message = "Please provide a title.")
        String title,
        @NotBlank(message = "Please describe briefly what is the problem.")
        String description,
        Priority priority,
        @NotNull
        UUID unitId
) {
}
