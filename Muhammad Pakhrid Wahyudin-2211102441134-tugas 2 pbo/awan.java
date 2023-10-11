import greenfoot.*; // Import Greenfoot

public class awan extends Actor
{
    private int speed = -2; // Kecepatan gerakan awan ke kiri

    public awan()
    {
        // Inisialisasi gambar awan dari file PNG
        GreenfootImage image = new GreenfootImage("cloude.png");
        setImage(image);
    }

    public void act()
    {move(-2);
        if(getX() <= 40){
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
}
