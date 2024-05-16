package infrastructure.service;

import domain.ports.in.service.IWarehouseService;
import domain.ports.out.repository.IWarehouseRepository;
import domain.secondary.Warehouse;
import infrastructure.repository.JpaWarehouseRepository;
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
