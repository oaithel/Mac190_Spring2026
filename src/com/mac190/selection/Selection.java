package com.mac190.selection;
/*
Very often we reach a point where a decision about the flow of the program needs
to be made and select one path among others. For that we use if-else or switch

if(condition){
    StatementsA;
}else{
    StatmentsB;
}
The condition evaluates only to true or false and nothing else
if the condition is true, then StatementsA are executed and StatementsB are skipped (ignored)
if however the condition is false, then StatementsA are skipped and StatementsB are executed.
StatementsA and StaementsB can contain if-else.

In the condition we use mostly comparators:
== (is it equal)
!= (is it not equal)
< smallers
<= smaller or equal
> larger
>= larger or equal
!< not smaller
! means not it's negation
To combine conditions we use logical operators: AND (&&) and OR (||)
A   B    A&&B     A||B
F   F     F        F
F   T     F        T
T   F     F        T
T   T     T        T

When combining conditions if the first is true in || the second is skipped
because true Or anything will be true
When combining conditions if the first is false in a && the second is not evaluated
because false && anything will be false.

int var1 = 3, var2 = 5, var3 = 8;

1) (var1 < 0 || var2 > 0 && var3 < 0)
     F   ||  T && F = F || F = F
2) (var1 > 0 || var2 < 0 && var3 < 0)
        T  ||  F  && F  = T  || F = T
3) ((var1 > 0 || var2 < 0) && var3 < 0)
     ( T  ||  F)  && F  = T && F = F
4) ((var1 < 0 || var2 > 0) && var3 < 0)
      ( F  || T)  && F = T && F  == F
5) var1 > 1 || var2++ > 0   (Wat is the value of the condition and var1 and var2)
       T  ||  T = T (also adds one to var2, so var2 = 5)
6) var1 < 1 || var2++ > 0
      F  ||  T  = T (and var2 = 6 because the second will be evaluated

 */
public class Selection {
    public static void main(String[] args) {
        int var1 = 3, var2 = 5, var3 = 8;
        if(var1 < 0 || var2 > 0 && var3 < 0) {
            System.out.println("var1 < 0 || var2 > 0 && var3 < 0:    TRUE");
        }else{
            System.out.println("var1 < 0 || var2 > 0 && var3 < 0:    FALSE");
        }
        if(var1 > 0 || var2 < 0 && var3 < 0){
            System.out.println("var1 > 0 || var2 < 0 && var3 < 0:  TRUE");
        }else{
            System.out.println("var1 > 0 || var2 < 0 && var3 < 0:  FALSE");
        }
        if((var1 > 0 || var2 < 0) && var3 < 0){
            System.out.println("(var1 > 0 || var2 < 0) && var3 < 0: TRUE");
        }else{
            System.out.println("(var1 > 0 || var2 < 0) && var3 < 0: False");
        }
        if ((var1 < 0 || var2 > 0) && var3 < 0){
            System.out.println("(var1 < 0 || var2 > 0) && var3 < 0: TRUE");
        }else{
            System.out.println("(var1 < 0 || var2 > 0) && var3 < 0: FALSE");
        }

        if( var1 > 1 || var2++ > 0 ){
            System.out.println("var1 > 1 || var2++ > 0: TRUE, var2: " + var2);
        }else{
            System.out.println("var1 > 1 || var2++ > 0: TRUE, var2: " + var2);
        }

        if( var1 < 1 || var2++ > 0 ){
            System.out.println("var1 > 1 || var2++ > 0: TRUE, var2: " + var2);
        }else{
            System.out.println("var1 > 1 || var2++ > 0: TRUE, var2: " + var2);
        }

    }
}
