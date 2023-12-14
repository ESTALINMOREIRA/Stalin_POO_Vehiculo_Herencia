package ejericio.vehiculo;

public class Motocicleta extends Vehiculo {

    public Motocicleta(String propietario, String color, int anio, String marca) {
        super(propietario, color, anio, marca);
       
    }

    public void encenderMoto() {

        System.out.println("PONIENDO LLAVES EN MOTO Y ENCENDIENDO EL MOTOR!!");
    }

    @Override
    public void descripcion() {
        super.descripcion(); // Llamar al método descripcion de la clase padre

    }

}
