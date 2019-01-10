/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students_Result;

import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

        







/**
 *
 * @author Vaishali
 */
public class Student_Result extends javax.swing.JFrame {

    /**
     * Creates new form Student_Result
     */
    public Student_Result() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtFirstname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtSurname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtTotalScore = new javax.swing.JTextField();
        jtxtAverage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtRanking = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jcmbCourseCode = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jtxtMaths = new javax.swing.JTextField();
        jtxtEnglish = new javax.swing.JTextField();
        jtxtBiology = new javax.swing.JTextField();
        jtxtComputing = new javax.swing.JTextField();
        jtxtChemistry = new javax.swing.JTextField();
        jtxtStudentID = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtTranscript = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnReset = new javax.swing.JButton();
        jbtnRanking = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnTranscript1 = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnExit1 = new javax.swing.JButton();
        jbtnSearchRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Result System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4), "Student Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36))); // NOI18N
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Student_ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Firstname:");

        jtxtFirstname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Lastname:");

        jtxtSurname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Total Score:");

        jtxtTotalScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtxtAverage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Average:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Ranking:");

        jtxtRanking.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRankingActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Maths:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("English:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Biology:");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Computing:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Chemistry:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Course Code:");

        jcmbCourseCode.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcmbCourseCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C98123", "C98234", "C98345", "C98567" }));
        jcmbCourseCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCourseCodeActionPerformed(evt);
            }
        });

        jtxtMaths.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtMaths.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMathsKeyTyped(evt);
            }
        });

        jtxtEnglish.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtEnglish.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtEnglishKeyTyped(evt);
            }
        });

        jtxtBiology.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtBiology.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBiologyKeyTyped(evt);
            }
        });

        jtxtComputing.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtComputing.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtComputingKeyTyped(evt);
            }
        });

        jtxtChemistry.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtChemistry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtChemistryKeyTyped(evt);
            }
        });

        jtxtStudentID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtStudentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtStudentIDKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcmbCourseCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtxtRanking, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                            .addComponent(jtxtAverage)
                                            .addComponent(jtxtTotalScore))
                                        .addGap(10, 10, 10))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(jtxtFirstname)
                                    .addComponent(jtxtStudentID))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtMaths, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jtxtEnglish)
                    .addComponent(jtxtBiology)
                    .addComponent(jtxtComputing)
                    .addComponent(jtxtChemistry))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtMaths, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtStudentID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtFirstname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jtxtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jtxtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jcmbCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(33, 33, 33)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtTotalScore, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jtxtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jtxtBiology, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtComputing, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtChemistry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtxtRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 710, 420));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4), "Grades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36))); // NOI18N

        jtxtTranscript.setColumns(20);
        jtxtTranscript.setRows(5);
        jScrollPane1.setViewportView(jtxtTranscript);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 370, 410));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_ID", "FirstName", "LastName", "Maths", "English", "Biology", "Computing", "Chemistry", "Total Score", "Average", "Ranking"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Student_ID");
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 1080, 120));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReset.setForeground(new java.awt.Color(0, 153, 153));
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 120, 40));

        jbtnRanking.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRanking.setForeground(new java.awt.Color(0, 153, 153));
        jbtnRanking.setText("Ranking and Add");
        jbtnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRankingActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 240, 40));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(0, 153, 153));
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 120, 40));

        jbtnTranscript1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnTranscript1.setForeground(new java.awt.Color(0, 153, 153));
        jbtnTranscript1.setText("Transcript");
        jbtnTranscript1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTranscript1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnTranscript1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 160, 40));

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDelete.setForeground(new java.awt.Color(0, 153, 153));
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 110, 40));

        jbtnExit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnExit1.setForeground(new java.awt.Color(0, 153, 153));
        jbtnExit1.setText("Exit");
        jbtnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 120, 40));

        jbtnSearchRecord.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnSearchRecord.setForeground(new java.awt.Color(0, 153, 153));
        jbtnSearchRecord.setText("Search Record");
        jbtnSearchRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchRecordActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSearchRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
        JTextField temp=null;
        for(Component c:jPanel2.getComponents())
        {
            if(c.getClass().toString().contains("javax.swing.JTextField")){
            temp=(JTextField)c;
            temp.setText(null);
            }
        }
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRankingActionPerformed
        // TODO add your handling code here:
        //================================================
        String Student_ID =  jtxtStudentID.getText().toString();
        String Firstname = jtxtFirstname.getText().toString();
        String Lastname = jtxtSurname.getText().toString();
        String Maths =  jtxtMaths.getText().toString();
        String English =  jtxtEnglish.getText().toString();
        String Biology =  jtxtBiology.getText().toString();
        String Computing =  jtxtComputing.getText().toString();
        String Chemistry =  jtxtChemistry.getText().toString();
        try
        {
            FileWriter writer = new FileWriter("Strudent_Result.dat",true);
           
            writer.write(Student_ID);
            writer.write('|');
            writer.write(Firstname);
            writer.write('|');
            writer.write(Lastname);
            writer.write('|');
            writer.write(Maths);
            writer.write('|');
            writer.write(English);
            writer.write('|');
            writer.write(Biology);
            writer.write('|');
            writer.write(Computing);
            writer.write('|');
            writer.write(Chemistry);
            writer.write("\r\n");
            writer.close();
            JOptionPane.showMessageDialog(rootPane, "Insert Data Sucessfully in text file");       
        }catch (Exception e){
        JOptionPane.showMessageDialog(rootPane, "Error");
        
        }
            
        
        //=================================================
        //declare an array
        double[] R =new double[14];
        R[0]= Double.parseDouble(jtxtMaths.getText());
        R[1]= Double.parseDouble(jtxtEnglish.getText());
        R[2]= Double.parseDouble(jtxtBiology.getText());
        R[3]= Double.parseDouble(jtxtComputing.getText());
        R[4]= Double.parseDouble(jtxtChemistry.getText());

        
        R[5]= (R[0]+ R[1]+ R[2] + R[3] + R[4]) / 5 ;
        R[6]= R[0]+ R[1]+ R[2] + R[3] + R[4];
        
        String Average = String.format("%.0f", R[5]);
        jtxtAverage.setText(Average);
        
        String TotalScore = String.format("%.0f", R[6]);
        jtxtTotalScore.setText(TotalScore);
        
        if(R[6] >= 700)
        {
            jtxtRanking.setText("1st");
        }
        else if (R[6] >= 600)
        {
            jtxtRanking.setText("2i");
         }
        else if ((R[6] <= 500 && R[6] > 400))
        {
            jtxtRanking.setText("2ND");
         }
        //else if (R[6] >= 400)
        //{
          //  jtxtRanking.setText("3RD");
        // }
        else if ((R[6] <= 300) && (R[6] > 200))
        {
            jtxtRanking.setText("Work Hard");
         }
        else if (R[6] <= 200)
        {
            //System.out.println("i am in less");
            jtxtRanking.setText("Fail");
         }
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{
            
            jtxtStudentID.getText(),
            jtxtFirstname.getText(),
            jtxtSurname.getText(),
            //jcmbCourseCode.getSelectedItem(),
            jtxtMaths.getText(),
            jtxtEnglish.getText(),
            jtxtBiology.getText(),
            jtxtComputing.getText(),
            jtxtChemistry.getText(),
            jtxtTotalScore.getText(),
            jtxtAverage.getText(),
            jtxtRanking.getText(),
            
        });
        
    }//GEN-LAST:event_jbtnRankingActionPerformed
    //declaring a variable frame for taking action on exit button;
    private JFrame frame;
    private void jbtnTranscript1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTranscript1ActionPerformed
             // TODO add your handling code here:
                jtxtTranscript.append("\nStrudent Result Recording System\n"
                +"=============================="
                 +"\nStudent_ID:\t\t" + jtxtStudentID.getText()
                +"\nFirstname:\t\t" +jtxtFirstname.getText()
                +"\nMaths:\t\t" + jtxtMaths.getText()
                +"\nEnglish:\t\t" +jtxtEnglish.getText()
                +"\nBiology:\t\t" + jtxtBiology.getText()
                +"\nTotal Score:\t\t" + jtxtTotalScore.getText()
                +"\nAverage:\t\t" + jtxtAverage.getText()
                +"\nRanking:\t\t" + jtxtRanking.getText()
                +"\n"
               
        );
    }//GEN-LAST:event_jbtnTranscript1ActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()== -1){
            if (jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"No data to delete",
                        "Student Result System",JOptionPane.OK_OPTION);
            }else{
                JOptionPane.showMessageDialog(null,"Select Row to delete",
                        "Student Result System",JOptionPane.OK_OPTION);
            }
        }else{
            model.removeRow(jTable1.getSelectedRow());
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jtxtStudentIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtStudentIDKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtStudentIDKeyTyped

    private void jtxtChemistryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtChemistryKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtChemistryKeyTyped

    private void jtxtComputingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtComputingKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtComputingKeyTyped

    private void jtxtBiologyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBiologyKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtBiologyKeyTyped

    private void jtxtEnglishKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEnglishKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }

    }//GEN-LAST:event_jtxtEnglishKeyTyped

    private void jtxtMathsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMathsKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtMathsKeyTyped

    private void jcmbCourseCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCourseCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbCourseCodeActionPerformed

    private void jtxtRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRankingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRankingActionPerformed

    private void jbtnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnExit1ActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","Student Result System",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnSearchRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchRecordActionPerformed
      
    }//GEN-LAST:event_jbtnSearchRecordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(Student_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Result().setVisible(true);
            }
        });
    }
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnExit1;
    private javax.swing.JButton jbtnRanking;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSearchRecord;
    private javax.swing.JButton jbtnTranscript1;
    private javax.swing.JComboBox<String> jcmbCourseCode;
    private javax.swing.JTextField jtxtAverage;
    private javax.swing.JTextField jtxtBiology;
    private javax.swing.JTextField jtxtChemistry;
    private javax.swing.JTextField jtxtComputing;
    private javax.swing.JTextField jtxtEnglish;
    private javax.swing.JTextField jtxtFirstname;
    private javax.swing.JTextField jtxtMaths;
    private javax.swing.JTextField jtxtRanking;
    private javax.swing.JTextField jtxtStudentID;
    private javax.swing.JTextField jtxtSurname;
    private javax.swing.JTextField jtxtTotalScore;
    private javax.swing.JTextArea jtxtTranscript;
    // End of variables declaration//GEN-END:variables
}
