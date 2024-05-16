package app.infrastructure.service;

import app.infrastructure.repository.JpaWarehouseRepository;
import app.domain.ports.in.service.IWarehouseService;
import app.domain.secondary.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WarehouseService implements IWarehouseService {

    private final JpaWarehouseRepository warehouseRepository;

    @Autowired
    public WarehouseService(JpaWarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }

    @Override
    public Warehouse getWarehouseByUuid(String uuid) {
        return warehouseRepository.findByUuid(UUID.fromString(uuid));
    }
}
