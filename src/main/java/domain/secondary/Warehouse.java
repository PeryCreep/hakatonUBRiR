package domain.secondary;

import java.util.Date;
import java.util.UUID;

public record Warehouse(
        UUID uuid,
        String name,
        String city,
        Date createdDate,
        UUID createBy
) {
}
