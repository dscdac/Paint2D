/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SM.DSC.IU;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * @author David
 */
public class Lienzo2DImagen extends Lienzo2D {
    private BufferedImage img;
    
    public Lienzo2DImagen(){
        super();
    }
    
    // Getters and setters
    public void setImage(BufferedImage img){
        this.img = img;
        if(img!=null){
            setPreferredSize(new Dimension(img.getWidth(),img.getHeight()));
        }
    }
    public BufferedImage getImage(){
        return img;
    }
    
    public BufferedImage getImage(boolean drawVector){
        if (drawVector) {
            int height = Math.max(img.getHeight(), this.getRootPane().getHeight()), 
                    width = Math.max(img.getHeight(), this.getRootPane().getWidth());
            BufferedImage resultado = new BufferedImage(width ,height ,img.getType());
           
            Graphics2D graficos = resultado.createGraphics();
            graficos.drawImage(img, 0, 0, null);
            super.paint(graficos);
            
            return resultado;
        }
        else{
            return getImage();
        }
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(img!=null){
            g.drawImage(img,0,0,this);
        }
    }
}
