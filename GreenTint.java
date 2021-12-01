import java.awt.*;
/**
 * Tints image green
 * 
 * @author Matilda Delacourt
 * @version 10.30.2021
 */
public class GreenTint extends Filter
{

    /**
     * Constructor for objects of class GreenTint
     */
    public GreenTint(String name)
    {
        // initialise instance variables
        super(name);
    }

    /**
     * Apply this filter to an image
     * @param image The image to be changed by this filter
     * 
     */
    public void apply(OFImage image){
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y=0; y<height;y++){
            for(int x=0; x<width; x++){
                Color pixel = image.getPixel(x,y);
                Color greenPixel = new Color((int)pixel.getRed()/2,pixel.getGreen(),(int)pixel.getBlue()/2);
                
                image.setPixel(x,y,greenPixel);
                //image.setPixel(x,y,pixel);
            }
        }
        
    }
}
