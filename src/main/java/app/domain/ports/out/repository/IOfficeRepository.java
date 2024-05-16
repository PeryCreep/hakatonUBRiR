package app.domain.ports.out.repository;

import app.domain.secondary.Office;

import java.util.List;

public interface IOfficeRepository {

    /**
     * Получение всех офисов из репозитория.
     *
     * @return список всех офисов
     */
    List<Office> getAllOffices();

    /**
     * Получение информации о рабочем месте по его уникальному идентификатору.
     *
     * @param uuid уникальный идентификатор рабочего места
     * @return информация о рабочем месте
     */
    Office getOfficeByUuid(String uuid);
}
