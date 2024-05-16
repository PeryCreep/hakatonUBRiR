package domain.ports.out.repository;

import domain.secondary.Workplace;

import java.util.List;

public interface IWorkplaceRepository {

    /**
     * Получение всех рабочих мест из репозитория.
     *
     * @return список всех рабочих мест
     */
    List<Workplace> getAllWorkplaces();

    /**
     * Получение информации о рабочем месте по его уникальному идентификатору.
     *
     * @param uuid уникальный идентификатор рабочего места
     * @return информация о рабочем месте
     */
    Workplace getWorkplaceByUuid(String uuid);
}

