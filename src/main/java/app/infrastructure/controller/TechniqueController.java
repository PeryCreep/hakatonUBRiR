package app.infrastructure.controller;

import app.domain.primary.Technique;
import app.infrastructure.repository.JpaTechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/techniques")
public class TechniqueController {

    private final JpaTechniqueRepository techniqueRepository;

    @Autowired
    public TechniqueController(JpaTechniqueRepository techniqueRepository) {
        this.techniqueRepository = techniqueRepository;
    }

    @GetMapping
    public List<Technique> getAllTechniques() {
        return techniqueRepository.getAllTechniques();
    }

    @GetMapping("/{uuid}")
    public Technique getTechniqueByUuid(@PathVariable String uuid) {
        return techniqueRepository.getTechniqueByUuid(uuid);
    }

    @PostMapping
    public Technique addTechnique(@RequestBody Technique technique) {
        return techniqueRepository.addTechnique(technique);
    }

//    @PatchMapping("/{uuid}")
//    public Technique updateTechnique(@PathVariable String uuid, @RequestBody Technique techniqueDetails) {
//        Technique technique = techniqueRepository.getTechniqueByUuid(uuid);
//        technique.setIdentifier(techniqueDetails.getIdentifier());
//        technique.setWorker(techniqueDetails.getWorker());
//        technique.setOffice(techniqueDetails.getOffice());
//        technique.setWorkplace(techniqueDetails.getWorkplace());
//        technique.setWarehouse(techniqueDetails.getWarehouse());
//        technique.setCreatedDate(techniqueDetails.getCreatedDate());
//        technique.setCreatedBy(techniqueDetails.getCreatedBy());
//        return techniqueRepository.updateTechnique(technique);
//    }

    @DeleteMapping("/{uuid}")
    public void deleteTechnique(@PathVariable String uuid) {
        techniqueRepository.deleteTechnique(uuid);
    }
}
