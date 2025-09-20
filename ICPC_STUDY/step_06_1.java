package ICPC_STUDY;
import java.util.Scanner;
import java.io.*;

public class step_06_1 {
   /* N 25083
   public static void main(String[] args) {
        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");
    } */

    /* N 3003 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] ori = { 
            1,1,2,2,2,8
        };


        int [] input = new int [6];
        int [] result = new int [6];

        for(int i = 0 ; i< 6; i++){
            input[i] = sc.nextInt();
        }

        for(int i = 0; i<6 ; i++){
            result [i] = ori[i] - input[i];       
        }

        for (int i = 0; i<6;i++){
            System.out.print(result[i]+" ");
        }


    } */

    /* N 2444 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for(int i = 0; i< N ; i++){
            for (int j = N ; j>i+1 ; j-- ){
                System.out.print(" ");
            }
            for (int k = 0; k<(i*2)+1; k++){
                System.out.print("*");
            }

            System.out.println(" ");
        }

        for(int i = N-1 ; i>0 ; i--){
            for(int j = N-1; j>i-1; j--){
                System.out.print(" ");
            }
            for(int j = i*2 - 1 ; j>0;j-- ){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    } */

    /* N 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");
        int result = 1; // 기본값

        for (int i = 0; i < input.length / 2; i++) {
            if (!input[i].equals(input[input.length - 1 - i])) {
                result = 0;
                break;
            }
        }

        System.out.println(result);
    } */
}

