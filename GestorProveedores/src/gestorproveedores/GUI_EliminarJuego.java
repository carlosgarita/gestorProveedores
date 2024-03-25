/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestorproveedores;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class GUI_EliminarJuego extends javax.swing.JFrame {

    /**
     * Creates new form GUI_eliminarJuego
     */
    public GUI_EliminarJuego() {
        initComponents();
    }
    
    public void llenarComboBoxProveedores() {
        // Vaciar el combobox antes de llenarlo
        cmbx_listaProveedores.removeAllItems();

        QueueArray<Proveedor> proveedoresTemp = new QueueArray<>();

        // Recorrer la cola y agregar los proveedores al QueueArray temporal
        while (!GestorProveedores.colaProveedores.isEmpty()) {
            Proveedor proveedor = (Proveedor) GestorProveedores.colaProveedores.dequeue();
            proveedoresTemp.enqueue(proveedor);
            String descripcion = proveedor.getDescripcion();
            cmbx_listaProveedores.addItem(descripcion);
        }

        // Repoblar la cola original con los proveedores del QueueArray temporal
        while (!proveedoresTemp.isEmpty()) {
            Proveedor proveedor = proveedoresTemp.dequeue();
            GestorProveedores.colaProveedores.enqueue(proveedor);
        }
    }

    //StackArray<Juego> juegoAEliminar = null;
    StackArray<Juego> listaJuegos = null;
    //StackArray<Juego> pilaDuplicada = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JButton();
        cmbx_listaProveedores = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_juegosAsociados = new javax.swing.JTable();
        btn_mostrarJuegos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_eliminarJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Eliminar Juego");

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        cmbx_listaProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Elegir proveedor:");

        tbl_juegosAsociados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Ctgoría. / Interacción", "Ctgoría / Accesorios", "Mecánica", "No. Participantes", "Edad Mín."
            }
        ));
        jScrollPane1.setViewportView(tbl_juegosAsociados);

        btn_mostrarJuegos.setText("Mostrar Juegos Asociados");
        btn_mostrarJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarJuegosActionPerformed(evt);
            }
        });

        jLabel3.setText("Juegos asociados al proveedor elegido:");

        btn_eliminarJuego.setBackground(new java.awt.Color(255, 0, 0));
        btn_eliminarJuego.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarJuego.setText("Eliminar Juego de Pila");
        btn_eliminarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cerrar)
                    .addComponent(btn_eliminarJuego)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(cmbx_listaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(btn_mostrarJuegos))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbx_listaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mostrarJuegos))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarJuego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btn_cerrar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        // TODO add your handling code here:
        GestorProveedores.ocultarEliminarJuego();
        GestorProveedores.mostrarMenuPrincipal();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    
    private void btn_mostrarJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarJuegosActionPerformed
        // TODO add your handling code here:
        mostrarJuegosEnTabla();
    
    
    }//GEN-LAST:event_btn_mostrarJuegosActionPerformed

    public void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) tbl_juegosAsociados.getModel();
        model.setRowCount(0);
    }
    
    public void limpiarComboBox() {
         cmbx_listaProveedores.setSelectedIndex(-1);
    }
    
    private void mostrarJuegosEnTabla() {
        limpiarTabla();
        String elementoSeleccionado = (String) cmbx_listaProveedores.getSelectedItem();
        QueueArray<Proveedor> proveedoresTemp = new QueueArray<>();

    if (elementoSeleccionado != null) {
        Proveedor proveedor;
        Juego juego;
        DefaultTableModel tableModel = (DefaultTableModel) tbl_juegosAsociados.getModel();
        
        StackArray<Juego> juegosTemporales = new StackArray();

        // Variable para verificar si se encontraron juegos asociados al proveedor seleccionado
        //boolean juegosEncontrados = false;

        // Recorrer la cola y buscar el proveedor seleccionado
        while (!GestorProveedores.colaProveedores.isEmpty()) {
            proveedor = (Proveedor) GestorProveedores.colaProveedores.dequeue();
            proveedoresTemp.enqueue(proveedor);

            if (proveedor.getDescripcion().equals(elementoSeleccionado)) {
                listaJuegos = proveedor.getJuegosStack();
                   
                
                // Mostrar los juegos asociados a este proveedor
                if (listaJuegos != null && !listaJuegos.isEmpty()) {
                    //juegosEncontrados = true; // Indicar que se encontraron juegos
                    while (!listaJuegos.isEmpty()) {
                        juego = listaJuegos.topAndPop();
                        juegosTemporales.push(juego);
                        tableModel.addRow(new Object[] {
                            juego.getCodigoGUID(),
                            juego.getNombre(),
                            juego.getCategoriaInteraccion(),
                            juego.getCategoriaAccesorios(),
                            juego.getMecanica(),
                            juego.getNumeroParticipantes(),
                            juego.getEdadMinima()
                        });
                        
                    }

                    // Devolver el proveedor a la cola original
                    //GestorProveedores.colaProveedores.enqueue(proveedor);

                    // Terminar el bucle una vez que se haya encontrado el proveedor
                    break;
                } else {
                    // Aquí manejas el caso en el que no hay juegos disponibles
                    JOptionPane.showMessageDialog(this, "No hay juegos disponibles para este proveedor.", "Sin Juegos Disponibles", JOptionPane.INFORMATION_MESSAGE);
                    break; // Salir del bucle ya que no hay juegos asociados
                }
                
               

            } else {
                // Devolver los proveedores que no coinciden con el seleccionado
                //GestorProveedores.colaProveedores.enqueue(proveedor);
            }
             
        }
        
        // Repoblar la cola original con los proveedores del QueueArray temporal
        while (!proveedoresTemp.isEmpty()) {
            proveedor = proveedoresTemp.dequeue();
            GestorProveedores.colaProveedores.enqueue(proveedor);
        }
        
    } else {
        System.out.println("No se ha seleccionado ningún proveedor.");
    }
    
    }
    
    private void btn_eliminarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarJuegoActionPerformed
        // TODO add your handling code here:
        //juegoAEliminar.pop();
        
        //NO PUDE HACER ESTA FUNCION.
        //SE ME VACIA LA PILA CUANDO LA RECORRO PARA SACAR SUS DATOS.
        //Y NO ME DIO TIEMPO DE HACERLA FUNCIONAR.
        
        mostrarJuegosEnTabla();
    }//GEN-LAST:event_btn_eliminarJuegoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_EliminarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_EliminarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_EliminarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_EliminarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_EliminarJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_eliminarJuego;
    private javax.swing.JButton btn_mostrarJuegos;
    private javax.swing.JComboBox<String> cmbx_listaProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_juegosAsociados;
    // End of variables declaration//GEN-END:variables
}
