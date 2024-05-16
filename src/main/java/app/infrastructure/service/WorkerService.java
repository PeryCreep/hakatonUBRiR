package app.infrastructure.service;
import app.infrastructure.repository.JpaWorkerRepository;
import app.domain.ports.in.service.IWorkerService;
import app.domain.secondary.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WorkerService implements IWorkerService {

    private final JpaWorkerRepository workerRepository;

    @Autowired
    public WorkerService(JpaWorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @Override
    public Worker getWorkerByUuid(String uuid) {
        return workerRepository.findByUuid(UUID.fromString(uuid));
    }
}
