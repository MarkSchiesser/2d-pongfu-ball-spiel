import greenfoot.*;
import java.util.*;

public class Ball extends Actor
{
    int geschwindigkeitX;
    int geschwindigkeitY;
    int counterBlau;
    int counterRot;
    
    Ball() 
    {
        zeigeBall();
        geschwindigkeitX = 3;
        geschwindigkeitY = 3;
    }
    
    void zeigeBall() // zeigt das Bild des Balles an
    {
        setImage("ball.png");
    }

    public void wechsleRichtung() //prallt ab
    {
        geschwindigkeitX = geschwindigkeitX * -1;
    }
    
    public void act() 
    {
       if(isTouching(Spieler.class) == true) //wenn der Ball einen Spieler berührt, prallt er ab
       {
            wechsleRichtung();
       }
        
       bewegeBall(geschwindigkeitX, geschwindigkeitY);
       
       //wenn der Ball hinter einem der Spieler ist, punktet der andere Spieler
       if(getX() < 10)
       {
           rotPunktet();
       } 
       if(getX() > 790)
       {
           blauPunktet();
       }
       
       if(getY() < 10 || getY() > 490) //falls der Ball zu nah an der Wand oben oder unten, prallt er ab
       {
           geschwindigkeitY = geschwindigkeitY * -1;
       }
       
       //zeigt die counter-Texte an
       this.getWorld().showText("Score: " + counterBlau, 60, 30);
       this.getWorld().showText("Score: " + counterRot, 740, 30);
    } 
    
    void bewegeBall(int GeschwindigkeitX, int GeschwindigkeitY)
    {
       setLocation(getX() + geschwindigkeitX, getY() + geschwindigkeitY);
    }
    
    void rotPunktet() //verschiebt den Ball wieder in die Mitte und aktualisiert den counter des roten Spielers
    {
       setLocation(400, 250);
       counterRot++;
       if(counterRot >= 10) //wenn der rote Spieler 10 Punkte hat, wird das Spiel beendet und ein Siegertextangezeigt
       {
            this.getWorld().showText("Rot hat gewonnen", 400, 250);
            Greenfoot.stop(); 
       }
    }
    
    void blauPunktet()
    {
       setLocation(400, 250);
       counterBlau++;
       if(counterBlau >= 10)
       {
           this.getWorld().showText("Blau hat gewonnen", 400, 250);
           Greenfoot.stop();
       }
    }
}
