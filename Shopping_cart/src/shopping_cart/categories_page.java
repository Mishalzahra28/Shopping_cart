/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shopping_cart;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author Mishal
 */
public class categories_page extends javax.swing.JFrame {

    /**
     * Creates new form categories_page
     */
    public categories_page() {
        initComponents();        
        this.setLocationRelativeTo(null);

        this.getContentPane().setBackground(new Color(255,255,255));
        DefaultTableCellRenderer MyHeaderRender = new DefaultTableCellRenderer();
        MyHeaderRender.setBackground(new Color(0,0,0));
        MyHeaderRender.setForeground(new Color(255,255,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        category_panel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        test = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        product1 = new javax.swing.JLabel();
        product2 = new javax.swing.JLabel();
        product3 = new javax.swing.JLabel();
        product4 = new javax.swing.JLabel();
        laundryBTN = new javax.swing.JButton();
        nashtaBTN = new javax.swing.JButton();
        kitchenBTN = new javax.swing.JButton();
        icecreamBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        category_panel.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(0, 0, 0));

        test.setBackground(new java.awt.Color(255, 255, 255));
        test.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        test.setForeground(new java.awt.Color(255, 255, 255));
        test.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        test.setText("Shopping Mart");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(test, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(test, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel1.setText("Categories");

        product1.setText("Product1");
        ImageIcon icon =new ImageIcon("./images/laundry.jpg");
        Image img=icon.getImage();
        Image imageScale=img.getScaledInstance(186,126,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon =new ImageIcon(imageScale);
        product1.setIcon(scaledIcon);

        //getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 700));

        product2.setText("Product2");
        ImageIcon icon2 =new ImageIcon("./images/nashta.jpg");
        Image img2=icon2.getImage();
        Image imageScale2=img2.getScaledInstance(186,126,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 =new ImageIcon(imageScale2);
        product2.setIcon(scaledIcon2);

        //getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 700));

        product3.setText("Product3");
        ImageIcon icon3 =new ImageIcon("./images/kitchen.jpg");
        Image img3=icon3.getImage();
        Image imageScale3=img3.getScaledInstance(186,126,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 =new ImageIcon(imageScale3);
        product3.setIcon(scaledIcon3);

        //getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 700));

        product4.setText("Product4");
        ImageIcon icon4 =new ImageIcon("./images/icecream.jpg");
        Image img4=icon4.getImage();
        Image imageScale4=img4.getScaledInstance(186,126,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 =new ImageIcon(imageScale4);
        product4.setIcon(scaledIcon4);

        //getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 700));

        laundryBTN.setBackground(new java.awt.Color(204, 204, 204));
        laundryBTN.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        laundryBTN.setText("Laundry");
        laundryBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        laundryBTN.setFocusPainted(false);
        laundryBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laundryBTNActionPerformed(evt);
            }
        });

        nashtaBTN.setBackground(new java.awt.Color(204, 204, 204));
        nashtaBTN.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        nashtaBTN.setText("Nashta");
        nashtaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nashtaBTNActionPerformed(evt);
            }
        });

        kitchenBTN.setBackground(new java.awt.Color(204, 204, 204));
        kitchenBTN.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        kitchenBTN.setText("Kitchen Supplies");
        kitchenBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitchenBTNActionPerformed(evt);
            }
        });

        icecreamBTN.setBackground(new java.awt.Color(204, 204, 204));
        icecreamBTN.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        icecreamBTN.setText("IceCream");
        icecreamBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icecreamBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout category_panelLayout = new javax.swing.GroupLayout(category_panel);
        category_panel.setLayout(category_panelLayout);
        category_panelLayout.setHorizontalGroup(
            category_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(category_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(category_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(category_panelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(category_panelLayout.createSequentialGroup()
                        .addGroup(category_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(category_panelLayout.createSequentialGroup()
                                .addComponent(product1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(product2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(category_panelLayout.createSequentialGroup()
                                .addComponent(kitchenBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(icecreamBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, category_panelLayout.createSequentialGroup()
                                .addComponent(laundryBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nashtaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, category_panelLayout.createSequentialGroup()
                                .addComponent(product3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(product4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 50, Short.MAX_VALUE))))
        );
        category_panelLayout.setVerticalGroup(
            category_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, category_panelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(category_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(product1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(category_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laundryBTN)
                    .addComponent(nashtaBTN))
                .addGap(45, 45, 45)
                .addGroup(category_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(category_panelLayout.createSequentialGroup()
                        .addComponent(product3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kitchenBTN))
                    .addGroup(category_panelLayout.createSequentialGroup()
                        .addComponent(product4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(icecreamBTN)))
                .addGap(116, 116, 116))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(category_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(category_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void laundryBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laundryBTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        laundary l = new laundary();
        l.setVisible(true);
    }//GEN-LAST:event_laundryBTNActionPerformed

    private void nashtaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nashtaBTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        icecream n = new icecream();
        n.setVisible(true);
    }//GEN-LAST:event_nashtaBTNActionPerformed

    private void kitchenBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitchenBTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        kitchen k = new kitchen();
        k.setVisible(true);
    }//GEN-LAST:event_kitchenBTNActionPerformed

    private void icecreamBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icecreamBTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        nashta i = new nashta();
        i.setVisible(true);
    }//GEN-LAST:event_icecreamBTNActionPerformed

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
            java.util.logging.Logger.getLogger(categories_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(categories_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(categories_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(categories_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new categories_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel category_panel;
    private javax.swing.JPanel header;
    private javax.swing.JButton icecreamBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kitchenBTN;
    private javax.swing.JButton laundryBTN;
    private javax.swing.JButton nashtaBTN;
    private javax.swing.JLabel product1;
    private javax.swing.JLabel product2;
    private javax.swing.JLabel product3;
    private javax.swing.JLabel product4;
    private javax.swing.JLabel test;
    // End of variables declaration//GEN-END:variables
}
