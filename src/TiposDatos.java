public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en java
        //enteros (valor por defecto 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32767;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 9223372036854775807L; // L al final para indicar que es un long
        System.out.println("tipoLong = " + tipoLong);
        //Punto flotante (valor por defecto 0.0)
        float tipoFloat = 3.4028235E38F; // F al final para indicar que es un float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble2 = 1.7976931348623157E3D; // D al final para indicar que es un double
        System.out.println("tipoDouble2 = " + tipoDouble2);
        double tipoDouble = 1.7976931348623157E308;
        System.out.println("tipoDouble = " + tipoDouble);
        //Caracter (valor por defecto \u0000)
        char tipoChar = 'A'; //carateres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; // ASCII
        System.out.println("tipoChar = " + tipoChar); // Imprime A
        //Boolean (valor por defecto false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);
        //Tipos de datos de referencia
        String nombre = null; //ausencia de referencia
        System.out.println("nombre = " + nombre);
        nombre = "Gael Cruz";
        System.out.println("nombre = " + nombre);


    }
}
