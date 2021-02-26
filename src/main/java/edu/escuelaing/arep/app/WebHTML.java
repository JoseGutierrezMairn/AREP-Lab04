package edu.escuelaing.arep.app;

/**
 * Esta clase generara el inicio para app web
 * @author Jose
 *
 */
public class WebHTML {
	
	/**
	 * Clase que genera inicio de html
	 * @return pagina html de inicio (home.html)
	 */
	@Web("/home.html")
    public static String sayHello() {
		
        return "<html>"
		        + "<head>"
		    		+ "<title>La casa de papel</title>"
		    		+ "<meta http-equiv='Content-Type' content='text/html; charset=utf-8'/>"
		    	+ "</head>"
		    	    + "<div style=\"padding:30px; width:96.9%; color:white; font-size:150%; position:absolute ; top:450px ; left:0px\">"
		    	    	+ "<center>\"Solo vemos las consecuencias cuando estan delante de nuestras narices\"</center>"
		    	    + "</div>"

		    	+ "</html>";
    }
}
