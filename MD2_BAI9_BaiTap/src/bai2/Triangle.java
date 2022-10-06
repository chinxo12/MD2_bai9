package bai2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

    }

    public static String nameTriangle(int a, int b, int c) {
        String nameIs = "";
        if (a+b>c && b+c>a && a+c>b){
            if (a == b && b == c && c == a) {
                nameIs = "tam giac deu";
            } else if (a == b || b == c || c == a) {
                nameIs = "tam giac can";
            } else if (a!=b&& b!=c) {
                nameIs= "tam giac thuong";
            }
        }else {
            nameIs= "khong phai la tam giac";
        }
        

        return nameIs;
    }
}
