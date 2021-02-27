package edu.escuelaing.arep.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

/**
 * Realiza la conexion en el servidor web
 * @author Jose
 *
 */
public class HTTPConexion {
	
	public Map<String, Method> url;
	
	/**
	 * Constructor
	 */
	public HTTPConexion() {
		url = new HashMap<String, Method>();
	}
	
	/**
	 * Obtiene el recurso
	 * @param r valor dado
	 * @return respuesta del recurso
	 */
	public String getRecurso(String r) {
       String response = null;
       
        try {
        	
        	response = (String) url.get(r).invoke(null);
        	
        } catch (IllegalAccessException | InvocationTargetException e) {
        	
            e.printStackTrace();
            System.out.println("Error invoking method");
            response = "ERROR";
            
        }
        return response;
    }
	
	/**
	 * Utiliza una url como recurso para app web
	 * @param recurso recurso
	 * @return recurso recurso
	 */
	public boolean recurso(String recurso) {
		return url.containsKey(recurso);
	}
	
	/**
	 * Inicia la web app
	 */
	public void start() {
		
        String paquete = "edu.escuelaing.arep.app";
        Reflections reflexion = new Reflections(paquete, new SubTypesScanner(false));
        Set<Class<? extends Object>> allClasses = reflexion.getSubTypesOf(Object.class);
        
        for (Class clase : allClasses) {
        	
            for (Method metodo : clase.getDeclaredMethods()) {
            	
            	if (metodo.isAnnotationPresent(Web.class)) {
                    url.put(metodo.getAnnotation(Web.class).value(), metodo);
                    
                }
            }
        }
	}

}
