/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day19_runnable;

/**
 *
 * @author MB-teacher
 */
public class RaceJFrame extends javax.swing.JFrame {

    Runnable turtle = null;
    Runnable rabbit = null;
    
    public RaceJFrame() {
        initComponents();
        
        turtle = () -> {
            while(turtle_bar.getValue() < turtle_bar.getMaximum()) {
                turtle_bar.setValue(turtle_bar.getValue() + 1);
            }
            if(winner_label.getText().equals("")) {
                winner_label.setText("烏龜贏");
            }
        };
        
        rabbit = () -> {
            while(rabbit_bar.getValue() <rabbit_bar.getMaximum()) {
                rabbit_bar.setValue(rabbit_bar.getValue() + 1);
            }
            if(winner_label.getText().equals("")) {
                winner_label.setText("兔子贏");
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        turtle_label = new javax.swing.JLabel();
        rabbit_label = new javax.swing.JLabel();
        turtle_bar = new javax.swing.JProgressBar();
        rabbit_bar = new javax.swing.JProgressBar();
        start_button = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        winner_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("龜兔賽跑");

        turtle_label.setFont(new java.awt.Font("微軟正黑體", 0, 36)); // NOI18N
        turtle_label.setForeground(new java.awt.Color(0, 102, 51));
        turtle_label.setText("烏龜");

        rabbit_label.setFont(new java.awt.Font("微軟正黑體", 0, 36)); // NOI18N
        rabbit_label.setForeground(new java.awt.Color(204, 0, 102));
        rabbit_label.setText("兔子");

        turtle_bar.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        turtle_bar.setMaximum(100000000);

        rabbit_bar.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        rabbit_bar.setMaximum(100000000);

        start_button.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        start_button.setText("Start");
        start_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_buttonActionPerformed(evt);
            }
        });

        clear_button.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        clear_button.setText("Clear");
        clear_button.setEnabled(false);
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        winner_label.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        winner_label.setForeground(new java.awt.Color(204, 0, 0));
        winner_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(start_button, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(winner_label, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rabbit_label)
                            .addGap(18, 18, 18)
                            .addComponent(rabbit_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(turtle_label)
                            .addGap(18, 18, 18)
                            .addComponent(turtle_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(turtle_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turtle_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rabbit_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rabbit_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(start_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear_button, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(winner_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_buttonActionPerformed
        Thread turtle_thread = new Thread(turtle);
        Thread rabbit_thread = new Thread(rabbit);
        //turtle_thread.setPriority(10);
        //rabbit_thread.setPriority(1);
        turtle_thread.start();
        rabbit_thread.start();
        start_button.setEnabled(false);
        clear_button.setEnabled(true);
    }//GEN-LAST:event_start_buttonActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        start_button.setEnabled(true);
        clear_button.setEnabled(false);
        turtle_bar.setValue(0);
        rabbit_bar.setValue(0);
        winner_label.setText("");
    }//GEN-LAST:event_clear_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(RaceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RaceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_button;
    private javax.swing.JProgressBar rabbit_bar;
    private javax.swing.JLabel rabbit_label;
    private javax.swing.JButton start_button;
    private javax.swing.JProgressBar turtle_bar;
    private javax.swing.JLabel turtle_label;
    private javax.swing.JLabel winner_label;
    // End of variables declaration//GEN-END:variables
}
