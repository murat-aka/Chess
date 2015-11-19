/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author murat
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UserInterface extends JPanel implements MouseListener, MouseMotionListener{
    static int x=0,y=0;
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.yellow);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        g.setColor(Color.BLUE);
        g.fillRect(x-20, y-20, 40, 40);
        g.setColor(new Color(190,81,215));
        g.fillRect(40, 20, 80, 50);
        g.drawString("Jonathan", x, y);
        Image chessPiecesImage;
        chessPiecesImage=new ImageIcon("ChessPieces.PNG").getImage();
        g.drawImage(chessPiecesImage, x, 0, x+100, 100, x, 0, x+100, 100, this);
    }
    @Override
    public void mouseMoved(MouseEvent e) {x=e.getX();
        y=e.getY();
        repaint();}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseClicked(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        repaint();
    }
    @Override
    public void mouseDragged(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}