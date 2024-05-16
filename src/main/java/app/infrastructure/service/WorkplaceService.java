package app.infrastructure.service;

import app.domain.ports.in.service.IWorkplaceService;
import app.domain.secondary.Workplace;
import app.infrastructure.repository.JpaWorkplaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WorkplaceService implements IWorkplaceService {

    private final JpaWorkplaceRepository workplaceRepository;

    @Autowired
    public WorkplaceService(JpaWorkplaceRepository workplaceRepository) {
        this.workplaceRepository = workplaceRepository;
    }

    @Override
    public List<Workplace> getAllWorkplaces() {
        return workplaceRepository.findAll();
    }

    @Override
    public Workplace getWorkplaceByUuid(String uuid) {
        return workplaceRepository.findByUuid(UUID.fromString(uuid));
    }
}
