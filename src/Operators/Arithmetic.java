package Operators;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        a++;  // tang a len 1 ( a = a + 1 )
        b = b * 2;

        System.out.println(a % b); // 10 : 20 lay phan du => 10
        System.out.println(b % c); // 20 : 15 lay phan du => 5
        System.out.println(a);
        System.out.println(b);
    }
}
