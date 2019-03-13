/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture13;

/**
 *
 * @author D_PIRUZA
 */
public class MyList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int LIST_SIZE = 10;
        int[] myList = new int[LIST_SIZE];

        for (int x = 0; x < myList.length; x++) {

            myList[x] = (int) (Math.random() * 10 + 1);

        }
        System.out.println(formatArrayForPrinting(myList));
        System.out.println("The sum of the array is - " + sumArray(myList));
        System.out.println("Largest - " + largestArrayValue(myList));

//        int[] testArray = {1,2,3,4};
        int[] newArray = shiftArray(myList);
        System.out.println(formatArrayForPrinting(newArray));

    }

//    Largest number_____________________________________________________________________
    public static int sumArray(int[] inputArray) {

        int counterSum = 0;
        for (int x : inputArray) {
            counterSum += x;
        }

        return counterSum;
    }

    public static int largestArrayValue(int[] inputArray) {

        int largest = inputArray[0];

        for (int x = 0; x < inputArray.length; x++) {
            if (inputArray[x] > largest) {
                largest = inputArray[x];
            }
        }
        return largest;
    }

//      ________________________________________________________________________________  
//  Always static, it's the same file
    public static String formatArrayForPrinting(int[] inputArray) {

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

    public static int[] shiftArray(int[] inputArray) {

        int firstMember = inputArray[0];
        for (int x = 1; x < inputArray.length; x++) {
            inputArray[x - 1] = inputArray[x];
        }
//peremeshenie A v conec
        inputArray[inputArray.length - 1] = firstMember;

        return inputArray;
    }
}
