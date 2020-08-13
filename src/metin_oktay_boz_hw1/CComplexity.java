/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metin_oktay_boz_hw1;

import java.io.File;         // To print outputs to a file
import java.io.FileWriter;   // To use FileWriter Function
import java.io.IOException;  // To print outputs to a file
import java.io.PrintWriter;  // To use PrintWriter method
import java.util.Random;     // To use Random method

/**
 *
 * @author MONSTER
 */
public class CComplexity {
        public long[] bubble;                //The array which stores the measured time during bubble sorts
        public long[] insertion;               //The array which stores the measured time during insertion sorts
        public long[] selection;               //The array which stores the measured time during selection sorts
        public int[] timearray;               //The array which is the same array in the main class
        public String negative;
        
    CComplexity(int[] timearray) {
        
        
        
        long[] insertion = new long[timearray.length];     // 1 - number 1 lines points the array which is defined as public in CComplexity class
        long[] bubble = new long[timearray.length];        // 2 - number 2 lines points the array which is defined as public in CComplexity class
        long[] selection = new long[timearray.length];        // 3 - number 3 lines points the array which is defined as public in CComplexity class
        this.insertion = insertion; //1
        this.bubble = bubble;  //2
        this.selection = selection;  //3
        this.timearray = timearray;         // This line points the array which is defined as public in CComplexity class
        
        
        Random r = new Random();   // Defines Random function as "r"
        
        
        
        
        for (int j=0; j<timearray.length; j++){   //This for loop provides how many arrays which is given in main class we need
            try
            {
            
            int[] arr1 = new int[timearray[j]];   //The array which will be used for inserstion sort
            int[] arr2 = new int[timearray[j]];   //The array which will be used for bubble sort
            int[] arr3 = new int[timearray[j]];   //The array which will be used for selection sort
            timearray[j] = timearray[j];
            
            
            
            
            if (timearray[j]<=1000000){            //This condition provides to sort until only 1000000 elements
            
            for(int i = 0; i<timearray[j]; i++){   //This for loop fills the arrays with random values
            
             arr3[i] = arr2[i] = arr1[i] = r.nextInt();   //This line provides to sort three same arrays
             }
        
        long startTime = System.currentTimeMillis();    // Stars to measure time
        insertionSort(arr1);                            // Sending the array to insertion sort function
        long endTime = System.currentTimeMillis();     //  Stops to measure time
        long estimatedTime = endTime - startTime;      //  Calculating the time which is measured above
        insertion[j]= estimatedTime;                   //  Stores the measured times 
        
        long start1 = System.currentTimeMillis();       // Stars to measure time
        BubbleSort(arr2);                              // Sending the array to bubble sort function
        long end1 = System.currentTimeMillis();        //  Stops to measure time
        long estimated1 = end1 - start1;               //  Calculating the time which is measured above
        bubble[j] = estimated1;                       //  Stores the measured times 
        
        long start2 = System.currentTimeMillis();       // Stars to measure time
        SelectionSort(arr3);                            // Sending the array to selection sort function
        long end2 = System.currentTimeMillis();        //  Stops to measure time
        long estimated2 = end2 - start2;               //  Calculating the time which is measured above
        selection[j] = estimated2;                    //  Stores the measured times 
        
       
        }   
            
        }
        
        
        catch(NegativeArraySizeException n){
            
            negative = ("Negative elements will not be sorted");
            
        }
                
                }
        
        }
         
       
        
        
        
    
       
    
    public void insertionSort(int[] arr1){    //The function which does the insertion sort
    for (int i = 1; i < arr1.length; i++) {
        int key = arr1[i];
        int j = i - 1;
        while (j >= 0 && key < arr1[j]) {
        arr1[j + 1] = arr1[j];
        j--;
                                        }
        arr1[j + 1] = key;
                                          }
    
    
    }
    
    public void BubbleSort(int[] arr2){    //The function which does the bubble sort
        
        for (int i = arr2.length; i > 1; i--){
        for (int j = 0; j < i-1; j++){
              if (arr2[j] > arr2[j+1]){
              int dummy = arr2[j];
              arr2[j] = arr2[j+1];
              arr2[j+1] = dummy;
              
              
}
}
        }
        
  
    }
    
    
    
    public static int Max(int [] arr3, int n){      //The function which does the calculation to use in selection sort function
int pos = 0;
for (int i = 1; i < n; i++)
if (arr3[pos] < arr3[i])
pos = i;
return pos;
}
    
    
    public void SelectionSort(int[] arr3){    //The function which does the Selection sort
        
        for (int size = arr3.length; size > 1; size--) {
int j = Max(arr3, size);
int dummy = arr3[j];
arr3[j] = arr3[size-1];
arr3[size-1] = dummy;
}

        
    }
    
    
    

 public void ProduceResult(){               //The method which prints the outputs on the screen
     
     if(negative!=null)
     System.out.println(negative);
     
     System.out.println("Selection Sort______________________");    //This for loop prints the measured selection sort times
     for(int i=0; i<selection.length; i++ ){
         if(timearray[i] <= 1000000 && timearray[i]>=0){                               // This condition provides to print the array which is equal or smaller than 1000000 
     System.out.println("In orer to sort " + timearray[i] + " elements took " + selection[i] + " milliseconds");
         }
         
         
     }
     
     System.out.println("Bubble Sort______________________");    //This for loop prints the measured bubble sort times
     for(int i=0; i<bubble.length; i++ ){
         if(timearray[i] <= 1000000 && timearray[i]>=0){                               // This condition provides to print the array which is equal or smaller than 1000000
     System.out.println("In orer to sort " + timearray[i] + " elements took " + bubble[i] + " milliseconds");
         }
                  
         }
     
     
     System.out.println("Insertion Sort______________________");    //This for loop prints the measured insertion sort times
     for(int i=0; i<insertion.length; i++ ){
         if(timearray[i] <= 1000000 && timearray[i]>=0){                               // This condition provides to print the array which is equal or smaller than 1000000
     System.out.println("In orer to sort " + timearray[i] + " elements took " + insertion[i] + " milliseconds");
         }
                  
         }
     
     for(int i=0; i<timearray.length; i++ ){
         if(timearray[i] > 1000000){                               // This condition provides to print that the numbers which is greater than 1000000 and print that the program can not sort
     System.out.println(timearray[i] + " elements can not be sorted because this program can sort until only 1000000 elements.");
         }
     
     }
     
    }
     
 
 
 public void ProduceResult(String deneme) throws IOException{
     
     try{
         int control=0;
         
     FileWriter fw = new FileWriter(deneme);
     PrintWriter pw = new PrintWriter(fw);
     
     if(negative!=null)
     pw.println(negative);
     
     
     
     pw.println("Selection Sort______________________");    //This for loop prints the measured selection sort times
     for(int i=0; i<selection.length; i++ ){
         if(timearray[i] <= 1000000 && timearray[i]>=0){                               // This condition provides to print the array which is equal or smaller than 1000000
     pw.println("In orer to sort " + timearray[i] + " elements took " + selection[i] + " milliseconds");
         }
         
         
     }
     
     pw.println("Bubble Sort______________________");    //This for loop prints the measured bubble sort times
     for(int i=0; i<bubble.length; i++ ){
         if(timearray[i] <= 1000000 && timearray[i]>=0){                               // This condition provides to print the array which is equal or smaller than 1000000
     pw.println("In orer to sort " + timearray[i] + " elements took " + bubble[i] + " milliseconds");
         }
                  
         }
     
     
     pw.println("Insertion Sort______________________");    //This for loop prints the measured insertion sort times
     for(int i=0; i<insertion.length; i++ ){
         if(timearray[i] <= 1000000 && timearray[i]>=0){                               // This condition provides to print the array which is equal or smaller than 1000000
     pw.println("In orer to sort " + timearray[i] + " elements took " + insertion[i] + " milliseconds");
         }
                  
         }
     
     for(int i=0; i<timearray.length; i++ ){
         if(timearray[i] > 1000000){                               // This condition provides to print the array which is equal or smaller than 1000000
     pw.println(timearray[i] + " elements can not be sorted because this program can sort until only 1000000 elements.");
         }
       }
     
     for(int i=0; i<timearray.length; i++ ){
         
     
     pw.close();
     }
     }
     catch(java.io.FileNotFoundException n){
         System.out.println("Location is invalid.");
     }
 }
    
}