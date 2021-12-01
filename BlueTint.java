import java.awt.*;

/**
 * Tints the image blue
 * 
 * @author Matilda Delacourt
 * @version 10.30.2021
 */
public class BlueTint extends Filter
{

    /**
     * Constructor for objects of class BlueTint
     */
    public BlueTint(String name)
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
                Color bluePixel = new Color((int)pixel.getRed()/2,(int)pixel.getGreen()/2,pixel.getBlue());
                
                image.setPixel(x,y,bluePixel);
                //image.setPixel(x,y,pixel);
            }
        }
        
    }
}
