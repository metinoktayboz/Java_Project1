/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metin_oktay_boz_hw1;

import java.io.IOException;


/**
 *
 * @author MONSTER
 */
public class Metin_Oktay_Boz_HW1 {

    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        int[] timearray = {1, 100, 1000, 100000, -1};
        
        
        CComplexity myc = new CComplexity(timearray);
        myc.ProduceResult();
         
        
       
            
        }
 }


        



