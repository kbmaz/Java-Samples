package event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Model;
import shapes.Rectangle;
import shapes.Oval;
import shapes.Line;
import shapes.Shape;

public class ShapeMouseHandler extends MouseAdapter {
  private Model model;
  //Start x and y location used to mark where the upper left corner of a shape is.
  private int startX;
  private int startY;
  private Shape shape;
  private List<Shape> shapeArrayList = new ArrayList<Shape>();
  
   public ShapeMouseHandler(Model model) {
     //persist local variable model to this.model.
     this.model = model;
   }
   
   /*
    * OVerrides MouseAdapter mousePressed method.
    */
   public void mousePressed(MouseEvent e) {
   //original upper left x and y of the shape.
     startX = e.getX();
     startY = e.getY();
     if (model.getAction() == Model.DRAW) {
       //have the model create a new shape for us.
       shape = model.createShape();
       
         //Set a default width and height or ending location in case user does not drag mouse.
         //Currently only instances of Rectangle or its descendants are used.
         if (shape instanceof Rectangle) {
           ((Rectangle)shape).setW(50);
           ((Rectangle)shape).setH(50);
         }
         else if (shape instanceof Line) {
           ((Line)shape).setX2(50);
           ((Line)shape).setY2(50);
         }
         else if(shape instanceof Oval) {
           ((Oval)shape).setW(50);
           ((Oval)shape).setH(50);
         }
     }
     //if the shape was created.
     if(shape != null) {
       //set its upper left x and y to where the mouse was pressed.
       shape.setX(e.getX());
       shape.setY(e.getY());
     }
       
       if(model.getAction() == Model.MOVE) {
         if(model.getShapeArrayList() != null) {
           if(shape != null) {
             shape  = shapeArrayList.get(i);
             shape = model.returnSelectShape(e.getX(), e.getY());   
           }
         } 
       }
       
       if(model.getAction() == Model.REMOVE) {
         shape = model.returnSelectShape(e.getX(), e.getY());
         model.getShapeArrayList().remove(shape);
       }
       
       if(model.getAction() == Model.CHANGE) {
         if(model.getShapeArrayList() != null) {
           if(shape != null) { 
             model.getShapeArrayList();
             shape = model.returnSelectShape(e.getX(), e.getY()); 
             shape.setLineColor(model.lineColor(model.getCurrentLineColor()));
           }
         }    
       }
       
       if(model.getAction() == Model.RESIZE) {
         if(model.getShapeArrayList() != null) {
           if(shape != null) { 
             model.getShapeArrayList();
             shape = model.returnSelectShape(e.getX(), e.getY());
           }
         }
       }
     
     //tell model to repaint applet or application.
     model.repaint();
   }

   
   /*
    * Overrides MouseAdapter's mouqseDragged method.
    */
   public void mouseDragged(MouseEvent e) {
     //get the current shape handled by the model      
     model.getCurrentShape();
     //if there's a current shape in the model.
     if(shape != null){
       //if we are in DRAW mode.
       if (model.getAction() == Model.DRAW) {

       //if the shape is an instance of Rectangle or a descendant of Rectangle
         if(shape instanceof Rectangle) {
           ((Rectangle) shape).setW(Math.abs(startX - e.getX()));
           ((Rectangle) shape).setH(Math.abs(startY = e.getY()));
         }
         else if(shape instanceof Oval) {
           ((Oval) shape).setW(Math.abs(startX - e.getX()));
           ((Oval) shape).setH(Math.abs(startY = e.getY()));
         }
         else if (shape instanceof Line) {
         }
       }
     }
     //tell model to repaint the applet or application.
     model.repaint();
   }
}



