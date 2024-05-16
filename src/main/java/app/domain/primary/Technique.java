package app.domain.primary;

import app.domain.secondary.Office;
import app.domain.secondary.Warehouse;
import app.domain.secondary.Worker;
import app.domain.secondary.Workplace;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import javax.persistence.*;

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

    @OneToMany
    @JoinColumn(name = "worker_id")
    private Optional<Worker> worker;

    @OneToMany
    @JoinColumn(name = "office_id")
    private Optional<Office> office;

    @OneToMany
    @JoinColumn(name = "workplace_id")
    private Optional<Workplace> workplace;

    @OneToMany
    @JoinColumn(name = "warehouse_id")
    private Optional<Warehouse> warehouse;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "created_by", nullable = false)
    private UUID createdBy;

}
