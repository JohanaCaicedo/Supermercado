package Supermercado;

import Supermercado.Almacen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import myExceptions.ObjectNotFoundException;

/**
 *
 * @author sony
 */
public class Grafica2 extends javax.swing.JFrame {

    private Almacen almacen;
    private Ventas ventas = null;
    private Grafica1 grafic = null;

    public Grafica2(Almacen almacen) {
        this.almacen = almacen;
        initComponents();
        
        IniciarSesion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                login.setVisible(true);
            }
        });
        
        
        this.AcercaDe.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Grafica2.this, "Implementado por: Cindy Johana Caicedo");
            }
        });
        this.RealizarCompra.addActionListener(new ManejadorCompra());
        this.MostrarVentas.addActionListener(new ManejadorVenta());
        
        
        aceptar1.addActionListener(new loginEmpleado());
        contraseña1.addActionListener(new loginEmpleado());
        
        CerrarSesion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                login.setVisible(true);
                grafic.setVisible(true);
                grafic.cancelventa.actionPerformed(e);
            }
        });
        super.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //System.out.println("windowClosing");
                ObjectOutputStream oos = null;
                try {
                    oos = new ObjectOutputStream(new FileOutputStream("phonebook.data"));
                    oos.writeObject(Grafica2.this.almacen);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Grafica2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Grafica2.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    if (oos != null) {
                        try {
                            oos.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Grafica2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

            }

            @Override
            public void windowClosed(WindowEvent e) {
                //System.out.println("windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Desktop = new javax.swing.JDesktopPane();
        login = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usuario1 = new javax.swing.JTextField();
        contraseña1 = new javax.swing.JTextField();
        aceptar1 = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        aplicacion = new javax.swing.JMenu();
        IniciarSesion = new javax.swing.JMenuItem();
        CerrarSesion = new javax.swing.JMenuItem();
        MostrarVentas = new javax.swing.JMenuItem();
        RealizarCompra = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();
        AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Usuario");

        jLabel6.setText("Contraseña");

        aceptar1.setText("Aceptar");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(contraseña1))
                .addGap(96, 96, 96))
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(aceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptar1)
                .addContainerGap())
        );

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        Desktop.setLayer(login, javax.swing.JLayeredPane.DEFAULT_LAYER);

        aplicacion.setText("APLICACIÓN");

        IniciarSesion.setText("Iniciar Sesion");
        aplicacion.add(IniciarSesion);

        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.setEnabled(false);
        aplicacion.add(CerrarSesion);

        MostrarVentas.setText("Mostrar Ventas");
        MostrarVentas.setEnabled(false);
        MostrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarVentasActionPerformed(evt);
            }
        });
        aplicacion.add(MostrarVentas);

        RealizarCompra.setText("Realizar Compra");
        RealizarCompra.setEnabled(false);
        aplicacion.add(RealizarCompra);

        MenuBar.add(aplicacion);

        ayuda.setText("AYUDA");

        AcercaDe.setText("Acerca de");
        ayuda.add(AcercaDe);

        MenuBar.add(ayuda);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MostrarVentasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AcercaDe;
    private javax.swing.JMenuItem CerrarSesion;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem IniciarSesion;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem MostrarVentas;
    private javax.swing.JMenuItem RealizarCompra;
    private javax.swing.JButton aceptar1;
    private javax.swing.JMenu aplicacion;
    private javax.swing.JMenu ayuda;
    private javax.swing.JTextField contraseña1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel login;
    private javax.swing.JTextField usuario1;
    // End of variables declaration//GEN-END:variables

    public class loginEmpleado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                Empleado empleado = almacen.BuscarEmpleado(usuario1.getText().trim());
                if (empleado.getContraseña().equals(contraseña1.getText().trim())) {
                    almacen.logueado = empleado;
                    CerrarSesion.setEnabled(true);
                    MostrarVentas.setEnabled(true);
                    RealizarCompra.setEnabled(true);
                    login.setVisible(false);
                    
                    new ManejadorCompra().actionPerformed(e);
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña no es correcta");
                }

            } catch (ObjectNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }

    }
    
    
    public class ManejadorCompra implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                if (grafic == null) {
                    grafic = new Grafica1(almacen);
                    Desktop.add(grafic);
                }
                grafic.setVisible(true);
            }
        }
    
    public class ManejadorVenta implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                if (ventas == null) {
                    ventas = new Ventas(almacen);
                    Desktop.add(ventas);
                }
                ventas.setVisible(true);
            }

        }
    
}
