/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shopping_cart;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.*;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Mishal
 */
public class Cart_1 extends javax.swing.JFrame {
 DefaultTableModel model;
 JTable cart_items;
  public void addToCart(String [][]array1){
               model = new DefaultTableModel() ;
         cart_items =new JTable(model);
       model.addColumn("ID");
        model.addColumn("Product");
        model.addColumn("Quantity");
        model.addColumn("Price");
//         tblPanel.add(new JScrollPane(cart_items));
        JFrame frame = new JFrame();
      frame.setSize(600, 400);
      frame.add(new JScrollPane(cart_items));
      frame.setVisible(true);
//        f.setSize(600, 400); cart_items.getModel();
////         model = new DefaultTableModel();
////            cart_items= new JTable(model) ;
//        model.addColumn("Column 1");
//        model.addColumn("Column 2");
//        model.addColumn("Column 1");
//        model.addColumn("Column 2");
// DefaultTableCellRenderer MyHeaderRender = new DefaultTableCellRenderer();
//        MyHeaderRender.setBackground(new Color(0, 0, 0));
//        MyHeaderRender.setForeground(new Color(255, 255, 255));
//        cart_items.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(MyHeaderRender);
//        cart_items.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(MyHeaderRender);
//        cart_items.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(MyHeaderRender);
//        cart_items.getTableHeader().getColumnModel().getColumn(3).setHeaderRenderer(MyHeaderRender);
//               
         for (int i = 0; i < array1.length; i++) {
//             for (int j = 0; j < 4; j++) {
//                 System.out.println(array1[i][j]);
//                 model.addRow(array1[i]);
 model.insertRow(model.getRowCount(), new Object[]{array1[i][0], array1[i][1], array1[i][2],array1[i][3]});
  
//            cart_items.getModel().
//                    model.insertRow(cart_items.getRowCount(),array1[i]);
//             }
        }
    }
    /**
     * Creates new form Cart
     */
    public Cart_1() {
        initComponents();
          this.setLocationRelativeTo(null);
//           model = new DefaultTableModel() cart_items.getModel() ;
//        model = new DefaultTableModel() ;
//         cart_items =new JTable(model);
//       model.addColumn("Column 1");
//        model.addColumn("Column 2");
//        model.addColumn("Column 1");
//        model.addColumn("Column 2");
        this.getContentPane().setBackground(new Color(255, 255, 255));
        DefaultTableCellRenderer MyHeaderRender = new DefaultTableCellRenderer();
        MyHeaderRender.setBackground(new Color(0, 0, 0));
        MyHeaderRender.setForeground(new Color(255, 255, 255));
//        cart_items.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(MyHeaderRender);
//        cart_items.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(MyHeaderRender);
//        cart_items.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(MyHeaderRender);
//        cart_items.getTableHeader().getColumnModel().getColumn(3).setHeaderRenderer(MyHeaderRender);
        setTotal();
    }
    
    public Cart_1(String [][]array1){
          model = new DefaultTableModel() ;
         cart_items =new JTable(model);
       model.addColumn("ID");
        model.addColumn("Product");
        model.addColumn("Quantity");
        model.addColumn("Price");
//         tblPanel.add(new JScrollPane(cart_items));
        JFrame frame = new JFrame();
      frame.setSize(600, 400);
      frame.add(new JScrollPane(cart_items));
      frame.setVisible(true);
//        f.setSize(600, 400); cart_items.getModel();
////         model = new DefaultTableModel();
////            cart_items= new JTable(model) ;
//        model.addColumn("Column 1");
//        model.addColumn("Column 2");
//        model.addColumn("Column 1");
//        model.addColumn("Column 2");
// DefaultTableCellRenderer MyHeaderRender = new DefaultTableCellRenderer();
//        MyHeaderRender.setBackground(new Color(0, 0, 0));
//        MyHeaderRender.setForeground(new Color(255, 255, 255));
//        cart_items.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(MyHeaderRender);
//        cart_items.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(MyHeaderRender);
//        cart_items.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(MyHeaderRender);
//        cart_items.getTableHeader().getColumnModel().getColumn(3).setHeaderRenderer(MyHeaderRender);
//               
         for (int i = 0; i < array1.length; i++) {
//             for (int j = 0; j < 4; j++) {
//                 System.out.println(array1[i][j]);
//                 model.addRow(array1[i]);
 model.insertRow(model.getRowCount(), new Object[]{array1[i][0], array1[i][1], array1[i][2],array1[i][3]});
  
//            cart_items.getModel().
//                    model.insertRow(cart_items.getRowCount(),array1[i]);
//             }
        }
     }
    
    
    
    public void setTotal(){
        int sum=0;
                   for (int i = 0; i < cart_items.getRowCount(); i++) {
                      int val=(int)cart_items.getModel().getValueAt(i, 3); 
                      sum=sum+val;
                      
                }
                   total_amount.setText(String.valueOf(sum));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cart_panel = new javax.swing.JPanel();
        cart_header = new javax.swing.JPanel();
        cart = new javax.swing.JLabel();
        total_amountLBL = new javax.swing.JLabel();
        total_amount = new javax.swing.JLabel();
        deleteBTN = new javax.swing.JToggleButton();
        checkoutBTN = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tblPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cart_panel.setBackground(new java.awt.Color(255, 255, 255));

        cart_header.setBackground(new java.awt.Color(0, 0, 0));

        cart.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        cart.setForeground(new java.awt.Color(255, 255, 255));
        cart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cart.setText("Cart");

        javax.swing.GroupLayout cart_headerLayout = new javax.swing.GroupLayout(cart_header);
        cart_header.setLayout(cart_headerLayout);
        cart_headerLayout.setHorizontalGroup(
            cart_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cart_headerLayout.setVerticalGroup(
            cart_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        total_amountLBL.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        total_amountLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_amountLBL.setText("Total Amount:");

        total_amount.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        total_amount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        deleteBTN.setBackground(new java.awt.Color(204, 204, 204));
        deleteBTN.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        deleteBTN.setText("Delete");
        deleteBTN.setAlignmentX(0.5F);
        deleteBTN.setBorder(null);
        deleteBTN.setBorderPainted(false);
        deleteBTN.setFocusPainted(false);
        deleteBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        checkoutBTN.setBackground(new java.awt.Color(204, 204, 204));
        checkoutBTN.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        checkoutBTN.setText("Proceed to Checkout");
        checkoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBTNActionPerformed(evt);
            }
        });

        searchBar.setSelectionColor(new java.awt.Color(204, 204, 204));
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel1.setText("Search:");

        javax.swing.GroupLayout tblPanelLayout = new javax.swing.GroupLayout(tblPanel);
        tblPanel.setLayout(tblPanelLayout);
        tblPanelLayout.setHorizontalGroup(
            tblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        tblPanelLayout.setVerticalGroup(
            tblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cart_panelLayout = new javax.swing.GroupLayout(cart_panel);
        cart_panel.setLayout(cart_panelLayout);
        cart_panelLayout.setHorizontalGroup(
            cart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cart_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cart_panelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(cart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cart_panelLayout.createSequentialGroup()
                        .addGroup(cart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cart_panelLayout.createSequentialGroup()
                                .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177)
                                .addComponent(total_amountLBL)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cart_panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
            .addGroup(cart_panelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(tblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cart_panelLayout.setVerticalGroup(
            cart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cart_panelLayout.createSequentialGroup()
                .addComponent(cart_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(cart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tblPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(cart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_amountLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(checkoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cart_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cart_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
  if (cart_items.getSelectedRow() != -1) {
            int modelRow = cart_items.convertRowIndexToModel(cart_items.getSelectedRow());
                model.removeRow(modelRow);
                 TableRowSorter<DefaultTableModel> t4 = new TableRowSorter<>(model);
        cart_items.setRowSorter(t4);
        t4.setRowFilter(null);
        }
  setTotal();// TODO add your handling code here:
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void checkoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBTNActionPerformed
       this.setVisible(false);
        checkout c1=new checkout(); 
        c1.setVisible(true);
        c1.setResizable(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_checkoutBTNActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        TableRowSorter<DefaultTableModel> t4 = new TableRowSorter<>(model);
        cart_items.setRowSorter(t4);
        t4.setRowFilter(RowFilter.regexFilter("(?i)" + searchBar.getText().trim()));    // TODO add your handling code here:
    }//GEN-LAST:event_searchBarKeyReleased

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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cart;
    private javax.swing.JPanel cart_header;
    private javax.swing.JPanel cart_panel;
    private javax.swing.JButton checkoutBTN;
    private javax.swing.JToggleButton deleteBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField searchBar;
    private javax.swing.JPanel tblPanel;
    private javax.swing.JLabel total_amount;
    private javax.swing.JLabel total_amountLBL;
    // End of variables declaration//GEN-END:variables
}
