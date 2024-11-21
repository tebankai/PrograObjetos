/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.proyectopoo.Forms.Clientes;

import com.mycompany.proyectopoo.Forms.Plantas.*;

/**
 *
 * @author ester
 */
public class InventClient extends javax.swing.JPanel {

    /**
     * Creates new form Home
     */
    public InventClient() {
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
        ConsultClient = new javax.swing.JButton();
        RegClient = new javax.swing.JButton();

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

        ConsultClient.setBackground(new java.awt.Color(15, 52, 52));
        ConsultClient.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        ConsultClient.setForeground(new java.awt.Color(255, 255, 255));
        ConsultClient.setText("Administrar Clientes");
        ConsultClient.setBorder(null);
        ConsultClient.setBorderPainted(false);
        Background.add(ConsultClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 200, 90));

        RegClient.setBackground(new java.awt.Color(15, 52, 52));
        RegClient.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        RegClient.setForeground(new java.awt.Color(255, 255, 255));
        RegClient.setText("Registrar Cliente");
        RegClient.setBorder(null);
        RegClient.setBorderPainted(false);
        RegClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegClientMouseEntered(evt);
            }
        });
        RegClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegClientActionPerformed(evt);
            }
        });
        Background.add(RegClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, 90));

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

    private void RegClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegClientActionPerformed

    private void RegClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegClientMouseEntered
        // Cambiar el color del botón al pasar el mouse
    RegClient.setBackground(new java.awt.Color(0, 153, 0)); // Verde
    }//GEN-LAST:event_RegClientMouseEntered
    private void BotonPlantasMouseExited(java.awt.event.MouseEvent evt) {
        // Restaurar el color original del botón cuando el mouse salga
        RegClient.setBackground(new java.awt.Color(15, 52, 52)); // Color original
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton ConsultClient;
    private javax.swing.JButton RegClient;
    private javax.swing.JLabel SignOut;
    private javax.swing.JPanel TopBar;
    private javax.swing.JLabel UserName;
    // End of variables declaration//GEN-END:variables
}
