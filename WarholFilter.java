import java.awt.*;

/**
 * Warhol style image filter
 * 
 * @author Matilda Delacourt
 * @version 10.30.2021
 */
public class WarholFilter extends Filter
{

    /**
     * Constructor for objects of class WarholFilter
     */
    public WarholFilter(String name)
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
        OFImage imageCopy = new OFImage(image);
        
        for(int y=0; y<height;y++){
            for(int x=0; x<width; x++){
                Color pixel = image.getPixel(x,y);
                
                //top left
                image.setPixel(x/2,y/2,pixel);
                //top right
                Color redPixel = new Color(pixel.getRed(),(int)pixel.getGreen()/2,(int)pixel.getBlue()/2);
                image.setPixel(x/2+width/2,y/2,redPixel);
                
            }
        }
        for(int x=0; x< width;x++){
            for(int y=0;y<height;y++){
                Color pixel = imageCopy.getPixel(x,y);
                
                //bottom left
                Color greenPixel = new Color((int)pixel.getRed()/2,pixel.getGreen(),(int)pixel.getBlue()/2);
                image.setPixel(x/2,y/2+height/2,greenPixel);
                
                //bottom right
                Color bluePixel = new Color((int)pixel.getRed()/2,(int)pixel.getGreen()/2,pixel.getBlue());
                
                image.setPixel(x/2+width/2,y/2+height/2,bluePixel);
            }
        }
        
           
    }
}
