import java.awt.*;

/**
 * An image filter that makes blue values appear lighter
 * 
 * @author Matilda Delacourt
 * @version 10.30.2021
 */
public class BlueChannelFilter extends Filter
{

    /**
     * Constructor for objects of class BlueChannelFilter
     */
    public BlueChannelFilter(String name)
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
                Color pixelNew = new Color(pixel.getBlue(),pixel.getBlue(),pixel.getBlue());
                image.setPixel(x,y,pixelNew);
            }
        }
        
    }
}
