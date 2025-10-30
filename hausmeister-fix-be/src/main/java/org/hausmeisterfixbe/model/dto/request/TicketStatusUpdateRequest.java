package org.hausmeisterfixbe.model.dto.request;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hausmeisterfixbe.model.enums.Status;

public record TicketStatusUpdateRequest(
        @NotNull
        @NotBlank
        @Enumerated(EnumType.STRING)
        Status status
) {
}
