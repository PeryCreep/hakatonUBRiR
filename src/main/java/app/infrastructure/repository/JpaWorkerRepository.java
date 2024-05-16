package app.infrastructure.repository;

import app.domain.secondary.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaWorkerRepository extends JpaRepository<Worker, UUID> {
    Worker findByUuid(UUID uuid);
}
