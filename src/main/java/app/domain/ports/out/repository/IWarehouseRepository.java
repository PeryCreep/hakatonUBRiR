package app.domain.ports.out.repository;

import app.domain.secondary.Warehouse;

import java.util.List;

public interface IWarehouseRepository {

    /**
     * Получение всех складов из репозитория.
     *
     * @return список всех складов
     */
    List<Warehouse> getAllWarehouses();

    /**
     * Получение информации о складе по его уникальному идентификатору.
     *
     * @param uuid уникальный идентификатор склада
     * @return информация о складе
     */
    Warehouse getWarehouseByUuid(String uuid);
}
