
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pariva
 */
public class Education extends javax.swing.JFrame {

    /**
     * Creates new form Education
     */
    public Education() {
        initComponents();
        
    }
 ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField_student = new javax.swing.JTextField();
        jTextField_roll = new javax.swing.JTextField();
        jTextField_address = new javax.swing.JTextField();
        jTextField_fname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_contact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eduaction.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Education");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("Student Name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("Roll No:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 0));
        jLabel5.setText("Address:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("Father Name:");

        jButton1.setBackground(new java.awt.Color(248, 148, 6));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextField_student.setBackground(new java.awt.Color(44, 62, 80));
        jTextField_student.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_student.setForeground(new java.awt.Color(255, 255, 255));

        jTextField_roll.setBackground(new java.awt.Color(44, 62, 80));
        jTextField_roll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_roll.setForeground(new java.awt.Color(255, 255, 255));

        jTextField_address.setBackground(new java.awt.Color(44, 62, 80));
        jTextField_address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_address.setForeground(new java.awt.Color(255, 255, 255));

        jTextField_fname.setBackground(new java.awt.Color(44, 62, 80));
        jTextField_fname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_fname.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 0));
        jLabel7.setText("Contact:");

        jTextField_contact.setBackground(new java.awt.Color(44, 62, 80));
        jTextField_contact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_contact.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 0));
        jLabel8.setText("DOB:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setText("<<");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(248, 148, 6));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(108, 122, 137));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(108, 122, 137));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(108, 122, 137));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(248, 148, 6));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("New");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(248, 148, 6));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Show");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel10.setText("X");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel11.setText("-");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "student_name", "roll_no", "address", "father name", "contact"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel6)
                                                        .addGap(45, 45, 45))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel3)
                                                            .addComponent(jLabel8))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                                    .addComponent(jTextField_contact)
                                                    .addComponent(jTextField_fname)
                                                    .addComponent(jTextField_roll)
                                                    .addComponent(jTextField_student)
                                                    .addComponent(jTextField_address)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(68, 68, 68)
                                                .addComponent(jLabel2))
                                            .addComponent(jLabel7))
                                        .addGap(139, 139, 139)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1)))
                .addGap(847, 847, 847))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String student_name = jTextField_student.getText();
        String roll_no = jTextField_roll.getText();
        String address = jTextField_address.getText();
        String father_name = jTextField_fname.getText();
        String contact = jTextField_contact.getText();
        
             String bdate1 = null;
        {
             if(jDateChooser1.getDate() != null)
                {
         SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
         bdate1 = dateformat.format(jDateChooser1.getDate());   
        }
       
         
      
        PreparedStatement ps;
        String query = " INSERT INTO `education`( `student_name`, `roll_no`, `address`, `father_name`,`contact`,`dob`) VALUES (?,?,?,?,?,?)";
        try {
            ps =  MyConnection.getConnection().prepareStatement(query);
            ps.setString(1,student_name);
            ps.setString(2,roll_no);
            ps.setString(3,address);
            ps.setString(4,father_name);
            ps.setString(5,contact);
         
             if(bdate1 != null)
            {
            ps.setString(6,bdate1);
            }
            else{
                ps.setNull(6,0);
            }
            
       
            
            
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"Submitted");
            } 
        } catch (SQLException ex) {
            Logger.getLogger(RegsiterForms.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        People_City ppl = new People_City();
       ppl.setVisible(true);
       ppl.pack();
       ppl.setLocationRelativeTo(null);
       ppl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PreparedStatement ps;
        try {
            String student_name = jTextField_student.getText();
            String roll_no= jTextField_roll.getText();
            String address = jTextField_address.getText();
            String fname= jTextField_fname.getText();
            String contact = jTextField_contact.getText();
                 String bdate1 = null;
        {
             if(jDateChooser1.getDate() != null)
                {
         SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
         bdate1 = dateformat.format(jDateChooser1.getDate());   
        }
        }
            ps = MyConnection.getConnection().prepareStatement("update education set student_name=?,address=?,father_name=?,contact=?,dob=? where roll_no=?");
            ps.setString(1,student_name);
            ps.setString(2,address);
            ps.setString(3,fname);
            ps.setString(4,contact);
            ps.setString(5,bdate1);
            ps.setString(6,roll_no);
            int k = ps.executeUpdate();
            if(k==1)
            {
                JOptionPane.showMessageDialog(this,"Record Updated successfully ");
            }
            else{
                jTextField_student.setText("");
                jTextField_roll.setText("");
                jTextField_address.setText("");
                jTextField_fname.requestFocus();
                jTextField_contact.setText("");
                 if(bdate1 != null)
            {
            ps.setString(6,bdate1);
            }
            else{
                ps.setNull(6,0);
            }
            
                
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(Education.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String roll_no = jTextField_roll.getText();
        PreparedStatement ps;
        try{
            ps = MyConnection.getConnection().prepareStatement("select * from education where roll_no = ?");
            ps.setString(1,roll_no);
            rs =ps.executeQuery();
            if(rs.next()==true){
                jTextField_address.setText(rs.getString(3));
                  jTextField_fname.setText(rs.getString(4));
                  jTextField_contact.setText(rs.getString(5));
                 
            }

        }
        catch (SQLException ex){
            Logger.getLogger(Add_Atm.class.getName()).log(Level.SEVERE,null,ex);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        view_education.AddRowTable1(new Object[]   {
                         jTextField_student.getText(),
                         jTextField_roll.getText(), 
                         jTextField_address.getText(),
                         jTextField_fname.getText(),
                         jTextField_contact.getText()
    });
        String student_name = jTextField_student.getText();
        String roll_no = jTextField_roll.getText();
        String address = jTextField_address.getText();
        String father_name = jTextField_fname.getText();
        String contact = jTextField_contact.getText();
        
             String bdate1 = null;
        {
             if(jDateChooser1.getDate() != null)
                {
         SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
         bdate1 = dateformat.format(jDateChooser1.getDate());   
        }
       
         
      
        PreparedStatement ps;
        String query = " INSERT INTO `education`( `student_name`, `roll_no`, `address`, `father_name`,`contact`,`dob`) VALUES (?,?,?,?,?,?)";
        try {
            ps =  MyConnection.getConnection().prepareStatement(query);
            ps.setString(1,student_name);
            ps.setString(2,roll_no);
            ps.setString(3,address);
            ps.setString(4,father_name);
            ps.setString(5,contact);
         
             if(bdate1 != null)
            {
            ps.setString(6,bdate1);
            }
            else{
                ps.setNull(6,0);
            }
            
       int k = ps.executeUpdate();
            if(jTextField_student.getText().trim().isEmpty())
            {
               jTextField_student.setText(" student name field is empty");
            }
            else if(jTextField_roll.getText().trim().isEmpty())
            {
                jTextField_roll.setText(" roll no field is empty");
                
            }
             else  if(jTextField_address.getText().trim().isEmpty())
            {
                jTextField_address.setText("address field is empty");
                
            }
             else  if(jTextField_fname.getText().trim().isEmpty())
            {
                jTextField_fname.setText("father name field is empty");
                
            }
              else  if(jTextField_contact.getText().trim().isEmpty())
            {
                jTextField_contact.setText("contact field is empty");
                
            }
            else if(k==1)
            {
                
                JOptionPane.showMessageDialog(this,"Record Added successfully ");
            }
            else{
               jTextField_student.setText(""); 
               jTextField_roll.setText("");
               jTextField_address.setText("");
               jTextField_fname.setText("");
               jTextField_contact.setText("");
               jTextField_student.requestFocus();
               
            }
            
            
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"Record Added successfully");
            } 
        } catch (SQLException ex) {
            Logger.getLogger(RegsiterForms.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PreparedStatement ps;
        try {

            String student_name = jTextField_student.getText();
            ps = MyConnection.getConnection().prepareStatement("delete from education where student_name=?");

            ps.setString(1,student_name);

            int k = ps.executeUpdate();
            if(k==1)
            {
                JOptionPane.showMessageDialog(this,"Record Deleted successfully ");
            }
            else{
                jTextField_student.setText(""); 
               jTextField_roll.setText("");
               jTextField_address.setText("");
               jTextField_fname.setText("");
               jTextField_contact.setText("");
               jTextField_student.requestFocus();
               
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(Education.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
               jTextField_student.setText(""); 
               jTextField_roll.setText("");
               jTextField_address.setText("");
               jTextField_fname.setText("");
               jTextField_contact.setText("");
               jTextField_student.requestFocus();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        if(jTextField_student.getText().equals("")||jTextField_roll.getText().equals("")||jTextField_address.getText().equals("")||jTextField_fname.getText().equals("")||jTextField_contact.getText().equals("")){
               
        }
        else{
        String data[]={jTextField_student.getText(),jTextField_roll.getText(),jTextField_address.getText(),jTextField_fname.getText(),jTextField_contact.getText()};
        
        
        
        DefaultTableModel model =  (DefaultTableModel)jTable1.getModel();
        
        
        model.addRow(data);
        JOptionPane.showMessageDialog(this,"record added successfully");
        }
       jTextField_student.setText(""); 
               jTextField_roll.setText("");
               jTextField_address.setText("");
               jTextField_fname.setText("");
               jTextField_contact.setText("");
               jTextField_student.requestFocus();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Education.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Education.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Education.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Education.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Education().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_address;
    private javax.swing.JTextField jTextField_contact;
    private javax.swing.JTextField jTextField_fname;
    private javax.swing.JTextField jTextField_roll;
    private javax.swing.JTextField jTextField_student;
    // End of variables declaration//GEN-END:variables
}
