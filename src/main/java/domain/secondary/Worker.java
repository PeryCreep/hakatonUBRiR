package domain.secondary;

import java.util.Date;
import java.util.UUID;
import java.util.Optional;

public record Worker(
        UUID uuid,
        String firstName,
        String lastName,
        Optional<String> middleName,
        String post,
        String role,
        UUID office,
        Date createdDate) {
}
