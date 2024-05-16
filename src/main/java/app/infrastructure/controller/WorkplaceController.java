package app.infrastructure.controller;

import app.domain.secondary.Workplace;
import app.infrastructure.service.WorkplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workplaces")
public class WorkplaceController {
    private final WorkplaceService workplaceService;

    @Autowired
    public WorkplaceController(WorkplaceService workplaceService) {
        this.workplaceService = workplaceService;
    }
    @GetMapping
    public List<Workplace> getAllWorkplaces(){
        return workplaceService.getAllWorkplaces();
    }
    @GetMapping("/{uuid}")
    public Workplace getWorkplaceByUuid(@PathVariable String uuid){
        return workplaceService.getWorkplaceByUuid(uuid);
    }
}
