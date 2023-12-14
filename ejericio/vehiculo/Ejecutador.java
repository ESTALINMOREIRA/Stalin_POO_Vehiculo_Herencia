package ejericio.vehiculo;

public class Ejecutador {
    public static void main(String[] args) {
        // Crear objetos de la clase Automovil
        Automovil auto1 = new Automovil("Juan", "Rojo", 2022, "Toyota", 4);
        Automovil auto2 = new Automovil("Ana", "Azul", 2023, "Honda", 2);

        // Llamar al método descripcion y otros métodos de la clase Automovil
        System.out.println("Descripción del Automovil 1:");
        auto1.descripcion();
        auto1.encenderAuto();
        System.out.println();

        System.out.println("Descripción del Automovil 2:");
        auto2.descripcion();
        auto2.encenderAuto();
        System.out.println();

        // Crear objetos de la clase Motocicleta
        Motocicleta moto1 = new Motocicleta("Pedro", "Negro", 2021, "Harley Davidson");
        Motocicleta moto2 = new Motocicleta("Maria", "Blanco", 2022, "Yamaha");

        // Llamar al método descripcion y otros métodos de la clase Motocicleta
        System.out.println("Descripción de la Motocicleta 1:");
        moto1.descripcion();
        moto1.encenderMoto();
        System.out.println();

        System.out.println("Descripción de la Motocicleta 2:");
        moto2.descripcion();
        moto2.encenderMoto();
    }
}
