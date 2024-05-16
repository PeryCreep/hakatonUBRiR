package app.infrastructure.controller;

import app.domain.secondary.Warehouse;
import app.infrastructure.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/warehouses")
public class WarehouseController {
    private final WarehouseService warehouseService;
    @Autowired
    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }
    @GetMapping
    public List<Warehouse> getAllWarehouses(){
        return warehouseService.getAllWarehouses();
    }
    @GetMapping("/{uuid}")
    public Warehouse getWarehouseByUuid(@PathVariable String uuid){
        return warehouseService.getWarehouseByUuid(uuid);
    }

}
