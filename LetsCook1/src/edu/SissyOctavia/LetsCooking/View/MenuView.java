/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.SissyOctavia.LetsCooking.View;

/**
 *
 * @author user
 */
public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() {
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

        Bodypanel = new javax.swing.JPanel();
        Panelkiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_home = new javax.swing.JButton();
        txt_recipe = new javax.swing.JButton();
        txt_tips = new javax.swing.JButton();
        txt_tutorials = new javax.swing.JButton();
        txt_logout = new javax.swing.JButton();
        Panelkanan = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RecipePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TipsPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TutorialsPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        LogoutPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bodypanel.setBackground(new java.awt.Color(240, 149, 104));

        Panelkiri.setBackground(new java.awt.Color(255, 153, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-cook-80.png")); // NOI18N

        txt_home.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_home.setForeground(new java.awt.Color(255, 153, 102));
        txt_home.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-chef-30.png")); // NOI18N
        txt_home.setText("HOME");
        txt_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_homeActionPerformed(evt);
            }
        });

        txt_recipe.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_recipe.setForeground(new java.awt.Color(255, 153, 102));
        txt_recipe.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-tomato-30.png")); // NOI18N
        txt_recipe.setText("RECIPE");
        txt_recipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_recipeActionPerformed(evt);
            }
        });

        txt_tips.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_tips.setForeground(new java.awt.Color(255, 153, 102));
        txt_tips.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-bread-30.png")); // NOI18N
        txt_tips.setText("TIPS");
        txt_tips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipsActionPerformed(evt);
            }
        });

        txt_tutorials.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_tutorials.setForeground(new java.awt.Color(255, 153, 102));
        txt_tutorials.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-salt-bae-30.png")); // NOI18N
        txt_tutorials.setText("TUTORIALS");
        txt_tutorials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tutorialsActionPerformed(evt);
            }
        });

        txt_logout.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_logout.setForeground(new java.awt.Color(255, 153, 102));
        txt_logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-tableware-30.png")); // NOI18N
        txt_logout.setText("LOGOUT");
        txt_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelkiriLayout = new javax.swing.GroupLayout(Panelkiri);
        Panelkiri.setLayout(PanelkiriLayout);
        PanelkiriLayout.setHorizontalGroup(
            PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelkiriLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(PanelkiriLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_recipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_tips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_tutorials, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelkiriLayout.setVerticalGroup(
            PanelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelkiriLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(txt_home, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_recipe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tips, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tutorials, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panelkanan.setBackground(new java.awt.Color(240, 149, 104));
        Panelkanan.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(240, 149, 104));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOME");

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel2)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(438, Short.MAX_VALUE))
        );

        Panelkanan.add(HomePanel, "card2");

        RecipePanel.setBackground(new java.awt.Color(240, 149, 104));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RECIPE");

        javax.swing.GroupLayout RecipePanelLayout = new javax.swing.GroupLayout(RecipePanel);
        RecipePanel.setLayout(RecipePanelLayout);
        RecipePanelLayout.setHorizontalGroup(
            RecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecipePanelLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel3)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        RecipePanelLayout.setVerticalGroup(
            RecipePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecipePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(438, Short.MAX_VALUE))
        );

        Panelkanan.add(RecipePanel, "card3");

        TipsPanel.setBackground(new java.awt.Color(240, 149, 104));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIPS");

        javax.swing.GroupLayout TipsPanelLayout = new javax.swing.GroupLayout(TipsPanel);
        TipsPanel.setLayout(TipsPanelLayout);
        TipsPanelLayout.setHorizontalGroup(
            TipsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipsPanelLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel4)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        TipsPanelLayout.setVerticalGroup(
            TipsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(438, Short.MAX_VALUE))
        );

        Panelkanan.add(TipsPanel, "card4");

        TutorialsPanel.setBackground(new java.awt.Color(240, 149, 104));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TUTORIALS");

        javax.swing.GroupLayout TutorialsPanelLayout = new javax.swing.GroupLayout(TutorialsPanel);
        TutorialsPanel.setLayout(TutorialsPanelLayout);
        TutorialsPanelLayout.setHorizontalGroup(
            TutorialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TutorialsPanelLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel5)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        TutorialsPanelLayout.setVerticalGroup(
            TutorialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TutorialsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(438, Short.MAX_VALUE))
        );

        Panelkanan.add(TutorialsPanel, "card5");

        LogoutPanel.setBackground(new java.awt.Color(240, 149, 104));

        javax.swing.GroupLayout LogoutPanelLayout = new javax.swing.GroupLayout(LogoutPanel);
        LogoutPanel.setLayout(LogoutPanelLayout);
        LogoutPanelLayout.setHorizontalGroup(
            LogoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        LogoutPanelLayout.setVerticalGroup(
            LogoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        Panelkanan.add(LogoutPanel, "card6");

        javax.swing.GroupLayout BodypanelLayout = new javax.swing.GroupLayout(Bodypanel);
        Bodypanel.setLayout(BodypanelLayout);
        BodypanelLayout.setHorizontalGroup(
            BodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodypanelLayout.createSequentialGroup()
                .addComponent(Panelkiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panelkanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BodypanelLayout.setVerticalGroup(
            BodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelkiri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panelkanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bodypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bodypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_logoutActionPerformed
        // TODO add your handling code here:
        
        MainView n = new MainView();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txt_logoutActionPerformed

    private void txt_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_homeActionPerformed
        // TODO add your handling code here:
        
        // remove panel
        
        Panelkanan.removeAll();
        Panelkanan.repaint();
        Panelkanan.revalidate();
        
        
        
        
        // add panel
        
        Panelkanan.remove(HomePanel);
        Panelkanan.repaint();
        Panelkanan.revalidate();
    }//GEN-LAST:event_txt_homeActionPerformed

    private void txt_recipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_recipeActionPerformed
        // TODO add your handling code here:
        // remove panel
        
        Panelkanan.removeAll();
        Panelkanan.repaint();
        Panelkanan.revalidate();
        
        
        
        
        // add panel
        
        Panelkanan.remove(RecipePanel);
        Panelkanan.repaint();
        Panelkanan.revalidate();
    }//GEN-LAST:event_txt_recipeActionPerformed

    private void txt_tipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipsActionPerformed
        // TODO add your handling code here:
        // remove panel
        
        Panelkanan.removeAll();
        Panelkanan.repaint();
        Panelkanan.revalidate();
        
        
        
        
        // add panel
        
        Panelkanan.remove(TipsPanel);
        Panelkanan.repaint();
        Panelkanan.revalidate();
    }//GEN-LAST:event_txt_tipsActionPerformed

    private void txt_tutorialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tutorialsActionPerformed
        // TODO add your handling code here:
        
        // remove panel
        
        Panelkanan.removeAll();
        Panelkanan.repaint();
        Panelkanan.revalidate();
        
        
        
        
        // add panel
        
        Panelkanan.remove(TutorialsPanel);
        Panelkanan.repaint();
        Panelkanan.revalidate();
    }//GEN-LAST:event_txt_tutorialsActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bodypanel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel LogoutPanel;
    private javax.swing.JPanel Panelkanan;
    private javax.swing.JPanel Panelkiri;
    private javax.swing.JPanel RecipePanel;
    private javax.swing.JPanel TipsPanel;
    private javax.swing.JPanel TutorialsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton txt_home;
    private javax.swing.JButton txt_logout;
    private javax.swing.JButton txt_recipe;
    private javax.swing.JButton txt_tips;
    private javax.swing.JButton txt_tutorials;
    // End of variables declaration//GEN-END:variables
}
