package app.infrastructure.controller;

import app.domain.primary.Technique;
import app.domain.primary.TechniqueDTO;
import app.infrastructure.service.TechniqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/techniques")
public class TechniqueController {

    private final TechniqueService techniqueService;

    @Autowired
    public TechniqueController(TechniqueService techniqueService) {
        this.techniqueService = techniqueService;
    }

    @GetMapping
    public List<Technique> getAllTechniques() {
        return techniqueService.getAllTechniques();
    }

    @GetMapping("/{uuid}")
    public Technique getTechniqueByUuid(@PathVariable String uuid) {
        return techniqueService.getTechniqueByUuid(uuid);
    }

    @PostMapping
    public ResponseEntity<Technique> addTechnique(@RequestBody TechniqueDTO techniqueDTO) {
        Technique technique = Technique.convertToEntity(techniqueDTO);
        Technique savedTechnique = techniqueService.addTechnique(technique);
        return ResponseEntity.ok(savedTechnique);
    }

    @PutMapping
    public ResponseEntity<Technique> updateTechnique(@RequestBody TechniqueDTO techniqueDTO) {
        Technique technique = Technique.convertToEntity(techniqueDTO);
        Technique updatedTechnique = techniqueService.updateTechnique(technique);
        return ResponseEntity.ok(updatedTechnique);
    }

    @DeleteMapping("/{uuid}")
    public void deleteTechnique(@PathVariable String uuid) {
        techniqueService.deleteTechnique(uuid);
    }
}