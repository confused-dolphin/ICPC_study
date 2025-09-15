package ICPC_STUDY;
import java.util.Scanner;

public class step01_2 {
    /* N 1330
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if ( a > b) System.out.println(">");
        else if (a < b)System.out.println("<");
        else System.out.println("==");
    } */

    /* N 9498 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >89) System.out.println("A");
            else if (score > 79) System.out.println("B");
            else if (score > 69) System.out.println("C");
            else if (score > 59) System.out.println("D");
            
            else System.out.println("F");
        }
        
    } */

    /* N 2753
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (( year%4 == 0) && (year %100 != 0)){
            System.out.println("1");
        }else if ( year % 400 == 0){
            System.out.println("1");
        }else System.out.println("0");
    } */

    /* N 14681 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        //1번 풀이
        // if ((x>0)&&(y>0)) System.out.println("1");  
        // else if((x<0)&&(y>0)) System.out.println("2");
        // else if ((x<0)&&(y<0)) System.out.println("3");
        // else if ((x>0)&&(y<0)) System.out.println("4");


        //2번 풀이
        // if (x>0){
        //     if (y>0) System.out.println("1");
        //     else System.out.println("4");
        // }
        // else{
        //     if (y>0) System.out.println("2");
        //     else System.out.println("3");
        // }
    } */

    /* N 2884 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M >44){     //45~60분 
            System.out.print(H);
            System.out.print(" ");
            System.out.print(M-45);
        }
        else{           //0~44분 
            if(H>0){
            System.out.print(H-1);      
            System.out.print(" ");
            System.out.print(M+15);
            }else{
                System.out.print(23);
                System.out.print(" ");
                System.out.print(M+15);
            }
        }
    } */

    /* N 2525 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        if (A>=0 && A<=23){
            if (B>=0 && B<=59){
                if (C>=0 && C<=1000){
                    int H = (B+C)/60;   // 총 시간의 H  
                    int M = (B+C)%60;   // 총 시간의 M 

                    if ((A+H)<= 23){
                    System.out.print(A + H);
                    System.out.print(" "+ M );
                    
                    }else{ 
                    System.out.print(A+H - 24);
                    System.out.print(" "+ M);
                    }
                }
            }
        }
    } */

    /* N 2480 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int money;

        if(a==b){
            if (b==c){  //a,b,c 같음
                money = (10000+(a*1000));
            }else{      //a,b 같음
                money = (1000+(a*100));
            }
        }else{  //a!=b
            if (c == a){ // a,c 같음
                money = (1000+(a*100));
            }
            else if (c ==b){ //b,c 같음
                money = (1000+(b*100));
            }else{          //같음 X 
                int max = a;
                if(max < b){
                    max = b;
                }
                if(max <c){
                    max = c;
                }
                // 여기서 else if로 쓰면 안됨 
                // 그러면 max<b까지만 비교하고 c일때를 비교 안하기 때문 

                money = max * 100;
            }
        }

        System.out.println(money);
        
    }
 */

}
