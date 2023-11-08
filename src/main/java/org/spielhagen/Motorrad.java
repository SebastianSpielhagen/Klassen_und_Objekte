package org.spielhagen;

// Die geschützte Instanzvariable "motorcycleArt" in der Klasse "Motorrad" erlaubt den Zugriff auf die Art des Motorrads
// von abgeleiteten Klassen und in der gleichen Paketebene, um spezifische Informationen über das Motorrad zu speichern.
public class Motorrad extends Fahrzeug {
    protected String motorcycleArt;
    // Der Konstruktor der Klasse "Motorrad" erweitert den Konstruktor der Basisklasse "Fahrzeug" und ermöglicht die
    // Initialisierung der zusätzlichen Information "motorcycleArt" (Art des Motorrads) spezifisch für Motorräder.
    public Motorrad(String brand, String model, int yearOfConstruction, String motorcycleArt) {
        super(brand, model, yearOfConstruction);
        this.motorcycleArt = motorcycleArt;
    }
    // Diese Methode überschreibt die Methode "informationMotorcycle()" aus der Basisklasse "Fahrzeug", um zusätzliche
    // Informationen zur Art des Motorrads (motorcycleArt) auszugeben. Sie ruft die Methode der Basisklasse mit "super"
    // auf und ergänzt die Informationen zur Motorradart.
    @Override
    public void informationMotorcycle() {
        super.informationMotorcycle(); // Ruft die Methode der Basisklasse auf
        System.out.println("Art des Motorrads: " + motorcycleArt);
    }
}

