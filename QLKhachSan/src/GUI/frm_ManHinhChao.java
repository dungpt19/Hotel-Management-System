
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.sql.*;


public class frm_ManHinhChao extends javax.swing.JFrame {

   
    public frm_ManHinhChao() {
        initComponents();
        Start();
    }

    private void Start() {
        ProgLoading.setStringPainted(true);
        Timer t = new Timer(8, new ActionListener() {
            int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                index += 1;
                ProgLoading.setValue(index);
                if (index == 100) {
                    ((Timer) e.getSource()).stop();
                    HienThiDangNhap();
                }
            }

        });
        t.start();
        
    }

    private void HienThiDangNhap() {
        this.dispose();
        frm_DangNhap frm = new frm_DangNhap();
        frm.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProgLoading = new javax.swing.JProgressBar();
        lblIcon = new javax.swing.JLabel();
        pnlTieuDe = new javax.swing.JPanel();
        lblTieuDe = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chào mừng");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(757, 490));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);
        getContentPane().add(ProgLoading);
        ProgLoading.setBounds(50, 430, 660, 30);

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/hotel 1.pnj.PNG"))); // NOI18N
        getContentPane().add(lblIcon);
        lblIcon.setBounds(0, 0, 150, 140);

        pnlTieuDe.setBackground(new java.awt.Color(204, 255, 255));

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTieuDe.setText("Hotel Management Application");

        javax.swing.GroupLayout pnlTieuDeLayout = new javax.swing.GroupLayout(pnlTieuDe);
        pnlTieuDe.setLayout(pnlTieuDeLayout);
        pnlTieuDeLayout.setHorizontalGroup(
            pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTieuDeLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblTieuDe)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pnlTieuDeLayout.setVerticalGroup(
            pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTieuDeLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblTieuDe)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTieuDe);
        pnlTieuDe.setBounds(150, 0, 610, 140);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/beach.PNG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 140, 760, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        amthanh bg = new amthanh();
        bg.run();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_ManHinhChao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ManHinhChao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ManHinhChao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ManHinhChao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ManHinhChao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgLoading;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JPanel pnlTieuDe;
    // End of variables declaration//GEN-END:variables
}
