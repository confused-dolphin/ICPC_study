package ICPC_STUDY;
import java.io.*;
import java.util.Scanner;

public class step04_7{

    /*  N 2738 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] A = new int [N][M];
        int [][] B = new int [N][M];
        int [][] C = new int [N][M];

        for(int i = 0 ; i<N; i++){
            for(int j = 0 ; j<M;j++){
                A[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i<N; i++){
            for(int j = 0 ; j<M;j++){
                B[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<N; i++){
            for(int j = 0 ; j< M ; j++){
                C[i][j] = A[i][j]+B[i][j];  
            }
        }

        for(int i = 0 ; i<N; i++){
            for(int j = 0 ; j<M; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }

       
    } */

    /*  N 2566 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int [9][9];

        for(int i = 0; i<9; i++){
            for(int j = 0 ; j<9; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0 ; 
        int col = 0; // 열 
        int row = 0; // 행

        for(int i= 0; i<9; i++){
            for(int j= 0; j<9; j++){
                if (max <= arr[i][j]){
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row+" "+col);
    } */

    /*  N 10798 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String [][] arr = new String[5][15];
        String [] input = new String [15];
        String [][] result = new String[15][5];

        for(int i = 0; i<5; i++){
            input = br.readLine().split("");
            for(int j =0 ; j<input.length; j++){
                arr[i][j] = input[j];
                result[j][i] = arr[i][j];
            }
        }
    

        for(int j = 0; j<15; j++){
            for(int i=0; i<5;i++){
                if(result[j][i] != null){
                    System.out.print(result[j][i]);
                }
            }
        } 
    } */

    /*  N 2563
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean [][] white = new boolean [100][100];    // 전부 false으로 채워짐

        int N = sc.nextInt();

        for(int i = 0 ; i< N ; i++){
            int n1 = sc.nextInt()-1;
            int n2 = sc.nextInt()-1;
            
            int n3 = n1+10 ;
            int n4 = n2+10;
            
            for(int a = n1; a<n3; a++){
                for(int b = n2; b<n4; b++){
                    white[a][b] = true;
                }
            }
        }

        int count = 0;
        for(int i = 0; i<100; i++){
            for(int j = 0; j<100; j++){
                if(white[i][j] == true){
                    count ++;
                }
            }
        }
       

       System.out.println(count);


    } */




}