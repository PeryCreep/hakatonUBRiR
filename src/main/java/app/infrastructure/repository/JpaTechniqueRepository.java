package app.infrastructure.repository;

import app.domain.primary.Technique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTechniqueRepository extends JpaRepository<Technique, String> {
    Technique findByIdentifier(String identifier);
}