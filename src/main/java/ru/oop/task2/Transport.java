package ru.oop.task2;

/**
 * Интерфейс транспорта
 */
public interface Transport extends Positioned{

    /**
     * Изменение позиции человека в транспорте до конечной точки или близжайщей к ней
     * @return True - удалось доехать до конечной точки, иначе - False
     */
    public boolean moveTo(Position destination);
}
