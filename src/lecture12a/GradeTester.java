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
public class GradeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StandartGrade sg = new StandartGrade();

        sg.grade = 40;

        if (evaluateGrade(sg)) {
            System.out.println("The student passed the course");
        } else {
            System.out.println("The student failed the course");

        }
    }

    public static boolean evaluateGrade(IGrade g) {

        if (g.getValueGrade() > 60) {
            return true;

        }

        return false;
    }

}
