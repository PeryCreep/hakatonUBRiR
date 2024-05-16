package infrastructure.service;

import java.util.List;
import domain.ports.in.service.ITechniqueService;
import domain.ports.out.repository.ITechniqueRepository;
import domain.primary.Technique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechniqueService implements ITechniqueService {

    private final ITechniqueRepository techniqueRepository;

    @Autowired
    public TechniqueService(ITechniqueRepository techniqueRepository) {
        this.techniqueRepository = techniqueRepository;
    }

    @Override
    public List<Technique> getAllTechniques() {
        return techniqueRepository.getAllTechniques();
    }

    @Override
    public Technique getTechniqueByUuid(String uuid) {
        return techniqueRepository.getTechniqueByUuid(uuid);
    }

    @Override
    public Technique addTechnique(Technique technique) {
        return techniqueRepository.addTechnique(technique);
    }

    @Override
    public Technique updateTechnique(Technique technique) {
        return techniqueRepository.updateTechnique(technique);
    }

    @Override
    public void deleteTechnique(String uuid) {
        techniqueRepository.deleteTechnique(uuid);
    }
}