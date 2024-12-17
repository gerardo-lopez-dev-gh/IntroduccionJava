public class DetalleLibro {
    public static void main(String[] args) {
        //Detalle del libro
        //Memoria stack      Memoria heap
        String tituloLibro = "El señor de los anillos";
        //Memoria stack
        int anoPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;
        //Imprimir las variables
        System.out.println("Titulo: " + tituloLibro);
        System.out.println("Año de publicación: " + anoPublicacion);
        System.out.println("Disponible: " + libroDisponible);
        System.out.println("Precio: " + precio);
    }
}
