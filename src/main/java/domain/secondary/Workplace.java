package domain.secondary;

import java.util.Date;
import java.util.UUID;

public record Workplace(
        UUID uuid,
        String number,
        UUID currentWorker,
        UUID office,
        Date createdDate,
        UUID createBy
) {
}
