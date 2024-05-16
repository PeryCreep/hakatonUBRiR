package app.infrastructure.repository;

import app.domain.ports.out.repository.ITechniqueRepository;
import app.domain.primary.Technique;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class JpaTechniqueRepository implements ITechniqueRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Technique> getAllTechniques() {
        return entityManager.createQuery("SELECT t FROM Technique t", Technique.class).getResultList();
    }

    @Override
    public Technique getTechniqueByUuid(String uuid) {
        return entityManager.find(Technique.class, uuid);
    }

    @Override
    public Technique addTechnique(Technique technique) {
        entityManager.persist(technique);
        return technique;
    }

    @Override
    public Technique updateTechnique(Technique technique) {
        return entityManager.merge(technique);
    }

    @Override
    public void deleteTechnique(String uuid) {
        Technique technique = entityManager.find(Technique.class, uuid);
        entityManager.remove(technique);
    }
}
