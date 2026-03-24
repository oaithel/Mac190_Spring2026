package com.mac190.secondorderclass;

public class SecondOrder {
    //coefficients as member variables
    double a, b, c;

    //method solve that solves the equation
    public void solve(){
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("The equation has infinite solution (0=0)");
                }else{
                    System.out.println("No solution (C = 0)");
                }
            }else{
                double x = -c/b;
                System.out.println("this is first order equation, solution: " + x);
            }
        }else{
            //compute the discriminant
            double D = Math.pow(b, 2) - 4*a*c;
            if(D == 0) {
                double X = -b/(2*a);
                System.out.println("There is one double solution: " + X);

            }else if(D > 0) {
                double X1 = (-b + Math.sqrt(D))/(2*a);
                double X2 = (-b - Math.sqrt(D))/(2*a);
                System.out.println("There are two distinct solutions: X1 = " + X1 + " X2 = " + X2);
            }else{
                System.out.println("there no real solutions.");
            }
        }
    }
}
