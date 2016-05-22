/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SM.DSC.Graficos;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author David
 */
public class Linea extends Line2D.Float {
    
    public Linea(float x1,float y1,float x2,float y2){
        super(x1, y1, x2, y2);
    }
    public boolean isNear(Point2D p){
        return this.ptLineDist(p)<=3.0;
    }
    
    @Override
    public boolean contains(Point2D p) {
        return isNear(p);
    }
    
    public void setLocation(Point2D pos){
        double dx=pos.getX()-this.getX1();
        double dy=pos.getY()-this.getY1();
        Point2D newp2 = new Point2D.Double(this.getX2()+dx,this.getY2()+dy);
        this.setLine(pos,newp2);
    }
}
