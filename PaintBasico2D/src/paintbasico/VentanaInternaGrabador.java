/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbasico;

import java.io.File;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import sm.sound.SMRecorder;
import sm.sound.SMSoundRecorder;

/**
 *
 * @author David
 */
public class VentanaInternaGrabador extends javax.swing.JInternalFrame {
    private SMRecorder player = null;

    @Override
    public void dispose() {
        super.dispose(); //To change body of generated methods, choose Tools | Templates.
        player.stop();
    }
    /**
     * Creates new form VentanaInternaReproductor
     */
    public VentanaInternaGrabador(File f) {
        initComponents();
        
        botonParar.setSelectedIcon(frameIcon);
        
        player = new SMSoundRecorder(f);
        ManejadorAudio manejador = new ManejadorAudio();
        ((SMSoundRecorder)player).setLineListener(manejador);
        
    }
    /**
     * Creates new form VentanaInternaGrabador
     */
    public VentanaInternaGrabador() {
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

        grupoBotonesGrabar = new javax.swing.ButtonGroup();
        botonGrabar = new javax.swing.JToggleButton();
        botonParar = new javax.swing.JToggleButton();

        setClosable(true);
        getContentPane().setLayout(new java.awt.FlowLayout());

        grupoBotonesGrabar.add(botonGrabar);
        botonGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/audio/RecordPressed_48x48.png"))); // NOI18N
        botonGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGrabar);

        grupoBotonesGrabar.add(botonParar);
        botonParar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/audio/StopDisabled_48x48.png"))); // NOI18N
        botonParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPararActionPerformed(evt);
            }
        });
        getContentPane().add(botonParar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGrabarActionPerformed
        if (player != null) {
            player.record();
        }
    }//GEN-LAST:event_botonGrabarActionPerformed

    private void botonPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPararActionPerformed
        if (player != null) {
            player.stop();
        }
    }//GEN-LAST:event_botonPararActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonGrabar;
    private javax.swing.JToggleButton botonParar;
    private javax.swing.ButtonGroup grupoBotonesGrabar;
    // End of variables declaration//GEN-END:variables

    private class ManejadorAudio implements LineListener {
        @Override
        public void update(LineEvent event) {
            if (event.getType() == LineEvent.Type.START) {
//TODO
            }
            if (event.getType() == LineEvent.Type.STOP) {
//TODO
            }
            if (event.getType() == LineEvent.Type.CLOSE) {
//TODO
            }
        }
    }

}