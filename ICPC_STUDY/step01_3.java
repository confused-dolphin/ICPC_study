package ICPC_STUDY;
import java.util.Scanner;
import java.io.*;
// -> io로 시작되는 모든 파일을 가져오는 것 
import java.util.StringTokenizer;


public class step01_3 {

    /* N 2739 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i<10; i++){
            System.out.println(N+" * "+i+" = "+ N*i);
        }
    } */
    
    /* N 10950  - 더 생각해보기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        int [] arr = new int[T];

        for(int i = 0 ; i < T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }
        for(int i = 0 ; i< T ; i++){
            System.out.println(arr[i]);
        }
    }
 */

    /* N 8393
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result= 0;

        for(int i = 0 ; i <= n; i++){
            result += i;
        }

        System.out.println(result);
    } */

    /* N 25304 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();

        int [] total = new int[N];
        int result =0 ;

        for(int i = 0 ; i< N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            total[i] = a*b;
        }

        for (int i =0 ; i< N ; i++){
            result += total[i];
        }

        if ( result == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    } */

        // Scanner
        // 1. 사용하기 쉽고 직관적
        // 2. 입력이 많아지면 속도가 느림 -> 시간초과 
        // Scanner sc = new Scanner(System.in);
        // -> 입력받는 sc 객체 만들어서 하기 

        // BufferedReader
        // 1. 입력을 버퍼에 모았다가 한번에 가져옴 
        // 2. 문자열 String 으로 읽음(readline())
        // 3. 읽은 문자열을 숫자로 쓰려면 Integer.parseInt()변환 필요 

        // System.out.println()
        // 1. 출력이 많으면 속도 저하 -> 시간초과

        // BufferedWriter
        // 1. 출력을 버퍼에 모았다가 한번에 가져옴
        // 2. write() 사용 -> \n은 직접 붙혀야함

        // flush()
        // 1. 프로그램 종료 전, 버퍼를 강제로 비우기 
        // 출력이 전부 끝난 뒤 딱 한번만 호출해야함

        // => 쓰기 위해 java.io.* 를 임포트 해야함 

    /* N 15552 - 더 생각해보기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write((A + B) + "\n");  // 버퍼에 결과만 쌓음
        }

        bw.flush();   // 마지막에 한 번만 flush
        bw.close();
        }
    } */

    /* N 11021
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        int [] arr = new int[T];

        for(int i = 0 ; i < T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }
        for(int i = 0 ; i< T ; i++){
            System.out.print("Case "+"#"+(i+1)+": ");
            System.out.println(arr[i]);
        }
    } */

    /* N 11022 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        int [] arr = new int[T];
        int [] A = new int [T];
        int [] B = new int [T];
        
        for(int i = 0 ; i < T; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            arr[i] = A[i] + B[i];
        }
        for(int i = 0 ; i< T ; i++){
            System.out.print("Case "+"#"+(i+1)+": ");
            System.out.print(A[i]+" + "+B[i]+" = ");
            System.out.println(arr[i]);
        }
    } */

    /* N 2438 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i =0 ; i<N; i++){
            for(int j = 0 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    } */

    /* N 2439
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i =0 ; i<N; i++){
            for(int k = i; k < N-1; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }  */

    /* N 10952 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10,b= 10;
        while(a !=0 && b !=0){
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a+b);

        }
    } */

    // sc.hasNextInt() 함수 
    // 1. boolean 형의 함수 
    // 더 이상 입력이 없거나, 정수가 아님 -> false
    // 다음 입력이 정수일 때 -> true

    /* N 10951  - 더 생각해보기 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
    } 
    */
}
