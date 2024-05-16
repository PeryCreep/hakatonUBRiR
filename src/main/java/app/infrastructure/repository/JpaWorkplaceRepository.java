package app.infrastructure.repository;

import app.domain.secondary.Workplace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaWorkplaceRepository extends JpaRepository<Workplace, UUID>  {
    Workplace findByUuid(UUID uuid);
}
