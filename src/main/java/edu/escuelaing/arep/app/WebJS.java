package edu.escuelaing.arep.app;

/**
 * Clase para mostrar js en app web
 * @author Jose
 *
 */
public class WebJS {
	
	/**
	 * Muestra js en app web, thanks.html
	 * @return un js en la app web
	 */
    @Web("/profesor.html")
    public static String returnHtmlWithJS(){
        return "<html><title>thanks</title><head><script src=\"/index.js\"></script></head>"
        		+ "<body style = \"background: url(https://serie-lacasadepapel.com/wp-content/uploads/2018/04/el-profesor.jpg) no-repeat ; background-size: 100% 100%;\">\r\n"
        		+ "</body>"
        		+ "</html>";
    }
	
}
