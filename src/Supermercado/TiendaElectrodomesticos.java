
package Supermercado;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 * @author Cindy Johana Caicedo
 * Codigo: 1461405-27111
 */

public class TiendaElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Almacen almacen = new Almacen ("ElectroHogar",6433434);
            
            Cliente cliente1 = new Cliente(189,"oscar","lopez",0);
            Cliente cliente2 = new Cliente(456,"jose","ibañez",0);
            Cliente cliente3 = new Cliente(123,"antonio","mosquera",0);
            Cliente cliente4 = new Cliente(752,"pedro","payarez",0);
            almacen.addCliente(cliente3);
            almacen.addCliente(cliente1);
            almacen.addCliente(cliente2);
            almacen.addCliente(cliente4);
            
            Empleado e1 = new Empleado(8656,"andres","arango","andres.arango","234");
            Empleado e2 = new Empleado(6678,"felipe","benavides","felipe.benavides","123");
            Empleado e3 = new Empleado(665,"zohan","mosquera","zohan.mosquera","768");
            Empleado e4 = new Empleado(985,"luna","castillo","luna.castillo","910");
            almacen.addEmpleado(e1);
            almacen.addEmpleado(e2);
            almacen.addEmpleado(e3);
            almacen.addEmpleado(e4);  
            
            Producto pr1 = new Producto ("ref334","licuadora",100);
            Producto pr2 = new Producto ("ref329","nevera",250);
            Producto pr3 = new Producto ("ref325","televisor",380);
            Producto pr4 = new Producto ("ref337","estufa",40350);
            Producto pr5 = new Producto ("ref374","aromatica",180450);
            Producto pr6 = new Producto ("ref322","computador",34000);
            Producto pr7 = new Producto ("ref355","ventilador",34000);
            Producto pr8 = new Producto ("ref378","horno",1800);
            Producto pr9 = new Producto ("ref356","lavadora",560);
            Producto pr10 = new Producto("ref416","olla",3000);
            almacen.addProducto(pr1);
            almacen.addProducto(pr2);
            almacen.addProducto(pr3);
            almacen.addProducto(pr4);
            almacen.addProducto(pr5);
            almacen.addProducto(pr6);
            almacen.addProducto(pr7);
            almacen.addProducto(pr8);
            almacen.addProducto(pr9);
            almacen.addProducto(pr10);
            Grafica2 Grafica2 = new Grafica2(almacen);
            Grafica2.setVisible(true);
            
         
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null,"debe ingresar valores numericos");
        }
         catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    
}
