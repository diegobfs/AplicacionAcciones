/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Criptomoneda;
import aplicacion.IVentana;
import aplicacion.Usuario;
import java.awt.Color;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author itocd
 */
public class VGestionCriptomonedas extends javax.swing.JDialog {

    /**
     * Creates new form VgestionCripto
     */
    aplicacion.FachadaAplicacion fa;
    private VPrincipal vp;
    Usuario usuario;
    IVentana ventana;

    public VGestionCriptomonedas(java.awt.Frame parent, boolean modal, aplicacion.FachadaAplicacion fa, Usuario user, IVentana ventana) {
        super(parent, modal);
        this.fa = fa;
        vp = this.vp;
        this.usuario = user;
        this.ventana = ventana;
        initComponents();
        this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoCriptomoneda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVender = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonCompra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        textoCriptomoneda.setForeground(new java.awt.Color(204, 204, 204));
        textoCriptomoneda.setToolTipText("");
        textoCriptomoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCriptomonedaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VPrincipal/botonBuscar.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VPrincipal/botonRefrescar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VRegistro/botonVolver.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGenerales/botonVenderCriptomoneda.png"))); // NOI18N
        btnVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVenderMouseClicked(evt);
            }
        });

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CriptoMoneda");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        jTable1.setModel((TableModel) modelo);
        /*
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        */
        jScrollPane1.setViewportView(jTable1);
        /*
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        */
        actualizarTabla("");

        botonCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGenerales/botonComprarCriptomoneda.png"))); // NOI18N
        botonCompra.setBorderPainted(false);
        botonCompra.setContentAreaFilled(false);
        botonCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCompraMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("CRIPTOMONEDAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnVender)
                        .addGap(12, 12, 12)
                        .addComponent(botonCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textoCriptomoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(textoCriptomoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btnVender)
                    .addComponent(botonCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoCriptomonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCriptomonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCriptomonedaActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        ventana.onSuccess();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        actualizarTabla(this.textoCriptomoneda.getText());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        actualizarTabla("");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMouseClicked
        int seleccion = jTable1.getSelectedRow();
        if (jTable1.getSelectedRow() != -1) {
            String nombreCripto = jTable1.getValueAt(seleccion, 0).toString();
            float cantidad = Float.parseFloat(jTable1.getValueAt(seleccion, 1).toString());
            String tipo = jTable1.getValueAt(seleccion, 1).toString();
            IVentana iventana = new IVentana() {
                @Override
                public void onSuccess() {
                    actualizarTabla("");
                }
            };
            fa.visualizarVVenderCripto(usuario, nombreCripto, cantidad, iventana);
        }
    }//GEN-LAST:event_btnVenderMouseClicked

    private void botonCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCompraMouseClicked
        // TODO add your handling code here:
        IVentana iventana = new IVentana() {
            @Override
            public void onSuccess() {
                actualizarTabla("");
            }
        };
        fa.visualizarCompraCriptos(usuario, iventana);
    }//GEN-LAST:event_botonCompraMouseClicked

    private void actualizarTabla(String nombreCripto) {
        DefaultTableModel modelo = new DefaultTableModel();
        Iterator<Criptomoneda> ofertasAccionesIterator = fa.consultarCriptos(usuario.getId_usuario(), nombreCripto).iterator();
        Criptomoneda auxiliar;
        modelo.addColumn("CriptoMoneda");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        while (ofertasAccionesIterator.hasNext()) {
            auxiliar = ofertasAccionesIterator.next();

            modelo.addRow(new Object[]{auxiliar.getNombre(), auxiliar.getCantidad(), auxiliar.getPrecioActual()});
        }

        jTable1.setModel((TableModel) modelo);
        if (modelo.getRowCount() > 0) {
            jTable1.setRowSelectionInterval(0, 0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCompra;
    private javax.swing.JLabel btnVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textoCriptomoneda;
    // End of variables declaration//GEN-END:variables
}
