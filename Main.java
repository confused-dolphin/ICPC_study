import java.io.*;
import java.util.*;

public class Main {
    /*  N 2745
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");
        
        String [] N = input[0].split("");       //N이 한그잘씩 쪼개져서 들어갔어도 한글자 짜리 문자열임 
        int B = Integer.parseInt(input[1]);

        int sum = 0; 
        int j= 0;

        for(int i = N.length-1; i>=0; i--){ // N[i]는 한글자 "문자" 가 아닌 한글자 짜리 "문자열" 
            if ( (9 < ((N[j].charAt(0)-'A') + 10)) && (36 > ((N[j].charAt(0)-'A') + 10)) ) {
                sum += (N[j].charAt(0)-'A'+10)*(int)Math.pow(B,i);
            }else{
            sum += Integer.parseInt(N[j])*(int)Math.pow(B,i);
            }
            j++;
        }

        System.out.println(sum);
    } */

    /*  N 11005
    public static void main(String[] args)throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");
     
        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        int quot_number =(int)(Math.log(N)/ Math.log(B)) + 1;
        
        int [] quot = new int [quot_number];
        int idx = 0 ; 

        while (N > 0){
            quot[idx++] = N % B; 
            N /= B; 
        }

        for(int i = idx-1; i>=0; i--){
            if( quot[i] > 9 && quot[i] < 36){
                char ch = (char)('A'+(quot[i]-10));
                System.out.print(ch);
            }else{
                System.out.print(quot[i]);
            }
        }
    }  */

    /*  N 2720
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
       double [] Q = new double[T];
       double [] D = new double[T];
       double [] N = new double[T];
       double [] P = new double[T];

        for(int i= 0 ; i< T; i++){
            double c =sc.nextDouble();

            Q[i] = c / 25;
            D[i] = (c%25)/10;
            N[i] = ((c%25)%10)/5;
            P[i] = (((c%25)%10)%5)/1;

        }

        for(int i = 0; i<T; i++){
            System.out.print((int)Q[i]+" ");
            System.out.print((int)D[i]+" ");
            System.out.print((int)N[i]+" ");
            System.out.print((int)P[i]);

            System.out.println();
        }



    } */

    /* N 2903 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double result = Math.pow((Math.pow(2,N)+1),2);

        System.out.println((int)result);
    } */

    /* N 2292 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int sum = 1; 
        int step = 0; 

        while (sum < N){
         step++;
         sum += 6*step;     
        }
        // 너무 복잡하게 만 바라봄 -> 완전 간단한 문제  
        // 이런 문제 풀 때 항상 각 단계마다 어떻게 변했는지 양상을 써볼 것 
        // 시작 or 끝을 인덱스로 잡고 생각하기 !!! 

        System.out.println(step+1);

    } */

    /* N 1193
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());  
        int line = 1;   
        int count = 0; 

        
        while (true) {
            if (X <= count + line) {  
                break;  
            }
            count += line;
            line++;
        }

        int pos = X - count;  

        int numerator, denominator;

        if (line % 2 == 0) {  
            numerator = pos;
            denominator = line - pos + 1;
        } else { 
            numerator = line - pos + 1;
            denominator = pos;
        }

        System.out.println(numerator + "/" + denominator);
    } */

    /* N 2869
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        int day = (V-A)/(A-B);
        //V-A  : day(마지막날) 올라갈 높이 
        //A-B : 하루에 실질적으로 올라가는 높이 (막날 제외)
        
        //(V-A)&(A-B) : day-1까지 올라가놓고 남은 높이 

        if((V-A)%(A-B) != 0){
            day++;
        }

        bw.write(Integer.toString(day+1));
        //버퍼는 String 형태만 가능 
        bw.flush();
        bw.close();


    } */


    /* N 5086 
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean check = true;
        
       while (check){
            String [] input = br.readLine().split(" ");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if(b == 0){
                bw.flush();
                bw.close();
                break;
            }

            
                if(a<b){
                    if(b%a==0){
                        bw.write("factor");
                        bw.newLine();
                    }else{
                    bw.write("neither");
                    bw.newLine();
                    }

                }else if (a>b) {
                    if(a%b == 0){
                        bw.write("multiple");
                        bw.newLine();
                    }else{
                    bw.write("neither");
                    bw.newLine();
                    }

                }
       }
    } */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int [] remain = new int[N];

        for(int i=1; i<N+1; i++){
            if(N%i == 0){
                remain[i] = i;
            } 
        }
        if(remain[N] == 0){
            System.out.println("0");
        }
        int max = remain[0];
        for(int i = 1 ; i<K ; i++){
            if(max<remain[i]){
                max = remain[i];
            }
        }
        
        System.out.println(max);

    }

}












