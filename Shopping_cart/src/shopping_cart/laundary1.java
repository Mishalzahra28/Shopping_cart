package shopping_cart;


import shopping_cart.laundary1;
import java.awt.Image;
import javax.swing.*;
//import javax.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class laundary1 extends javax.swing.JFrame {

    /**
     * Creates new form productsPage
     */
//    String[][] arr1 = new String[6][4];
//    public laundary1() {
//        initComponents();
//        arr1[0][0] = "l01";
//        arr1[0][1] = "Detergent";
//        arr1[0][2] = "0";
//        arr1[0][3] = "500";
//        arr1[1][0] = "l02";
//        arr1[1][1] = "Brush";
//        arr1[1][2] = "0";
//        arr1[1][3] = "500";
//        arr1[2][0] = "l03";
//        arr1[2][1] = "Glooves";
//        arr1[2][2] = "0";
//        arr1[2][3] = "fds";
//        arr1[3][0] = "l04";
//        arr1[3][1] = "Comforter";
//        arr1[3][2] = "0";
//        arr1[3][3] = "500";
//        arr1[4][0] = "l05";
//        arr1[4][1] = "Dry Stand";
//        arr1[4][2] = "0";
//        arr1[4][3] = "500";
//        arr1[5][0] = "l06";
//        arr1[5][1] = "Clips";
//        arr1[5][2] = "0";
//        arr1[5][3] = "500";
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        price4 = new javax.swing.JLabel();
        price5 = new javax.swing.JLabel();
        price6 = new javax.swing.JLabel();
        switchCategories = new javax.swing.JToggleButton();
        prod4 = new javax.swing.JLabel();
        prod6 = new javax.swing.JLabel();
        addToCart5 = new javax.swing.JButton();
        addToCart6 = new javax.swing.JButton();
        addToCart7 = new javax.swing.JButton();
        prod7 = new javax.swing.JLabel();
        prod8 = new javax.swing.JLabel();
        prod9 = new javax.swing.JLabel();
        price7 = new javax.swing.JLabel();
        price8 = new javax.swing.JLabel();
        price9 = new javax.swing.JLabel();
        addToCart8 = new javax.swing.JButton();
        addToCart9 = new javax.swing.JButton();
        addToCart10 = new javax.swing.JButton();
        prod10 = new javax.swing.JLabel();
        gotoCart = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Laundary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        price4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        price4.setText("Comforter");

        price5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        price5.setText("Towel");

        price6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        price6.setText("Clips");

        switchCategories.setBackground(new java.awt.Color(204, 204, 204));
        switchCategories.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        switchCategories.setText("Switch Categories");
        switchCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchCategoriesActionPerformed(evt);
            }
        });

        ImageIcon icon3 =new ImageIcon("./images/laundary_4.jpg");
        Image img3=icon3.getImage();
        Image imageScale3=img3.getScaledInstance(97,89,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 =new ImageIcon(imageScale3);
        prod4.setIcon(scaledIcon3);

        ImageIcon icon5 =new ImageIcon("./images/laundary_6.jpg");                
        Image img5=icon5.getImage();                
        Image imageScale5=img5.getScaledInstance(97,89,Image.SCALE_SMOOTH);                
        ImageIcon scaledIcon5 =new ImageIcon(imageScale5);       
        prod6.setIcon(scaledIcon5);

        addToCart5.setBackground(new java.awt.Color(204, 204, 204));
        addToCart5.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        addToCart5.setText("Add to Cart");
        addToCart5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCart5ActionPerformed(evt);
            }
        });

        addToCart6.setBackground(new java.awt.Color(204, 204, 204));
        addToCart6.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        addToCart6.setText("Add to Cart");
        addToCart6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCart6ActionPerformed(evt);
            }
        });

        addToCart7.setBackground(new java.awt.Color(204, 204, 204));
        addToCart7.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        addToCart7.setText("Add to Cart");
        addToCart7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCart7ActionPerformed(evt);
            }
        });

        ImageIcon icon =new ImageIcon("./images/laundary_1.jpg");
        Image img=icon.getImage();
        Image imageScale=img.getScaledInstance(97,89,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon =new ImageIcon(imageScale);
        prod7.setIcon(scaledIcon);

        ImageIcon icon1 =new ImageIcon("./images/laundary_2.jpg");                
        Image img1=icon1.getImage();                
        Image imageScale1=img1.getScaledInstance(97,89,Image.SCALE_SMOOTH);                
        ImageIcon scaledIcon1 =new ImageIcon(imageScale1);       
        prod8.setIcon(scaledIcon1);

        ImageIcon icon2 =new ImageIcon("./images/laundary_3.jpg");                
        Image img2=icon2.getImage();                
        Image imageScale2=img2.getScaledInstance(97,89,Image.SCALE_SMOOTH);                
        ImageIcon scaledIcon2 =new ImageIcon(imageScale2);       
        prod9.setIcon(scaledIcon2);

        price7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        price7.setText("Gloves");

        price8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        price8.setText("Brush");

        price9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        price9.setText("Surf Excel");

        addToCart8.setBackground(new java.awt.Color(204, 204, 204));
        addToCart8.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        addToCart8.setText("Add to Cart");
        addToCart8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCart8ActionPerformed(evt);
            }
        });

        addToCart9.setBackground(new java.awt.Color(204, 204, 204));
        addToCart9.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        addToCart9.setText("Add to Cart");
        addToCart9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCart9ActionPerformed(evt);
            }
        });

        addToCart10.setBackground(new java.awt.Color(204, 204, 204));
        addToCart10.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        addToCart10.setText("Add to Cart");
        addToCart10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCart10ActionPerformed(evt);
            }
        });

        ImageIcon icons =new ImageIcon("./images/laundary_5.jpg");
        Image imgs=icons.getImage();
        Image imageScales=imgs.getScaledInstance(97,89,Image.SCALE_SMOOTH);
        ImageIcon scaledIcons =new ImageIcon(imageScales);
        prod10.setIcon(scaledIcons);

        gotoCart.setBackground(new java.awt.Color(204, 204, 204));
        gotoCart.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        gotoCart.setText("Go To Cart");
        gotoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(addToCart5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addToCart6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(prod4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(price4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(32, 32, 32)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(price5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prod10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(prod6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(price6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addToCart7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(addToCart8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addToCart9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(switchCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gotoCart, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(price9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(price8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(prod7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(prod8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(44, 44, 44)
                                            .addComponent(price7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(prod9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(addToCart10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(prod6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prod10, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(prod4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(price5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(price4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(price6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addToCart7)
                    .addComponent(addToCart6)
                    .addComponent(addToCart5))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(prod9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prod8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prod7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(price8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(price9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(price7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToCart9)
                    .addComponent(addToCart10)
                    .addComponent(addToCart8))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(switchCategories)
                    .addComponent(gotoCart))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//void addToCart(String id) {
//        for(int i = 0; i<arr1.length; i++){
//            if(arr1[i][0] == id){
//               int quantity = Integer.parseInt(arr1[i][2]);
//               quantity +=1;
//               arr1[i][2] =  Integer.toString(quantity);
//            }
//            System.out.println(arr1[i][2]);
//        }
//    }
    private void switchCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchCategoriesActionPerformed
        // TODO add your handling code here:
          categories_page cp = new categories_page() ;
        cp.setVisible(true);
        this.setVisible(false);
      
//        Thread.sleep(2000);
    }//GEN-LAST:event_switchCategoriesActionPerformed

    private void addToCart5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCart5ActionPerformed
//       addToCart("l04"); // TODO add your handling code here:
    if(evt.getSource() == addToCart5){
        String name_lbl = price4.getText().toString();
        Cart2 c1 = new Cart2(name_lbl);
    }
    }//GEN-LAST:event_addToCart5ActionPerformed

    private void addToCart6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCart6ActionPerformed
//      addToCart("l05");  // TODO add your handling code here:
    }//GEN-LAST:event_addToCart6ActionPerformed

    private void addToCart7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCart7ActionPerformed
//       addToCart("l06"); // TODO add your handling code here:
    }//GEN-LAST:event_addToCart7ActionPerformed

    private void addToCart8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCart8ActionPerformed
//addToCart("l01");        // TODO add your handling code here:
    }//GEN-LAST:event_addToCart8ActionPerformed

    private void addToCart9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCart9ActionPerformed
//    addToCart("l02");    // TODO add your handling code here:
    }//GEN-LAST:event_addToCart9ActionPerformed

    private void addToCart10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCart10ActionPerformed
//       addToCart("l03"); // TODO add your handling code here:
    }//GEN-LAST:event_addToCart10ActionPerformed

    private void gotoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoCartActionPerformed
  // TODO add your handling code here:
//        String [][] newArr= new String[6][4];
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 4; j++) {
//                if (Integer.parseInt(arr1[i][2])!=0) {
//                    newArr[i][j] = arr1[i][j];
//                }
//            }
//        }
//        Cart_1 sendArr =  new Cart_1(newArr);
        
        Cart2 c =  new Cart2();
        this.setVisible(false);
        c.setVisible(true);       
    }//GEN-LAST:event_gotoCartActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
//ImageIcon icon =new ImageIcon("laundry.jpg");
//Image img=icon.getImage();
//Image imageScale=img.getScaledInstance(186,126,Image.SCALE_SMOOTH);
//ImageIcon scaledIcon =new ImageIcon(imageScale);
//prod1.setIcon(scaledIcon);


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
            java.util.logging.Logger.getLogger(laundary1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laundary1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laundary1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laundary1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laundary1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCart10;
    private javax.swing.JButton addToCart5;
    private javax.swing.JButton addToCart6;
    private javax.swing.JButton addToCart7;
    private javax.swing.JButton addToCart8;
    private javax.swing.JButton addToCart9;
    private javax.swing.JToggleButton gotoCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel price4;
    private javax.swing.JLabel price5;
    private javax.swing.JLabel price6;
    private javax.swing.JLabel price7;
    private javax.swing.JLabel price8;
    private javax.swing.JLabel price9;
    private javax.swing.JLabel prod10;
    private javax.swing.JLabel prod4;
    private javax.swing.JLabel prod6;
    private javax.swing.JLabel prod7;
    private javax.swing.JLabel prod8;
    private javax.swing.JLabel prod9;
    private javax.swing.JToggleButton switchCategories;
    // End of variables declaration//GEN-END:variables
}
