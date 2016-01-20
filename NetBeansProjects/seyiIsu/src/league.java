import AppPackage.AnimationClass;
import BreezySwing.*;
public class league extends javax.swing.JFrame {
    public static int timer;// timer is use the make sure you arent spamming one button by dearseing the effectivness every time you use it
    public static int timers;//a cross referance for the timer to check if it as been press multiple times
    public static int timerp;// basicly a timer for the play button
    public static int timerps;//cross referance for the play botton
    public static int timersd;//timer for study botton
    public static int timersds;//cross for study botton
    int moralval=150;
    int smartval=150;
    int healthval=150;
    public static int HMT=150;// this var trackes the movment of the health val
    public static int MMT=150;// this var trackes the movment of the moral val
    public static int SMT=150;// this var trackes the movment of the smarts val
    public league() {
        initComponents();
        timer=0;// the reason i have the timer outside of the botton is bc if i want to use this var i want its value to be constnt with the changes i make with it
        timers=0;
        timerp=0;
        timerps=0;
        timersd=0;
        timersds=0;
       
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        btnsleep = new javax.swing.JButton();
        btnplay = new javax.swing.JButton();
        btnstudy = new javax.swing.JButton();
        txtsmarts = new javax.swing.JTextField();
        txthealth = new javax.swing.JTextField();
        txtmoral = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(504, 404));
        setMinimumSize(new java.awt.Dimension(504, 404));
        getContentPane().setLayout(null);

        btnsleep.setText("Sleep");
        btnsleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsleepActionPerformed(evt);
            }
        });
        getContentPane().add(btnsleep);
        btnsleep.setBounds(18, 282, 70, 23);

        btnplay.setText("play");
        btnplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayActionPerformed(evt);
            }
        });
        getContentPane().add(btnplay);
        btnplay.setBounds(56, 316, 70, 23);

        btnstudy.setText("Study");
        btnstudy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstudyActionPerformed(evt);
            }
        });
        getContentPane().add(btnstudy);
        btnstudy.setBounds(100, 280, 70, 23);

        txtsmarts.setBackground(new java.awt.Color(0, 51, 255));
        txtsmarts.setMaximumSize(new java.awt.Dimension(6, 20));
        getContentPane().add(txtsmarts);
        txtsmarts.setBounds(320, 150, 30, 10);

        txthealth.setBackground(new java.awt.Color(255, 0, 51));
        txthealth.setMaximumSize(new java.awt.Dimension(6, 20));
        getContentPane().add(txthealth);
        txthealth.setBounds(220, 150, 30, 10);

        txtmoral.setMaximumSize(new java.awt.Dimension(6, 20));
        getContentPane().add(txtmoral);
        txtmoral.setBounds(270, 150, 30, 10);

        jMenu1.setText("File");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");
        jMenu1.add(jRadioButtonMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");
        jMenu2.add(jRadioButtonMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("insert");

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("jRadioButtonMenuItem4");
        jMenu3.add(jRadioButtonMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("del");

        jRadioButtonMenuItem5.setSelected(true);
        jRadioButtonMenuItem5.setText("jRadioButtonMenuItem5");
        jMenu4.add(jRadioButtonMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsleepActionPerformed
        if(timer>timers){//if timer is more then timers
            healthval+=5;//health score gose down by 5
            timers=timer;// make timers the same as timer
        }
        moralval+=2;
        smartval+=4;
        timer++;//incrase the timer buy one
        healthval-=10;
        
        if(timerp>0)// if the timer for the play button is more then zero
        {
            timerp--;// decrease the timer for play by one
        }
        if(timersd>0)// if the timer for the study button is more then zero
        {
            timersd--;// decrease the timer for study by one
        
        }
        AnimationClass ac = new AnimationClass();// create an instance of the AnimationClass
        
        ac.jTextFieldYUp(HMT, healthval, 50, 1 , txthealth);//move the bar up by ten pix
        ac.jTextFieldYUp(SMT, smartval, 50, 1, txtsmarts);
        ac.jTextFieldYUp(MMT, moralval, 50, 1, txtmoral);
         
         if(HMT!= healthval)// if health movement tracker is not the same as the health value
         {
            HMT=healthval;// then make then the same
         }
         if(SMT!=smartval)
         {
            SMT=smartval;
         }
         if(MMT!=moralval)
         {
            MMT=moralval;
         }
         
    }//GEN-LAST:event_btnsleepActionPerformed

    private void btnstudyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstudyActionPerformed
        if(timerp>timerps){//if timer is more then timers
            smartval+=5;//health score gose down by 5
            timerps=timerp;// make timers the same as timer
        }
        timerp++;//incrase the timer buy one
        smartval-=10;
        moralval+=2;
        healthval+=2;
        if(timer>0)// if the timer for the play button is more then zero
        {
            timer--;// decrease the timer for play by one
        }
        if(timersd>0)// if the timer for the study button is more then zero
        {
            timersd--;// decrease the timer for study by one
        
        }
        AnimationClass ac = new AnimationClass();// create an instance of the AnimationClass
        ac.jTextFieldYUp(HMT, healthval, 50, 1 , txthealth);//move the bar up by ten pix
        ac.jTextFieldYUp(SMT, smartval, 50, 1, txtsmarts);
        ac.jTextFieldYUp(MMT, moralval, 50, 1, txtmoral);
        if(HMT!= healthval)// if health movement tracker is not the same as the health value
        {
            HMT=healthval;// then make then the same
        }
        if(SMT!=smartval)
        {
            SMT=smartval;
        }
        if(MMT!=moralval)
        {
            MMT=moralval;
        }
          
    }//GEN-LAST:event_btnstudyActionPerformed

    private void btnplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayActionPerformed
        if(timersd>timersds){//if timer is more then timers
            healthval-=5;//health score gose down by 5
            timersds=timersd;// make timers the same as timer
        }
        smartval+=10;
        timersd++;//incrase the timer buy one
       
        if(timer>0)// if the timer for the play button is more then zero
        {
            timer--;// decrease the timer for play by one
        }
        if(timerp>0)// if the timer for the study button is more then zero
        {
            timerps--;// decrease the timer for study by one
        
        }
    }//GEN-LAST:event_btnplayActionPerformed

   
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
            java.util.logging.Logger.getLogger(league.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(league.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(league.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(league.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new league().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnplay;
    private javax.swing.JButton btnsleep;
    private javax.swing.JButton btnstudy;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JTextField txthealth;
    private javax.swing.JTextField txtmoral;
    private javax.swing.JTextField txtsmarts;
    // End of variables declaration//GEN-END:variables
}
