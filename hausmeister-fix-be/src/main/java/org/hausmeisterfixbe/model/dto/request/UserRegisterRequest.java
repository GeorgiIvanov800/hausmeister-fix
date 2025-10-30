package org.hausmeisterfixbe.model.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRegisterRequest(
        @NotBlank(message = "First name is required.")
        String firstName,
        @NotBlank(message = "Last name is required.")
        String lastName,
        @NotBlank(message = "You should provide a strong password.")
        @Size(min = 8, max = 20, message = "Password should be between 8 and 20 characters.")
        String password,
        @NotBlank(message = "Email is required.")
        @Email(message = "Please provide a correct email.")
        String email,
        @NotBlank(message = "Phone number is required.")
        String phoneNumber
) {
}
