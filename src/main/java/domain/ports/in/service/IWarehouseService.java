package domain.ports.in.service;

import domain.secondary.*;
import java.util.List;
public interface IWarehouseService {

    /**
     * Получение всех складов хранящихся в сервисе.
     * 
     * @return список всех складов
     */
    List<Warehouse> getAllWarehouses();

    /**
     * Получение информации о конкретном складе.
     * 
     * @param uuid уникальный идентификатор склада
     * @return информация о складе
     */
    Warehouse getWarehouseByUuid(String uuid);
}
