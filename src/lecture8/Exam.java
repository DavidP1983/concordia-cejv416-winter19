/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture8;

/**
 *
 * @author D_PIRUZA
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    
        
        private double examScore1 = 0.0;
        private double examScore2 = 0.0;
        private double examScore3 = 0.0;
        
        public Exam() {};
        
        
        
        public Exam (double score1,double score2,double score3)
        {
        examScore1 = score1;
        examScore2 = score2;
        examScore3 = score3;
        }
        
        
        public double getAverage ()
        {
        double average;
        average = (examScore1 + examScore2 + examScore3)/3;
        return average;
        }
      
        public boolean isAPass ()
        {
        return getAverage() > 60;
        }
        
        public boolean isAPass(double passingValue)
        {
        return getAverage() > passingValue;
        }
        
    }
    

