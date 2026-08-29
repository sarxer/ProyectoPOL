package tiendapolimorfismo;

public class Gerente {

    private String nombre;
    private int documento;
    private String area;
    private double salario;

    
public Gerente(String nombre, int documento, String area, double salario) {
    this.nombre = nombre;
    this.documento = documento;
    this.area = area;
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

public String getArea() {
    return area;
}

public void setArea(String area) {
    this.area = area;
}

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}
}
