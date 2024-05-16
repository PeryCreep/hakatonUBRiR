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


    static public Technique convertToEntity(TechniqueDTO techniqueDTO) {
        Technique technique = new Technique();
        technique.setIdentifier(techniqueDTO.getIdentifier());
        technique.setCreatedDate(techniqueDTO.getCreatedDate());
        technique.setCreatedBy(techniqueDTO.getCreatedBy());

        // Проверяем наличие UUID и создаем объекты Worker, Office, Workplace и Warehouse
        if (techniqueDTO.getWorker() != null) {

            technique.setWorker(techniqueDTO.getWorker());
        }
        if (techniqueDTO.getOffice() != null) {
            technique.setOffice(techniqueDTO.getOffice());
        }
        if (techniqueDTO.getWorkplace() != null) {
            technique.setWorkplace(techniqueDTO.getWorkplace());
        }
        if (techniqueDTO.getWarehouse() != null) {
            technique.setWarehouse(techniqueDTO.getWarehouse());
        }

        return technique;
    }
}
