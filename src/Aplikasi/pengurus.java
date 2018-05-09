 package Aplikasi;

/**
 *
 * @author ITD_Stu
 */

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pengurus extends javax.swing.JFrame {
    // membuat Koneksi tgl DB
    
     koneksi con=new koneksi();
     Date tgl=new Date();
     SimpleDateFormat noformat=new SimpleDateFormat("yyMM");

     
    public pengurus() {
        initComponents();
    }

private void aktif()
{
tnama.setEnabled(true);
tjenis.setEnabled(true);
ttelp.setEnabled(true);
tjabatan.setEnabled(true);
talamat.setEnabled(true);
}

private void bersih()
{
tno.setText("");
tnama.setText("");
tjenis.setText("");
ttelp.setText("");
tjabatan.setText("");
talamat.setText("");
}
    
// untuk Tabel

public DefaultTableModel gettabel()
{
String[]judul={"No.Pengurus","Nama","Jenis Kelamin","No.Telepon","Jabatan","Alamat"};
DefaultTableModel kolom=new DefaultTableModel(null,judul);
    try
    {
    con.setkoneksi();
    con.rs=con.st.executeQuery("select * from pengurus");
    String data[]=new String[6];
        while(con.rs.next())
        {
        data[0]=con.rs.getString(1);
        data[1]=con.rs.getString(2);
        data[2]=con.rs.getString(3);
        data[3]=con.rs.getString(4);
        data[4]=con.rs.getString(5);
        data[5]=con.rs.getString(6);
        kolom.addRow(data);
        }
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null,"<Error>"+e,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
    }
return kolom;
}

private void awal()
{
//Table2.setModel(gettabel());
bersih();
aktif();
 
 
tnama.requestFocus();
bkeluar.setEnabled(true);
bupdate.setVisible(false);
bedit.setEnabled(false);
bhapus.setEnabled(false);
bsimpan.setVisible(true);
}

private void pasif()
{
tno.setEnabled(false);
tnama.setEnabled(false);
talamat.setEnabled(false);
tjenis.setEnabled(false);
ttelp.setEnabled(false);
tjabatan.setEnabled(false);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        talamat = new javax.swing.JTextField();
        ttelp = new javax.swing.JTextField();
        tjabatan = new javax.swing.JTextField();
        tjenis = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        bsimpan = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        label2 = new java.awt.Label();
        jLabel10 = new javax.swing.JLabel();
        tnoPengurus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tnamaPengurus = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jFile = new javax.swing.JMenu();
        jHome = new javax.swing.JMenuItem();
        jKeluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nama :");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Alamat :");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Jenis Kelamin :");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("No. Telp :");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Jabatan :");

        ttelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttelpActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("No. Pengurus :");

        tno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnoActionPerformed(evt);
            }
        });
        tno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tnoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tjenis)
                    .addComponent(talamat)
                    .addComponent(tnama, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttelp)
                    .addComponent(tjabatan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(talamat, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bedit.setText("Edit");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        bkeluar.setText("Kembali");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        bupdate.setText("Update");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bedit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bkeluar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(bupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bsimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bedit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bhapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bkeluar)
                .addGap(23, 23, 23))
        );

        label2.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(153, 0, 51));
        label2.setText("Cari");

        jLabel10.setText("No. Pengurus      :");
        jLabel10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel10FocusGained(evt);
            }
        });

        tnoPengurus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnoPengurusActionPerformed(evt);
            }
        });
        tnoPengurus.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tnoPengurusPropertyChange(evt);
            }
        });
        tnoPengurus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tnoPengurusKeyPressed(evt);
            }
        });

        jLabel11.setText("Nama Pengurus   :");
        jLabel11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel11FocusGained(evt);
            }
        });

        tnamaPengurus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaPengurusActionPerformed(evt);
            }
        });
        tnamaPengurus.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tnamaPengurusPropertyChange(evt);
            }
        });
        tnamaPengurus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tnamaPengurusKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(163, 197, 211));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 66, 10));
        jLabel1.setText("Formulir Pengurus Koperasi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(163, 197, 211));

        jLabel8.setText("Copyright © TK 2016 - PBO ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jFile.setText("File");

        jHome.setText("Home");
        jHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHomeActionPerformed(evt);
            }
        });
        jFile.add(jHome);

        jKeluar.setText("Keluar");
        jKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKeluarActionPerformed(evt);
            }
        });
        jFile.add(jKeluar);

        jMenuBar1.add(jFile);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tnoPengurus, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(tnamaPengurus))))
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tnoPengurus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tnamaPengurus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ttelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttelpActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        // TODO add your handling code here:
        try
        {
            con.setkoneksi();
            String sql="insert into pengurus values('"+tno.getText()+"','"+tnama.getText()+"','"+tjenis.getText()+"','"+ttelp.getText()+"','"+tjabatan.getText()+"','"+talamat.getText()+"')";
            con.st.executeUpdate(sql);
            con.rs.close();
            JOptionPane.showMessageDialog(null,"Database Berhasil Tersimpan","Koneksi Sukses",JOptionPane.INFORMATION_MESSAGE);
            con.conn.close();
            awal();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"  OK  "+e,"Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
        try
        {
            con.setkoneksi();
            String sql="delete from pengurus where no_peng='"+tnoPengurus.getText()+"' or nama_peng='"+tnamaPengurus.getText()+"'";
            con.st.executeUpdate(sql);
            con.rs.close();
            JOptionPane.showMessageDialog(null,"Pengurus Berhasil dihapus","Koneksi Sukses",JOptionPane.INFORMATION_MESSAGE);
            con.conn.close();
            awal();
            tnamaPengurus.setText("");
            tnoPengurus.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"<Error> Koneksikan Xampp Terlebih  : "+e,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
        aktif();
        bupdate.setEnabled(true);
        bedit.setEnabled(false);
        bhapus.setEnabled(false);
    }//GEN-LAST:event_beditActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        new menuUtama().setVisible(true);
        dispose();
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        // TODO add your handling code here:
        try
        {
             con.setkoneksi();String sql="update pengurus set nama_peng='"+tnama.getText()+"',alamat='"+talamat.getText()+"',jenisKelamin='"+tjenis.getText()+"',no_telp='"+ttelp.getText()+"',jabatan='"+tjabatan.getText()+"' where no_peng='"+tno.getText()+"'";
             con.st.executeUpdate(sql);
            
           // con.setkoneksi();String sql="update pengurus set nama_peng='"+tnama.getText()+"',alamat='"+talamat.gettext()+"',jenisKelamin='"+tjenis.getText()+"',no_telp='"+ttelp.getText()+"',jabatan='"+tjabatan.getText()+"' where no_peng='"+tnoPeng.getText()+"'";
           //con.st.executeUpdate(sql);

            con.rs.close();
            JOptionPane.showMessageDialog(null,"Database Berhasil Terupdate","Koneksi Sukses",JOptionPane.INFORMATION_MESSAGE);
            con.conn.close();
            awal();
            tnoPengurus.setText("");
            tnamaPengurus.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"<Error> "+e,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bupdateActionPerformed

    private void jLabel10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel10FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10FocusGained

    private void tnoPengurusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnoPengurusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnoPengurusActionPerformed

    private void tnoPengurusPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tnoPengurusPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tnoPengurusPropertyChange

    private void tnoPengurusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnoPengurusKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try
            {
                con.setkoneksi();
                con.rs=con.st.executeQuery("select * from pengurus where no_peng like '"+tnoPengurus.getText()+"'");
                if(con.rs.next())
                {
                    tno.setText(con.rs.getString(1));
                    tnama.setText(con.rs.getString(2));
                    tjenis.setText(con.rs.getString(3));
                    ttelp.setText(con.rs.getString(4));
                    tjabatan.setText(con.rs.getString(5));
                    talamat.setText(con.rs.getString(6));
                    pasif();
                    bedit.setEnabled(true);
                    bhapus.setEnabled(true);
                    bsimpan.setVisible(false);
                    bupdate.setVisible(true);
                    bupdate.setEnabled(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Nomor Pengurus Tidak ditemukan");
                    tnoPengurus.setText("");
                }
                con.rs.close();
                con.conn.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"<Error> Koneksikan Xampp Terlebih Dahulu : "+e,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_tnoPengurusKeyPressed

    private void jLabel11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel11FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11FocusGained

    private void tnamaPengurusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaPengurusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaPengurusActionPerformed

    private void tnamaPengurusPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tnamaPengurusPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaPengurusPropertyChange

    private void tnamaPengurusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnamaPengurusKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try
            {
                con.setkoneksi();
                con.rs=con.st.executeQuery("select * from pengurus where nama_peng like '"+tnamaPengurus.getText()+"'");
                if(con.rs.next())
                {
                    tno.setText(con.rs.getString(1));
                    tnama.setText(con.rs.getString(2));
                    tjenis.setText(con.rs.getString(3));
                    ttelp.setText(con.rs.getString(4));
                    tjabatan.setText(con.rs.getString(5));
                    talamat.setText(con.rs.getString(6));
                    pasif(); // untuk menutup sebagian fungsi 
                    bedit.setEnabled(true);
                    bhapus.setEnabled(true);
                    bsimpan.setVisible(false);
                    bupdate.setVisible(true);
                    bupdate.setEnabled(false);
                    //Table2.setModel(gettabel());
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Nama Tidak Tersedia");
                    tnamaPengurus.setText("");
                }
                con.rs.close();
                con.conn.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"<Error> Koneksikan Xampp Terlebih Dahulu : "+e,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_tnamaPengurusKeyPressed

    private void tnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnoActionPerformed

    private void tnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnoKeyPressed

    private void jHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeActionPerformed
        new menuUtama().setVisible(true);
        dispose();
    }//GEN-LAST:event_jHomeActionPerformed

    private void jKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKeluarActionPerformed
        new LoginAplikasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jKeluarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengurus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bupdate;
    private javax.swing.JMenu jFile;
    private javax.swing.JMenuItem jHome;
    private javax.swing.JMenuItem jKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private java.awt.Label label2;
    private javax.swing.JTextField talamat;
    private javax.swing.JTextField tjabatan;
    private javax.swing.JTextField tjenis;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnamaPengurus;
    private javax.swing.JTextField tno;
    private javax.swing.JTextField tnoPengurus;
    private javax.swing.JTextField ttelp;
    // End of variables declaration//GEN-END:variables
}
