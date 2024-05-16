package app.domain.primary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TechniqueDTO {
    private String identifier;
    private Optional<UUID> workerId;
    private Optional<UUID> officeId;
    private Optional<UUID> workplaceId;
    private Optional<UUID> warehouseId;
    private Date createdDate;
    private UUID createdBy;
}
