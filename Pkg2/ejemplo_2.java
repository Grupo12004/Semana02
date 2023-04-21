package ejemplo_2;

public class ejemplo_2 {
    public static void main(String[] args) {

        Coche miCoche = new Coche ("Toyota", "Corolla", 4);

        miCoche.arrancar();

        miCoche.abrirPuertas();
        System.out.println("-------------------------------------");

        Vehiculo vehiculoPolimorfico = new Coche ("Mazda", "CX-5", 4);
        vehiculoPolimorfico.arrancar();
        miCoche.abrirPuertas();

    }
}

