/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author D_PIRUZA
 */
public class Calculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double originalPrice = 11.575;
        final double QST = 0.1;
        final double GST = 0.05;
        final double Total;
        
        double qst_amount = originalPrice * QST;
        double gst_amount = originalPrice * GST;
        double total_amount = originalPrice + qst_amount + gst_amount;
        
        
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        String price = currency.format(originalPrice);
        String qstAmount = currency.format(qst_amount);
        String gstAmount = currency.format(gst_amount);
        String totalAmount = currency.format(total_amount);
        
        
       NumberFormat percent = NumberFormat.getPercentInstance(Locale.CANADA_FRENCH);
       String gstString = percent.format(QST);
       String qstString = percent.format(GST);
        
        System.out.println("Price: " + price);
        System.out.println("QST( " + qstString + "):" + qstAmount);
        System.out.println("GST( " + gstString + "):" + gstAmount);
        System.out.println("Total:" + totalAmount);
//        System.out.println("QST(10%): " + priceString);
//        System.out.println("GST(5%): " + priceString);
//        System.out.println("Total: " + priceString);
//        
        
        
        
                
        
//        Scanner st = new Scanner(System.in);
//        double price,qst,gst,result;
//        System.out.print("Price- ");
//        price: st.nextDouble();
        
        
        
    }
    
}
