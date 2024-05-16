package app.infrastructure.controller;

import app.domain.secondary.Worker;
import app.infrastructure.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {
    private final WorkerService workerService;

    @Autowired
    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }
    @GetMapping
    public List<Worker> getAllWorkers(){
        return workerService.getAllWorkers();
    }
    @GetMapping("/{uuid}")
    public Worker getWorkerByUuid(@PathVariable String uuid){
        return workerService.getWorkerByUuid(uuid);
    }

}
