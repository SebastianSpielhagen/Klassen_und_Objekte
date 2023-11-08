package org.spielhagen;

public class Main {
    public static void main(String[] args) {

        // Erstellt eine Instanz der Basisklasse "Fahrzeug" (car) und der abgeleiteten Klasse "Auto" (auto).
        Fahrzeug car = new Fahrzeug("BMW", "F11", 2016);
        Auto auto = new Auto("Ford", "Transit MK7", 2014, 4);

        // Gibt Informationen über das Fahrzeug aus, indem die Methode "informationCar()" aufgerufen wird.
        System.out.println("Informationen über das Fahrzeug:");
        car.informationCar();
        // Gibt Informationen über das Auto aus, indem die Methode "informationCar()" aufgerufen wird.
        System.out.println("\nInformationen über das Auto:");
        auto.informationCar();
    }
}
