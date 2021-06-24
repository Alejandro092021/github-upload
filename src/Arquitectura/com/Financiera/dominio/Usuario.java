
package Arquitectura.com.Financiera.dominio;

public class Usuario {
    String usuarioId;
    String usuarioNombre;
    String usuarioPassword;

    public Usuario() {
    }

    
    
    public Usuario(String usuarioId, String usuarioNombre, String usuarioPassword) {
        this.usuarioId = usuarioId;
        this.usuarioNombre = usuarioNombre;
        this.usuarioPassword = usuarioPassword;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getUsuarioPassword() {
        return usuarioPassword;
    }

    public void setUsuarioPassword(String usuarioPassword) {
        this.usuarioPassword = usuarioPassword;
    }
    
    
}
