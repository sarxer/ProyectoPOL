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

        
        
    }
}
