package app.domain.ports.in.service;

import app.domain.secondary.Office;

import java.util.List;

public interface IOfficeService {

     /**
     * Получение всех офисов хранящихся в сервисе.
     * 
     * @return список всех офисов
     */
    List<Office> getAllWorkplaces();

    /**
     * Получение информации о конкретном офисе.
     * 
     * @param uuid уникальный идентификатор офиса
     * @return информация о рабочем месте
     */
    Office getWorkplaceByUuid(String uuid);
}
