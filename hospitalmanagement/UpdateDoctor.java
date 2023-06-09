package hospitalmanagement;



import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajink
 */
public class UpdateDoctor extends javax.swing.JFrame {

    private String no;

    /**
     * Creates new form UpdateDoctor
     */
    public UpdateDoctor() {
        initComponents();
        combo();
    }
String s;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        doctorid = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        bloodgroup = new javax.swing.JComboBox();
        aadhar_no = new javax.swing.JTextField();
        status = new javax.swing.JComboBox();
        phoneno = new javax.swing.JTextField();
        joiningdate = new javax.swing.JTextField();
        doctorphoto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        leavingdate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        doctoruser = new javax.swing.JTextField();
        doctorpassword = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        specialization = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        timing = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        searchdoct = new javax.swing.JMenuBar();
        adddoc = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        deletedoc = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        searchdoc = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        updatedoc = new javax.swing.JMenu();
        viewdoc = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UPDATE DOCTORS");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 695, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 6, 1120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/patientdetals.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 165, 172));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 197, 105, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Doctor ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 94, -1, 35));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Blood Group");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, 35));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 259, 105, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Phone No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 105, 35));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Aadhar_no.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 424, 100, 35));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 323, -1, 35));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("Joining Date");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 513, 105, 35));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setText("Last Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 197, -1, 35));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setText("Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 377, 105, 35));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 204));
        jLabel14.setText("Maritial Status");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 471, -1, 35));
        getContentPane().add(doctorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 193, 32));

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 674, 32));
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 193, 32));
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 200, 240, 32));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 193, 32));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Other" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 192, 33));

        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A+", "A-", "B+", "B-" }));
        getContentPane().add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 250, 33));

        aadhar_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhar_noActionPerformed(evt);
            }
        });
        getContentPane().add(aadhar_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 202, 32));

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Maritial Status", "Single", "Married" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 259, 33));

        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 203, 32));

        joiningdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joiningdateActionPerformed(evt);
            }
        });
        getContentPane().add(joiningdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 259, 32));

        doctorphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(doctorphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, 280, 273));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 204));
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 410, 161, 43));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 204));
        jLabel16.setText("Leaving Date");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 105, 35));

        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 203, 32));

        leavingdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leavingdateActionPerformed(evt);
            }
        });
        getContentPane().add(leavingdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 203, 32));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 204));
        jLabel17.setText("Password");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 500, 105, 35));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 204));
        jLabel18.setText("City");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 105, 35));

        doctoruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctoruserActionPerformed(evt);
            }
        });
        getContentPane().add(doctoruser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 460, 182, 32));

        doctorpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(doctorpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 500, 182, 32));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 204));
        jLabel19.setText("Username");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 460, 105, 35));

        search.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search.setForeground(new java.awt.Color(0, 102, 204));
        search.setText("SEARCH DOCTOR");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 94, -1, 49));

        update.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 102, 204));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 82, 155, 51));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 204));
        jLabel15.setText("Department");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 294, 118, 35));

        specialization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Department" }));
        getContentPane().add(specialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 294, 250, 38));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 204));
        jLabel20.setText("Visit Timing");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 560, 105, 35));

        timing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timingActionPerformed(evt);
            }
        });
        getContentPane().add(timing, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 259, 32));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 204));
        jLabel21.setText("Days");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 105, 35));

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, 200, 32));

        adddoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adddoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ADD (6)_1.png"))); // NOI18N
        adddoc.setText("Add Doctors");
        adddoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adddocMouseClicked(evt);
            }
        });
        adddoc.add(jSeparator1);

        searchdoct.add(adddoc);

        deletedoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deletedoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/removeuser.png"))); // NOI18N
        deletedoc.setText("Delete Doctors");
        deletedoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletedocMouseClicked(evt);
            }
        });
        deletedoc.add(jSeparator3);

        searchdoct.add(deletedoc);

        searchdoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchdoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/searchuser.png"))); // NOI18N
        searchdoc.setText("Search Doctors");
        searchdoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchdocMouseClicked(evt);
            }
        });
        searchdoc.add(jSeparator2);

        searchdoct.add(searchdoc);

        updatedoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatedoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/updateuser (2).png"))); // NOI18N
        updatedoc.setText("Update Doctors");
        updatedoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatedocMouseClicked(evt);
            }
        });
        searchdoct.add(updatedoc);

        viewdoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewdoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/viewuser.png"))); // NOI18N
        viewdoc.setText("View Doctors");
        viewdoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewdocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewdocMouseEntered(evt);
            }
        });
        searchdoct.add(viewdoc);

        setJMenuBar(searchdoct);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adddocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddocMouseClicked
        DoctorDetails dd=new DoctorDetails();
        dd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adddocMouseClicked

    private void deletedocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletedocMouseClicked
        DeleteDoctor dd1=new DeleteDoctor();
        dd1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deletedocMouseClicked

    private void searchdocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchdocMouseClicked
        SearchDoctor sd=new SearchDoctor();
        sd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchdocMouseClicked

    private void updatedocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatedocMouseClicked
        UpdateDoctor ud=new UpdateDoctor();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updatedocMouseClicked

    private void viewdocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewdocMouseClicked
        ViewDoctor vp=new ViewDoctor();
        vp.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_viewdocMouseClicked

    private void viewdocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewdocMouseEntered

    }//GEN-LAST:event_viewdocMouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adminPanel ap=new adminPanel();
        ap.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void aadhar_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhar_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhar_noActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void joiningdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joiningdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joiningdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            doctorphoto.setIcon(ResizeImage(path));
            s = path;
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No Data");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void leavingdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leavingdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leavingdateActionPerformed

    private void doctoruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctoruserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctoruserActionPerformed

    private void doctorpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorpasswordActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/hospitalmanagementsystem?useSSL=false","root","ROOT");
            PreparedStatement pst = conn.prepareStatement( "select *from doctor where D_id=?");
            pst.setString(1,doctorid.getText());
            ResultSet rs=pst.executeQuery();

            if(rs.next()){
                String fname=rs.getString("firstname");
                firstname.setText(fname);
                String sname=rs.getString("lastname");
                lastname.setText(sname);
                String age1=rs.getString("age");
                age.setText(age1);
                String mstatus=rs.getString("maritialstatus");
                status.setSelectedItem(mstatus);
                String gen=rs.getString("gender");
                gender.setSelectedItem(gen);
                String add=rs.getString("address");
                address.setText(add);
                String Aadhar_no=rs.getString("Aadhar_no");
               aadhar_no.setText(Aadhar_no);
                String bg=rs.getString("bloodgroup");
                bloodgroup.setSelectedItem(bg);
                String jdatey=rs.getString("joiningdate");
                joiningdate.setText(jdatey);
                String ldatey=rs.getString("leavingdate");
                leavingdate.setText(ldatey);
                String pno=rs.getString("phoneno");
                phoneno.setText(pno);
                String cty=rs.getString("city");
                city.setText(cty);
                String duser=rs.getString("username");
                doctoruser.setText(duser);
                String dpass=rs.getString("password");
                doctorpassword.setText(dpass);
                 String sp=rs.getString("specialization");
                specialization.setSelectedItem(sp);
                 byte[]imagedata =rs.getBytes("doctorphoto");
        ImageIcon path=new ImageIcon(imagedata);
   doctorphoto.setIcon(path);
    String ti=rs.getString("timing");
                timing.setText(ti);
                 String da=rs.getString("days");
                date.setText(da);
            }
            else{
                JOptionPane.showMessageDialog(null,"No Specific Id Found");
            }
        }

        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed
private void combo(){
    try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/hospitalmanagementsystem?useSSL=false","root","ROOT");
           
            PreparedStatement pst = conn.prepareStatement( "SELECT * FROM hospitalmanagementsystem.department");       
             ResultSet rs=pst.executeQuery();
             while(rs.next()){
                  specialization.addItem(rs.getString("departmentname"));
             }
            
              pst.execute();
             
    }                                           
catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());}  
}
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/hospitalmanagementsystem?useSSL=false","root","ROOT");
            PreparedStatement pst = conn.prepareStatement("UPDATE doctor SET firstname=?,lastname=?,age=?,maritialstatus=?,gender=?,address=?,Aadhar_no=?,bloodgroup=?,joiningdate=?,phoneno=?,leavingdate=?,city=?,username=?,password=?,specialization=?,timing=?,days=? WHERE D_id=?");
    
            pst.setString(1,firstname.getText());
            pst.setString(2,lastname.getText());
            pst.setString(3,age.getText());
            pst.setString(4, (String) status.getSelectedItem());
            pst.setString(5, (String) gender.getSelectedItem());
            pst.setString(6,address.getText());
            pst.setString(7,aadhar_no.getText());
            pst.setString(8, (String) bloodgroup.getSelectedItem());
            pst.setString(9,joiningdate.getText());
            pst.setString(10,phoneno.getText());
             pst.setString(11,leavingdate.getText());
            
            pst.setString(12,city.getText());
            pst.setString(13,doctoruser.getText());
            pst.setString(14,doctorpassword.getText());
             pst.setString(15,(String) specialization.getSelectedItem());
               
                   
                     
                       
                  
                     pst.setString(16,timing.getText());
                      pst.setString(17,date.getText());
               pst.setString(18,doctorid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Updated Sucessfully");
            doctorid.setText(null);
            firstname.setText(null);
            lastname.setText(null);
            age.setText(null);
            address.setText(null);
            aadhar_no.setText(null);
              specialization.setSelectedIndex(0);
            phoneno.setText(null);
            joiningdate.setText(null);
            leavingdate.setText(null);
            gender.setSelectedIndex(0);
            bloodgroup.setSelectedIndex(0);
            status.setSelectedIndex(0);
            doctorphoto.setIcon(null);
            doctoruser.setText(null);
            doctorpassword.setText(null);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void timingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timingActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar_no;
    private javax.swing.JMenu adddoc;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox bloodgroup;
    private javax.swing.JTextField city;
    private javax.swing.JTextField date;
    private javax.swing.JMenu deletedoc;
    private javax.swing.JTextField doctorid;
    private javax.swing.JTextField doctorpassword;
    private javax.swing.JLabel doctorphoto;
    private javax.swing.JTextField doctoruser;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextField joiningdate;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField leavingdate;
    private javax.swing.JTextField phoneno;
    private javax.swing.JButton search;
    private javax.swing.JMenu searchdoc;
    private javax.swing.JMenuBar searchdoct;
    private javax.swing.JComboBox specialization;
    private javax.swing.JComboBox status;
    private javax.swing.JTextField timing;
    private javax.swing.JButton update;
    private javax.swing.JMenu updatedoc;
    private javax.swing.JMenu viewdoc;
    // End of variables declaration//GEN-END:variables
public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(doctorphoto.getWidth(), doctorphoto.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
}
