
package Supermercado;

import java.io.Serializable;
import myExceptions.ObjectNotFoundException;
import java.util.Date;
import java.util.LinkedList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Cindy Johana Caicedo
 * Codigo: 1461405-2711
 */

public class Compra implements Serializable{
       
    private long valorTotalcompra;
    private Date fechaCompra;   
    private Cliente cliente;
    private Empleado empleado; 
    
    private LinkedList<DetalleCompra>  detalleCompras ;

    public Compra(Empleado empleado) {
        this.valorTotalcompra = 0;
        this.fechaCompra = new Date();
        this.cliente = null;
        this.empleado = empleado;
        this.detalleCompras = new LinkedList<>();
    }
    public Compra(long valorTotalcompra, Date fechacompra, Cliente cliente, Empleado empleado) {
        this.valorTotalcompra = valorTotalcompra;
        this.fechaCompra = new Date();
        this.cliente = cliente;
        this.empleado = empleado;
        this.detalleCompras = new LinkedList<>();
    }

    
    /**
     * Metodo para agregar Detalle de compra
     *
     * @param detalle objeto tipo DetalleCompra
     */
    //hecho por el profe
    public void AgregarDetalle(DetalleCompra detalle){
        try {
            DetalleCompra detacontra = buscar(detalle);
            valorTotalcompra -= detacontra.costoProducto();
           detacontra.IncrementarCantidad(detalle.getCantProductos());
           valorTotalcompra += detacontra.costoProducto();
        } catch (Exception ex) {
             this.detalleCompras.add(detalle);
             valorTotalcompra += detalle.costoProducto();
        }
    }
    //hecho por el profe
    public void Eliminar(int selected){
        DetalleCompra detalle = this.detalleCompras.get(selected);
        this.detalleCompras.remove(selected);
        valorTotalcompra -=detalle.costoProducto();
    }


    public int puntosCompra() {
        int puntosCompra = 0;
        if (valorTotalcompra >= 200000) {
            puntosCompra = (int) Math.floor(valorTotalcompra / 10000.0);
        }
//          Linea eliminada porque los puntos se asignan cuando se registra la venta
        return puntosCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fechaCompra;
    }

    public long getValorTotalcompra() {
        return valorTotalcompra;
    }

    public LinkedList<DetalleCompra> getDetalleCompras() {
        return detalleCompras;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     *
     * @param detalle obejto detalle para buscar un producto en especifico
     * @return
     * @throws ObjectNotFoundException
     */
    public DetalleCompra buscar(DetalleCompra detalle) throws Exception {
        DetalleCompra detalleFound = null;

        for (DetalleCompra detail : this.detalleCompras) {
            if (detalle.equals(detail)) {
                detalleFound = detail;
                break;
            }
        }

        if (detalleFound == null) {
            throw new ObjectNotFoundException("Producto: +" + detalle.toString() + " no encontrado");
        }

        return detalleFound;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compra other = (Compra) obj;
        if (!Objects.equals(fechaCompra, other.fechaCompra)) {
            return false;
        }
        return true;
    }

    
    
}

