package tiendapolimorfismo;

public class Cliente {

    private String nombre;
    private int documento;
    private String telefono;
    private String correo;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre, int documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public Cliente(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}