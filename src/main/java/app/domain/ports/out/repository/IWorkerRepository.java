package app.domain.ports.out.repository;

import app.domain.secondary.Worker;

import java.util.List;

public interface IWorkerRepository {

    /**
     * Получение всех сотрудников из репозитория.
     *
     * @return список всех сотрудников
     */
    List<Worker> getAllWorkers();

    /**
     * Получение информации о сотруднике по его уникальному идентификатору.
     *
     * @param uuid уникальный идентификатор сотрудника
     * @return информация о сотруднике
     */
    Worker getWorkerByUuid(String uuid);
}