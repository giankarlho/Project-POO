package empresarial;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus
 */
public class Simulacion extends javax.swing.JFrame {

    /**
     * Creates new form Simulaciondeelecciones
     */
    public Simulacion() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_c1 = new javax.swing.JTextField();
        txt_c2 = new javax.swing.JTextField();
        txt_c3 = new javax.swing.JTextField();
        txt_c4 = new javax.swing.JTextField();
        txt_b = new javax.swing.JTextField();
        txt_n = new javax.swing.JTextField();
        txt_p1 = new javax.swing.JTextField();
        txt_p2 = new javax.swing.JTextField();
        txt_p3 = new javax.swing.JTextField();
        txt_p4 = new javax.swing.JTextField();
        txt_pb = new javax.swing.JTextField();
        txt_pn = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_ganador = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jLabel1.setText("ELECCIONES 2020");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 14, 338, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setText("Candidatos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 190, 22));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("N° VOTOS:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 90, 22));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("%VOTOS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 80, 22));

        jButton1.setText("VOTOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("SATAR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 320, 22));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("PALMAS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 320, 26));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("SOROHC");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 320, 26));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("AKATSUKI");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 300, 24));

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel10.setText("VOTOS EN BLANCO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 180, 30));

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel11.setText("VOTOS NULOS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, 20));

        txt_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_c1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 83, -1));
        getContentPane().add(txt_c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 83, -1));
        getContentPane().add(txt_c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 83, -1));
        getContentPane().add(txt_c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 83, -1));
        getContentPane().add(txt_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 292, 130, 30));
        getContentPane().add(txt_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 130, 30));
        getContentPane().add(txt_p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 91, 26));
        getContentPane().add(txt_p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 91, -1));
        getContentPane().add(txt_p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 91, -1));
        getContentPane().add(txt_p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 91, -1));
        getContentPane().add(txt_pb, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 140, 30));
        getContentPane().add(txt_pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 140, 30));

        jLabel12.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel12.setText("TOTAL DE VOTOS:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 320, 38));
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 280, 30));

        jLabel13.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel13.setText("CANDIDATO GANADOR");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 410, 29));
        getContentPane().add(txt_ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 280, 29));

        jLabel9.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Eleccion.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 820, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int c1=0,c2=0,c3=0,c4=0,v_blancos=0,v_nulos=0,voto=0,total;
    double por1,por2,por3,por4,por5,por6; 
    String ganador = "";
    do {
        voto = Integer.parseInt(JOptionPane.showInputDialog("Numero de candidato Aa votar (1-4)(voto en blanco y nulo 5-6) y para salir del programa 0"));
        switch (voto){
            case 1:
                c1++;
                break;
            case 2:
                c2++;
                break;
            case 3:
                c3++;
                break;
            case 4:
                c4++;
                break;
            case 5:
                v_blancos++;
                break;
                case 6:
                v_nulos++;             
        
        }
        
        total = c1+c2+c3+c4+v_blancos+v_nulos;
        
        por1 = (c1*100)/total;
        por2 = (c2*100)/total;
        por3 = (c3*100)/total;
        por4 = (c4*100)/total;
        por5 = (v_blancos*100)/total;
        por6 = (v_nulos*100)/total;
        
        if (c1>c2 && c1>c3 && c1>c4){
            ganador = "PARTIDO POLITICO DC";
        }
        if (c2>c1 && c2>c3 && c2>c4){
            ganador = "PARTIDO POLITICO AVENGERS";
        }
        if (c3>c1 && c3>c2 && c3>c4){
            ganador = "PARTIDO POLITICA DE LOS SPYDERS";
        }
        if (c4>c1 && c4>c2 && c4>c3){
            ganador = "HULK AMANECER DE NUEVO";
        }
        
        txt_c1.setText(String.valueOf(c1));
        txt_c2.setText(String.valueOf(c2));
        txt_c3.setText(String.valueOf(c3));
        txt_c4.setText(String.valueOf(c4));
        txt_b.setText(String.valueOf(v_blancos));
        txt_n.setText(String.valueOf(v_nulos));
        txt_total.setText(String.valueOf(total));
        
        txt_p1.setText(String.valueOf(""+por1+" %"));
        txt_p2.setText(String.valueOf(""+por2+" %"));
        txt_p3.setText(String.valueOf(""+por3+" %"));
        txt_p4.setText(String.valueOf(""+por4+" %"));
        txt_pb.setText(String.valueOf(""+por5+" %"));
        txt_pn.setText(String.valueOf(""+por6+" %"));
        txt_ganador.setText(String.valueOf(ganador));
    }while(voto!=0);
    
    
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_c1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_b;
    private javax.swing.JTextField txt_c1;
    private javax.swing.JTextField txt_c2;
    private javax.swing.JTextField txt_c3;
    private javax.swing.JTextField txt_c4;
    private javax.swing.JTextField txt_ganador;
    private javax.swing.JTextField txt_n;
    private javax.swing.JTextField txt_p1;
    private javax.swing.JTextField txt_p2;
    private javax.swing.JTextField txt_p3;
    private javax.swing.JTextField txt_p4;
    private javax.swing.JTextField txt_pb;
    private javax.swing.JTextField txt_pn;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
