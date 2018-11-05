import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bai1();
        bai2();
        bai3();
        bai4();
    }
        public static void bai1()
    {
            double a, b, c, tong, tbc;
            Scanner sc = new Scanner(System.in);
            System.out.print("Xin moi nhap diem mon ly :");
            a = sc.nextDouble();
            System.out.print("Xin moi nhap diem mon hoa:");
            b = sc.nextDouble();
            System.out.print("Xin moi nhap diem mon sinh: ");
            c = sc.nextDouble();
            tong = a + b + c;
            System.out.println("Tong la: " +tong);
            tbc = (a + b + c) / 3;
            System.out.println(" \nTrung bình cong la :" +tbc);
        }
        public static void bai2(){
            double C,F;
            Scanner sc= new Scanner(System.in);
            System.out.println("Xin mơi nhap vao do C :");
            C= sc.nextDouble();
            F=(9*C+160)/5;
            System.out.println("Do F la "+F);
        }
        public static void bai3(){
            Double r,s, c;
            final double pi=3.14;
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời nhập bán kinh hinh tròn:");
            r= sc.nextDouble();
            s=r*r*pi;
            System.out.println("Dien tich hinh tron la "+s);
            c=r*2*pi;
            System.out.println("\nChu vi hinh tron la "+c);
        }
        public static void bai4(){
            int ns, tuoi;
            Scanner sc=new Scanner(System.in);
            System.out.println("Moi nhap vao nam sinh:");
            ns =sc.nextInt();
            tuoi = 2018-ns;
            System.out.println("Tuoi cua ban la "+tuoi);
        }

}
