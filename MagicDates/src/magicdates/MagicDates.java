/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicdates;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author arzatalf
 */
public class MagicDates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int day,month,year,year2;
        
        Scanner scan = new Scanner (System.in);
        out.println("please enter a day");
        day=scan.nextInt();
        out.println("please enter a month");
        month=scan.nextInt();
        out.println("please enter a year");
        year=scan.nextInt();
        year2=day*month;
        if (year==year2) {
            out.printf("%d * %d = %d thats magic\n",day,month,year);
        } else{
            out.printf("%d * %d does not equal %d and is not magic\n",day,month,year);
        }
    }
    
}
