package org.spielhagen;

// Die Instanzvariablen (brand, model, yearOfConstruction) in der Klasse "Fahrzeug" wurden auf 'protected' geändert,
// was bedeutet, dass sie in abgeleiteten Klassen und in der gleichen Paketebene sichtbar sind, um den Zugriff für
// Vererbungszwecke und Unterklassen zu ermöglichen.
public class Fahrzeug {
    protected String brand;
    protected String model;
    protected int yearOfConstruction;


    // Der Konstruktor der Klasse "Fahrzeug" ermöglicht die Initialisierung von Fahrzeuginformationen,
    // wie Hersteller (brand), Modell (model) und Baujahr (yearOfConstruction),
    // wenn eine Instanz der Klasse erstellt wird.
    public Fahrzeug(String brand, String model, int yearOfConstruction) {
        this.brand = brand;
        this.model = model;
        this.yearOfConstruction = yearOfConstruction;
    }
    // Die Methode "informationCar()" wird verwendet, um Informationen über ein Fahrzeug auszugeben,
    // einschließlich des Herstellers (brand), des Modells (model) und des Baujahrs (yearOfConstruction).
    // Sie druckt diese Informationen auf die Konsole.
    public void informationCar() {
        System.out.println("Hersteller: " + brand);
        System.out.println("Modell: " + model);
        System.out.println("Baujahr: " + yearOfConstruction);
    }
    // Die geschützte Methode "informationMotorcycle()" wird in der Klasse "Motorrad" deklariert, jedoch nicht implementiert.
    // Dies könnte eine Platzhaltermethode sein, die in Unterklassen überschrieben wird, um spezifische Informationen über das Motorrad auszugeben.
    protected void informationMotorcycle() {
    }
}

