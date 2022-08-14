package com.basic;
import java.util.Scanner;

/**
 * @author yudong
 */
public class Main<operation> {
    public static void main(String[] args) {
	// write your code here
        System.out.println("hello,world");
        System.out.println("helo,HABO");

        char tab = '\t'; //制表符，8的整数倍, tab,首字母
        char carReturn = '\r'; // return,回车，r为首字母
        char doubleQuote = '\"'; //双引号
        char singleQuote = '\''; //单引号
        char newLine = '\n'; //换行

        long aa = 12L; //false true null
        String s = null;

        boolean b = true;
        boolean c = false;

        int operation = 2;

        switch (operation) {
            case 1:
                System.out.println("abc");
                break;
            case 2:
                System.out.println("operation is two");
                break;
            default:
                break;
        }

        {
            int j = 5;
        }
        //j作用域在第41行结束，这里不能调用
        boolean j = true;//变量必须初始化
        System.out.println(j);

        {
            int k = 1; //变量必须初始化
            System.out.println(k);
        }

        {
            final int i = 1;
     //       i = 5;  已经是final,不能再赋值
        }

        {
            final int ii; //final未赋初值，则可以另附初值,但只可赋值一次
            ii = 5;
       //     ii = 6; final只能赋值一次
        }

        int num = 0;
        switch (num) {
            case 1:
                break;
            case 2:
                break;
        }
    }

    public int add(final int i){
      //  i = 1; error, 调用方法时，已经赋了实参
        var j = 1;
        return i;
    }



}
