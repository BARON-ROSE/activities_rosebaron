/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elaborate;

/**
 *
 * @author User
 */
public class elaborate_1 extends elaborate_2{
    public static void elaborate1() {
     
        String array[]= {"your love is my drug", "i love"};
        
        for (int i = 0; i <= array[0].length()-1; i++){
            System.out.println(array[0].charAt(i));
        
        }
        System.out.println();
        char st = array[0].toUpperCase().charAt(2);
         System.out.println(array[1]+" "+ st + " "+ array[0].indexOf("u"));
    }
    
}

