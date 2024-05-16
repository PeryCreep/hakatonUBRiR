package app.domain.secondary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Office {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid", nullable = false, unique = true)
    @Id
    private UUID uuid;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "created_by", nullable = false)
    private UUID createdBy;

}

