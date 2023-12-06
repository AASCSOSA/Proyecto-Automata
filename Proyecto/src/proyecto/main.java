/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import clases.CAdjetivos;
import clases.CAdverbio;
import clases.CArticulos;
import clases.CConjunciones;
import clases.CMetodosGenerales;
import clases.CPronombre;
import clases.CSustantivo;
import clases.CVerbo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alanh
 */
public class main extends javax.swing.JFrame {

    CMetodosGenerales CMetodoG = new CMetodosGenerales();
    CSustantivo Csus = new CSustantivo();
    CAdjetivos CAdj = new CAdjetivos();
    CAdverbio CAdv = new CAdverbio();
    CVerbo Cverb = new CVerbo();
    CPronombre Cpro = new CPronombre();
    CArticulos CArti = new CArticulos();
    CConjunciones CCon = new CConjunciones();

    /**
     * Creates new form main
     */
    public main() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextElementosLexicos = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        txtPalabra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextTexto = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTEstructuraTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextElementosLexicos.setEditable(false);
        jTextElementosLexicos.setColumns(20);
        jTextElementosLexicos.setRows(5);
        jScrollPane1.setViewportView(jTextElementosLexicos);

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraActionPerformed(evt);
            }
        });

        jLabel1.setText("Palabra");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagen.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jTextTexto.setEditable(false);
        jTextTexto.setColumns(20);
        jTextTexto.setRows(5);
        jScrollPane2.setViewportView(jTextTexto);

        jTEstructuraTexto.setColumns(20);
        jTEstructuraTexto.setRows(5);
        jScrollPane3.setViewportView(jTEstructuraTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextElementosLexicos.setText(" ");
        jTextTexto.setText(" ");
        separarOraciones();
        elementosLexicos();
        estructuraOracion();
        txtPalabra.setText(" ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void elementosLexicos() {
        String palabratxt = txtPalabra.getText();
        ArrayList<String> salida = new ArrayList<>();
        ArrayList<String> palabrasSeparadasList = CMetodoG.separarXPalabra(palabratxt);
        salida = CMetodoG.obtenerElementoLexico(palabrasSeparadasList);
        for (String palabra : salida) {
            jTextElementosLexicos.append(palabra + "\n");
        }
    }

    private void separarOraciones() {
        String palabratxt = txtPalabra.getText();
        String[] palabrasSeparadasArray = CMetodoG.separarXOracion(palabratxt);
        String palabraAux = "";
        int contador = 1;
        for (String palabraSeparada : palabrasSeparadasArray) {
            palabraAux=CMetodoG.obtenerElementoLexicoBoolean(palabraSeparada);
            jTextTexto.append(contador+".-"+palabraSeparada+"\n"+palabraAux+"\n");
            contador++;
        }
    }
    private void estructuraOracion(){
        String palabratxt = txtPalabra.getText();
        ArrayList<String> palabrasSeparadasArray = CMetodoG.oracionesSimples(palabratxt);
        for (String oracionesSimples : palabrasSeparadasArray) {
            jTEstructuraTexto.append(oracionesSimples+"\n");
        }
    }
    private void txtPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTEstructuraTexto;
    private javax.swing.JTextArea jTextElementosLexicos;
    private javax.swing.JTextArea jTextTexto;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
