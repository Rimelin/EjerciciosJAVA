/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo:
 *   https://fs-prod-cdn.nintendo-europe.com/media/images/10_share_images/portals_3/SI_Hub_Zelda_Portal_image1600w.jpg
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */

import java.net.URL;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Ej6AspectRatio {

    public static void main(String[] args) {
        int rate;
        rate = ratio("https://fs-prod-cdn.nintendo-europe.com/media/images/10_share_images/portals_3/SI_Hub_Zelda_Portal_image1600w.jpg");
        System.err.println("Ratio: "+ rate + ":1");
    }

    public static Integer ratio (String link){

        try {
        //URI uri = new URI (link);
        @SuppressWarnings("deprecation")
        URL url = new URL (link);
        //java.io.File file = Paths.get(uri).toFile();

           // Leer la imagen en un BufferedImage
            BufferedImage image = ImageIO.read(url);
            
            // Verificar si la imagen se ha leído correctamente
            if (image != null) {
                System.out.println(image.getWidth());
                System.out.println(image.getHeight());
                
                return (image.getWidth()/image.getHeight());
            } else {
                System.out.println("No se pudo cargar la imagen.");
                return 0;
            }
        } catch (IOException e) {
          e.printStackTrace();
        }
        return 0;

    }

}
