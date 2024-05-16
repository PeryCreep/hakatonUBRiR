package app.infrastructure.repository;

import app.domain.secondary.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaOfficeRepository extends JpaRepository<Office, UUID> {
    Office findByUuid(UUID uuid);
}
