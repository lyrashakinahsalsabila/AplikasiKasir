/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikasir_ujikom;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MenuUtama extends javax.swing.JFrame {
        Connection konek;
        PreparedStatement pst;
        ResultSet rst;
    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        konek =Koneksi.koneksiDB();
         mulai();
        tampilWaktu();
    }
    public void mulai() {
        Register.setEnabled(false);
        Logout.setEnabled(false);
        Master.setEnabled(false);
        Transaksi.setEnabled(false);
        Laporan.setEnabled(false);
        txtJam.setEnabled(false);
        txtTgl.setEnabled(false);
        FormLogin.setVisible(false);
        btnRegis.setEnabled(false);
        btnPelanggan.setEnabled(false);
        btnProduk.setEnabled(false);
        btnPenjualan.setEnabled(false);
        
    }
    public void tampilWaktu() {
        Thread clock =new Thread() {
            public void run() {
                for(;;) {
                    Calendar cal =Calendar.getInstance();
                    SimpleDateFormat Jam =new SimpleDateFormat("HH:mm:ss");
                    SimpleDateFormat Tanggal =new SimpleDateFormat("dd-MM-yyyy");
                    txtJam.setText(Jam.format(cal.getTime()));
                    txtTgl.setText(Tanggal.format(cal.getTime()));
                    try { sleep(1000);
                    }catch (InterruptedException ex){
                        Logger.getLogger(FormPenjualan.class.getName()).log(Level.SEVERE, null,ex);
                    }
                }
            }
        };
        clock.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtJam = new javax.swing.JTextField();
        txtTgl = new javax.swing.JTextField();
        btnPelanggan = new javax.swing.JButton();
        btnProduk = new javax.swing.JButton();
        btnPenjualan = new javax.swing.JButton();
        btnRegis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FormLogin = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPw = new javax.swing.JPasswordField();
        cmbHA = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Beranda = new javax.swing.JMenu();
        Register = new javax.swing.JMenuItem();
        LOGIN = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        Master = new javax.swing.JMenu();
        Produksi = new javax.swing.JMenuItem();
        Pelanggan = new javax.swing.JMenuItem();
        Transaksi = new javax.swing.JMenu();
        Penjual = new javax.swing.JMenuItem();
        Laporan = new javax.swing.JMenu();
        RkpLap = new javax.swing.JMenuItem();
        Tentang = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama");
        setBackground(new java.awt.Color(255, 255, 255));

        txtJam.setEnabled(false);
        txtJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJamActionPerformed(evt);
            }
        });

        txtTgl.setEnabled(false);
        txtTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglActionPerformed(evt);
            }
        });

        btnPelanggan.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-customer-100.png")); // NOI18N
        btnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelangganActionPerformed(evt);
            }
        });

        btnProduk.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-product-100.png")); // NOI18N
        btnProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdukActionPerformed(evt);
            }
        });

        btnPenjualan.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-sale-100.png")); // NOI18N
        btnPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjualanActionPerformed(evt);
            }
        });

        btnRegis.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-registration-100.png")); // NOI18N
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Pelanggan");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Produk");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Penjualan");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Registrasi");

        FormLogin.setVisible(true);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("LOGIN");

        cmbHA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu", "Admin", "Petugas", "" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\user2.png")); // NOI18N
        jLabel6.setText("Username");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\pw2.png")); // NOI18N
        jLabel7.setText("Password");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\access.png")); // NOI18N
        jLabel8.setText("Hak Akses");

        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormLoginLayout = new javax.swing.GroupLayout(FormLogin.getContentPane());
        FormLogin.getContentPane().setLayout(FormLoginLayout);
        FormLoginLayout.setHorizontalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(112, 112, 112)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUser)
                    .addComponent(txtPw)
                    .addComponent(cmbHA, 0, 180, Short.MAX_VALUE))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLoginLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(259, 259, 259))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLoginLayout.createSequentialGroup()
                        .addComponent(btnBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogin)
                        .addGap(175, 175, 175))))
        );
        FormLoginLayout.setVerticalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(54, 54, 54)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPw, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbHA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal)
                    .addComponent(btnLogin))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUser.setText("Silahkan Login Disini");

        Beranda.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-home-25 (1).png")); // NOI18N
        Beranda.setText("Beranda");

        Register.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-registration-18.png")); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        Beranda.add(Register);

        LOGIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-login-20 (1).png"))); // NOI18N
        LOGIN.setText("Login");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        Beranda.add(LOGIN);

        Logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-logout-20.png")); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        Beranda.add(Logout);

        jMenuBar1.add(Beranda);

        Master.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-master-25.png")); // NOI18N
        Master.setText("Master");

        Produksi.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-product-18.png")); // NOI18N
        Produksi.setText("Produk");
        Produksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProduksiActionPerformed(evt);
            }
        });
        Master.add(Produksi);

        Pelanggan.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-customer-18.png")); // NOI18N
        Pelanggan.setText("Pelanggan");
        Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PelangganActionPerformed(evt);
            }
        });
        Master.add(Pelanggan);

        jMenuBar1.add(Master);

        Transaksi.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-money-25.png")); // NOI18N
        Transaksi.setText("Transaksi");

        Penjual.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-sale-18.png")); // NOI18N
        Penjual.setText("Penjualan");
        Penjual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenjualActionPerformed(evt);
            }
        });
        Transaksi.add(Penjual);

        jMenuBar1.add(Transaksi);

        Laporan.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-report-25.png")); // NOI18N
        Laporan.setText("Laporan");

        RkpLap.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-report-25 (1).png")); // NOI18N
        RkpLap.setText("RekapLaporan");
        RkpLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RkpLapActionPerformed(evt);
            }
        });
        Laporan.add(RkpLap);

        jMenuBar1.add(Laporan);

        Tentang.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons8-get-help-25 (1).png")); // NOI18N
        Tentang.setText("Help");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-about-25.png"))); // NOI18N
        jMenuItem1.setText("Tentang");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Tentang.add(jMenuItem1);

        jMenuBar1.add(Tentang);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblUser)
                .addGap(428, 428, 428)
                .addComponent(txtJam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(FormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel4)
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addGap(139, 139, 139)
                .addComponent(jLabel2)
                .addGap(127, 127, 127)
                .addComponent(jLabel3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblUser))
                    .addComponent(txtJam, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(FormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
FormLogin.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGINActionPerformed

    private void ProduksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProduksiActionPerformed
new FormProduk().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_ProduksiActionPerformed

    private void PelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PelangganActionPerformed
new FormPelanggan().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_PelangganActionPerformed

    private void txtJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJamActionPerformed

    private void txtTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglActionPerformed

    private void btnPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjualanActionPerformed
new FormPenjualan().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPenjualanActionPerformed

    private void btnProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdukActionPerformed
new FormProduk().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProdukActionPerformed

    private void btnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelangganActionPerformed
new FormPelanggan().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPelangganActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
new FormRegister().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
new MenuUtama().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void PenjualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenjualActionPerformed
new FormPenjualan().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_PenjualActionPerformed

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
       new FormRegister().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
try{
    String sql ="select * from login where username='"+txtUser.getText()+"'and  password='"+txtPw.getText()+"'and HakAkses='"+cmbHA.getSelectedItem()+"'";
    pst =konek.prepareStatement(sql);
    rst=pst.executeQuery();
    if(rst.next()) {
    if(txtUser.getText().equals(rst.getString("username"))&& txtPw.getText().equals(rst.getString("password"))&& cmbHA.getSelectedItem().equals(rst.getString("HakAkses")));
    if(cmbHA.getSelectedItem().equals("Admin")){
         Register.setEnabled(true);
        Logout.setEnabled(true);
        Master.setEnabled(true);
        Transaksi.setEnabled(true);
        Laporan.setEnabled(true);
        txtJam.setEnabled(false);
        txtTgl.setEnabled(false);
        FormLogin.setVisible(false);
        btnRegis.setEnabled(true);
        btnPelanggan.setEnabled(true);
        btnProduk.setEnabled(true);
        btnPenjualan.setEnabled(true);
    }else if (cmbHA.getSelectedItem().equals("Petugas")){
       Register.setEnabled(false);
        Logout.setEnabled(true);
        Master.setEnabled(true);
        Transaksi.setEnabled(true);
        Laporan.setEnabled(true);
        txtJam.setEnabled(false);
        txtTgl.setEnabled(false);
        FormLogin.setVisible(false);
        btnRegis.setEnabled(false);
        btnPelanggan.setEnabled(true);
        btnProduk.setEnabled(true);
        btnPenjualan.setEnabled(true);
        
    }
    {
    

    JOptionPane.showMessageDialog(null, "Selamat Datang '"+txtUser.getText()+"'");
    String text =txtUser.getText();
    lblUser.setText("Selamat Datang," +text);
}
    } else {
   JOptionPane.showMessageDialog(null, "Gagal Masuk, periksa kembali ");
   txtUser.getText();
   txtPw.getText();
   cmbHA.setSelectedItem("-Pilih Salah Satu");
            }
}catch (Exception e) {
    JOptionPane.showMessageDialog(null,"login gagal");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void RkpLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RkpLapActionPerformed
new FormLaporanTransaksi().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_RkpLapActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
new FormAbout().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
new MenuUtama().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Beranda;
    private javax.swing.JInternalFrame FormLogin;
    private javax.swing.JMenuItem LOGIN;
    private javax.swing.JMenu Laporan;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenu Master;
    private javax.swing.JMenuItem Pelanggan;
    private javax.swing.JMenuItem Penjual;
    private javax.swing.JMenuItem Produksi;
    private javax.swing.JMenuItem Register;
    private javax.swing.JMenuItem RkpLap;
    private javax.swing.JMenu Tentang;
    private javax.swing.JMenu Transaksi;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPelanggan;
    private javax.swing.JButton btnPenjualan;
    private javax.swing.JButton btnProduk;
    private javax.swing.JButton btnRegis;
    private javax.swing.JComboBox<String> cmbHA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtJam;
    private javax.swing.JPasswordField txtPw;
    private javax.swing.JTextField txtTgl;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
