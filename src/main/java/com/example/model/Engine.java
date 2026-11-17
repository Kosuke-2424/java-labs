package com.example.model;

/**
 * Класс, представляющий двигатель автомобиля.
 * Содержит информацию о мощности и производителе.
 *
 * @author Student
 * @version 1.0
 */
public class Engine {

    /** Мощность двигателя (л.с.). */
    private int power;

    /** Производитель двигателя. */
    private String manufacturer;

    /**
     * Конструктор класса Engine.
     *
     * @param power        мощность двигателя (л.с.)
     * @param manufacturer производитель двигателя
     */
    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    /**
     * Возвращает мощность двигателя.
     *
     * @return мощность в л.с.
     */
    public int getPower() {
        return power;
    }

    /**
     * Устанавливает мощность двигателя.
     *
     * @param power мощность в л.с.
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Возвращает производителя двигателя.
     *
     * @return название производителя
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Устанавливает производителя двигателя.
     *
     * @param manufacturer название производителя
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Возвращает строковое представление двигателя.
     *
     * @return строка с информацией о двигателе
     */
    @Override
    public String toString() {
        return "Двигатель: " + "Мощность - " + power + "; Производитель - " + manufacturer;
    }
}