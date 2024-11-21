/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.proyectopoo.Forms.CitasMantenimientos;

import com.mycompany.proyectopoo.Forms.Clientes.*;
import com.mycompany.proyectopoo.Forms.Plantas.*;

/**
 *
 * @author ester
 */
public class AdminCitasManteniento extends javax.swing.JPanel {

    /**
     * Creates new form Home
     */
    public AdminCitasManteniento() {
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
        SearchBarCitasMant = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaCitasMante = new javax.swing.JList<>();
        ModCitaMante = new javax.swing.JButton();
        EliminarCitaMate = new javax.swing.JButton();

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

        SearchBarCitasMant.setText("Buscar Citas de Manteniento");
        SearchBarCitasMant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBarCitasMantActionPerformed(evt);
            }
        });
        Background.add(SearchBarCitasMant, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, -1));

        ListaCitasMante.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaCitasMante);

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 430, -1));

        ModCitaMante.setText("Modificar");
        Background.add(ModCitaMante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        EliminarCitaMate.setText("Eliminar");
        Background.add(EliminarCitaMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

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

    private void SearchBarCitasMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBarCitasMantActionPerformed
       //Adding stuff
    }//GEN-LAST:event_SearchBarCitasMantActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton EliminarCitaMate;
    private javax.swing.JList<String> ListaCitasMante;
    private javax.swing.JButton ModCitaMante;
    private javax.swing.JTextField SearchBarCitasMant;
    private javax.swing.JLabel SignOut;
    private javax.swing.JPanel TopBar;
    private javax.swing.JLabel UserName;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
