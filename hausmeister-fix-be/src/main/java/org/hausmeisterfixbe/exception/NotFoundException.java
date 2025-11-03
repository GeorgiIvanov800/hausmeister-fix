package org.hausmeisterfixbe.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

@Getter
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
    private final Object[] args;

    public NotFoundException(UUID uuid) {
        super("User not found.");
        this.args = new Object[]{uuid};
    }
}
