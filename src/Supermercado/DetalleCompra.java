
package Supermercado;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Cindy Johana Caicedo Caicedo
 * Codigo: 1461405-2711
 */

public class DetalleCompra implements Serializable{
    
    
   private int cantProductos;
   private Producto producto;

    public DetalleCompra(int cantProductos, Producto producto) {
        this.cantProductos = cantProductos;
        this.producto = producto;
    }
    
    
   public long costoProducto (){
      return producto.getCostoUnitario() * cantProductos;
   }
   
 

    public int getCantProductos() {
        return cantProductos;
    }

    public Producto getProducto() {
        return producto;
    }
    
    public void IncrementarCantidad(int cant){
        this.cantProductos +=cant;
    }
    
    public void DecrementarCantidad(int cant){
        this.cantProductos -=cant;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetalleCompra other = (DetalleCompra) obj;
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        return true;
    }
    
    
}
