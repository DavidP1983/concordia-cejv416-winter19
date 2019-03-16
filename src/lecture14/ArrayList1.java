/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture14;

/**
 *
 * @author D_PIRUZA
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
    
    public static void main(String[] args){
    final int LIST_SIZE = 10;
        ArrayList<Integer> myList = new ArrayList<>();

        for (int x = 0; x < LIST_SIZE; x++) {

            myList.add((int) (Math.random() * 10 + 1));

        }
        
        System.out.println(formatArrayForPrinting(myList));
        
        System.out.println("The sum of the array is - " + sumArray(myList));
        System.out.println("Largest - " + largestArrayValue(myList));

        
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
//        int[] testArray = {1,2,3,4};
//for myList also insted of newList and delet all app like  newList.add
        ArrayList<Integer>  shiftedList= shiftArray(newList);
        System.out.println(formatArrayForPrinting(shiftedList));

    }

//    Largest number_____________________________________________________________________
    public static int sumArray(ArrayList<Integer> inputArray)
    {

        int counterSum = 0;
        for (int x : inputArray) {
            counterSum += x;
        }

        return counterSum;
    }

    public static int largestArrayValue(ArrayList<Integer>inputArray) {

        int largest = inputArray.get(0);

        for (int x : inputArray) {
            if (x > largest) {
                largest = x;
            }
        }
        return largest;
    }

//      ________________________________________________________________________________  
//  Always static, it's the same file
    public static String formatArrayForPrinting(ArrayList<Integer> inputArray) {

//        StringBuilder fonction
        StringBuilder sb = new StringBuilder();

        for (int value : inputArray) {
//   append comes from StringBuilder
            sb.append(value);
            sb.append(" , ");
        }
        return sb.toString();

    }
//______________________________________________________Naoborot numbers

    public static ArrayList<Integer> shiftArray(ArrayList<Integer> inputArray) {

        int temp = inputArray.get(0);
        inputArray.remove(0);
        inputArray.add(temp);
//peremeshenie A v conec
//inputArray.add(inputArray.get(0));
        return inputArray;
  }

}