package app.infrastructure.controller;

import app.domain.secondary.Office;
import app.infrastructure.repository.JpaOfficeRepository;
import app.infrastructure.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offices")
public class OfficeController {
    private final OfficeService officeService;

    @Autowired
    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }
    @GetMapping
    public List<Office> getAllOffices() {
        return officeService.getAllWorkplaces();
    }
    @GetMapping("/{uuid}")
    public Office getOfficeByUuid(@PathVariable String uuid) {
        return officeService.getWorkplaceByUuid(uuid);
    }

//    @PostMapping("/create")
//    public void createOffice(@RequestBody Office office) {
//        officeService.createWorkplace(office);
//    }
}
