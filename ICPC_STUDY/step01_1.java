package ICPC_STUDY;
import java.util.Scanner;
//입력받을 수 있게 객체 가져오는 파일 

public class step01_1 {

   /* N 2557
    public static void main(String[] args) {
        System.out.println("Hello World!");
    } */

    /* N 1000 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    //    이렇게 풀었는데 안됨  
    //     int num1 = sc.nextInt();
    //     sc.nextLine();
    //     int num2 = sc.nextInt(); 
        
    //     -> 문제에선 1 2 이렇게 옆으로 쓰는걸 원함 
    //     해당 코드는 1 (line) 2 이런식으로 한줄개행 형태로 입력을 받음 
    //     한줄 개행 제거를 위해 넣은 sc.nextLine(); 이 오히려 반드시 라인을 넣어야하는걸로 되어버림 
        

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
    //      이렇게 하니까 이제 됨  
    //      애초에 nextInt는 int형 정수만 받는거니까 enter,space 다 안받음 !! 
    //      -> 입력 객체 잘 생각하기 

        int num3 = num1 + num2;
        System.out.println(num3);
        

    } 
    */

    /* N 1001
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int num3 = num1 - num2;
    System.out.println(num3);
    } */

    /* N 10998 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int num3 = num1 * num2;
        System.out.println(num3);
    } */

    /* N 1008 
//      * 문제 [실제 정답과 출력값의 절대오차 또는 상대오차가 10의-9승 이하이면 정답이다.]
//        -> 즉, double을 이용하라는 말 !! 
//           계속 float로 푸니까 틀림. 앞으로는 그냥 다 double로 풀 것 ! 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
//      -> double 형으로 받는거니까 nextDouble 형식으로 받아야함 ! 

        double num3 = num1 / num2;
        System.out.println(num3);

//      만약 소수점 n자리까지 출력해라 같을 때는 
//       %f : 소수점 표기 (기본 6자리) 
//          - double,float 모두 사용 가능 
//          - 이때 반드시 System.out.printf()를 써야함 -> println은 포맷 지정자를 처리 X  
//              1. System.out.println(num3);
//                  -> println은 전체 값은 그대로 출력함
//              2. System.out.printf("%f", num3);
//                  -> %f는 소수점 6자리까지만 출력 

    }
 */

    /* N 10869 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);

        // 출력예시 보면 전부 정수로 계산됨 
    } */

    /* N 10926 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();  // String 대문자 
        System.out.println(id + "??!");

        //입력개행은 무조건 enter를 눌러야 끝남 
    }
 */

    /* N 18108  
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        System.out.println(year - 543);
    } */

    /* N 10430   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println((A+B)%C);
        System.out.println( ((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }  */

   /*  N 2588 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int n3 = (n2/10);   // 38
        int n4 = n2/100;  //3
     

        int result = n1 * n2;

        System.out.println((n2%10) * n1);    //(3)
        System.out.println((n3%10)*n1);      //(4)
        System.out.println(n4 * n1);         //(5)
        System.out.println(result);
        

    
    } */

   /*  N 11382
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a+b+c);
    }

    //  [문제] 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
    //  -> long은 int보다 더 넓은 범위의 정수형 값을 담을 수 있음 ! 
 */

}
