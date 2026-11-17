package com.example.model;

/**
 * Класс, представляющий водителя автомобиля.
 * Содержит информацию о ФИО и стаже вождения.
 *
 * @author Student
 * @version 1.0
 */
public class Driver {

    /** ФИО водителя. */
    private String fullName;

    /** Стаж вождения в годах. */
    private int drivingExperience;

    /**
     * Конструктор класса Driver.
     *
     * @param fullName          ФИО водителя
     * @param drivingExperience стаж вождения (в годах)
     */
    public Driver(String fullName, int drivingExperience) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }

    /**
     * Возвращает ФИО водителя.
     *
     * @return ФИО водителя
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Устанавливает ФИО водителя.
     *
     * @param fullName ФИО водителя
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Возвращает стаж вождения.
     *
     * @return стаж вождения в годах
     */
    public int getDrivingExperience() {
        return drivingExperience;
    }

    /**
     * Устанавливает стаж вождения.
     *
     * @param drivingExperience стаж вождения в годах
     */
    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    /**
     * Возвращает строковое представление водителя.
     *
     * @return строка с информацией о водителе
     */
    @Override
    public String toString() {
        return "Водитель: " + "ФИО - " + fullName + "; Стаж вождения - " + drivingExperience;
    }
}