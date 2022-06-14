import java.text.DecimalFormat;
import java.util.Scanner;

/***************************************************************
 Filename: 
 Created by: Melat Semereab
 Created on: 08/11/2021
 Comment: area for diffrent type of triangle
 ***************************************************************/

class Main {
  
  //Method to calculate the area of an equilateral triangle
    public static double calculateArea(int pside)
    {
        return (double)((Math.sqrt(3) / 4) * (Math.pow(pside, 2)));
    }//calculateArea

    //Method to calculate the area of an isosceles triangle
    public static double calculateArea(int pside1, int pside2)
    {
         return (double)(pside1 * pside2)/2;
    }//calculateArea

    //Method to calculate the area of a scalene triangle
    public static double calculateArea(int pside1, int pside2, int pside3)
    {
        double s; //SemiPerimeter
        s = (pside1 + pside2 + pside3) / 2;
        return (double) Math.sqrt(s * (s - pside1) * (s - pside2) * (s - pside3));
    }//calculateArea

    public static void main(String[] args) {
        int side1, side2, side3;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".0");
        System.out.println("Equilateral Triangle");
        System.out.println("********************");
        System.out.print("Enter the length of the side of the equilateral triangle: ");
        side1 = keyboard.nextInt();
        System.out.println("The area of the triangle is " + df.format(calculateArea(side1)) + " units squared\n");
        System.out.println("isosceles");
        System.out.println("********************");
        System.out.print("Enter the length of the side of the isosceles triangle: ");
        side1 = keyboard.nextInt();
        side2 = keyboard.nextInt();
        System.out.println("The area of the triangle is " + df.format(calculateArea(side1, side2)) + " units squared\n");

        System.out.println("Scalen");
        System.out.println("********************");
        System.out.print("Enter the length of the side of the scalen triangle: ");
        side1 = keyboard.nextInt();
        side2 = keyboard.nextInt();
        side3 = keyboard.nextInt();
        System.out.println("The area of the triangle is " + df.format(calculateArea(side1, side2, side3)) + " units squared\n");


    }//main

}//class