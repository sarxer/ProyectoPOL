package tiendapolimorfismo;

public class TiendaPolimorfismo {

    public static void main(String[] args) {

        Trabajador trabajador1 = new Trabajador("Carlos");
        Trabajador trabajador2 = new Trabajador("Ana", "Vendedora");
        Trabajador trabajador3 = new Trabajador("Luis", "Administrador", 2500000);

        Gerente gerente1 = new Gerente("Laura");
        Gerente gerente2 = new Gerente("Pedro", "Ventas");
        Gerente gerente3 = new Gerente("Marta", "Administracion", 4000000);

        Cliente cliente1 = new Cliente("Sofia");
        Cliente cliente2 = new Cliente("Daniel", 25);
        Cliente cliente3 = new Cliente("Camila", "3001234567", "camila@gmail.com");

        Mascota mascota1 = new Mascota("Luna");
        Mascota mascota2 = new Mascota("Max", "Perro");
        Mascota mascota3 = new Mascota("Milo", "Gato", "Siames", 2);

        System.out.println("TRABAJADORES");
        System.out.println(trabajador1.getNombre());
        System.out.println(trabajador2.getNombre());
        System.out.println(trabajador3.getNombre());

        System.out.println();

        System.out.println("GERENTES");
        System.out.println(gerente1.getNombre());
        System.out.println(gerente2.getNombre());
        System.out.println(gerente3.getNombre());

        System.out.println();

        System.out.println("CLIENTES");
        System.out.println(cliente1.getNombre());
        System.out.println(cliente2.getNombre());
        System.out.println(cliente3.getNombre());

        System.out.println();

        System.out.println("MASCOTAS");
        System.out.println(mascota1.getNombre());
        System.out.println(mascota2.getNombre());
        System.out.println(mascota3.getNombre());
        
    }
}
