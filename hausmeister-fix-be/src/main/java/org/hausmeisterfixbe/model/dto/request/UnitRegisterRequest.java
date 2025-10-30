package org.hausmeisterfixbe.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record UnitRegisterRequest(
        Integer floor,
        @NotBlank(message = "Please provide your unit number.")
        @Size(min = 1, max = 32, message = "")
        String unitNumber,

        @NotNull(message = "Please provide the name of the property.")
        UUID propertyId
) {
}
