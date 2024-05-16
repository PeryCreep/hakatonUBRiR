package app.domain.primary;

import app.domain.secondary.Office;
import app.domain.secondary.Warehouse;
import app.domain.secondary.Worker;
import app.domain.secondary.Workplace;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "technique")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Technique {

    @Id
    @Column(name = "identifier", nullable = false, unique = true)
    private String identifier;

    @OneToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;

    @OneToOne
    @JoinColumn(name = "office_id")
    private Office office;

    @OneToOne
    @JoinColumn(name = "workplace_id")
    private Workplace workplace;

    @OneToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "created_by", nullable = false)
    private UUID createdBy;

}
