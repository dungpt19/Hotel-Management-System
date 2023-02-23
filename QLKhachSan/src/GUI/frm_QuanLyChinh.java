package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import javafx.scene.layout.Border;

public class frm_QuanLyChinh extends javax.swing.JFrame {

    javax.swing.border.Border a = BorderFactory.createLineBorder(Color.black, 2, true);
    javax.swing.border.Border empty = BorderFactory.createEmptyBorder();
    public static frm_QuanLyChinh b;

    public frm_QuanLyChinh() {
        initComponents();
        showtime();
        b = this;
//        setExtendedState(getExtendedState() | this.MAXIMIZED_BOTH);//Jframe mở toàn màn hình
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();// lấy chiều cao và rộng màn hình hiện tại
//        setMaximumSize(screenSize);
    }

    void showtime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                SimpleDateFormat D = new SimpleDateFormat("dd/MM/yyyy");
                lblTime.setText(s.format(d) + "-" + D.format(d));
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNutBam = new javax.swing.JPanel();
        btnDatPhong = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnDichVu1 = new javax.swing.JButton();
        btnDSHoaDon = new javax.swing.JButton();
        btnDanhSachDP = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        tab = new javax.swing.JTabbedPane();
        btn_Dong = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MnuBar = new javax.swing.JMenuBar();
        mnuTK = new javax.swing.JMenu();
        mniDangXuat = new javax.swing.JMenuItem();
        mniDoiMK = new javax.swing.JMenuItem();
        mnuQLChinh = new javax.swing.JMenu();
        mniDSDatPhong = new javax.swing.JMenuItem();
        mniDSKH = new javax.swing.JMenuItem();
        mniDSPhong = new javax.swing.JMenuItem();
        mniDSHoaDon = new javax.swing.JMenuItem();
        mniDichVuPhong = new javax.swing.JMenuItem();
        mnuQLLoai = new javax.swing.JMenu();
        mniLoaiKH = new javax.swing.JMenuItem();
        mniLoaiPhong = new javax.swing.JMenuItem();
        mniDichVu = new javax.swing.JMenuItem();
        mnuQLNV = new javax.swing.JMenu();
        mniDSNhanVien = new javax.swing.JMenuItem();
        mniDSTK = new javax.swing.JMenuItem();
        mniLuongNV = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnu_CaiDat = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlNutBam.setBackground(new java.awt.Color(153, 255, 255));

        btnDatPhong.setBackground(new java.awt.Color(255, 255, 255));
        btnDatPhong.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 22)); // NOI18N
        btnDatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/thuephong.PNG"))); // NOI18N
        btnDatPhong.setText("Rent Room");
        btnDatPhong.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDatPhong.setContentAreaFilled(false);
        btnDatPhong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDatPhong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDatPhong.setOpaque(true);
        btnDatPhong.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnDatPhongMouseMoved(evt);
            }
        });
        btnDatPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDatPhongMouseClicked(evt);
            }
        });
        btnDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatPhongActionPerformed(evt);
            }
        });

        btnKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnKhachHang.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 22)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/kh.PNG"))); // NOI18N
        btnKhachHang.setText("   Customers");
        btnKhachHang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKhachHang.setContentAreaFilled(false);
        btnKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKhachHang.setOpaque(true);
        btnKhachHang.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseMoved(evt);
            }
        });
        btnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseClicked(evt);
            }
        });
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnDichVu1.setBackground(new java.awt.Color(255, 255, 255));
        btnDichVu1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 22)); // NOI18N
        btnDichVu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/dichvu.PNG"))); // NOI18N
        btnDichVu1.setText("  Services");
        btnDichVu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDichVu1.setContentAreaFilled(false);
        btnDichVu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDichVu1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDichVu1.setOpaque(true);
        btnDichVu1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnDichVu1MouseMoved(evt);
            }
        });
        btnDichVu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDichVu1MouseClicked(evt);
            }
        });
        btnDichVu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDichVu1ActionPerformed(evt);
            }
        });

        btnDSHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        btnDSHoaDon.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 22)); // NOI18N
        btnDSHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/hoadon.PNG"))); // NOI18N
        btnDSHoaDon.setText("   Reciepts");
        btnDSHoaDon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDSHoaDon.setContentAreaFilled(false);
        btnDSHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDSHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDSHoaDon.setOpaque(true);
        btnDSHoaDon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnDSHoaDonMouseMoved(evt);
            }
        });
        btnDSHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDSHoaDonMouseClicked(evt);
            }
        });
        btnDSHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSHoaDonActionPerformed(evt);
            }
        });

        btnDanhSachDP.setBackground(new java.awt.Color(255, 255, 255));
        btnDanhSachDP.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 22)); // NOI18N
        btnDanhSachDP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/danhsach.PNG"))); // NOI18N
        btnDanhSachDP.setText("List of Rented Room");
        btnDanhSachDP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDanhSachDP.setContentAreaFilled(false);
        btnDanhSachDP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDanhSachDP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDanhSachDP.setOpaque(true);
        btnDanhSachDP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnDanhSachDPMouseMoved(evt);
            }
        });
        btnDanhSachDP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDanhSachDPMouseClicked(evt);
            }
        });
        btnDanhSachDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachDPActionPerformed(evt);
            }
        });

        lblTime.setBackground(new java.awt.Color(255, 255, 255));
        lblTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/clock.PNG"))); // NOI18N

        javax.swing.GroupLayout pnlNutBamLayout = new javax.swing.GroupLayout(pnlNutBam);
        pnlNutBam.setLayout(pnlNutBamLayout);
        pnlNutBamLayout.setHorizontalGroup(
            pnlNutBamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNutBamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNutBamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDanhSachDP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDatPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDichVu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDSHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlNutBamLayout.setVerticalGroup(
            pnlNutBamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNutBamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDanhSachDP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDichVu1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDSHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pnl2.setBackground(new java.awt.Color(102, 102, 102));
        pnl2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tab.setBackground(new java.awt.Color(255, 255, 255));

        btn_Dong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Dong.setText("X");
        btn_Dong.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_DongMouseMoved(evt);
            }
        });
        btn_Dong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DongActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/hotelbig.PNG"))); // NOI18N

        MnuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MnuBar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        MnuBar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MnuBar.setMaximumSize(new java.awt.Dimension(66, 500));

        mnuTK.setBackground(new java.awt.Color(255, 255, 255));
        mnuTK.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 255)));
        mnuTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/key-chain.png"))); // NOI18N
        mnuTK.setText("Account");
        mnuTK.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        mnuTK.setPreferredSize(new java.awt.Dimension(310, 49));

        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/exit.PNG"))); // NOI18N
        mniDangXuat.setText("Exit");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuTK.add(mniDangXuat);

        mniDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/password.PNG"))); // NOI18N
        mniDoiMK.setText("Change Password");
        mniDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMKActionPerformed(evt);
            }
        });
        mnuTK.add(mniDoiMK);

        MnuBar.add(mnuTK);

        mnuQLChinh.setBackground(new java.awt.Color(255, 255, 255));
        mnuQLChinh.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 255)));
        mnuQLChinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/qlc.PNG"))); // NOI18N
        mnuQLChinh.setText("Main Management");
        mnuQLChinh.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        mnuQLChinh.setPreferredSize(new java.awt.Dimension(310, 49));

        mniDSDatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/qlcnho.PNG"))); // NOI18N
        mniDSDatPhong.setText("Rented Room Lists");
        mniDSDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDSDatPhongActionPerformed(evt);
            }
        });
        mnuQLChinh.add(mniDSDatPhong);

        mniDSKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/qlcnho.PNG"))); // NOI18N
        mniDSKH.setText("Customer Lists");
        mniDSKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDSKHActionPerformed(evt);
            }
        });
        mnuQLChinh.add(mniDSKH);

        mniDSPhong.setText("Room Lists");
        mniDSPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDSPhongActionPerformed(evt);
            }
        });
        mnuQLChinh.add(mniDSPhong);

        mniDSHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/qlcnho.PNG"))); // NOI18N
        mniDSHoaDon.setText("Reciepts Lists");
        mniDSHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDSHoaDonActionPerformed(evt);
            }
        });
        mnuQLChinh.add(mniDSHoaDon);

        mniDichVuPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/qlcnho.PNG"))); // NOI18N
        mniDichVuPhong.setText("Room Services");
        mniDichVuPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDichVuPhongActionPerformed(evt);
            }
        });
        mnuQLChinh.add(mniDichVuPhong);

        MnuBar.add(mnuQLChinh);

        mnuQLLoai.setBackground(new java.awt.Color(255, 255, 255));
        mnuQLLoai.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 255)));
        mnuQLLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/qll.PNG"))); // NOI18N
        mnuQLLoai.setText("Type Management");
        mnuQLLoai.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        mnuQLLoai.setPreferredSize(new java.awt.Dimension(310, 49));

        mniLoaiKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/qllnho.PNG"))); // NOI18N
        mniLoaiKH.setText("List of Clients");
        mniLoaiKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLoaiKHActionPerformed(evt);
            }
        });
        mnuQLLoai.add(mniLoaiKH);

        mniLoaiPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/qllnho.PNG"))); // NOI18N
        mniLoaiPhong.setText("Room Types");
        mniLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLoaiPhongActionPerformed(evt);
            }
        });
        mnuQLLoai.add(mniLoaiPhong);

        mniDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/qllnho.PNG"))); // NOI18N
        mniDichVu.setText("Services");
        mniDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDichVuActionPerformed(evt);
            }
        });
        mnuQLLoai.add(mniDichVu);

        MnuBar.add(mnuQLLoai);

        mnuQLNV.setBackground(new java.awt.Color(255, 255, 255));
        mnuQLNV.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 255)));
        mnuQLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/qlnv.PNG"))); // NOI18N
        mnuQLNV.setText("Staffs Management");
        mnuQLNV.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        mnuQLNV.setPreferredSize(new java.awt.Dimension(310, 49));

        mniDSNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/qlnvnho.PNG"))); // NOI18N
        mniDSNhanVien.setText("List of Staffs");
        mniDSNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDSNhanVienActionPerformed(evt);
            }
        });
        mnuQLNV.add(mniDSNhanVien);

        mniDSTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/qlnvnho.PNG"))); // NOI18N
        mniDSTK.setText("Account Lists");
        mniDSTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDSTKActionPerformed(evt);
            }
        });
        mnuQLNV.add(mniDSTK);

        mniLuongNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/luong.PNG"))); // NOI18N
        mniLuongNV.setText("Staffs's Salary");
        mniLuongNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLuongNVActionPerformed(evt);
            }
        });
        mnuQLNV.add(mniLuongNV);

        MnuBar.add(mnuQLNV);

        mnuThongKe.setBackground(new java.awt.Color(255, 255, 255));
        mnuThongKe.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 255)));
        mnuThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/thongke.PNG"))); // NOI18N
        mnuThongKe.setText("Statistic");
        mnuThongKe.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        mnuThongKe.setPreferredSize(new java.awt.Dimension(310, 49));

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/thongkenho.PNG"))); // NOI18N
        jMenuItem2.setText("Income Statistic");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuThongKe.add(jMenuItem2);

        MnuBar.add(mnuThongKe);

        mnu_CaiDat.setBackground(new java.awt.Color(255, 255, 255));
        mnu_CaiDat.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 255)));
        mnu_CaiDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/caidat.PNG"))); // NOI18N
        mnu_CaiDat.setText("Settings");
        mnu_CaiDat.setToolTipText("");
        mnu_CaiDat.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        mnu_CaiDat.setPreferredSize(new java.awt.Dimension(310, 49));

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/settingnho.PNG"))); // NOI18N
        jMenuItem1.setText("Check-in, Check-out Setting");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnu_CaiDat.add(jMenuItem1);

        MnuBar.add(mnu_CaiDat);

        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        MnuBar.add(jMenu1);

        setJMenuBar(MnuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNutBam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Dong)
                        .addGap(1172, 1172, 1172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(tab)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Dong, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlNutBam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatPhongActionPerformed
        try {
            tab.setSelectedComponent(pnl_DSphong.form);
        } catch (Exception e) {
            //tab.remove(pnl_DSphong.form);
            pnl_DSphong pnl = new pnl_DSphong();
            tab.add("List of Rooms", pnl);
            tab.setSelectedComponent(pnl);
        }

    }//GEN-LAST:event_btnDatPhongActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pnl_DSphong pnl = new pnl_DSphong();
        tab.add("List of Rooms", pnl);
        btnDatPhong.setBorder(a);
        if (!BLL.BLL_DangNhap.quyen.equals("QuanLy")) {
//            mniDSNhanVien.setEnabled(false);
            mnuQLNV.setEnabled(false);
            mnuThongKe.setEnabled(false);
            btnDSHoaDon.setEnabled(false);
            mniDSHoaDon.setEnabled(false);
            mnu_CaiDat.setEnabled(false);
        }
//        CaiDat frm=new CaiDat();
//        frm.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void btnDatPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatPhongMouseClicked
        AnBorder();
        btnDatPhong.setBorder(a);
    }//GEN-LAST:event_btnDatPhongMouseClicked

    private void btnDanhSachDPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachDPMouseClicked
        AnBorder();
        btnDanhSachDP.setBorder(a);
    }//GEN-LAST:event_btnDanhSachDPMouseClicked

    private void btnKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseClicked
        AnBorder();
        btnKhachHang.setBorder(a);
    }//GEN-LAST:event_btnKhachHangMouseClicked
    private void btnDSHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDSHoaDonMouseClicked
        AnBorder();
        btnDSHoaDon.setBorder(a);
    }//GEN-LAST:event_btnDSHoaDonMouseClicked
    private void AnBorder() {
        btnDatPhong.setBorder(empty);
        btnKhachHang.setBorder(empty);
        btnDichVu1.setBorder(empty);
        btnDSHoaDon.setBorder(empty);
        btnDanhSachDP.setBorder(empty);
//        btnDichVu2.setBorder(empty);
    }
    private void mniDSPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDSPhongActionPerformed
        frm_QLPhong frm = new frm_QLPhong();
        frm.setVisible(true);
    }//GEN-LAST:event_mniDSPhongActionPerformed
    private void btnDichVu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDichVu1MouseClicked
        AnBorder();
        btnDichVu1.setBorder(a);
    }//GEN-LAST:event_btnDichVu1MouseClicked

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        try {
            tab.setSelectedComponent(pnl_KhachHang.form);
        } catch (Exception e) {
            // tab.remove(pnl_KhachHang.form);
            pnl_KhachHang pnl = new pnl_KhachHang();
            tab.add("Customers", pnl);
            tab.setSelectedComponent(pnl);

        }

    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnDichVu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDichVu1ActionPerformed
        try {
            tab.setSelectedComponent(pnl_DichVuPhong.form);
        } catch (Exception e) {
            //tab.remove(pnl_CungCapDichVu.form);
            pnl_DichVuPhong pnl = new pnl_DichVuPhong();
            tab.add("Room Services", pnl);
            tab.setSelectedComponent(pnl);
        }

    }//GEN-LAST:event_btnDichVu1ActionPerformed

    private void btnDanhSachDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachDPActionPerformed
        try {
            tab.setSelectedComponent(pnl_DSThuePhong.form);
        } catch (Exception e) {
            //tab.remove(pnl_DSThuePhong.form);
            pnl_DSThuePhong pnl = new pnl_DSThuePhong();
            tab.add("List of Rented Rooms", pnl);
            tab.setSelectedComponent(pnl);
        }

    }//GEN-LAST:event_btnDanhSachDPActionPerformed

    private void btn_DongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DongActionPerformed
        if (tab.getTabCount() != 1) {
            tab.remove(tab.getSelectedComponent());
        }
    }//GEN-LAST:event_btn_DongActionPerformed

    private void mniLuongNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLuongNVActionPerformed

        try {
            tab.setSelectedComponent(pnl_LoaiLuong.form);
        } catch (Exception e) {
            pnl_LoaiLuong pnl = new pnl_LoaiLuong();
            tab.add("Salary", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_mniLuongNVActionPerformed

    private void mniDSNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDSNhanVienActionPerformed
        try {
            tab.setSelectedComponent(pnl_NhanVien.form);
        } catch (Exception e) {
            pnl_NhanVien pnl = new pnl_NhanVien();
            tab.add("Staffs", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_mniDSNhanVienActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void btn_DongMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DongMouseMoved
        btn_Dong.setBackground(Color.red);
    }//GEN-LAST:event_btn_DongMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        btn_Dong.setBackground(Color.white);
        btnDatPhong.setBackground(Color.white);
        btnDanhSachDP.setBackground(Color.white);
        btnKhachHang.setBackground(Color.white);
        btnDichVu1.setBackground(Color.white);
//        btnDichVu2.setBackground(Color.white);
        btnDSHoaDon.setBackground(Color.white);
//     .setBackground(Color.white);
    }//GEN-LAST:event_formMouseMoved

    private void btnDatPhongMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatPhongMouseMoved
        btnDatPhong.setBackground(Color.decode("#DA81F5"));
    }//GEN-LAST:event_btnDatPhongMouseMoved

    private void btnDanhSachDPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachDPMouseMoved
        btnDanhSachDP.setBackground(Color.decode("#DA81F5"));
    }//GEN-LAST:event_btnDanhSachDPMouseMoved

    private void btnKhachHangMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseMoved
        btnKhachHang.setBackground(Color.decode("#DA81F5"));
    }//GEN-LAST:event_btnKhachHangMouseMoved

    private void btnDichVu1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDichVu1MouseMoved
        btnDichVu1.setBackground(Color.decode("#DA81F5"));
    }//GEN-LAST:event_btnDichVu1MouseMoved

    private void btnDSHoaDonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDSHoaDonMouseMoved
        btnDSHoaDon.setBackground(Color.decode("#DA81F5"));
    }//GEN-LAST:event_btnDSHoaDonMouseMoved

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CaiDat frm = new CaiDat();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            tab.setSelectedComponent(pnl_ThongKe.form);
        } catch (Exception e) {
            pnl_ThongKe pnl = new pnl_ThongKe();
            tab.add("Income Statistic", pnl);
            tab.setSelectedComponent(pnl);
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mniLoaiKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLoaiKHActionPerformed
        try {
            tab.setSelectedComponent(pnl_KhachHang.form);
        } catch (Exception e) {
            pnl_KhachHang pnl = new pnl_KhachHang();
            tab.add("Customers", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_mniLoaiKHActionPerformed

    private void mniLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLoaiPhongActionPerformed
        frm_QLPhong frm = new frm_QLPhong();
        frm.setVisible(true);

//       frm.tab.setSelectedComponent(pnl_LoaiPhong.form);
    }//GEN-LAST:event_mniLoaiPhongActionPerformed

    private void mniDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDichVuActionPerformed
        try {
            tab.setSelectedComponent(pnl_CungCapDichVu.form);
        } catch (Exception e) {
            pnl_CungCapDichVu pnl = new pnl_CungCapDichVu();
            tab.add("Adding Services", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_mniDichVuActionPerformed

    private void mniDSDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDSDatPhongActionPerformed
        try {
            tab.setSelectedComponent(pnl_DSThuePhong.form);
        } catch (Exception e) {
            //tab.remove(pnl_DSThuePhong.form);
            pnl_DSThuePhong pnl = new pnl_DSThuePhong();
            tab.add("List of Rented Rooms", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_mniDSDatPhongActionPerformed

    private void mniDSKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDSKHActionPerformed
        try {
            tab.setSelectedComponent(pnl_KhachHang.form);
        } catch (Exception e) {
            // tab.remove(pnl_KhachHang.form);
            pnl_KhachHang pnl = new pnl_KhachHang();
            tab.add("Customers", pnl);
            tab.setSelectedComponent(pnl);

        }
    }//GEN-LAST:event_mniDSKHActionPerformed

    private void mniDSHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDSHoaDonActionPerformed
        try {
            tab.setSelectedComponent(pnl_ThongKe.form);
        } catch (Exception e) {
            pnl_ThongKe pnl = new pnl_ThongKe();
            tab.add("Income Statistic", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_mniDSHoaDonActionPerformed

    private void mniDichVuPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDichVuPhongActionPerformed
        try {
            tab.setSelectedComponent(pnl_DichVuPhong.form);
        } catch (Exception e) {
            //tab.remove(pnl_CungCapDichVu.form);
            pnl_DichVuPhong pnl = new pnl_DichVuPhong();
            tab.add("Room Services", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_mniDichVuPhongActionPerformed

    private void mniDSTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDSTKActionPerformed
        try {
            tab.setSelectedComponent(pnl_NhanVien.form);
        } catch (Exception e) {
            pnl_NhanVien pnl = new pnl_NhanVien();
            tab.add("Staffs", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_mniDSTKActionPerformed

    private void btnDSHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSHoaDonActionPerformed
        try {
            tab.setSelectedComponent(pnl_ThongKe.form);
        } catch (Exception e) {
            pnl_ThongKe pnl = new pnl_ThongKe();
            tab.add("Income Statistic", pnl);
            tab.setSelectedComponent(pnl);
        }
    }//GEN-LAST:event_btnDSHoaDonActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMKActionPerformed
        frm_DoiMatKhau frm = new frm_DoiMatKhau();
        frm.setVisible(true);
        b.setVisible(false);
    }//GEN-LAST:event_mniDoiMKActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int nutbam = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "THOÁT", JOptionPane.OK_CANCEL_OPTION);
        if (nutbam == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       
    }//GEN-LAST:event_jMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_QuanLyChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_QuanLyChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_QuanLyChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_QuanLyChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_QuanLyChinh().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MnuBar;
    private javax.swing.JButton btnDSHoaDon;
    private javax.swing.JButton btnDanhSachDP;
    private javax.swing.JButton btnDatPhong;
    private javax.swing.JButton btnDichVu1;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btn_Dong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblTime;
    private javax.swing.JMenuItem mniDSDatPhong;
    private javax.swing.JMenuItem mniDSHoaDon;
    private javax.swing.JMenuItem mniDSKH;
    private javax.swing.JMenuItem mniDSNhanVien;
    private javax.swing.JMenuItem mniDSPhong;
    private javax.swing.JMenuItem mniDSTK;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDichVu;
    private javax.swing.JMenuItem mniDichVuPhong;
    private javax.swing.JMenuItem mniDoiMK;
    private javax.swing.JMenuItem mniLoaiKH;
    private javax.swing.JMenuItem mniLoaiPhong;
    private javax.swing.JMenuItem mniLuongNV;
    private javax.swing.JMenu mnuQLChinh;
    private javax.swing.JMenu mnuQLLoai;
    private javax.swing.JMenu mnuQLNV;
    private javax.swing.JMenu mnuTK;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnu_CaiDat;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnlNutBam;
    public javax.swing.JTabbedPane tab;
    // End of variables declaration//GEN-END:variables
}
