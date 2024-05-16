package infrastructure.service;

import domain.ports.in.service.IOfficeService;
import domain.secondary.Office;
import infrastructure.repository.JpaOfficeRepository;
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
}