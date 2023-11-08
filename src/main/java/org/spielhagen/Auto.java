package org.spielhagen;

// Die Klasse "Auto" erbt von der Basisklasse "Fahrzeug" und erweitert sie um zusätzliche Informationen
// spezifisch für Autos. Die private Instanzvariable "doors" (Türen) speichert die Anzahl der Türen des Autos.
public class Auto extends Fahrzeug {
    private int doors;

    // Der Konstruktor der Klasse "Auto" erweitert den Konstruktor der Basisklasse "Fahrzeug" und ermöglicht die
    // Initialisierung der zusätzlichen Information "doors" (Anzahl der Türen) spezifisch für Autos.
    public Auto(String brand, String model, int yearOfConstruction, int doors) {
        super(brand, model, yearOfConstruction);
        this.doors = doors;
    }
    // Diese Methode überschreibt die Methode "informationCar()" aus der Basisklasse "Fahrzeug", um zusätzlich
    // Informationen zur Anzahl der Türen (doors) des Autos auszugeben. Sie ruft die Methode der Basisklasse mit "super"
    // auf und ergänzt die Anzahl der Türen.
    @Override
    public void informationCar() {
        super.informationCar();
        System.out.println("Anzahl der Türen: " + doors);
    }
}
