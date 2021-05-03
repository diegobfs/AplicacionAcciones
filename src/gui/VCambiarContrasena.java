/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Usuario;
import java.awt.Color;

/**
 *
 * @author anaca
 */
public class VCambiarContrasena extends javax.swing.JDialog {

    private aplicacion.FachadaAplicacion fa;
    private aplicacion.Usuario usuario;
    
    /**
     * Creates new form VCambiarContrasena
     */
    public VCambiarContrasena(java.awt.Frame parent, boolean modal, aplicacion.FachadaAplicacion fa, aplicacion.Usuario usuario) {
        super(parent, modal);
        this.fa = fa;
        this.usuario = usuario;
        initComponents();
        
        this.getContentPane().setBackground(Color.white);
        
        
        txtError.setVisible(false);
        
        //Código de java swing para que funcione la ventana
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dispose();
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

        etiquetaFallo1 = new javax.swing.JLabel();
        labelInsertarContrasena = new javax.swing.JLabel();
        labelInsertarContrasena1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtError = new javax.swing.JLabel();
        fieldInsertar = new javax.swing.JPasswordField();
        fieldConfirmar = new javax.swing.JPasswordField();
        btnSalir = new javax.swing.JButton();

        etiquetaFallo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etiquetaFallo1.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaFallo1.setText("Los campos no coinciden");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelInsertarContrasena.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelInsertarContrasena.setText("Inserte nueva contresña");

        labelInsertarContrasena1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelInsertarContrasena1.setText("Confirmar nueva contraseña");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGenerales/BotonGuardar.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtError.setForeground(new java.awt.Color(204, 0, 0));
        txtError.setText("Contrasena actualizada");
        txtError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        fieldConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldConfirmarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGenerales/botonCancelar.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtError.setForeground(new java.awt.Color(0, 255, 0));
        txtError.setText("Contrasena actualizada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelInsertarContrasena)
                    .addComponent(fieldInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelInsertarContrasena1)
                    .addComponent(fieldConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtError)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelInsertarContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelInsertarContrasena1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtError)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        guardarCambioContrasena();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void fieldConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldConfirmarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etiquetaFallo1;
    private javax.swing.JPasswordField fieldConfirmar;
    private javax.swing.JPasswordField fieldInsertar;
    private javax.swing.JLabel labelInsertarContrasena;
    private javax.swing.JLabel labelInsertarContrasena1;
    private javax.swing.JLabel txtError;
    // End of variables declaration//GEN-END:variables

    public void guardarCambioContrasena(){
        Usuario usuario = this.usuario;
        String nuevaContrasena = "";
        
        txtError.setVisible(false);
        
        if(fieldInsertar.getText().isEmpty() || fieldConfirmar.getText().isEmpty()){
            txtError.setText("Uno de los campos está incompleto");
            txtError.setVisible(true);
        }
        else if(!fieldConfirmar.getText().equals(fieldInsertar.getText())){
            txtError.setText("Los campos no coinciden");
            txtError.setVisible(true);
        }
        else{
            nuevaContrasena = fieldConfirmar.getText();
            usuario.setContrasena(nuevaContrasena);
            fa.modificarContrasena(usuario);
            txtError.setText("Contraseña actualizada");
            txtError.setVisible(true);
        }
    }

}
