
package Supermercado;

import myExceptions.SpaceException;
import java.util.Objects;

/**
 * @author Cindy Johana Caicedo
 * Codigo: 1461405-2711
 */

public class Empleado {
   
    private long identificacion;
    private String nombres;
    private String apellidos;
    private String login;
    private String contraseña;

    public Empleado(long identificación, String nombres, String apellidos, String login, String contraseña) throws Exception {
        
        this.identificacion = identificación;
        
        if (nombres == null || "".equals(nombres.trim())) {
            throw new SpaceException();
        } else { this.nombres = nombres;
        }
        
        if (apellidos == null || "".equals(nombres.trim())) {
            throw new SpaceException();
        } else { this.apellidos = apellidos;
        }
        
        if (nombres == null || "".equals(nombres.trim())) {
            throw new SpaceException();
        } else { this.login = login;
        }
        
        if (contraseña == null || "".equals(nombres.trim())) {
            throw new SpaceException();
        } else { this.contraseña = contraseña;
        }          
    }

    /**
     * METODOS GET
     */
    
    public long getIdentificación() {
        return identificacion;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getLogin() {
        return login;
    }

    public String getNombres() {
        return nombres;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setLogin(String login) {
        this.login = login;
    }
   
    
   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.identificacion != other.identificacion) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nombres=" + nombres + ", apellidos=" + apellidos ;
    }
  

    
}
