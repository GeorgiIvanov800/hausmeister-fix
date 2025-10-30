package org.hausmeisterfixbe.model.dto.response;

import java.util.List;

public record PageResponse<T>(
        List<T> items,
        int page,
        int size,
        long totalItems,
        int totalPages,
        boolean hasNext,
        List<SortOrder> sort

) {
}
