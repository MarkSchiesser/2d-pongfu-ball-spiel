import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Klasse Spieler <br>
 * Arbeitsauftrag 3b), Aufgabe 1
 */

public class Spieler extends Actor
{
    int geschwindigkeit;
    public String obenTaste;
    public String untenTaste;

    Spieler(int startGeschwindigkeit, String bild,String ObenTaste, String UntenTaste)
    {
        setImage(bild);
        geschwindigkeit = 6;
        obenTaste = ObenTaste;
        untenTaste = UntenTaste;
        
    }
    
    public void act()
    {
        checkKeyPress();     
    }
    
    void checkKeyPress()
    {
        if(Greenfoot.isKeyDown(obenTaste)) //bewegt den Spieler nach oben
        {
        setLocation(getX(), getY() - geschwindigkeit);
        }
        else if(Greenfoot.isKeyDown(untenTaste)) //bewegt den Spieler nach unten
        {  
        setLocation(getX(), getY() + geschwindigkeit);
        }
    }
}