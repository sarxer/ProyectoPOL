package tiendapolimorfismo;

public class Trabajador {

    private String nombre;
    private int documento;
    private String cargo;
    private double salario;

public Trabajador(String nombre, int documento, String cargo, double salario) {
    this.nombre = nombre;
    this.documento = documento;
    this.cargo = cargo;
    this.salario = salario;
}
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getDocumento() {
    return documento;
}

public void setDocumento(int documento) {
    this.documento = documento;
}

public String getCargo() {
    return cargo;
}

public void setCargo(String cargo) {
    this.cargo = cargo;
}

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}
}
