package domain.ports.in.service;

import domain.secondary.*;

public interface IWorkerService {

    /**
     * Получение всех пользователей хранящихся в сервисе.
     * 
     * @return список всех пользователей
     */
    List<Worker> getAllWorkers();

    /**
     * Получение информации о конкретном сотруднике.
     * 
     * @param uuid уникальный идентификатор сотрудника
     * @return информация о сотруднике
     */
    Worker getWorkerByUuid(String uuid);
}
