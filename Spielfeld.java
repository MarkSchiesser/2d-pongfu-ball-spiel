import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Projekt zu Kap. 5.7
 * Arbeitsauftrag 4
 */

public class Spielfeld extends World
{
    Ball ball;
    Spieler spielerLinks;
    Spieler spielerRechts;

    public Spielfeld()
    {    
        super(800, 500, 1); 
        
        ball = new Ball();
        addObject(ball, 400, 250);

        spielerLinks = new Spieler(1, "Spieler_Blau.png", "w", "s");
        addObject(spielerLinks, 70, 250);

        spielerRechts = new Spieler(3, "Spieler_Rot.png", "up", "down");
        addObject(spielerRechts, 730, 250);
    }
}