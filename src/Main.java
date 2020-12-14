import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh ax2 + bx + c = 0");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a:");
        double a = input.nextDouble();
        System.out.print("Nhap b:");
        double b= input.nextDouble();
        System.out.print("Nhap c:");
        double c= input.nextDouble();
        QuadraticEquation pt1 = new QuadraticEquation(a,b,c);
        System.out.println("Phuong trinh co delta = "+ pt1.getDiscriminant());
        if(pt1.getDiscriminant()>0){
            System.out.println("Phuong trinh co 2 nghiem la x1= "+ pt1.getRoot1()+" "+ " x2= "+ pt1.getRoot2());
        } else if (pt1.getDiscriminant()==0){
            System.out.println("Phuong trinh co nghiem kep x1=x2=" + pt1.getDoubleRoot());
        } else
            System.out.println("Phuong trinh vo nghiem");


    }
}
