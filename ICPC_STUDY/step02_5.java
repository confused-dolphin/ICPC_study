package ICPC_STUDY;
import java.io.*;
import java.util.Scanner;

public class step02_5 {
    /*  N 27866
    public static void main(String[] args) throws IOException  {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     Scanner sc = new Scanner(System.in);

     String S = br.readLine();

     int N = Integer.parseInt(br.readLine());

     System.out.println(S.charAt(N-1));     
    } */

    /*  N 2743 
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        System.out.println(word.length());
        
    } */

    /*  N 9086 
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력을 위한 객체를 따로 만들 필요 없이 br 계속 사용하기 

        int T = Integer.parseInt(br.readLine());

        String [] arr = new String [T];

        for(int i = 0 ; i< T; i++){
            arr[i] = br.readLine();
        }

        for(int i = 0 ; i< T ; i++){
           System.out.print(arr[i].charAt(0));
           System.out.print(arr[i].charAt(arr[i].length()-1));
           // length()-1 로 해야함 !! 

           System.out.println("");
        } */

    /*  N 11654 
    public static void main(String[] args) throws IOException {
        //문자를 정수로 바꾼 뒤에 !! 아스키코드로 바꿔야함 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char word = br.readLine().charAt(0);

        int ASC = (int) word;

        System.out.println(ASC);

    } */    

    /*  N 11720
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        String number = br.readLine();

        
        String[] arr = number.split("");

        int result = 0;

        for(int i = 0 ; i< N ; i++){
            result += Integer.parseInt(arr[i]);
        }

        System.out.println(result);
   
    } */
        
    /*  N 10809  - 더 공부하기 알고리즘이 괜찮음  
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int [] arr = new int [26];  // 굳이 abc.. 이런식으로 다 넣지말고 갯수만큼 공간만 만들기 

        for(int i = 0 ; i<26; i++){
            arr[i] = -1;
        } 
        // 애초에 해당 공간에 abc..같은 문자가 아닌 숫자 -1로 설정 

        for(int i = 0; i<S.length(); i++){
            char word = S.charAt(i);
            
            int idx = word - 'a';  //아식스 코드 이용 하여 해당 인덱스 찾기 
            
            if(arr[idx] == -1){
                arr[idx] = i;   
                //S의 인덱스와 arr의 인덱스가 동일하다는 점 이용 
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        
    } */
    
    /*  N 2675 - 알고리즘 자체가 너무 헷가림 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            String[] parts = br.readLine().split(" ");
            int R = Integer.parseInt(parts[0]);
            String S = parts[1];

            char[] out = new char[S.length() * R];
            int p = 0;
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                for (int r = 0; r < R; r++) {
                    out[p++] = ch;
                }
            }
                System.out.println(new String(out));
        }
    } */

    /*  N 11718
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line ; 
        
        while(((line = br.readLine()) != null)){
            bw.write(line); //bw에 저장됨 
            bw.newLine(); // \n 연할
        }     

        bw.flush();  //데이터 한번에 내보내기 

    } */

    /* N 1152 - 백준으로는 틀리는데 돌리면 맞긴함.. ??? 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] line = br.readLine().split(" ");

        int count = line.length;

        System.out.println(count);


    } */

    /* N 2908 - 공부하기 (0920) 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input  = br.readLine().split(" ");
        String A = new StringBuilder(input[0]).reverse().toString();
        String B = new StringBuilder(input[1]).reverse().toString();
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);

        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    } */

    // N 5622 - 다시 풀기 아예 감을 못잡음 

}




