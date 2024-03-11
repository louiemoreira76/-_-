package com.example;
import java.util.Locale;
import java.util.Scanner;
//equals
public class Opp {
    public static void main(String[] args) {
      // Sangue nos Oioo 🔥
      Scanner read = new Scanner(System.in).useLocale(Locale.US);
      float rA1 = read.nextFloat();
      float rB1 = read.nextFloat();
      float rA2 = read.nextFloat();
      float rB2 = read.nextFloat();

      float[] area = areas(rA1,rB1,rA2,rB2);
      boolean igual = hum((float)area[0], area[1]);
      System.out.println("O primeiro retângulo possui área " + area[0]);
      System.out.println("O segundo retângulo possui área " + area[1]);
      System.out.println("Eles são iguais? " + igual);
      read.close();
    } 
    public static float[] areas(float z, float x, float y, float u){
        float ar1 = z * x;
        float ar2 = y * u;
        float[] resp = {ar1,ar2};
        return resp;
    }
    public static boolean hum(float a, float b){
        boolean igual = false;
        if(a == b){
            igual = true;
            return igual;
        }
        else{
            return igual;
        }
    }
}


   // public static void main(String[] args) {
   //    // Sangue nos Oioo 🔥
   //    Scanner read = new Scanner(System.in);
   //   byte n1 = read.nextByte();
   //   byte n2 = read.nextByte();
   //   float result = calculo(n1, n2);

   //    System.out.println("A área do triângulo (Altura " + n1 + " x Base " + n2 + ") é " + result);
   //  }   
   //  public static float calculo(float altura,float base){
   //      float area = (float) ((altura * base) / 2);
   //       return area;
   //  }

//    public static void main(String[] args) {
//     // Sangue nos Oioo 🔥
//     Scanner read = new Scanner(System.in).useLocale(Locale.US);

//     float compra = read.nextFloat();
//     byte parcelas = read.nextByte();

//     calculo(compra, parcelas);
// }

// public static void calculo(float c, byte p) {
//     float total = c / p;
//     System.out.println("Sua compra de R$ " + c + " em " + p + "x de R$" + total + " foi concluída");
// }