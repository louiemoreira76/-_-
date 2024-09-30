package myapp.src.matriz;

public class ex1 {
    public static void main(String[] args) {
        int i,j;
        int [][] a = new int [3][3];
        
        for(i=0; i<3; i++){
            for(j=0;j<3;j++){
                a[i][j] = (i+1) + (j+1) -1;
            }
        }
        System.out.println("Matriz formada pela lei i+j-1");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.printf("%d\t",a[i][j]);
                if (j==2) {
                    System.out.println("");
                }
            }
        }
        System.out.println("traço da matriz");
        int tr = 0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(i==j){
                    tr = tr + a[i][j];
                }
            }
        }
        System.out.println("Valor do traço: " + tr);
    }
}
