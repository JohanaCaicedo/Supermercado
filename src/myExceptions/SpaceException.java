/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myExceptions;

/**
 * @author Cindy Johana Caicedo
 * Codigo: 1461405-2711
 */

public class SpaceException extends Exception {

    public SpaceException() {
    }

    @Override
    public String getMessage() {
        return "Error, no debe dejar espacios en blanco";
    }
    
   
}
