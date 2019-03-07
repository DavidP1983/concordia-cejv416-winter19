/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture12a;

/**
 *
 * @author D_PIRUZA
 */
public class StandartGrade implements IGrade {

    double grade;

   
    public double getValueGrade() {
        return grade;
    }

    
    public String getLetterGrade() {
        
     if (grade >90)
     {return "A";}
     
     if (grade >80)
     {return "B";}
     
     if (grade >70)
     {return "C";}
     
     return "F";
        
    }

}
