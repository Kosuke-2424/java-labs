package com.example.model;

/**
 * Класс, представляющий автомобиль.
 * Содержит марку, класс автомобиля, вес, водителя и мотор.
 * Использует композицию с классами {@link Driver} и {@link Engine}.
 *
 * @author Student
 * @version 1.0
 */
public class Car {

    /** Марка автомобиля. */
    private String brand;

    /** Класс автомобиля (например, "седан", "внедорожник"). */
    private String carClass;

    /** Вес автомобиля (кг). */
    private double weight;

    /** Водитель автомобиля. */
    private Driver driver;

    /** Мотор автомобиля. */
    private Engine engine;

    /**
     * Конструктор класса Car.
     *
     * @param brand    марка автомобиля
     * @param carClass класс автомобиля
     * @param weight   вес автомобиля (кг)
     * @param driver   водитель типа {@link Driver}
     * @param engine   мотор типа {@link Engine}
     */
    public Car(String brand, String carClass, double weight,
               Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    /**
     * Возвращает марку автомобиля.
     *
     * @return марка автомобиля
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Устанавливает марку автомобиля.
     *
     * @param brand марка автомобиля
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Возвращает класс автомобиля.
     *
     * @return класс автомобиля
     */
    public String getCarClass() {
        return carClass;
    }

    /**
     * Устанавливает класс автомобиля.
     *
     * @param carClass класс автомобиля
     */
    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    /**
     * Возвращает вес автомобиля.
     *
     * @return вес в кг
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Устанавливает вес автомобиля.
     *
     * @param weight вес в кг
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Возвращает водителя автомобиля.
     *
     * @return объект {@link Driver}
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * Устанавливает водителя автомобиля.
     *
     * @param driver объект {@link Driver}
     */
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    /**
     * Возвращает мотор автомобиля.
     *
     * @return объект {@link Engine}
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Устанавливает мотор автомобиля.
     *
     * @param engine объект {@link Engine}
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * Возвращает строковое представление автомобиля.
     *
     * @return строка с полной информацией об автомобиле
     */
    @Override
    public String toString() {
        return "Машина: " + '\n' +
                "Марка - " + brand + '\n' +
                "Класс автомобиля - " + carClass + '\n' +
                "Вес - " + weight + '\n' +
                driver + '\n' +
                engine + '\n';
    }
}