/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elaborate;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class elaborate_2 {
     public static void elaborate2(){
    
    String [] array = {"Rose", "Tanque", "Baron"};
    System.out.println("Array :" + Arrays.toString(array));
    
    
    ArrayList<String> languages = new ArrayList<>(Arrays.asList(array));
    System.out.println("ArrayList :" + languages);
    }
}
