package domain.ports.in.service;

public interface IOfficeService {

     /**
     * Получение всех офисов хранящихся в сервисе.
     * 
     * @return список всех офисов
     */
    List<Workplace> getAllWorkplaces();

    /**
     * Получение информации о конкретном офисе.
     * 
     * @param uuid уникальный идентификатор офиса
     * @return информация о рабочем месте
     */
    Workplace getWorkplaceByUuid(String uuid);
}
