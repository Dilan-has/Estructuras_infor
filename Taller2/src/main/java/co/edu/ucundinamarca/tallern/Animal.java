package co.edu.ucundinamarca.tallern;

import java.util.Objects;

public class Animal {

    private String nombre;
    private String especie;
    private int edad;
    private int patas;
    private int identificacion;

   
     public Animal (String nombre, int edad, int identificacion, String especie, int patas) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.edad = edad;
        this.patas = patas;
         
     }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Animal that = (Animal) obj;
        return Objects.equals(this.getNombre(), that.getNombre())
                && Objects.equals(this.getEdad(), that.getEdad())
                && Objects.equals(this.getIdentificacion(), that.getIdentificacion())
                && Objects.equals(this.getPatas(), that.getPatas())
                && Objects.equals(this.getEspecie(), that.getEspecie());

    }
    
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getEdad();
        result = 31 * result + getIdentificacion();
        return result;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
}
