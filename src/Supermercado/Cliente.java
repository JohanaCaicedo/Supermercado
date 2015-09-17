
package Supermercado;

import myExceptions.SpaceException;
import java.util.Objects;

/**
 * @author Cindy Johana Caicedo Caicedo
 * Codigo: 1461405-2711
 */

public class Cliente {
    
    
    long Identificacion;
    String Nombres;
    String Apellidos;
    int PuntosAcumulados;  

    public Cliente(long identificación, String nombres, String apellidos, int puntosAcumulados) throws Exception {
        
        this.Identificacion = identificación;
        
        if (nombres == null || "".equals(nombres.trim())) {
            throw new SpaceException();
        } else { this.Nombres = nombres;
        }
        
        if (apellidos == null || "".equals(apellidos.trim())) {
            throw new SpaceException();
        } else { this.Apellidos = apellidos;
        }
        
        this.PuntosAcumulados = puntosAcumulados;
    }
    /** Metodos get
     * 
     * @return atributos de clase
     */
    public String getApellidos() {
        return Apellidos;
    }

    public long getIdentificacion() {
        return Identificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public int getPuntosAcumulados() {
        return PuntosAcumulados;
    }
 
   
    
    public void incrementarPuntos(int puntos){
        PuntosAcumulados += puntos;
        
    }
    
    public void setPuntos(int puntos) {
        PuntosAcumulados = puntos;
    }


 
     @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.Identificacion != other.Identificacion) {
            return false;
        }
        return true;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setPuntosAcumulados(int PuntosAcumulados) {
        this.PuntosAcumulados = PuntosAcumulados;
    }

    @Override
    public String toString() {
        return "Nombre: "+ Nombres + ", Apellidos=" + Apellidos;
    }
}
