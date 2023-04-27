package ejemplo_2;

    public class Coche extends Vehiculo {

            private int numPuertas ;
            public Coche ( String marca, String modelo, int numPuertas) {
                super (marca, modelo);
                this . numPuertas = numPuertas;
            }

            public void   abrirPuertas ( ) {
                System.out.print( "Abriendo las " + numPuertas + "puertas del coche ");
            }
    }



