/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import com.sun.glass.events.KeyEvent;
import java.text.DecimalFormat;

/**
 *
 * @author amerlin7
 */
public class ActivitiesCaloriesBurned extends javax.swing.JPanel implements Switchable {

    private String initialBMIText, initialCaloriesText, initialBMRText;
    
    /**
     * Creates new form ActivitiesCaloriesBurned
     */
    public ActivitiesCaloriesBurned() {
        initComponents();
        initialBMIText = jLabel6.getText();
        initialCaloriesText = jLabel5.getText();
        initialBMRText = jLabel7.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Calories Burned");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Running", "Walking", "Swimming", "Skiing", "Tennis", "Soccer", "Basketball", "Volleyball", "Football", "Programming" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Choose Activity");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel3.setText("Distance (Miles) (if sport put 0)");

        jLabel4.setText("Time (Hours)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Total Calories Burned: ");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Body Mass Index (BMI): ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Basal Metabolic Range (BMR): ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        //isValid checks for if user enters letters to stop
        //after that, we need to make sure that if they are entering a ".", then they must not have a previous dot
        //Otherwise it would allow 3..45
        if(!isValid(evt.getKeyChar() + "") || 
           (evt.getKeyChar() == '.' && jTextField1.getText().contains(".")))
        {
            evt.consume();
            return;
        }
        jTextField1.setText(jTextField1.getText() + evt.getKeyChar());
        evt.consume();
        onUpdateText();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        if(!isValid(evt.getKeyChar() + "") || 
           (evt.getKeyChar() == '.' && jTextField2.getText().contains(".")))
        {
            evt.consume();
            return;
        }
        jTextField2.setText(jTextField2.getText() + evt.getKeyChar());
        evt.consume();
        onUpdateText();
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Frame.switchPanel(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        onUpdateText();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_BACKSPACE)
        {
            jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length()-1));
            onUpdateText();
            evt.consume();
            return;
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_BACKSPACE)
        {
            jTextField2.setText(jTextField2.getText().substring(0, jTextField2.getText().length()-1));
            onUpdateText();
            evt.consume();
            return;
        }
    }//GEN-LAST:event_jTextField2KeyPressed
    
    public void onSwitch()
    {
        double BMI = Frame.userProfile.calculateBMI();
        double BMR = Frame.userProfile.calculateBMR();
        DecimalFormat df = new DecimalFormat("#.##");
        jLabel6.setText(initialBMIText + df.format(BMI));
        jLabel7.setText(initialBMRText + df.format(BMR));
    }
    
    public void onUpdateText()
    {
        if(jTextField1.getText().length() == 0 || jTextField2.getText().length() == 0 ||
            !isValid(jTextField1.getText()) || !isValid(jTextField2.getText()))
            return;
        
        DecimalFormat df = new DecimalFormat("#.##");
        //Running, Walking, Swimming, Skiing, Tennis, Soccer, Backetball, Volleyball, Football
        double result = 0;
        try
        {
            double BMRHour = BMR.bmrHour(Frame.userProfile.calculateBMR());
            switch(jComboBox1.getSelectedItem().toString())
            {
                case "Running":
                    result = CaloriesBurned.caloriesBurnedRunning(BMRHour, Double.parseDouble(jTextField1.getText()), 
                                                                  Double.parseDouble(jTextField2.getText()));
                    break;
                case "Walking":
                    result = CaloriesBurned.caloriesBurnedWalking(BMRHour, Double.parseDouble(jTextField1.getText()), 
                                                                  Double.parseDouble(jTextField2.getText()));
                    break;
                case "Swimming":
                    result = CaloriesBurned.caloriesBurnedSwimming(BMRHour, Double.parseDouble(jTextField1.getText()), 
                                                                  Double.parseDouble(jTextField2.getText()));
                    break;
                case "Skiing":
                    result = CaloriesBurned.caloriesBurnedSkiing(BMRHour, Double.parseDouble(jTextField2.getText()));
                    break;
                case "Tennis":
                    result = CaloriesBurned.caloriesBurnedTennis(BMRHour, Double.parseDouble(jTextField2.getText()));
                    break;
                case "Soccer":
                    result = CaloriesBurned.caloriesBurnedSoccer(BMRHour, Double.parseDouble(jTextField2.getText()));
                    break;
                case "Basketball":
                    result = CaloriesBurned.caloriesBurnedBasketball(BMRHour, Double.parseDouble(jTextField2.getText()));
                    break;
                case "Volleyball":
                    result = CaloriesBurned.caloriesBurnedVolleyball(BMRHour, Double.parseDouble(jTextField2.getText()));
                    break;
                case "Football":
                    result = CaloriesBurned.caloriesBurnedFootball(BMRHour, Double.parseDouble(jTextField2.getText()));
                    break;
                case "Programming":
                        result= CaloriesBurned.caloriesBurnedCoding(BMRHour, Double.parseDouble(jTextField2.getText()));
                default:
                    break;
            }
            
            jLabel5.setText(initialCaloriesText + df.format(result));
        }
        catch(Exception ex)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Make sure all values are correct and entered", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private static boolean isValid(String str)
    {
      return str.matches("-?\\d+(\\.\\d+)?") || str.equals(".");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
