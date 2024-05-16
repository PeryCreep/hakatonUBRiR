package app.domain.ports.in.service;

import app.domain.primary.Technique;
import app.domain.primary.*;
import java.util.List;
public interface ITechniqueService {

    /**
     * Получение информации о всей технике в реестре.
     * 
     * @return список всей техники
     */
    List<Technique> getAllTechniques();

    /**
     * Получение информации о конкретной технике.
     * 
     * @param uuid уникальный идентификатор техники
     * @return информация о технике
     */
    Technique getTechniqueByUuid(String uuid);

    /**
     * Занести устройство в систему.
     * 
     * @param technique информация о технике
     * @return добавленная техника
     */
    Technique addTechnique(Technique technique);

    /**
     * Обновить информацию о технике.
     * 
     * @param technique информация о технике
     * @return обновленная техника
     */
    Technique updateTechnique(Technique technique);

    /**
     * Удалить устройство с конкретным UUID.
     * 
     * @param uuid уникальный идентификатор техники
     */
    void deleteTechnique(String uuid);
}