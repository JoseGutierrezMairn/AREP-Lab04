package edu.escuelaing.arep.app;

/**
 * Clase para mostar imagen en app web
 * @author Jose
 *
 */
public class WebImagen {
	
	/**
	 * Utiliza la imagen stormtrooper.png para mostrar en pagina de app web
	 * @return retorna imagen en HD de app web
	 */
    @Web("/fin.html")
    public static String imagen() {
        return "<html><title>Background</title><body><img src=\"/fin.png\" width=\"1900\" height=\"950\"></body></html>";
    }
    
}
