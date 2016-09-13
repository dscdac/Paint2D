/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbasico;

import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.Icon;
import javax.swing.plaf.IconUIResource;
import sm.sound.SMClipPlayer;
import sm.sound.SMPlayer;

/**
 *
 * @author David
 */
public class VentanaInternaReproductor extends javax.swing.JInternalFrame {
    private SMPlayer player = null;

    @Override
    public void dispose() {
        super.dispose(); //To change body of generated methods, choose Tools | Templates.
        player.stop();
    }
    /**
     * Creates new form VentanaInternaReproductor
     */
    public VentanaInternaReproductor(File f) {
        initComponents();
        player = new SMClipPlayer(f);
        ((SMClipPlayer)player).setLineListener(new ManejadorAudio());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesReproductor = new javax.swing.ButtonGroup();
        botonPlay = new javax.swing.JToggleButton();
        botonStop = new javax.swing.JToggleButton();

        setClosable(true);
        getContentPane().setLayout(new java.awt.FlowLayout());

        grupoBotonesReproductor.add(botonPlay);
        botonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/audio/PlayPressed_48x48.png"))); // NOI18N
        botonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlayActionPerformed(evt);
            }
        });
        getContentPane().add(botonPlay);

        grupoBotonesReproductor.add(botonStop);
        botonStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/audio/StopDisabled_48x48.png"))); // NOI18N
        botonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStopActionPerformed(evt);
            }
        });
        getContentPane().add(botonStop);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlayActionPerformed
        if (player != null) {
            player.play();
        }
    }//GEN-LAST:event_botonPlayActionPerformed

    private void botonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStopActionPerformed
        if (player != null) {
            player.stop();
        }
    }//GEN-LAST:event_botonStopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonPlay;
    private javax.swing.JToggleButton botonStop;
    private javax.swing.ButtonGroup grupoBotonesReproductor;
    // End of variables declaration//GEN-END:variables

    private class ManejadorAudio implements LineListener {

        @Override
        public void update(LineEvent event) {
            
            System.out.println("evento!"+ event);
            
            if (event.getType() == LineEvent.Type.START) {
                String imagePath = "iconos.audio/stop24x24.png";
                InputStream imgStream = PaintBasico.class.getResourceAsStream(imagePath );
                BufferedImage myImg = null;
                try {
                    myImg = ImageIO.read(imgStream);
                    // ImageIcon icon = new ImageIcon(myImg);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaInternaReproductor.class.getName()).log(Level.SEVERE, null, ex);
                };

                botonPlay.setIcon((Icon) myImg);
                System.out.println("1");
                
            }
            if (event.getType() == LineEvent.Type.STOP) {
                String imagePath = "iconos.audio/stopRecord24x24.png";
                InputStream imgStream = PaintBasico.class.getResourceAsStream(imagePath );
                BufferedImage myImg = null;
                try {
                    myImg = ImageIO.read(imgStream);
                    // ImageIcon icon = new ImageIcon(myImg);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaInternaReproductor.class.getName()).log(Level.SEVERE, null, ex);
                };

                botonPlay.setIcon((Icon) myImg);
                System.out.println("2");
            }
            if (event.getType() == LineEvent.Type.CLOSE) {
                String imagePath = "iconos.audio/play24x24.png";
                InputStream imgStream = PaintBasico.class.getResourceAsStream(imagePath );
                BufferedImage myImg = null;
                try {
                    myImg = ImageIO.read(imgStream);
                    // ImageIcon icon = new ImageIcon(myImg);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaInternaReproductor.class.getName()).log(Level.SEVERE, null, ex);
                };

                botonPlay.setIcon((Icon) myImg);
                System.out.println("3");
            }
        }
    }

}
