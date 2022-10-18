package Recursion;
// рекурсия - вызов метода в теле этого же метода
public class Main {
    public static void main(String[] args) {
        counter(3);
    }
    private static void counter(int n){
        System.out.println(n);

        if(n==0) return;
        counter(n-1);

}}
