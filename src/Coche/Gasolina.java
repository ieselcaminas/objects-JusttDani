package Coche;

public abstract class Gasolina extends Coche {
    public Gasolina(String nombre){
        super(nombre);
    }

    public void Combustible(){
        System.out.println("Combustible: Gasolina");
    }
}