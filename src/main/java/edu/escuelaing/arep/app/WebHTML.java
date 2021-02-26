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
		    	    	+ "<center>Solo vemos las consecuencias cuando estan delante de nuestras narices</center>"
		    	        + "<center>https://vast-wildwood-34386.herokuapp.com/profesor.html</center>"
		    	    	+ "<center>https://vast-wildwood-34386.herokuapp.com/fin.html</center>"
		    	    + "</div>"
		    	    + "</body>"
		    			+ "<img src =\"https://rtvc-assets-radionica3.s3.amazonaws.com/s3fs-public/styles/image_750x424/public/field/image/article/casa-de-papel.jpg?itok=q95dhAFf\" height=\"100%\" width=\"100%\" />"
		    			+ "</body>"
		    		+ "<script src=\"index.js\"></script>"
		    	+ "</html>";
    }
}
