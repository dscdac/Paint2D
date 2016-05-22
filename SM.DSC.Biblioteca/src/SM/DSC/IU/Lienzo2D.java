/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SM.DSC.IU;

import SM.DSC.Graficos.Linea;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Lienzo2D extends javax.swing.JPanel {
    private ArrayList<Shape> vformas;
    private ArrayList<Point> vpuntos;
    private int grosor;
    private Color color;
    private boolean relleno;
    private boolean transparente;
    private boolean alisado;
    private boolean edicion;
    
    private Point p = new Point(-100,-100);
    private Point pInicio = new Point(-100,-100);
    private Point pFin = new Point(-100,-100);
    private Shape selectedShape = null;
    private int forma = 0;
    
    public static final int FORMA_LAPIZ = 0;
    public static final int FORMA_LINEA = 1;
    public static final int FORMA_RECTANGULO = 2;
    public static final int FORMA_OVALO = 3;
    
    public static final int TAM_PUNTO = 3;
    public static final float GRADO_TRANSPARENCIA = 0.5f;
    
    /**
     * Creates new form Lienzo2D
     */
    public Lienzo2D() {
        initComponents();
        grosor = 1;
        color = Color.BLACK;
        relleno = false;
        transparente = false;
        alisado = false;
        edicion = false;   
        vformas = new ArrayList<Shape>();
        vpuntos = new ArrayList<Point>();
    }
    
    // Getters and setters
    public void setColor(Color c){
        this.color = c;
        this.repaint();
    }
    
    public Color getColor(){
        return this.color;
    }
    
    public void setRelleno(boolean relleno){
        this.relleno = relleno;
        this.repaint();
    }
    
    public boolean getRelleno(){
        return this.relleno;
    }
    
    public void setForma(int forma){
        this.forma = forma;
    }
    
    public int getForma(){
        return this.forma;
    }
    
    public void setGrosor(int grosor){
        this.grosor = grosor;
        this.repaint();
    }
    
    public int getGrosor(){
        return this.grosor;
    }
    
    public void setEditable(boolean editable){
        this.edicion = editable;
    }
    
    public boolean getEditable(){
        return this.edicion;
    }
    
    public void setTransparente(boolean trans){
        this.transparente = trans;
        this.repaint();
    }
    
    public boolean getTransparente(){
        return this.transparente;
    }
    
    public void setAlisado(boolean al){
        this.alisado = al;
        this.repaint();
    }
    
    public boolean getAlisado(){
        return this.alisado;
    }
    
    public void setP(Point p){
        this.p = p;
    }
    
    public void setPInicio(Point p){
        this.pInicio = p;
    }
    
    public Point getPInicio(){
        return this.pInicio;
    }
    
    public void setPFin(Point p){
        this.pFin = p;
    }
    
    public Point getPFin(){
        return this.pFin;
    }
    
    // Sobrescribimos el método paint
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        
        if(transparente){
            g2d.setPaint(new Color(color.getRed(), color.getGreen(), color.getBlue(), ((int) (255*GRADO_TRANSPARENCIA))) );
        }else{
            g2d.setPaint(color);
        }
        
        if(alisado){
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        
        g2d.setStroke( new BasicStroke(grosor) );
        
        for(Shape s:vformas) {
            if(relleno) 
                g2d.fill(s);
            g2d.draw(s);
        }
        
        for(Point p:vpuntos) {
            g2d.fillOval(p.x-TAM_PUNTO*grosor/2, p.y-TAM_PUNTO*grosor/2, TAM_PUNTO*grosor, TAM_PUNTO*grosor);
        }
    }
    
    private void createShape(){
        switch(this.getForma()){
            case FORMA_LAPIZ:
                vpuntos.add( pInicio);
                break;
            case FORMA_LINEA:
                selectedShape = new Linea(pInicio.x, pInicio.y, pInicio.x, pInicio.y); 
                vformas.add( selectedShape);
                break;
            case FORMA_RECTANGULO:
                selectedShape = new Rectangle(pInicio);
                vformas.add(selectedShape);
                break;
            case FORMA_OVALO:
                selectedShape = new Ellipse2D.Float(pInicio.x, pInicio.y, pInicio.x, pInicio.y );
                vformas.add(selectedShape);
                break;
        };
        this.repaint();
    }
    
    private void updateShape(){
        if(edicion){
            if(selectedShape instanceof Line2D){
                ((Linea)selectedShape).setLocation(pFin);
            }else if(selectedShape instanceof Rectangle){
                ((Rectangle)selectedShape).setLocation(pFin);
            }else if(selectedShape instanceof Ellipse2D){
                ((Ellipse2D)selectedShape).setFrame(pFin.x, pFin.y, ((Ellipse2D)selectedShape).getWidth(), ((Ellipse2D)selectedShape).getHeight());
            }
        }else{
            switch(this.getForma()){
                case FORMA_LINEA:
                    ((Line2D.Float)selectedShape).x2 = pFin.x;
                    ((Line2D.Float)selectedShape).y2 = pFin.y;
                    break;
                case FORMA_RECTANGULO:
                    ((Rectangle)selectedShape).setFrameFromDiagonal(pInicio, pFin);
                    break;
                case FORMA_OVALO:
                    ((Ellipse2D)selectedShape).setFrameFromDiagonal( pInicio.x, pInicio.y, pFin.x, pFin.y);
                    break;
            };
        }
        this.repaint();
    }
    
    private Shape getSelectedShape(Point p){
        for(Shape s:vformas){
            if(s.contains(p)){
                return s;
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(edicion){
            selectedShape = getSelectedShape(evt.getPoint());
        }else{
            this.setPInicio(evt.getPoint());
            createShape();
        }
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if(edicion){
            selectedShape = getSelectedShape(evt.getPoint());
        }else{
            this.setPInicio(evt.getPoint());
            createShape();
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        this.setPFin(evt.getPoint());
        
        updateShape();
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setPFin( evt.getPoint() );
        
        updateShape();
    }//GEN-LAST:event_formMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void setImage(BufferedImage img) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
