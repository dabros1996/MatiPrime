/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matiprime;

/**
 *
 * @author dabro
 */
public class MatiPrime {

    public static boolean isNumeric(String string) {
    int intValue;
		
    System.out.println(String.format("Parsing string: \"%s\"", string));
		
    if(string == null || string.equals("")) {
        System.out.println("String cannot be parsed, it is null or empty.");
        return false;
    }
    
    try {
        intValue = Integer.parseInt(string);
        return true;
    } catch (NumberFormatException e) {
        System.out.println("Input String cannot be parsed to Integer.");
    }
    return false;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma=0;
        
        for(int ii=0;ii<args.length;ii++){
            
        if(isNumeric(args[ii])) { 
         System.out.println("String is numeric!");
          int i= Integer.parseInt(args[ii]);
           suma+=i;
        } else {
          System.out.println("String is not numeric.");
        } 
        }
           System.out.print(suma);
    }}
