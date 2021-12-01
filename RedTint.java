import java.awt.*;

/**
 * Tints image red
 * 
 * @author Matilda Delacourt
 * @version 10.30.2021
 */
public class RedTint extends Filter
{
 

    /**
     * Constructor for objects of class RedTint
     */
    public RedTint(String name)
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
                Color redPixel = new Color(pixel.getRed(),(int)pixel.getGreen()/2,(int)pixel.getBlue()/2);
                
                image.setPixel(x,y,redPixel);
            }
        }
        
    }
}
