package infrastructure.service;
import domain.ports.in.service.IWorkerService;
import domain.ports.out.repository.IWorkerRepository;
import domain.secondary.Worker;
import infrastructure.repository.JpaWorkerRepository;
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
