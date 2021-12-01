import java.awt.*;

/**
 * An image filter that makes red values appear lighter
 * 
 * @author Matilda Delacourt
 * @version 10.30.2021
 */
public class RedChannelFilter extends Filter
{

    /**
     * Constructor for objects of class RedChannelFilter
     * @param name the name of the filter
     */
    public RedChannelFilter(String name)
    {
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
                Color pixelNew = new Color(pixel.getRed(),pixel.getRed(),pixel.getRed());
                image.setPixel(x,y,pixelNew);
            }
        }
        
    }
}
