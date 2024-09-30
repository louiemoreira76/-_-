package myapp.src.matriz;
import java.util.Scanner;

public class teste {
        static Scanner read = new Scanner(System.in);
          
        static int quadrada(){
        System.out.println("Digite o número para formar uma matriz quadrada i+j*2");
        int quadrada = read.nextInt(); //instância (read) de um contexto estático 
        return quadrada;
        }
        
        static int[][] formacao(int m) {
            int[][] a = new int[m][m];
    
            for (byte i = 0; i < m; i++) {
                for (byte j = 0; j < m; j++) {
                    a[i][j] = (i + j) * 2;
                }
            }
            return a;
        }
        
        static void printar(int [][]m, int q){
            byte i,j;
            System.out.println("A matriz formada!");
            for(i = 0; i < q; i++){
                for(j = 0; j < q; i++){
                    System.out.printf("%d\t",m[i][j]);
                    if(j==2){
                        System.out.println("");
                    }
                }
            }
        }
        
        public static void main(String[] args){
          int matriz = quadrada();
          int m [][] = formacao(matriz);
          printar(m, matriz);
        }
}
