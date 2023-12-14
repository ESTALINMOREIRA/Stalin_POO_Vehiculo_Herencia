package ejericio.vehiculo;

public class Vehiculo {

    private String propietario;
    public String color;
    public int anio;
    public String marca;

    public Vehiculo(String propietario, String color, int anio, String marca) {
        this.propietario = propietario;
        this.color = color;
        this.anio = anio;
        this.marca = marca;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }


    public void descripcion(){

        System.out.println("Propietario: " + propietario);
        System.out.println("Color: " + color);
        System.out.println("Año: " + anio);
        System.out.println("Marca: " + marca);
    }

}
