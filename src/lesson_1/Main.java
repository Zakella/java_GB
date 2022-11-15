package lesson_1;

import java.util.*;

public class Main {
    //Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void Factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = scan.nextInt();
        int summ = 1;
        for (int i = 1; i < n + 1; i++){
           summ = summ * i;
        }
        System.out.println(summ);


    }

    //Вывести все простые числа от 1 до 1000
    public static void SimpleNumbers(){

        int m,n;
        A:for (n = 2;  n<= 1000; n++) {
            for (m = 2;  m<= n/2; m++) {
                if (n%m==0) {
                    continue A;
                }
            }
            System.out.println(n);
        }

    }

    //Реализовать простой калькулятор

    public static void Calculator(){

        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Ошибка! Не верный оператор");
                return;
        }
        System.out.print("\nРезультат выражения:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }




    public static void main(String[] args) {
        Factorial();
        SimpleNumbers();
        Calculator();

    }
}

