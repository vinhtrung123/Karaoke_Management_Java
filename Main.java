/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class Main extends javax.swing.JFrame {

    private JPanel childPanel;
    public Main() {
        initComponents();
    }
    private void showPanelCapTK(JPanel panel)
    {
        childPanel= new CapTKhoan();
        pnlMain.removeAll();
        pnlMain.add(childPanel);
        pnlMain.validate();
    }
    private void showPanelSP(JPanel panel)
    {
        childPanel= new SanPham();
        pnlMain.removeAll();
        pnlMain.add(childPanel);
        pnlMain.validate();
    }
    private void showPanelThanhToan(JPanel panel)
    {
        childPanel= new ThanhToan();
        pnlMain.removeAll();
        pnlMain.add(childPanel);
        pnlMain.validate();
    }
    private void showPanelDP(JPanel panel)
    {
        childPanel= new DatPhong();
        pnlMain.removeAll();
        pnlMain.add(childPanel);
        pnlMain.validate();
    }
    private void showPanelDoiMK(JPanel panel)
    {
        childPanel= new DoiMK();
        pnlMain.removeAll();
        pnlMain.add(childPanel);
        pnlMain.validate();
    }
    private void showPanelNhanVien(JPanel panel)
    {
        childPanel= new NhanVien();
        pnlMain.removeAll();
        pnlMain.add(childPanel);
        pnlMain.validate();
    }
    private void showPanelDoanhThu(JPanel panel)
    {
        childPanel= new DoanhThu();
        pnlMain.removeAll();
        pnlMain.add(childPanel);
        pnlMain.validate();
    }
    private void showPanelTrangChu(JPanel panel)
    {
        childPanel= new TrangChu();
        pnlMain.removeAll();
        pnlMain.add(childPanel);
        pnlMain.validate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnTchu = new javax.swing.JMenu();
        mntc = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnDPhong = new javax.swing.JMenuItem();
        mnMonan = new javax.swing.JMenuItem();
        mnThanhtoan = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnNhanVien = new javax.swing.JMenuItem();
        mnSP = new javax.swing.JMenuItem();
        mnDoanhthu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnDoiMk = new javax.swing.JMenuItem();
        mnCaptk = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setPreferredSize(new java.awt.Dimension(1500, 1000));
        pnlMain.setLayout(new java.awt.BorderLayout());

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));
        jMenuBar1.setAlignmentX(0.8F);
        jMenuBar1.setAlignmentY(0.8F);
        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(300, 50));

        mnTchu.setBackground(new java.awt.Color(153, 204, 255));
        mnTchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/menu.png"))); // NOI18N
        mnTchu.setText("Trang Chủ");
        mnTchu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnTchu.setPreferredSize(new java.awt.Dimension(150, 24));
        mnTchu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTchuActionPerformed(evt);
            }
        });

        mntc.setText("Trang Chủ");
        mntc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntcActionPerformed(evt);
            }
        });
        mnTchu.add(mntc);

        jMenuBar1.add(mnTchu);

        jMenu2.setBackground(new java.awt.Color(102, 204, 255));
        jMenu2.setText("Hoạt Động");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(100, 24));

        mnDPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/room.png"))); // NOI18N
        mnDPhong.setText("Đặt Phòng");
        mnDPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDPhongActionPerformed(evt);
            }
        });
        jMenu2.add(mnDPhong);

        mnMonan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/food.png"))); // NOI18N
        mnMonan.setText("Đặt Món Ăn");
        jMenu2.add(mnMonan);

        mnThanhtoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bill.png"))); // NOI18N
        mnThanhtoan.setText("Thanh Toán");
        mnThanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnThanhtoanActionPerformed(evt);
            }
        });
        jMenu2.add(mnThanhtoan);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thiết Lập");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(89, 24));

        mnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/info.png"))); // NOI18N
        mnNhanVien.setText("Nhân Viên");
        mnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNhanVienActionPerformed(evt);
            }
        });
        jMenu3.add(mnNhanVien);

        mnSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/car.png"))); // NOI18N
        mnSP.setText("Sản Phẩm");
        mnSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSPActionPerformed(evt);
            }
        });
        jMenu3.add(mnSP);

        mnDoanhthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bill1.png"))); // NOI18N
        mnDoanhthu.setText("Lịch Sử & Thống Kê");
        mnDoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDoanhthuActionPerformed(evt);
            }
        });
        jMenu3.add(mnDoanhthu);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Hệ Thống");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(85, 35));

        mnDoiMk.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        mnDoiMk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sua.png"))); // NOI18N
        mnDoiMk.setText("Đổi mật khẩu");
        mnDoiMk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDoiMkActionPerformed(evt);
            }
        });
        jMenu4.add(mnDoiMk);

        mnCaptk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/luu.png"))); // NOI18N
        mnCaptk.setText("Cấp Tài Khoản");
        mnCaptk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCaptkActionPerformed(evt);
            }
        });
        jMenu4.add(mnCaptk);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xuat.png"))); // NOI18N
        jMenuItem2.setText("Thoát");
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnDPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDPhongActionPerformed
        showPanelDP(new DatPhong());
    }//GEN-LAST:event_mnDPhongActionPerformed

    private void mnSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSPActionPerformed
        showPanelSP(new SanPham());
    }//GEN-LAST:event_mnSPActionPerformed

    private void mnDoiMkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDoiMkActionPerformed
        showPanelDoiMK(new DoiMK());
    }//GEN-LAST:event_mnDoiMkActionPerformed

    private void mnTchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTchuActionPerformed
        showPanelTrangChu(new TrangChu());
    }//GEN-LAST:event_mnTchuActionPerformed

    private void mnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNhanVienActionPerformed
        showPanelNhanVien(new NhanVien());
    }//GEN-LAST:event_mnNhanVienActionPerformed

    private void mnDoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDoanhthuActionPerformed
        showPanelDoanhThu(new DoanhThu());
    }//GEN-LAST:event_mnDoanhthuActionPerformed

    private void mntcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntcActionPerformed
        showPanelTrangChu(new TrangChu());
    }//GEN-LAST:event_mntcActionPerformed

    private void mnThanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnThanhtoanActionPerformed
        showPanelThanhToan(new ThanhToan());
    }//GEN-LAST:event_mnThanhtoanActionPerformed

    private void mnCaptkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCaptkActionPerformed
        showPanelCapTK(new CapTKhoan());
    }//GEN-LAST:event_mnCaptkActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mnCaptk;
    private javax.swing.JMenuItem mnDPhong;
    private javax.swing.JMenuItem mnDoanhthu;
    private javax.swing.JMenuItem mnDoiMk;
    private javax.swing.JMenuItem mnMonan;
    private javax.swing.JMenuItem mnNhanVien;
    private javax.swing.JMenuItem mnSP;
    private javax.swing.JMenu mnTchu;
    private javax.swing.JMenuItem mnThanhtoan;
    private javax.swing.JMenuItem mntc;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables

    private JPanel panel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
