/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homologaciones;

import com.sun.awt.AWTUtilities;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
<<<<<<< Updated upstream
import javax.swing.Spring;
=======
>>>>>>> Stashed changes
import javax.swing.UIManager;

/**
 *
 * @author JOHN EDWAR
 */
public class Registrar_usuarios_interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Registrar_usuarios_interfaz
     */
    int x,y;
    int control=0;
   
    public Registrar_usuarios_interfaz() {
        initComponents();
        TextPrompt nom = new TextPrompt("Nombre", jTNombre);
        TextPrompt ced = new TextPrompt("Documento De Identidad", jTDocumento);
        TextPrompt ema = new TextPrompt("Email",jTCorreo);
        TextPrompt cod = new TextPrompt("Codigo",jTCodigo);
        TextPrompt cont = new TextPrompt("Contraseña",jPasswordField1);
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLtexto_superior = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jREstudiante = new javax.swing.JRadioButton();
        jRGestor = new javax.swing.JRadioButton();
        jTNombre = new javax.swing.JTextField();
        jTCodigo = new javax.swing.JTextField();
        jTDocumento = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MostrarContra = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLtexto_superior.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLtexto_superior.setForeground(new java.awt.Color(255, 0, 0));
        jLtexto_superior.setText("REGISTRATE");
        jLtexto_superior.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLtexto_superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLtexto_superiorMouseDragged(evt);
            }
        });
        jLtexto_superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLtexto_superiorMousePressed(evt);
            }
        });
        getContentPane().add(jLtexto_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 170, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton2.png"))); // NOI18N
        jButton4.setText("Registrarse");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, 170, 60));

        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton2.png"))); // NOI18N
        jButton3.setText("Volver");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, 170, 60));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Desarrollado por @Equipo Integrador");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 700, -1, -1));

        jREstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jREstudiante.setText("Estudiante");
        jREstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jREstudianteMouseClicked(evt);
            }
        });
        jREstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jREstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(jREstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 120, -1));

        jRGestor.setBackground(new java.awt.Color(255, 255, 255));
        jRGestor.setText("Gestor");
        jRGestor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRGestorMouseClicked(evt);
            }
        });
        jRGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRGestorActionPerformed(evt);
            }
        });
        getContentPane().add(jRGestor, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 110, -1));

        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 230, 40));

        jTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoActionPerformed(evt);
            }
        });
        jTCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(jTCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, 230, 40));

        jTDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDocumentoActionPerformed(evt);
            }
        });
        jTDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDocumentoKeyTyped(evt);
            }
        });
        getContentPane().add(jTDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 230, 40));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 230, 40));

        jTCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(jTCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 230, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo nombre2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo contra.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo dco.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo ema.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo cod2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        MostrarContra.setBackground(new java.awt.Color(255, 255, 255));
        MostrarContra.setText("Mostrar Contraseña");
        MostrarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarContraActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1120, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLtexto_superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLtexto_superiorMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLtexto_superiorMouseDragged

    private void jLtexto_superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLtexto_superiorMousePressed
        // TODO add your handling code here:
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jLtexto_superiorMousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login_univalle loguear = null;
        try {
            loguear = new Login_univalle();
            } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Registrar_usuarios_interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        loguear.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jREstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jREstudianteMouseClicked
        // TODO add your handling code here:
          
    }//GEN-LAST:event_jREstudianteMouseClicked

    private void jREstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jREstudianteActionPerformed
        // TODO add your handling code here:
        if (jREstudiante.isSelected()==true){
            jRGestor.setEnabled(false);
            jTCodigo.setEnabled(true);
            control=1;
        }
        else{
            jRGestor.setEnabled(true);
            control=0;
        }
    }//GEN-LAST:event_jREstudianteActionPerformed

    private void jRGestorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRGestorMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jRGestorMouseClicked

    private void jRGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRGestorActionPerformed
        // TODO add your handling code here:
        if (jRGestor.isSelected()==true){
            jREstudiante.setEnabled(false);
            control=2;
            jTCodigo.setEnabled(false);
        }
        else{
            jREstudiante.setEnabled(true);
            jTCodigo.setEnabled(true);
            control=0;
        }
    }//GEN-LAST:event_jRGestorActionPerformed

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jTDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDocumentoActionPerformed

    private void jTCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCorreoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        if(control != 0){
<<<<<<< Updated upstream
           
             if (!jPasswordField1.getText().equals("") && !jTCorreo.getText().equals("") && !jTNombre.getText().equals("")){
             int opciones = JOptionPane.showConfirmDialog(null,"¿Desea crear el usuario?");

               if (opciones ==JOptionPane.YES_OPTION){

                    try{ 
                    String sql="";
                    int cedula;
                    int codigo;
                    String nombre = jTNombre.getText();
                    String contraseña = jPasswordField1.getText();
                    String correo = jTCorreo.getText();       
            
                        if (jRGestor.isSelected()){
                             cedula = Integer.parseInt(jTDocumento.getText());
                             sql = "insert into gestores (nombre,cedula,contraseña,email) values ('"+nombre+"','"+cedula+"','"+contraseña+"','"+correo+"')";
                             System.out.println("entroo peeggasasd");
                        }
                        else {
                             System.out.println("entro en opcion estudiante");
                             cedula = Integer.parseInt(jTDocumento.getText());
                             codigo = Integer.parseInt(jTCodigo.getText()); 
                             sql = "insert into estudiante (nombre,cedula,contraseña,email,codigo) values ('"+nombre+"','"+cedula+"','"+contraseña+"','"+correo+"','"+codigo+"')";
                        }
                             conexionBD con = new conexionBD();
                             con.sentencia(sql);

                             jTCodigo.setText("");
                             jPasswordField1.setText("");
                             jTNombre.setText("");
                             jTDocumento.setText("");
                             jTCorreo.setText("");
                             jREstudiante.setSelected(false);
                             jREstudiante.setEnabled(true);
                             jRGestor.setSelected(false);
                             jRGestor.setEnabled(true);
            
                             JOptionPane.showMessageDialog(null,"se ha creado un nuevo usuario");
                             Login_univalle loguear = null;
                    try {
                            loguear = new Login_univalle();
                        } 
                    catch (ClassNotFoundException ex) {
                            Logger.getLogger(Registrar_usuarios_interfaz.class.getName()).log(Level.SEVERE, null, ex);
                            ex.printStackTrace();
                        }
        
                     loguear.setVisible(true);
                     this.dispose();
                        }
          
                    catch (Exception ex) {
                       JOptionPane.showMessageDialog(null, "Los campos no deben de estar vacios");
//                       ex.printStackTrace();
                        }
                }
            }
             else{
                JOptionPane.showMessageDialog(null, "Los campos no deben de estar vacios");
                 } 
       
      }
             else{
                JOptionPane.showMessageDialog(null, "Por favor seleccione si es estudiante o gestor ");
                 }
=======
            
           if(!jTNombre.getText().equals("") && !jTCorreo.getText().equals("") && !jTContraseña.getText().equals("")){
               
               System.out.println("asldkasldñasdaskdaslñdasñdkasñdl");
            
          try{ 
            String sql="";
            int cedula;
            int codigo;
            String nombre = jTNombre.getText();
            String contraseña = jTContraseña.getText();
            String correo = jTCorreo.getText();       
            
            if (jRGestor.isSelected()){
                cedula = Integer.parseInt(jTDocumento.getText());
             sql = "insert into gestor (cedula,nombre,contraseña,correo) values ('"+cedula+"','"+nombre+"','"+contraseña+"','"+correo+"')";
                System.out.println("entroo peeggasasd");
            }
            else {
               cedula = Integer.parseInt(jTDocumento.getText());
               codigo = Integer.parseInt(jTCodigo.getText()); 
               sql = "insert into estudiante (nombre,correo,codigo,contraseña,cedula) values ('"+nombre+"','"+correo+"','"+codigo+"','"+contraseña+"','"+cedula+"')";
                System.out.println("nombre: "+nombre);
            }
            conexionBD con = new conexionBD();
            MensajeConfirmacion nuevo = new MensajeConfirmacion();
            nuevo.setVisible(true);
            con.sentencia(sql);

            jTCodigo.setText("");
            jTContraseña.setText("");
            jTNombre.setText("");
            jTDocumento.setText("");
            jTCorreo.setText("");
            jREstudiante.setSelected(false);
            jREstudiante.setEnabled(true);
            jRGestor.setSelected(false);
            jRGestor.setEnabled(true);
            
          }
          catch (Exception ex) {
            System.out.println("error aqui cuando presione el boton ");
            MensajeCamposVacios mensaje = new MensajeCamposVacios();
            mensaje.setVisible(true);
        }
        }
           else{
               JOptionPane.showMessageDialog(null, "Compruebe que todos los campos estan diligenciados");
           }
        }
         else{
           MensajeMarcarOpcion nuevo = new MensajeMarcarOpcion();
           nuevo.setVisible(true);
       }
>>>>>>> Stashed changes
    }//GEN-LAST:event_jButton4ActionPerformed
        
    private void jTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoActionPerformed

    private void jTDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDocumentoKeyTyped
        char n = evt.getKeyChar(); // KeyChar Obtiene o establece el carácter correspondiente a la tecla presionada.
       
       if(n<'0' || n>'9'){
           evt.consume();
       }
    }//GEN-LAST:event_jTDocumentoKeyTyped

    private void jTCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCodigoKeyTyped
       char n = evt.getKeyChar(); // KeyChar Obtiene o establece el carácter correspondiente a la tecla presionada.
       if(n<'0' || n>'9'){
           evt.consume();
       }
    }//GEN-LAST:event_jTCodigoKeyTyped

    private void MostrarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarContraActionPerformed
       if(MostrarContra.isSelected()){
           jPasswordField1.setEchoChar((char)0);
       }
       
       else{
           jPasswordField1.setEchoChar('●');
       }
    }//GEN-LAST:event_MostrarContraActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_usuarios_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_usuarios_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_usuarios_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_usuarios_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                }
                new Registrar_usuarios_interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox MostrarContra;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLtexto_superior;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jREstudiante;
    private javax.swing.JRadioButton jRGestor;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTCorreo;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}
