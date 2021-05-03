/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.IVentana;
import aplicacion.TipoUsuario;
import aplicacion.Usuario;
import java.awt.Color;

/**
 *
 * @author itocd
 */
public class VPrincipalAdministrador extends javax.swing.JFrame {

    private java.util.List<Usuario> usuarios;
    aplicacion.FachadaAplicacion fa;
    Usuario user;

    /**
     * Creates new form VPrincipal
     */
    public VPrincipalAdministrador(java.awt.Frame parent, boolean modal, aplicacion.FachadaAplicacion fa) {
        this.fa = fa;
        initComponents();
        this.getContentPane().setBackground(Color.white);
        InicializarTabla();

        botonEliminar.setEnabled(false);
        botonDarAlta.setEnabled(false);
        BotonAnadirFondos.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Filtro = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        botonDarAlta = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablauser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tiposelector = new javax.swing.JComboBox<>();
        userespera = new javax.swing.JComboBox<>();
        BotonAnadirFondos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Filtro :");

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VPrincipal/botonBuscar.png"))); // NOI18N
        Buscar.setBorderPainted(false);
        Buscar.setContentAreaFilled(false);
        Buscar.setDefaultCapable(false);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        botonDarAlta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonDarAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VAdministrador/botonDarDeAltaActivo.png"))); // NOI18N
        botonDarAlta.setBorderPainted(false);
        botonDarAlta.setContentAreaFilled(false);
        botonDarAlta.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VAdministrador/botonDarDeAltaDesactivo.png"))); // NOI18N
        botonDarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDarAltaActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VAdministrador/botonDarDeBajaActivo.png"))); // NOI18N
        botonEliminar.setBorderPainted(false);
        botonEliminar.setContentAreaFilled(false);
        botonEliminar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VAdministrador/botonDarDeBajaDesactivo.png"))); // NOI18N
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VAdministrador/botonSalir.png"))); // NOI18N
        botonSalir.setBorderPainted(false);
        botonSalir.setContentAreaFilled(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        tablauser.setModel(new ModeloTablaUsuarios());
        tablauser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablauserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablauser);

        jLabel2.setText("Id usuario");

        tiposelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por defecto", "Empresa", "Inversor" }));

        userespera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por defecto", "Dar de baja", "Dar de alta", "Operativo", "Eliminado" }));
        userespera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useresperaActionPerformed(evt);
            }
        });

        BotonAnadirFondos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotonAnadirFondos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VAdministrador/botonAñadirFondosActivo.png"))); // NOI18N
        BotonAnadirFondos.setBorderPainted(false);
        BotonAnadirFondos.setContentAreaFilled(false);
        BotonAnadirFondos.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VAdministrador/botonAñadirFondosDesactivo.png"))); // NOI18N
        BotonAnadirFondos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnadirFondosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Estado:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tipo Usuario:");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Filtro)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(392, 392, 392)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userespera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tiposelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAnadirFondos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonDarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tiposelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userespera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonDarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAnadirFondos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        EliminarAccion();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        BuscarAccion();
    }//GEN-LAST:event_BuscarActionPerformed

    private void botonDarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDarAltaActionPerformed
        // TODO add your handling code here:
        //DarAlta();
        DarAltaLecturaNoComprometida();
    }//GEN-LAST:event_botonDarAltaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        fa.iniciaInterfazUsuario();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void tablauserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablauserMouseClicked
        // TODO add your handling code here:
        click_fila_tabla();
    }//GEN-LAST:event_tablauserMouseClicked

    private void BotonAnadirFondosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnadirFondosActionPerformed
        // TODO add your handling code here:
        ModeloTablaUsuarios m = (ModeloTablaUsuarios) tablauser.getModel();
        this.user = m.obtenerUsuario(tablauser.getSelectedRow());
        if(user != null){
            ModificarFondo();
        }
    }//GEN-LAST:event_BotonAnadirFondosActionPerformed

    private void useresperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useresperaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useresperaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnadirFondos;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Filtro;
    private javax.swing.JButton botonDarAlta;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablauser;
    private javax.swing.JComboBox<String> tiposelector;
    private javax.swing.JComboBox<String> userespera;
    // End of variables declaration//GEN-END:variables

    private void click_fila_tabla() {
        ModeloTablaUsuarios m = (ModeloTablaUsuarios) tablauser.getModel();
        this.user = m.obtenerUsuario(tablauser.getSelectedRow());

        if (user.getTipoUsuario()== TipoUsuario.regulador) {
            botonEliminar.setEnabled(false);
            botonDarAlta.setEnabled(false);
            BotonAnadirFondos.setEnabled(false);
        } else {
            if (user.getEnEspera() == 1) {
                botonDarAlta.setEnabled(true);
                botonEliminar.setEnabled(false);
                BotonAnadirFondos.setEnabled(false);
            } else if(user.getEnEspera() == 0){
                botonDarAlta.setEnabled(false);
                botonEliminar.setEnabled(false);
                BotonAnadirFondos.setEnabled(true);
            } else if(user.getEnEspera() == -1){
                botonDarAlta.setEnabled(false);
                botonEliminar.setEnabled(true);
                BotonAnadirFondos.setEnabled(true);
            } else if(user.getEnEspera() == -3){
                botonDarAlta.setEnabled(true);
                botonEliminar.setEnabled(false);
                BotonAnadirFondos.setEnabled(false);
            }
        }
    }

    public void InicializarTabla() {
        usuarios = fa.consultarUsuarios(Filtro.getText());
        ModeloTablaUsuarios m = (ModeloTablaUsuarios) tablauser.getModel();
        m.setFilas(usuarios);
    }

    
    public void DarAlta() {
        ModeloTablaUsuarios m = (ModeloTablaUsuarios) tablauser.getModel();
        user = m.obtenerUsuario(tablauser.getSelectedRow());
        fa.ejemploLecturaNoComprometida(user);
        //user.setEnEspera(0);
        //fa.modificarUsuario(user, user.getId_usuario());
        InicializarTabla();
        
        botonDarAlta.setEnabled(false);
        botonEliminar.setEnabled(false);
        BotonAnadirFondos.setEnabled(false);
    }
    
    public void DarAltaLecturaNoComprometida() {
        ModeloTablaUsuarios m = (ModeloTablaUsuarios) tablauser.getModel();
        user = m.obtenerUsuario(tablauser.getSelectedRow());
        //user.setEnEspera(0);
        //fa.modificarUsuario(user, user.getId_usuario());
        fa.darDeAlta(user);
        InicializarTabla();
    }

    
    public void BuscarAccion(){
        String tipo = "";
        int enEspera = -2;
        
        
        if(userespera.getSelectedItem() == "Dar de baja"){
            enEspera = -1;
        } else if(userespera.getSelectedItem() == "Dar de alta"){
            enEspera = 1;
        } 
        else if(userespera.getSelectedItem() == "Operativo"){
            enEspera = 0;
        } else if(userespera.getSelectedItem() == "Eliminado"){
            enEspera = -3;
        } 
        
        if(tiposelector.getSelectedItem() == "Empresa"){
            tipo = "empresas";
        } else if(tiposelector.getSelectedItem() == "Inversor"){
            tipo = "inversores";
        } 
        
        
        usuarios = fa.consultarUsuariosFiltrados(Filtro.getText(), tipo, enEspera);
        ModeloTablaUsuarios m = (ModeloTablaUsuarios) tablauser.getModel();
        m.setFilas(usuarios);
        
        botonDarAlta.setEnabled(false);
        botonEliminar.setEnabled(false);
        BotonAnadirFondos.setEnabled(false);
    }
    
    public void  EliminarAccion(){
        ModeloTablaUsuarios m = (ModeloTablaUsuarios) tablauser.getModel();
        user = m.obtenerUsuario(tablauser.getSelectedRow());
        user.setEnEspera(-3);
        user.setFondos(0);
        fa.modificarUsuario(user, user.getId_usuario());
        InicializarTabla();
        
        botonDarAlta.setEnabled(false);
        botonEliminar.setEnabled(false);
        BotonAnadirFondos.setEnabled(false);
        
       
    }
    
    public void ModificarFondo(){
        ModeloTablaUsuarios m = (ModeloTablaUsuarios) tablauser.getModel();
        user = m.obtenerUsuario(tablauser.getSelectedRow());
        
        IVentana iVentana = new IVentana() {
            @Override
            public void onSuccess() {
                InicializarTabla();
                BotonAnadirFondos.setEnabled(false);
                botonDarAlta.setEnabled(false);
                botonEliminar.setEnabled(false);
            }
        };
        
        fa.visualizarVModificarFondos(user, iVentana);
    }

}
