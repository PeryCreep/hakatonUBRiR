package domain.primary;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

public record Technique(
        String identifier,
        Optional<UUID> worker,
        Optional<UUID> office,
        Optional<UUID> workplace,
        Optional<UUID> warehouse,
        Date createdDate,
        UUID createBy
) {
}
