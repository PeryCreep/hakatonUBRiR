package app.domain.primary;

import app.domain.secondary.Office;
import app.domain.secondary.Warehouse;
import app.domain.secondary.Worker;
import app.domain.secondary.Workplace;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("worker")
    private Worker worker;

    @JsonProperty("office")
    private Office office;

    @JsonProperty("workplace")
    private Workplace workplace;

    @JsonProperty("warehouse")
    private Warehouse warehouse;

    @JsonProperty("createdDate")
    private Date createdDate;

    @JsonProperty("createdBy")
    private UUID createdBy;
}
