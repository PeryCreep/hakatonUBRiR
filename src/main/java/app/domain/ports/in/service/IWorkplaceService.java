package app.domain.ports.in.service;

import app.domain.secondary.Workplace;

import java.util.List;
public interface IWorkplaceService {

    /**
     * Получение всех рабочих мест хранящихся в сервисе.
     * 
     * @return список всех рабочих мест
     */
    List<Workplace> getAllWorkplaces();

    /**
     * Получение информации о конкретном рабочем месте.
     * 
     * @param uuid уникальный идентификатор рабочего места
     * @return информация о рабочем месте
     */
    Workplace getWorkplaceByUuid(String uuid);
}
