package gui;

import converter.*;
import java.awt.event.KeyEvent;

import static util.ConverterUtil.*;

public class ConverterApp extends javax.swing.JFrame {

    private NumeralConverter ARConverter = new ArabicToRomanConverter();
    private NumeralConverter RAConverter = new RomanToArabicConverter();

    public ConverterApp() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new ConverterApp().setVisible(true);
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
        setTitle("Converter");

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arabicTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                arabicTextFieldKeyTyped(evt);
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                romanTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                romanTextFieldKeyTyped(evt);
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
    }//GEN-LAST:event_arabicTextFieldKeyPressed

    private void romanTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_romanTextFieldKeyPressed
    }//GEN-LAST:event_romanTextFieldKeyPressed

    private void arabicTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arabicTextFieldMouseClicked
        arabicTextField.setText("");
    }//GEN-LAST:event_arabicTextFieldMouseClicked

    private void romanTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_romanTextFieldMouseClicked
        romanTextField.setText("");
    }//GEN-LAST:event_romanTextFieldMouseClicked

    private void arabicTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arabicTextFieldKeyTyped
    }//GEN-LAST:event_arabicTextFieldKeyTyped

    private void romanTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_romanTextFieldKeyTyped
    }//GEN-LAST:event_romanTextFieldKeyTyped

    private void romanTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_romanTextFieldKeyReleased
        String text = romanTextField.getText().toUpperCase();            
        if (! text.isEmpty()) {
            if (isEnter(evt)) {
               // String result = RAConverter.convert(text);
               // arabicTextField.setText(result);
            } 
//            else if (!isRoman(evt) && !isBackspace(evt) ||
//                     !isValidRoman(text))
//                removeLastCharacter(romanTextField);
        }
    }//GEN-LAST:event_romanTextFieldKeyReleased

    private void arabicTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arabicTextFieldKeyReleased
        String text = arabicTextField.getText();            
        if (! text.isEmpty()) {
            if (isEnter(evt)) {
              //  String result = ARConverter.convert(text);
               // romanTextField.setText(result);
            } 
//            else if (isNumber(evt) && !isValidArabic(text) || 
//                    !isNumber(evt) && !isBackspace(evt))
//                removeLastCharacter(arabicTextField);
        }
    }//GEN-LAST:event_arabicTextFieldKeyReleased
    
    private boolean isEnter(KeyEvent evt){
        return evt.getKeyCode() == 10;
    }
    
    private boolean isBackspace(KeyEvent evt){
        return evt.getKeyCode() == 8;
    }
    
    private boolean isNumber(KeyEvent evt){
        return (evt.getKeyCode() >= 48 && evt.getKeyCode() <= 57) ||
                (evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105);
    }
    
    private boolean isRoman(KeyEvent evt){
        char x = Character.toUpperCase(evt.getKeyChar());
        String s = String.valueOf(x);
        return ROMANS.containsValue(s);
    }
    
    private void removeLastCharacter(javax.swing.JTextField jField){
        String text = jField.getText();  
        jField.setText(text.substring(0, text.length() - 1));
    }
        
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
