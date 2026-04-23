package com.mac190.minmaxprime;

import com.mac190.minmax.MinMax;
import com.mac190.prime.Prime;

import java.util.Objects;

/*
Implement the MinMax class using rime objects as member variables.
 */
public class MinMaxPrime {
    private Prime min, max;

    public MinMaxPrime(){
        min = new Prime();
        max = new Prime();
    }
    public MinMaxPrime(int a){
        min = new Prime(a);
        max = new Prime(a);
    }
    public MinMaxPrime(Prime a){
        min = new Prime(a.getPrime());
        max = new Prime(a.getPrime());
    }
    public MinMaxPrime(int a, int b){
        if(a < b){
            min = new Prime(a);
            max = new Prime(b);
        }else{
            min = new Prime(b);
            max = new Prime(a);
        }
    }
    public MinMaxPrime(Prime a, Prime b){
        if(a.getPrime() < b.getPrime()){
            min = new Prime(a.getPrime());
            //OR min = a;
            max = new Prime(b.getPrime());
            //OR ma = b;
        }else{
            min = new Prime(b.getPrime());
            //OR min = b;
            max = new Prime(a.getPrime());
            //OR max = a;
        }
    }
    //implement all the other methods including:
    public void setMin(Prime m){
        if(m.getPrime() > max.getPrime()){
            min.setPrime(max.getPrime());
            max.setPrime(m.getPrime());
        }else{
            min.setPrime(m.getPrime());//preferable
            //OR min = m;
        }
    }
    public void setMin(int m){
        if(m > max.getPrime()){
            min.setPrime(max.getPrime());
            max.setPrime(m);
        }else{
            min.setPrime(m);
        }
    }
    public void setMax(Prime m){
        if(m.getPrime() < min.getPrime()){
            max.setPrime(min.getPrime());
            min.setPrime(m.getPrime());
        }else{
            max.setPrime(m.getPrime());//preferable
            //OR max = m;
        }
    }
    public void setMax(int m){
        if(m < min.getPrime()){
            max.setPrime(min.getPrime());
            min.setPrime(m);
        }else{
            max.setPrime(m);
        }
    }
    //Prime getMinPrime()  and Prime getMaxPrime()
    public Prime getMinPrime(){
        return  min;
    }
    public int getMin(){
        return min.getPrime();
    }
    public Prime getMaxPrime(){
        return  max;
    }
    public int getMax(){
        return max.getPrime();
    }
    public void setMinMax(int a, int b){
        if(a < b){
            min.setPrime(a);
            max.setPrime(b);
        }else{
            min.setPrime(b);
            max.setPrime(a);
        }
    }
    public void setMinMax(Prime a, Prime b){
        if(a.getPrime() < b.getPrime()){
            min.setPrime(a.getPrime());
            //Or min = a;
            max.setPrime(b.getPrime());
            //Or max = b;
        }else{
            min.setPrime(b.getPrime());
            //Or min = b;
            max.setPrime(a.getPrime());
            //Or max = a;
        }
    }
    @Override
    public String toString() {
        return "(" + min.getPrime() +
                ", " + max.getPrime() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MinMaxPrime that = (MinMaxPrime) o;
        return Objects.equals(min, that.min) && Objects.equals(max, that.max);
    }


    //Then all the other methods as in MinMax class.
    public MinMaxPrime add(int a){
        MinMaxPrime res = new MinMaxPrime(this.min.getPrime() + a, this.max.getPrime() + a);
        return res;
    }
    public MinMaxPrime add(Prime p){
        MinMaxPrime res = new MinMaxPrime(this.min.getPrime() + p.getPrime(), this.max.getPrime() + p.getPrime());
        return res;
    }
    //as static
    public static MinMaxPrime add(MinMaxPrime t, int a){
        MinMaxPrime res = new MinMaxPrime(t.min.getPrime() + a, t.max.getPrime() + a);
        return res;
    }
    public MinMaxPrime add(MinMaxPrime m){
        MinMaxPrime res = new MinMaxPrime(this.min.getPrime() + m.min.getPrime(), this.max.getPrime() + m.max.getPrime());
        return res;
    }
    public static MinMaxPrime add(MinMaxPrime t, MinMaxPrime m){
        MinMaxPrime res = new MinMaxPrime(t.min.getPrime() + m.min.getPrime(), t.max.getPrime() + m.max.getPrime());
        return res;
    }
    public MinMaxPrime multiply(int a){
        return new MinMaxPrime(this.min.getPrime()*a, this.max.getPrime()*a);
    }
}
