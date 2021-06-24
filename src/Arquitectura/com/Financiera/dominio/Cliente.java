package Arquitectura.com.Financiera.dominio;

public class Cliente {

    private int codigo;
    private String nombre;
    private String apellidos;
    private String dni;
    private boolean tienePrestamoPendiente;
    
    public Cliente() {
        this.tienePrestamoPendiente = false;
    }
    
    public Cliente(int codigo, String nombre, String apellidos, String dni, boolean prestamoPendiente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tienePrestamoPendiente = prestamoPendiente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrestamoPendiente(boolean prestamoPendiente) {
        this.tienePrestamoPendiente = prestamoPendiente;
    }

    public boolean getPrestamoPendiente() {
        return tienePrestamoPendiente;
    }
}
