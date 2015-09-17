package Supermercado;

import myExceptions.ObjectNotFoundException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Cindy Johana Caicedo Codigo: 1461405-2711
 */
public class Almacen {

    String Nombre;
    long Nit;

    private LinkedList<Producto> Productos;
    private LinkedList<Empleado> Empleados;
    private LinkedList<Cliente> Clientes;
    private LinkedList<Compra> Compras;

    public Almacen(String nombres, long nit) {
        this.Nombre = nombres;
        this.Nit = nit;

        Productos = new LinkedList<>();
        Empleados = new LinkedList<>();
        Clientes = new LinkedList<>();
        Compras = new LinkedList<>();
    }

    public LinkedList<Compra> getCompras() {
        return Compras;
    }

    //*******************************    
    // Metodos add de las listas
    public void addProducto(Producto p) throws Exception {
        if (Productos.contains(p)) {
            throw new Exception("Ya esta registrado este producto: " + p.toString());
        }
        Productos.add(p);
    }

    public void addEmpleado(Empleado e) throws Exception {
        if (Empleados.contains(e)) {
            throw new Exception("El empleado: " + e.toString() + " ya esta Registrado");
        } else {
            Empleados.add(e);
        }
    }

    public void addCliente(Cliente c) throws Exception {
        if (Clientes.contains(c)) {
            throw new Exception("El cliente: " + c.toString() + " Ya esta registrado");
        }
        Clientes.add(c);
    }

    public void addCompra(Compra co) throws Exception {
        if (Compras.contains(co)) {
            throw new Exception("La compra ya esta registrada");
        }
        Compras.add(co);
    }

    //******************************
    // Metodos de Busqueda
    /**
     * buscarEmpleado Busca en la lista de empleado por numero de identificacion
     *
     * @param id del empleado a buscar
     * @return empleado
     * @throws ObjectNotFoundException
     */
    public Empleado buscarEmpleado(long id) throws ObjectNotFoundException {
        Empleado empleado = null;
        for (Empleado e : Empleados) {
            if (e.getIdentificación() == id) {
                empleado = e;
            }
        }

        if (empleado == null) {
            throw new ObjectNotFoundException("Empleado con id: " + id + " no encontrado");
        }

        return empleado;
    }

    /**
     * buscarCliente busca un cliente en la lista de clientes por identificacion
     *
     * @param id
     * @return cliente
     * @throws ObjectNotFoundException
     */
    public Cliente buscarCliente(long id) throws ObjectNotFoundException {
        Cliente cliente = null;
        for (Cliente c : Clientes) {
            if (c.getIdentificacion() == id) {
                cliente = c;
            }
        }
        if (cliente == null) {
            throw new ObjectNotFoundException("Cliente con id: " + id + " no encontrado");
        }

        return cliente;
    }

    /**
     * buscarProducto Busca un producto por su codigo
     *
     * @param code
     * @return
     * @throws ObjectNotFoundException
     */
    public Producto buscarProducto(String code) throws ObjectNotFoundException {
        Producto producto = null;
        for (Producto p : Productos) {
            if (p.getCodigo().equalsIgnoreCase(code)) {
                producto = p;
            }
        }
        if (producto == null) {
            throw new ObjectNotFoundException("Producto con codigo: " + code + " no encontrado");
        }

        return producto;

    }

    public Compra BuscarCompra(Cliente client, Date fecha) throws ObjectNotFoundException {
        Compra compra = null;
        for (Compra c : Compras) {
            if ((c.getCliente().equals(client)) && (c.getFecha().equals(fecha))) {
                compra = c;
            }
        }
        if (compra == null) {
            throw new ObjectNotFoundException("Compra del cliente: " + client.toString() + " en la fecha: " + fecha.toString() + " no encontrado");
        }

        return compra;

    }

    //******************************
    public String getNombre() {
        return Nombre;
    }

    public long getNit() {
        return Nit;
    }

}
