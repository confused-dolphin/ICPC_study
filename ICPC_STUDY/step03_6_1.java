package ICPC_STUDY;

import java.util.Scanner;
import java.io.*;

public class step03_6_1 {
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

    /* N 10988 @팰린드롬 문제 
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
        // length 는 인덱스와 다르게 1부터 시작하는 SIZE 자체임 
        // length -1 : 인덱스상(0~) 동일한 크기가 됨 
        // length -1 - i : 인덱스 상 마지막부터 나오게 됨 


        System.out.println(result);
    } */

    /* N 1157  - 알고리즘 분석하기 
    public static void main(String[] args) throws IOException{

        //그냥 처음부터 입력을 대문자로 바꿔서 생각하기 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().toUpperCase();

        int [] abc = new int [26];


        for(int i= 0 ; i< input.length(); i++){
            char ch = input.charAt(i);
            abc[ch-'A']++;      //int형으로 답이 나옴 -> 자바는 수식이 들어가면 자동으로 int 함 
            //ch-'A' : 아스키 코드 이용하기
            // ^ 이렇게 하면 A,B,C..에 맞는 인덱스가 나옴 
        }

        int max = 0 ; 
        char result = '?';

        for(int i = 0 ; i<26; i++){
            if(abc[i] > max){
                max = abc[i];
                result = (char)(i+'A');
                // 아스키코드를 wrapper클래스로 감싸서 정수 -> 정수에 해당되는 문자 로 변환 
                 
            } else if(abc[i] == max){
                result = '?';
            }
        }

        
        System.out.println(result);

    }
 */

    /* N 2941  - 향상된 for문 사용 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] croa = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
        for (String p : croa){
            input = input.replace(p,"*");
        }
        // 향상된 for문 이용 
        // 애초에 크로아티아어가 감지되면 바로 *(한글자)로 치환

        System.out.println(input.length());
    } */

    /* N 1316
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            boolean[] abc = new boolean[26]; 
            boolean GroupWord = true;      
            char prev = 0;                 

            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);

                
                if (ch != prev) {
                    if (abc[ch - 'a']) {     
                        GroupWord = false;
                        break;
                    }
                    abc[ch - 'a'] = true;    
                }
                prev = ch;
            }

            if (GroupWord) {
                count++;
            }
        }

        System.out.println(count);
    } */

    /* N 25206 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0.0;
        double totalCredit = 0.0;

        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            String subject = input[0];
            double credit = Double.parseDouble(input[1]);
            String grade = input[2];

            if (grade.equals("P")) continue;

            double gradePoint = 0.0;
            switch (grade) {
                case "A+": gradePoint = 4.5; break;
                case "A0": gradePoint = 4.0; break;
                case "B+": gradePoint = 3.5; break;
                case "B0": gradePoint = 3.0; break;
                case "C+": gradePoint = 2.5; break;
                case "C0": gradePoint = 2.0; break;
                case "D+": gradePoint = 1.5; break;
                case "D0": gradePoint = 1.0; break;
                case "F":  gradePoint = 0.0; break;
            }

            totalScore += credit * gradePoint;
            totalCredit += credit;
        }

        System.out.printf("%.6f\n", totalScore / totalCredit);
    } */
}




