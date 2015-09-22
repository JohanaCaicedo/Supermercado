/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supermercado;

import java.io.Serializable;
import myExceptions.SpaceException;
import java.util.Objects;

/**
 * @author Cindy Johana Caicedo
 * Codigo: 1461405-2711
 */

public class Producto implements Serializable{

   private String Codigo;
   private String Nombre;
   private long CostoUnitario;

    public Producto(String codigo, String nombre, long costoUnitario) throws Exception {
        
        if (codigo == null || "".equals(codigo.trim())) {
            throw new SpaceException();
        } else { this.Codigo = codigo;
        }
        
        if (nombre == null || "".equals(nombre.trim())) {
            throw new SpaceException();
        } else { this.Nombre = nombre;
        }
        
        if (nombre == null || "".equals(nombre.trim())) {
            throw new SpaceException();
        } else { this.Nombre = nombre;
        }
        this.CostoUnitario = costoUnitario;
    }
    
   public void setCostoUnitario(int costoUnitario) {
        this.CostoUnitario = costoUnitario;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public long getCostoUnitario() {
        return CostoUnitario;
    }

  

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.Codigo, other.Codigo)) {
            return false;
        }
        return true;
    }

   

    @Override
    public String toString() {
        return "codigo = " + Codigo + ", nombre = " + Nombre;
    }
   
}
