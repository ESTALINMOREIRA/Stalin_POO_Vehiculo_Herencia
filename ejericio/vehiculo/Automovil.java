package ejericio.vehiculo;

public class Automovil extends Vehiculo{

    public int numeroPuertas;
    public Automovil(String propietario, String color, int anio, String marca, int numeroPuertas) {
        super(propietario, color, anio, marca);//herencia de atributos del la clase padre
        this.numeroPuertas= numeroPuertas;
    
    }


    @Override
    public void descripcion() {
        super.descripcion(); // Llamar al método descripcion de la clase padre
        System.out.println("Numero Puertas"+numeroPuertas);

    }

    public void encenderAuto() {

        System.out.println("PONIENDO LLAVES EN EL AUTO Y ME VOY CON CALEFACION , MUSICA Y GRAN SEGURIDAD!! :) ");
    }

}
