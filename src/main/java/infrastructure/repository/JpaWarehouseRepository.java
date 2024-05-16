package infrastructure.repository;

import domain.secondary.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaWarehouseRepository extends JpaRepository<Warehouse, UUID> {
    Warehouse findByUuid(UUID uuid);
}
