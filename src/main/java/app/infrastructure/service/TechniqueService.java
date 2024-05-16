package app.infrastructure.service;

import app.domain.ports.in.service.ITechniqueService;
import app.domain.primary.Technique;
import app.infrastructure.repository.JpaTechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechniqueService implements ITechniqueService {

    private final JpaTechniqueRepository techniqueRepository;

    @Autowired
    public TechniqueService(JpaTechniqueRepository techniqueRepository) {
        this.techniqueRepository = techniqueRepository;
    }

    @Override
    public List<Technique> getAllTechniques() {
        return techniqueRepository.findAll();
    }

    @Override
    public Technique getTechniqueByUuid(String uuid) {
        return techniqueRepository.findById(uuid).orElse(null);
    }

    @Override
    public Technique addTechnique(Technique technique) {
        return techniqueRepository.save(technique);
    }

    @Override
    public Technique updateTechnique(Technique technique) {
        return techniqueRepository.save(technique);
    }

    @Override
    public void deleteTechnique(String uuid) {
        techniqueRepository.deleteById(uuid);
    }
}