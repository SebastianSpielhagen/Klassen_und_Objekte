package org.spielhagen;

// Die Klasse "Fahrzeug" deklariert private Instanzvariablen, um Informationen über ein Fahrzeug zu speichern.
// Diese Variablen umfassen den Hersteller (brand), das Modell (model) und das Baujahr (yearOfConstruction).
public class Fahrzeug {
    private String brand;
    private String model;
    private int yearOfConstruction;


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
}

