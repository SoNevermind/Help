import javax.swing.*;
import java.awt.*;

public class Main extends javax.swing.JFrame {
    private javax.swing.JTextField addr;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField scity;
    private javax.swing.JTextField sdept;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sphone;

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        addr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        sphone = new javax.swing.JTextField();
        sdept = new javax.swing.JTextField();
        scity = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        addr.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 53, 45));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setName("Интеофейс химчистки");
        getContentPane().setLayout(new FlowLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel1.setText("К какому времени хотите прийти:");
        getContentPane().add(jLabel1, new FlowLayout(FlowLayout.RIGHT));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel2.setText("Наличие загрязнения:");
        getContentPane().add(jLabel2, new FlowLayout(FlowLayout.RIGHT));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel3.setText("Имя:");
        getContentPane().add(jLabel3, new FlowLayout(FlowLayout.RIGHT));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel4.setText("Фамилия:");
        getContentPane().add(jLabel4, new FlowLayout(FlowLayout.RIGHT));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel5.setText("Отчество:");
        getContentPane().add(jLabel5, new FlowLayout(FlowLayout.RIGHT));

        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });

        getContentPane().add(sid, new FlowLayout(FlowLayout.CENTER));
        getContentPane().add(sname, new FlowLayout(FlowLayout.CENTER));
        getContentPane().add(sphone, new FlowLayout(FlowLayout.CENTER));
        getContentPane().add(sdept, new FlowLayout(FlowLayout.CENTER));
        getContentPane().add(scity, new FlowLayout(FlowLayout.CENTER));
        getContentPane().add(email, new FlowLayout(FlowLayout.CENTER));
        getContentPane().add(fname, new FlowLayout(FlowLayout.CENTER));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Потвердить");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new FlowLayout(FlowLayout.CENTER));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Очистить");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new FlowLayout(FlowLayout.CENTER));

        jPanel1.setBackground(new java.awt.Color(145, 12, 45));

        jLabel9.setBackground(new java.awt.Color(0, 255, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel9.setForeground(new java.awt.Color(51, 255, 204));
        jLabel9.setText("Регистрация в химчистку");

        jButton1.setText("Выход");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(129, Short.MAX_VALUE).addComponent(jLabel9).addGap(95, 95, 95).addComponent(jButton1).addGap(4, 4, 4)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(40, 40, 40).addComponent(jButton1).addContainerGap(37, Short.MAX_VALUE).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel9).addContainerGap())));

        getContentPane().add(jPanel1, new FlowLayout(FlowLayout.CENTER));

        jCheckBox1.setText("Есть");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new FlowLayout(FlowLayout.CENTER));

        jCheckBox2.setText("Нету");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new FlowLayout(FlowLayout.CENTER));

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        String ID=sid.getText().toString();
        String Stname=sname.getText().toString();
        String phone=sphone.getText().toString();
        String department=sdept.getText().toString();
        String city=scity.getText().toString();
        String Email=email.getText().toString();
        String Fathername=fname.getText().toString();
        String Address=addr.getText().toString();
        if(ID.equals("")){
            JOptionPane.showMessageDialog(null,"К кому времени вам нужно записаться.");
        }
        if(Stname.equals("")) {
            JOptionPane.showMessageDialog(null,"Желаемое время приёма нужно обязательно.");

        }
        if(phone.equals("")){
            JOptionPane.showMessageDialog(null,"Имя нужно обязательно.");
        }
        if(department.equals("")){
            JOptionPane.showMessageDialog(null,"Фамилия нужна обязательно.");
        }
        if(Fathername.equals("")){
            JOptionPane.showMessageDialog(null,"Введите заново.");
        }
        if(Address.equals("")){
            JOptionPane.showMessageDialog(null,"Какой график нужно обязательно.");
        }
        else{
            JOptionPane.showMessageDialog(null,"Заявка успешно поступила в обработку");
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        sid.setText(null);
        sname.setText(null);
        sphone.setText(null);
        sdept.setText(null);
        scity.setText(null);
        email.setText(null);
        addr.setText(null);
        fname.setText(null);
    }

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
