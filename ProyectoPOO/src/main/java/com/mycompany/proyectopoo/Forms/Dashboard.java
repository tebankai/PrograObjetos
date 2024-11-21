/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.proyectopoo.Forms;


/**
 *
 * @author ester
 */
public class Dashboard extends javax.swing.JPanel {

    /**
     * Creates new form Home
     */
    public Dashboard() {
        initComponents();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopBar = new javax.swing.JPanel();
        UserName = new javax.swing.JLabel();
        SignOut = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        BotonTecnicos = new javax.swing.JButton();
        BotonCitas = new javax.swing.JButton();
        BotonFactuacion = new javax.swing.JButton();
        BotonPlantas = new javax.swing.JButton();
        BotonServicios = new javax.swing.JButton();
        BotonMantenimiento = new javax.swing.JButton();
        BotonClientes = new javax.swing.JButton();

        setBackground(new java.awt.Color(19, 23, 29));

        TopBar.setBackground(new java.awt.Color(51, 255, 204));
        TopBar.setPreferredSize(new java.awt.Dimension(500, 350));

        UserName.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setText("Usuario");

        SignOut.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        SignOut.setForeground(new java.awt.Color(255, 255, 255));
        SignOut.setText("Salir");

        javax.swing.GroupLayout TopBarLayout = new javax.swing.GroupLayout(TopBar);
        TopBar.setLayout(TopBarLayout);
        TopBarLayout.setHorizontalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(UserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addComponent(SignOut)
                .addGap(25, 25, 25))
        );
        TopBarLayout.setVerticalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName)
                    .addComponent(SignOut))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Background.setBackground(new java.awt.Color(19, 23, 29));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonTecnicos.setBackground(new java.awt.Color(15, 52, 52));
        BotonTecnicos.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BotonTecnicos.setForeground(new java.awt.Color(255, 255, 255));
        BotonTecnicos.setText("Tecnicos");
        BotonTecnicos.setBorder(null);
        BotonTecnicos.setBorderPainted(false);
        BotonTecnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTecnicosActionPerformed(evt);
            }
        });
        Background.add(BotonTecnicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 170, 60));

        BotonCitas.setBackground(new java.awt.Color(15, 52, 52));
        BotonCitas.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BotonCitas.setForeground(new java.awt.Color(255, 255, 255));
        BotonCitas.setText("Registro de Citas");
        BotonCitas.setBorder(null);
        BotonCitas.setBorderPainted(false);
        Background.add(BotonCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 170, 60));

        BotonFactuacion.setBackground(new java.awt.Color(15, 52, 52));
        BotonFactuacion.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BotonFactuacion.setForeground(new java.awt.Color(255, 255, 255));
        BotonFactuacion.setText("Facturacion");
        BotonFactuacion.setBorder(null);
        BotonFactuacion.setBorderPainted(false);
        Background.add(BotonFactuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 170, 60));

        BotonPlantas.setBackground(new java.awt.Color(15, 52, 52));
        BotonPlantas.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BotonPlantas.setForeground(new java.awt.Color(255, 255, 255));
        BotonPlantas.setText("Inventario de Plantas");
        BotonPlantas.setBorder(null);
        BotonPlantas.setBorderPainted(false);
        BotonPlantas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonPlantasMouseEntered(evt);
            }
        });
        BotonPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPlantasActionPerformed(evt);
            }
        });
        Background.add(BotonPlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 170, 60));

        BotonServicios.setBackground(new java.awt.Color(15, 52, 52));
        BotonServicios.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BotonServicios.setForeground(new java.awt.Color(255, 255, 255));
        BotonServicios.setText("Inventario de Servicios");
        BotonServicios.setBorder(null);
        BotonServicios.setBorderPainted(false);
        Background.add(BotonServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 170, 60));

        BotonMantenimiento.setBackground(new java.awt.Color(15, 52, 52));
        BotonMantenimiento.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BotonMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        BotonMantenimiento.setText("Citas de Mantenimiento");
        BotonMantenimiento.setBorder(null);
        BotonMantenimiento.setBorderPainted(false);
        Background.add(BotonMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 170, 60));

        BotonClientes.setBackground(new java.awt.Color(15, 52, 52));
        BotonClientes.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BotonClientes.setForeground(new java.awt.Color(255, 255, 255));
        BotonClientes.setText("Clientes");
        BotonClientes.setBorder(null);
        BotonClientes.setBorderPainted(false);
        Background.add(BotonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 170, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TopBar, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TopBar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPlantasActionPerformed
           // Crear una instancia del formulario InventPlant
    InventPlant inventPlantForm = new InventPlant();

    // Hacer visible el formulario InventPlant
    inventPlantForm.setVisible(true);

    }//GEN-LAST:event_BotonPlantasActionPerformed

    private void BotonTecnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTecnicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonTecnicosActionPerformed

    private void BotonPlantasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPlantasMouseEntered
        // Cambiar el color del botón al pasar el mouse
    BotonPlantas.setBackground(new java.awt.Color(0, 153, 0)); // Verde
    }//GEN-LAST:event_BotonPlantasMouseEntered
    private void BotonPlantasMouseExited(java.awt.event.MouseEvent evt) {
        // Restaurar el color original del botón cuando el mouse salga
        BotonPlantas.setBackground(new java.awt.Color(15, 52, 52)); // Color original
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BotonCitas;
    private javax.swing.JButton BotonClientes;
    private javax.swing.JButton BotonFactuacion;
    private javax.swing.JButton BotonMantenimiento;
    private javax.swing.JButton BotonPlantas;
    private javax.swing.JButton BotonServicios;
    private javax.swing.JButton BotonTecnicos;
    private javax.swing.JLabel SignOut;
    private javax.swing.JPanel TopBar;
    private javax.swing.JLabel UserName;
    // End of variables declaration//GEN-END:variables
}
