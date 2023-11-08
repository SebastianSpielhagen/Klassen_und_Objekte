package org.spielhagen;

public class Auto extends Fahrzeug {
    private int doors;

    public Auto(String brand, String model, int yearOfConstruction, int doors) {
        super(brand, model, yearOfConstruction);
        this.doors = doors;
    }

    @Override
    public void informationCar() {
        super.informationCar();
        System.out.println("Anzahl der Türen: " + doors);
    }
}
