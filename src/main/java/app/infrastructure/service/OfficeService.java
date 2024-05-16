package app.infrastructure.service;

import app.domain.ports.in.service.IOfficeService;
import app.domain.secondary.Office;
import app.infrastructure.repository.JpaOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OfficeService implements IOfficeService {

    private final JpaOfficeRepository officeRepository;

    @Autowired
    public OfficeService(JpaOfficeRepository  officeRepository) {
        this.officeRepository = officeRepository;
    }

    @Override
    public List<Office> getAllWorkplaces() {
        return officeRepository.findAll();
    }

    @Override
    public Office getWorkplaceByUuid(String uuid) {
        return officeRepository.findByUuid(UUID.fromString(uuid));
    }

    public void createWorkplace(Office office) {
        officeRepository.save(office);
    }
}