package com.mac190.minmax;

import java.util.Objects;

/*
Design an implement a class MinMax that has the following properties:
1- Two integer mebers variables: min and max where max should always be larger
or equal than min.
2- setter for max: if you try to set max to a value smaller than min, then
max is set to min and min is set to that value, otherwise max is set
to the input.
setter setMin: if you try to set min to a value larger than max, then
min is set to max and max is set to that value, otherwise min is set
to the input
-getter for max and min
setMinMax(int a, int b) max is set to the larger value and min to the smallest
- toString returns min and max as a coule between parenthesis: (2, 5)
- public boolean equals(Object o)
- method MinMax add(int a) returns a MinMax object similar to this augmented
by a (a is added to both min and max)
- method MinMax add(MinMax m) returns a MinMax object that is the
sum of this and m, mins are added and maxs are added as well.
- implement both as static methods.
- method MinMax multiply(int a) returns a MinMax object multiplied by a
if a is negative then min and max should be swapped (pay attention to
the sign of a).
- Test your class.


 */
public class MinMax {
    private int min, max;
    public MinMax(){
        this.setMinMax(0, 0);
    }
    public MinMax(int a){
        this.setMinMax(a, a);
    }
    public MinMax(int a, int b){
        this.setMinMax(a, b);
    }
    //getters
    public int getMin(){
        return min;
    }
    public int getMax(){
        return max;
    }
    //setters
    public void setMinMax(int a, int b){
        min = a;
        max = b;
        if(a > b){
            min = b;
            max = a;
        }
    }
    public void setMin(int a){
        if(a > max){
            min = max;
            max = a;
        }else{
            min = a;
        }
    }
    public void setMax(int a){
        if(a < min){
            max = min;
            min = a;
        }else{
            max = a;
        }
    }

    @Override
    public String toString() {
        return "(" +min +
                "," + max +")";
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MinMax minMax = (MinMax) o;
        return this.min == minMax.min && this.max == minMax.max;
    }
    public MinMax add(int a){
        MinMax res = new MinMax(this.min + a, this.max + a);
        return res;
    }
    //as static
    public static MinMax add(MinMax t, int a){
        MinMax res = new MinMax(t.min + a, t.max + a);
        return res;
    }
    public MinMax add(MinMax m){
        MinMax res = new MinMax(this.min + m.min, this.max + m.max);
        return res;
    }
    public static MinMax add(MinMax t, MinMax m){
        MinMax res = new MinMax(t.min + m.min, t.max + m.max);
        return res;
    }
    public MinMax multiply(int a){
        return new MinMax(this.min*a, this.max*a);
    }
}
