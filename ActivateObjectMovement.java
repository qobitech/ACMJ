package com.qobitech.api.slidingObjects;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

class MainMenuSlideIn extends Timer{
    public MainMenuSlideIn(int delay, ActionListener listener) {
        super(delay, listener);
    }
}

public class ActivateObjectMovement{
    
    private int x;private int y;private Timer t1;private int GAP,DELAY;private int opacity,manipulateOpacity;private ActionListener al,al2;
    static int count = 0;
    private int getManipulateOpacity(){
        return manipulateOpacity;
    }
    private ActionListener getAl() {return al;}
    private void setAl(ActionListener al) {this.al = al;}
    public void reset(int x,int opacity){this.x = x;this.opacity = opacity;}
    private int getX() {return x;}
    private void setX(int x) {this.x = x;}
    private Timer getT1() {return t1;}
    private void setT1(Timer t1) {this.t1 = t1;}
    private int getGAP() {return GAP;}
    private void setGAP(int GAP) {this.GAP = GAP;}
    private int getDELAY() {return DELAY;}
    private void setDELAY(int DELAY) {this.DELAY = DELAY;}
    private int getOpacity() {return opacity;}
    private void setOpacity(int opacity) {this.opacity = opacity;}
    
    public ActivateObjectMovement(){}
    
    //JPANEL
 
//XAXIS
    public void xMoveRight(JPanel p,JFrame j,int x,int y,int xDestination,int gap,int delay){    
        this.x = x;
        this.GAP = gap;
        this.DELAY = delay;
        al  = (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ActivateObjectMovement.this.x == xDestination) {
                    t1.stop();p.repaint();j.repaint();
                } else {
                    ActivateObjectMovement.this.x += ActivateObjectMovement.this.GAP;
                    p.setLocation(ActivateObjectMovement.this.x, y);
                    p.repaint();
                    j.repaint();
                }
            }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }    
    public void xMoveRightOnce(JPanel p,JFrame j,int x,int y,int xDestination,int gap,int delay){    
        this.x = x;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination || p.getLocation().x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x+=this.GAP;
                        p.setLocation(this.x,y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();        
    }
    public void xMoveLeft(JPanel p,JFrame j,int x,int y,int xDestination,int gap,int delay){
        this.x = x;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x-=this.GAP;
                        p.setLocation(this.x,y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void xMoveLeftOnce(JPanel p,JFrame j,int x,int y,int xDestination,int gap,int delay){
        this.x = x;
        this.GAP = gap;
        this.DELAY = delay;
        
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination || p.getLocation().x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x-=this.GAP;
                        p.setLocation(this.x,y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    public void xMoveRight(JPanel p,JPanel p2,JFrame j,int x,int y,int xDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){    
        this.x = x;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;
        Color c = p2.getBackground();
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x+=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(this.x,y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
                
    }
    public void xMoveRightOnce(JPanel p,JPanel p2,JFrame j,int x,int y,int xDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){    
        this.x = x;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;
        Color c = p2.getBackground();
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination || p.getLocation().x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x+=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(this.x,y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
                
    }
    public void xMoveLeft(JPanel p,JPanel p2,JFrame j,int x,int y,int xDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){
        this.x = x;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;
        
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x-=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(this.x,y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    public void xMoveLeftOnce(JPanel p,JPanel p2,JFrame j,int x,int y,int xDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){
        this.x = x;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;
        
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination || p.getLocation().x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x-=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(this.x,y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    
//YAXIS
    public void yMoveDown(JPanel p,JFrame j,int x,int y,int yDestination,int gap,int delay){    
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y+=this.GAP;
                        p.setLocation(x,this.y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void yMoveDownOnce(JPanel p,JFrame j,int x,int y,int yDestination,int gap,int delay){    
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.y == yDestination || p.getLocation().y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y+=this.GAP;
                        p.setLocation(x,this.y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void yMoveUp(JPanel p,JFrame j,int x,int y,int yDestination,int gap,int delay){
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y-=this.GAP;
                        p.setLocation(x,this.y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void yMoveUpOnce(JPanel p,JFrame j,int x,int y,int yDestination,int gap,int delay){
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.y == yDestination || p.getLocation().y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y-=this.GAP;
                        p.setLocation(x,this.y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void yMoveDown(JPanel p,JPanel p2,JFrame j,int x,int y,int yDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){    
        this.y = y;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;

        al  = ((ActionEvent e)->{
                    if(this.y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y+=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(x,this.y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    public void yMoveDownOnce(JPanel p,JPanel p2,JFrame j,int x,int y,int yDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){    
        this.y = y;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;

        al  = ((ActionEvent e)->{
                    if(this.y == yDestination || p.getLocation().y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y+=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(x,this.y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    public void yMoveUp(JPanel p,JPanel p2,JFrame j,int x,int y,int yDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){
        this.y = y;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;
        
        al  = ((ActionEvent e)->{
                    if(this.y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y-=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(x,this.y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    public void yMoveUpOnce(JPanel p,JPanel p2,JFrame j,int x,int y,int yDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){
        this.y = y;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;
        
        al  = ((ActionEvent e)->{
                    if(this.y == yDestination || p.getLocation().y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y-=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(x,this.y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    
    //JLABEL
    
//XAXIS
    public void xMoveRight(JLabel p,JFrame j,int x,int y,int xDestination,int gap,int delay){    
        this.x = x;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x+=this.GAP;
                        p.setLocation(this.x,y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void xMoveRightOnce(JLabel p,JFrame j,int x,int y,int xDestination,int gap,int delay){    
        this.x = x;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination || p.getLocation().x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x+=this.GAP;
                        p.setLocation(this.x,y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();        
    }
    public void xMoveLeft(JLabel p,JFrame j,int x,int y,int xDestination,int gap,int delay){
        this.x = x;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x-=this.GAP;
                        p.setLocation(this.x,y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void xMoveLeftOnce(JLabel p,JFrame j,int x,int y,int xDestination,int gap,int delay){
        this.x = x;
        this.GAP = gap;
        this.DELAY = delay;
        
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination || p.getLocation().x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x-=this.GAP;
                        p.setLocation(this.x,y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    public void xMoveRight(JLabel p,JPanel p2,JFrame j,int x,int y,int xDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){    
        this.x = x;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;

        al  = ((ActionEvent e)->{
                    if(this.x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x+=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(this.x,y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    public void xMoveRightOnce(JLabel p,JPanel p2,JFrame j,int x,int y,int xDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){    
        this.x = x;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination || p.getLocation().x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x+=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(this.x,y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
                
    }
    public void xMoveLeft(JLabel p,JPanel p2,JFrame j,int x,int y,int xDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){
        this.x = x;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;
        
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x-=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(this.x,y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    public void xMoveLeftOnce(JLabel p,JPanel p2,JFrame j,int x,int y,int xDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){
        this.x = x;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;
        
        al  = ((ActionEvent e)->{
                    if(this.x == xDestination || p.getLocation().x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.x-=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(this.x,y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    
//YAXIS
    public void yMoveDown(JLabel p,JFrame j,int x,int y,int yDestination,int gap,int delay){    
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y+=this.GAP;
                        p.setLocation(x,this.y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void yMoveDownOnce(JLabel p,JFrame j,int x,int y,int yDestination,int gap,int delay){    
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.y == yDestination || p.getLocation().y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y+=this.GAP;
                        p.setLocation(x,this.y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void yMoveUp(JLabel p,JFrame j,int x,int y,int yDestination,int gap,int delay){
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y-=this.GAP;
                        p.setLocation(x,this.y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void yMoveUpOnce(JLabel p,JFrame j,int x,int y,int yDestination,int gap,int delay){
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(this.y == yDestination || p.getLocation().y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y-=this.GAP;
                        p.setLocation(x,this.y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void yMoveDown(JLabel p,JPanel p2,JFrame j,int x,int y,int yDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){    
        this.y = y;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;

        al  = ((ActionEvent e)->{
                    if(this.y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y+=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(x,this.y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    public void yMoveDownOnce(JLabel p,JPanel p2,JFrame j,int x,int y,int yDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){    
        this.y = y;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;

        al  = ((ActionEvent e)->{
                    if(this.y == yDestination || p.getLocation().y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y+=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(x,this.y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    public void yMoveUp(JLabel p,JPanel p2,JFrame j,int x,int y,int yDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){
        this.y = y;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;
        
        al  = ((ActionEvent e)->{
                    if(this.y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y-=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(x,this.y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    public void yMoveUpOnce(JLabel p,JPanel p2,JFrame j,int x,int y,int yDestination,int gap,int delay,int R,int G,int B,int opacity,int manipulateOpacity){
        this.y = y;
        this.opacity = opacity;
        this.manipulateOpacity = manipulateOpacity;
        this.GAP = gap;
        this.DELAY = delay;
        
        al  = ((ActionEvent e)->{
                    if(this.y == yDestination || p.getLocation().y == yDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        this.y-=this.GAP;
                        this.opacity-=this.manipulateOpacity;
                        p.setLocation(x,this.y);
                        p2.setBackground(new Color(R,G,B,this.opacity));
                        p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);
                this.t1.start();
    }
    
//CLOCK WISE    
    public void clockWise(JPanel p,JFrame j,int x,int xDestination,int y,int yDestination,int gap,int delay,int ntimes) {
                        Point a = new Point(xDestination,0);Point b = new Point(xDestination,yDestination);
                        Point c = new Point(0,yDestination);Point d = new Point(0,0);
                        Thread tr = new Thread(() -> {
                            try{
                                while(count < ntimes * 4){
                                    Thread.sleep(1000);
                                    if((p.getLocation().x == d.x) && (p.getLocation().y == d.y)) {
                                        xMoveRightOnce(p,j,x,y,xDestination,gap,delay);
                                        ++count;
                                        // System.out.println(count);
                                    }else if((p.getLocation().x == a.x) && (p.getLocation().y == a.y)) {
                                        yMoveDownOnce(p,j,xDestination,y,yDestination,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == b.x) && (p.getLocation().y == b.y)) {
                                        xMoveLeftOnce(p,j,xDestination,yDestination,x,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == c.x) && (p.getLocation().y == c.y)) {
                                        yMoveUpOnce(p,j,x,yDestination,y,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }
                                }
                                count = 0;
                            }catch(InterruptedException ex){}
                        });
                        tr.start();
    }
    public void clockWise(JLabel p,JFrame j,int x,int xDestination,int y,int yDestination,int gap,int delay,int ntimes) {
                        Point a = new Point(xDestination,0);Point b = new Point(xDestination,yDestination);
                        Point c = new Point(0,yDestination);Point d = new Point(0,0);
                        Thread tr = new Thread(() -> {
                            try{
                                while(count < ntimes * 4){
                                    Thread.sleep(1000);
                                    if((p.getLocation().x == d.x) && (p.getLocation().y == d.y)) {
                                        xMoveRightOnce(p,j,x,y,xDestination,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == a.x) && (p.getLocation().y == a.y)) {
                                        yMoveDownOnce(p,j,xDestination,y,yDestination,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == b.x) && (p.getLocation().y == b.y)) {
                                        xMoveLeftOnce(p,j,xDestination,yDestination,x,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == c.x) && (p.getLocation().y == c.y)) {
                                        yMoveUpOnce(p,j,x,yDestination,y,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }
                                }
                                count = 0;
                            }catch(InterruptedException ex){}
                        });
                        tr.start();
    }
    public void clockWiseInfinite(JPanel p,JFrame j,int x,int xDestination,int y,int yDestination,int gap,int delay,int ntimes) {
                        Point a = new Point(xDestination,0);Point b = new Point(xDestination,yDestination);
                        Point c = new Point(0,yDestination);Point d = new Point(0,0);
                        Thread tr = new Thread(() -> {
                            try{
                                while(true){
                                    Thread.sleep(1000);
                                    if((p.getLocation().x == d.x) && (p.getLocation().y == d.y)) {
                                        xMoveRightOnce(p,j,x,y,xDestination,gap,delay);
                                        ++count;
                                        // System.out.println(count);
                                    }else if((p.getLocation().x == a.x) && (p.getLocation().y == a.y)) {
                                        yMoveDownOnce(p,j,xDestination,y,yDestination,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == b.x) && (p.getLocation().y == b.y)) {
                                        xMoveLeftOnce(p,j,xDestination,yDestination,x,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == c.x) && (p.getLocation().y == c.y)) {
                                        yMoveUpOnce(p,j,x,yDestination,y,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }
                                }
                            }catch(InterruptedException ex){}
                        });
                        tr.start();
    }
    public void clockWiseInfinite(JLabel p,JFrame j,int x,int xDestination,int y,int yDestination,int gap,int delay,int ntimes) {
                        Point a = new Point(xDestination,0);Point b = new Point(xDestination,yDestination);
                        Point c = new Point(0,yDestination);Point d = new Point(0,0);
                        Thread tr = new Thread(() -> {
                            try{
                                while(true){
                                    Thread.sleep(1000);
                                    if((p.getLocation().x == d.x) && (p.getLocation().y == d.y)) {
                                        xMoveRightOnce(p,j,x,y,xDestination,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == a.x) && (p.getLocation().y == a.y)) {
                                        yMoveDownOnce(p,j,xDestination,y,yDestination,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == b.x) && (p.getLocation().y == b.y)) {
                                        xMoveLeftOnce(p,j,xDestination,yDestination,x,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == c.x) && (p.getLocation().y == c.y)) {
                                        yMoveUpOnce(p,j,x,yDestination,y,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }
                                }
                            }catch(InterruptedException ex){}
                        });
                        tr.start();
    }
    
//ANTI CLOCK WISE    
    public void anticlockWise(JPanel p,JFrame j,int x,int xDestination,int y,int yDestination,int gap,int delay,int ntimes) {
                        Point a = new Point(0,yDestination);Point b = new Point(xDestination,yDestination);
                        Point c = new Point(xDestination,0);Point d = new Point(0,0);
                        Thread tr = new Thread(() -> {
                            try{
                                while(count < ntimes * 4){
                                    Thread.sleep(1000);
                                    if((p.getLocation().x == d.x) && (p.getLocation().y == d.y)) {
                                        yMoveDownOnce(p,j,x,y,yDestination,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == a.x) && (p.getLocation().y == a.y)) {
                                        xMoveRightOnce(p,j,x,yDestination,xDestination,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == b.x) && (p.getLocation().y == b.y)) {
                                        yMoveUpOnce(p,j,xDestination,yDestination,y,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == c.x) && (p.getLocation().y == c.y)) {
                                        xMoveLeftOnce(p,j,xDestination,y,x,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }
                                }
                                count = 0;
                            }catch(InterruptedException ex){}
                        });
                        tr.start();
    }
    public void anticlockWise(JLabel p,JFrame j,int x,int xDestination,int y,int yDestination,int gap,int delay,int ntimes) {
                        Point a = new Point(0,yDestination);Point b = new Point(xDestination,yDestination);
                        Point c = new Point(xDestination,0);Point d = new Point(0,0);
                        Thread tr = new Thread(() -> {
                            try{
                                while(count < ntimes * 4){
                                    Thread.sleep(1000);
                                    if((p.getLocation().x == d.x) && (p.getLocation().y == d.y)) {
                                        yMoveDownOnce(p,j,x,y,yDestination,gap,delay);
                                        ++count;
                                        //System.out.println(count);
                                    }else if((p.getLocation().x == a.x) && (p.getLocation().y == a.y)) {
                                        xMoveRightOnce(p,j,x,yDestination,xDestination,gap,delay);
                                        ++count;
                                        //  System.out.println(count);
                                    }else if((p.getLocation().x == b.x) && (p.getLocation().y == b.y)) {
                                        yMoveUpOnce(p,j,xDestination,yDestination,y,gap,delay);
                                        ++count;
                                        //    System.out.println(count);
                                    }else if((p.getLocation().x == c.x) && (p.getLocation().y == c.y)) {
                                        xMoveLeftOnce(p,j,xDestination,y,x,gap,delay);
                                        ++count;
                                        //      System.out.println(count);
                                    }
                                }
                                count = 0;
                            }catch(InterruptedException ex){}
                        });
                        tr.start();
    }
    public void anticlockWiseInfinite(JPanel p,JFrame j,int x,int xDestination,int y,int yDestination,int gap,int delay,int ntimes) {
                        Point a = new Point(0,yDestination);Point b = new Point(xDestination,yDestination);
                        Point c = new Point(xDestination,0);Point d = new Point(0,0);
                        Thread tr = new Thread(() -> {
                            try{
                                while(count < ntimes * 4){
                                    Thread.sleep(1000);
                                    if((p.getLocation().x == d.x) && (p.getLocation().y == d.y)) {
                                        yMoveDownOnce(p,j,x,y,yDestination,gap,delay);
                                    }else if((p.getLocation().x == a.x) && (p.getLocation().y == a.y)) {
                                        xMoveRightOnce(p,j,x,yDestination,xDestination,gap,delay);
                                    }else if((p.getLocation().x == b.x) && (p.getLocation().y == b.y)) {
                                        yMoveUpOnce(p,j,xDestination,yDestination,y,gap,delay);
                                    }else if((p.getLocation().x == c.x) && (p.getLocation().y == c.y)) {
                                        xMoveLeftOnce(p,j,xDestination,y,x,gap,delay);
                                    }
                                }
                            }catch(InterruptedException ex){}
                        });
                        tr.start();
    }
    public void anticlockWiseInfinite(JLabel p,JFrame j,int x,int xDestination,int y,int yDestination,int gap,int delay,int ntimes) {
                        Point a = new Point(0,yDestination);Point b = new Point(xDestination,yDestination);
                        Point c = new Point(xDestination,0);Point d = new Point(0,0);
                        Thread tr = new Thread(() -> {
                            try{
                                while(count < ntimes * 4){
                                    Thread.sleep(1000);
                                    if((p.getLocation().x == d.x) && (p.getLocation().y == d.y)) {
                                        yMoveDownOnce(p,j,x,y,yDestination,gap,delay);
                                    }else if((p.getLocation().x == a.x) && (p.getLocation().y == a.y)) {
                                        xMoveRightOnce(p,j,x,yDestination,xDestination,gap,delay);
                                    }else if((p.getLocation().x == b.x) && (p.getLocation().y == b.y)) {
                                        yMoveUpOnce(p,j,xDestination,yDestination,y,gap,delay);
                                    }else if((p.getLocation().x == c.x) && (p.getLocation().y == c.y)) {
                                        xMoveLeftOnce(p,j,xDestination,y,x,gap,delay);
                                    }
                                }
                            }catch(InterruptedException ex){}
                        });
                        tr.start();
    }
    
//DIAGONAL    
    public void moveDownRightDiagonal(JPanel p,JFrame j,int x,int y,int xDestination,int gap,int delay){    
        this.x = x;
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ActivateObjectMovement.this.x == xDestination) {
                    t1.stop();p.repaint();j.repaint();
                } else {
                    ActivateObjectMovement.this.x += ActivateObjectMovement.this.GAP;
                    ActivateObjectMovement.this.y += ActivateObjectMovement.this.GAP;
                    p.setLocation(ActivateObjectMovement.this.x, ActivateObjectMovement.this.y);
                    p.repaint();
                    j.repaint();
                }
            }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void moveUpRightDiagonal(JPanel p,JFrame j,int x,int y,int xDestination,int gap,int delay){    
        this.x = x;
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ActivateObjectMovement.this.x == xDestination) {
                    t1.stop();p.repaint();j.repaint();
                } else {
                    ActivateObjectMovement.this.x += ActivateObjectMovement.this.GAP;
                    ActivateObjectMovement.this.y -= ActivateObjectMovement.this.GAP;
                    p.setLocation(ActivateObjectMovement.this.x, ActivateObjectMovement.this.y);
                    p.repaint();
                    j.repaint();
                }
            }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void moveDownRightDiagonal(JLabel p,JFrame j,int x,int y,int xDestination,int gap,int delay){    
        this.x = x;
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ActivateObjectMovement.this.x == xDestination) {
                    t1.stop();p.repaint();j.repaint();
                } else {
                    ActivateObjectMovement.this.x += ActivateObjectMovement.this.GAP;
                    ActivateObjectMovement.this.y += ActivateObjectMovement.this.GAP;
                    p.setLocation(ActivateObjectMovement.this.x, ActivateObjectMovement.this.y);
                    p.repaint();
                    j.repaint();
                }
            }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void moveUpRightDiagonal(JLabel p,JFrame j,int x,int y,int xDestination,int gap,int delay){    
        this.x = x;
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ActivateObjectMovement.this.x == xDestination) {
                    t1.stop();p.repaint();j.repaint();
                } else {
                    ActivateObjectMovement.this.x += ActivateObjectMovement.this.GAP;
                    ActivateObjectMovement.this.y -= ActivateObjectMovement.this.GAP;
                    p.setLocation(ActivateObjectMovement.this.x, ActivateObjectMovement.this.y);
                    p.repaint();
                    j.repaint();
                }
            }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void moveDownLeftDiagonal(JPanel p,JFrame j,int x,int y,int xDestination,int gap,int delay){
        this.x = x;
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(ActivateObjectMovement.this.x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        ActivateObjectMovement.this.x-=ActivateObjectMovement.this.GAP;
                        ActivateObjectMovement.this.y+=ActivateObjectMovement.this.GAP;
                        p.setLocation(ActivateObjectMovement.this.x,ActivateObjectMovement.this.y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void moveUpLeftDiagonal(JPanel p,JFrame j,int x,int y,int xDestination,int gap,int delay){
        this.x = x;
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(ActivateObjectMovement.this.x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        ActivateObjectMovement.this.x-=ActivateObjectMovement.this.GAP;
                        ActivateObjectMovement.this.y-=ActivateObjectMovement.this.GAP;
                        p.setLocation(ActivateObjectMovement.this.x,ActivateObjectMovement.this.y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void moveDownLeftDiagonal(JLabel p,JFrame j,int x,int y,int xDestination,int gap,int delay){
        this.x = x;
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(ActivateObjectMovement.this.x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        ActivateObjectMovement.this.x-=ActivateObjectMovement.this.GAP;
                        ActivateObjectMovement.this.y+=ActivateObjectMovement.this.GAP;
                        p.setLocation(ActivateObjectMovement.this.x,ActivateObjectMovement.this.y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    public void moveUpLeftDiagonal(JLabel p,JFrame j,int x,int y,int xDestination,int gap,int delay){
        this.x = x;
        this.y = y;
        this.GAP = gap;
        this.DELAY = delay;
        al  = ((ActionEvent e)->{
                    if(ActivateObjectMovement.this.x == xDestination) {
                        t1.stop();p.repaint();j.repaint();
                    }else{
                        ActivateObjectMovement.this.x-=ActivateObjectMovement.this.GAP;
                        ActivateObjectMovement.this.y-=ActivateObjectMovement.this.GAP;
                        p.setLocation(ActivateObjectMovement.this.x,ActivateObjectMovement.this.y);p.repaint();j.repaint();
                    }
        });
                this.t1 =  new MainMenuSlideIn(this.DELAY,this.al);this.t1.start();
    }
    
}