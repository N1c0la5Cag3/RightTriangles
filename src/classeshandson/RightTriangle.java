/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classeshandson;

import java.util.Scanner;

/**
 *
 * @author luoos2514
 */
public class RightTriangle {
    private double base, height;
    
    public RightTriangle(){
        Scanner sc = new Scanner(System.in);
        String baseString = sc.nextLine();
    }
    
    public double setBase(String baseInput){
        Scanner sc = new Scanner(System.in);
        base = Double.parseDouble(baseInput);
        System.out.println(base);
        
        return(base);
    }
    
    public double setHeight(String heightInput){
        Scanner sc = new Scanner(System.in);
        height = Double.parseDouble(sc.nextLine());
        System.out.println(height);
        
        return(height);
    }
    
}
