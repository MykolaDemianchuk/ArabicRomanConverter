package gui;

import com.sun.glass.events.KeyEvent;
import converter.*;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        arabicTextField = new javax.swing.JTextField();
        mainLabel = new javax.swing.JLabel();
        arabicLabel = new javax.swing.JLabel();
        romanLabel = new javax.swing.JLabel();
        romanTextField = new javax.swing.JTextField();
        mainLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arabicTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        arabicTextField.setToolTipText("");
        arabicTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arabicTextFieldMouseClicked(evt);
            }
        });
        arabicTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arabicTextFieldActionPerformed(evt);
            }
        });
        arabicTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                arabicTextFieldKeyPressed(evt);
            }
        });

        mainLabel.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Arabic - Roman");
        mainLabel.setToolTipText(""); // NOI18N

        arabicLabel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        arabicLabel.setText("Arabic numeral");

        romanLabel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        romanLabel.setText("Roman numeral");

        romanTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        romanTextField.setToolTipText("Enter roman numeral here");
        romanTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                romanTextFieldMouseClicked(evt);
            }
        });
        romanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanTextFieldActionPerformed(evt);
            }
        });
        romanTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                romanTextFieldKeyPressed(evt);
            }
        });

        mainLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        mainLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel2.setText("numeral converter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arabicLabel)
                            .addComponent(romanLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arabicTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(romanTextField))
                        .addGap(35, 35, 35)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(mainLabel2)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(arabicLabel)
                    .addComponent(arabicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(romanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(romanLabel))
                .addGap(30, 30, 30))
        );

        arabicTextField.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arabicTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arabicTextFieldActionPerformed

    }//GEN-LAST:event_arabicTextFieldActionPerformed

    private void romanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanTextFieldActionPerformed

    }//GEN-LAST:event_romanTextFieldActionPerformed

    private void arabicTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arabicTextFieldKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            NumeralConverter aConverter = new ArabicToRomanConverter();
            String result = aConverter.convert(arabicTextField.getText());
            romanTextField.setText(result);
        }
    }//GEN-LAST:event_arabicTextFieldKeyPressed

    private void romanTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_romanTextFieldKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            NumeralConverter rConverter = new RomanToArabicConverter();
            String result = rConverter.convert(romanTextField.getText());
            arabicTextField.setText(result);
        }        
    }//GEN-LAST:event_romanTextFieldKeyPressed

    private void arabicTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arabicTextFieldMouseClicked
        arabicTextField.setText("");       
    }//GEN-LAST:event_arabicTextFieldMouseClicked

    private void romanTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_romanTextFieldMouseClicked
        romanTextField.setText("");
    }//GEN-LAST:event_romanTextFieldMouseClicked
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arabicLabel;
    private javax.swing.JTextField arabicTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel mainLabel2;
    private javax.swing.JLabel romanLabel;
    private javax.swing.JTextField romanTextField;
    // End of variables declaration//GEN-END:variables
}