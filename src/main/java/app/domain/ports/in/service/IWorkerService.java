package app.domain.ports.in.service;

import app.domain.secondary.Worker;
import app.domain.secondary.*;
import java.util.List;
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
