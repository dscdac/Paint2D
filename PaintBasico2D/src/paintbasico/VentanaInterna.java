/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbasico;

/**
 *
 * @author David
 */
public class VentanaInterna extends javax.swing.JInternalFrame {
    /**
     * Creates new form VentanaInterna
     */
    public VentanaInterna() {
        initComponents();
        
    }
    
    public SM.DSC.IU.Lienzo2DImagen getLienzo(){
        return lienzo2DImagen1;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelScroll = new javax.swing.JScrollPane();
        lienzo2DImagen1 = new SM.DSC.IU.Lienzo2DImagen();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Nuevo lienzo");

        javax.swing.GroupLayout lienzo2DImagen1Layout = new javax.swing.GroupLayout(lienzo2DImagen1);
        lienzo2DImagen1.setLayout(lienzo2DImagen1Layout);
        lienzo2DImagen1Layout.setHorizontalGroup(
            lienzo2DImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );
        lienzo2DImagen1Layout.setVerticalGroup(
            lienzo2DImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        panelScroll.setViewportView(lienzo2DImagen1);

        getContentPane().add(panelScroll, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SM.DSC.IU.Lienzo2DImagen lienzo2DImagen1;
    private javax.swing.JScrollPane panelScroll;
    // End of variables declaration//GEN-END:variables

}
