/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author ASUS
 */
public class DoanhThu extends javax.swing.JPanel {

    /**
     * Creates new form DoanhThu
     */
    public DoanhThu() {
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

        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox2.setBackground(new java.awt.Color(0, 204, 204));
        jCheckBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBox2.setText("Theo Quý");
        add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, 100));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bill1.png"))); // NOI18N
        jButton1.setText("Xem Lợi Nhuận");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 417, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/timkiem.png"))); // NOI18N
        jButton2.setText("Xem");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1118, 255, -1, -1));

        jButton3.setText("Xuất Excel");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1118, 366, 111, 54));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Doanh Thu:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 850, -1, -1));

        jScrollPane1.setViewportView(jTextPane1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 850, 153, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Lịch Sử & Thống Kê");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 533, 639, 309));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Chọn Thời Gian:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 90));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Tùy Chỉnh");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 90));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 533, 645, 309));

        jCheckBox1.setBackground(new java.awt.Color(0, 204, 204));
        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBox1.setText("Theo Tháng");
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, 100));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}