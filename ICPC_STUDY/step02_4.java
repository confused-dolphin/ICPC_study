package ICPC_STUDY;
import java.io.*;
import java.util.Scanner;

public class step02_4 {
    /* N 10807 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count=0;
        int n1 = Integer.parseInt(br.readLine());

        int [] arr = new int [n1];


        String [] str = br.readLine().split(" ");
    // split(" ")
    // 공백 기준으로 잘라 읽기 -> 새로운 string 배열 생성 
    // 해당 배열의 주소가 str에 저장 됨 !! 

        for (int i = 0 ; i< n1 ; i++){
            arr[i] = Integer.parseInt(str[i]); 
        }

        int n2 = Integer.parseInt(br.readLine());
    
        for(int i = 0 ; i< n1 ; i++){
            if (n2 == arr[i]){
                count ++;
            }
        }

        System.out.println(count);
 }    */

    /* N 10871
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
       String [] input = br.readLine().split(" ");  //입력객체 

       int [] arr = new int [2] ; // arr[0] : N 과 arr[1]: X 
    
       for(int i = 0; i<2; i++){
        arr[i] = Integer.parseInt(input[i]);
       }

       int [] check = new int [arr[0]]; 
       int value=0;

       // input = br.readLine().split(" ");
       // \n  나오기 전까지 쭉 받음 
       // input은 어차피 배열 사이즈가 지정되어있어서, 해당 사이즈를 벗어나서 입력해도 괜찮음 

       
       input = br.readLine().split(" ");

       for (int i = 0 ; i< arr[0]; i++){
        if (arr[1] > Integer.parseInt(input[i])){
            check[value] = Integer.parseInt(input[i]);
            value++;
        }
       }

       for(int i =0; i< value; i++){
            System.out.print(check[i]+" ");
       }


       
    } */
    
    /* N 10818 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        String [] input = br.readLine().split(" ");
        int [] arr = new int [N];
        
       // arr =Integer.parseInt(br.readLine().split(" "));
       // -> 이건 안됨. Integer.parseInt()는 문자열 하나를 정수 하나로 변환 하는거임
       // -> readLine()은 문자열 배열을 반환 함 => 결론 자료형이 안맞음 

        for (int i = 0 ; i< N ; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0 ; i<N; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            
            if(arr[i]<min){
                min = arr[i];
            }
        }
    

        System.out.println(min + " "+ max);
    }
 */

    /* N 2562 
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String [] input = new String [9];
        int [] arr = new int [9];

        for (int i = 0; i<9;i++){
            input[i] = br.readLine();
            arr[i] = Integer.parseInt(input[i]);
        }

        int max = arr[0];
        int max_number = 1;
        // max_number을 0으로 초기화 해버리면 
        // arr[0]이 최댓값이였을때 1이 아닌 0이 나오게 됨 

        for (int i = 1; i<9; i++){
            if(arr[i]> max){
                max = arr[i];
                max_number = i+1;
                // 얘는 i가 인덱스 번호라 i+1을 하는게 맞음 
            }
        }

        System.out.println(max);
        System.out.println(max_number);
        
    
    } */

    /* N 10810 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int [] basket = new int [N];

        for (int a = 0 ; a< M ; a++){

            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int b = i-1 ; b<j; b++){
                basket[b] = k;
            }

            // b=i-1 로 해야함 
            // 왜냐면 i(순번)는 항상  인덱스 보다 +1 된 값이니까 
            // 다시 인덱스를 순번으로 바꾸려면 -1을 해야함 ! 
        }

        for(int i = 0; i<N ;i++){
            System.out.print(basket[i]+" ");
        }
    } */

    /* N 10813 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] basket = new int [N];

        for (int i =0 ; i<N; i++){
            basket[i] = i+1;
        }
    
        int M = sc.nextInt();

        for(int a = 0; a < M ; a++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;

            int tmp = basket[j];
            basket[j] = basket[i];
            basket[i] = tmp; 
        }

        for (int i = 0 ; i< N; i++){
            System.out.print(basket[i] + " ");
        }



    } */

    /* N 5597 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] student = new int [30];

        for(int i = 0 ; i<28; i++){
            int check = sc.nextInt()-1;

            student[check] = 1;
        }

        for (int i = 0 ; i<30; i++){
            if (student[i] != 1){
                int no_check = i+1;
                System.out.println(no_check);
            } 
         }
    } */

    /* N 3052 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] input = new int [10];
        int [] result = new int [10];
        boolean check = true;
        int end = 0;

        for(int i = 0 ; i< 10 ; i++){
            input[i] = sc.nextInt();
            result[i] = input[i]%42;
        }

        for(int i=0; i<10;i++){
            for(int j=i+1; j<10; j++){
                if(result[i] == result[j]){     // 나머지가 같을 때마다 check가 false가 됨
                   check = false;    
                }
            }
            //기존에 check ++로 썼는데 계속 틀림
            // -> 같을때마다 check++ 하면 i가 한 사이클 돌 때 같은게 2개면 check++이 두번 돌게 됨
            // 나는 같은게 있을때마다(유무) ++ 하고싶은거고 
            // 내가 썼던건 같은게 있을때마다(갯수) ++ 된거임 . 그래서 틀린것! 

            if (check == false){
                end++;
                check = true;
            }
        }

        System.out.print((10-end));     //(전체 갯수)에서 (나머지가 같은 수의 갯수)만 뺴면 됨
        
    }
 */

    /* N 10811 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] basket = new int [N];

        for(int i = 0 ; i< N; i++){
            basket[i] = i+1;
        }

        int M = sc.nextInt();

        for(int a = 0 ; a< M ; a++){

            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;

            while (i<j){        // 실제로 i==j 일때는 바뀌는게 없어서 안해도 됨
                
                int tmp = basket[j];
                basket[j] = basket[i];
                basket[i] = tmp;

                i++;
                j--;
                
            }
        }

        for(int i = 0 ; i<N;i++){
            System.out.print(basket[i]+" ");
        }
    }

    // 1 2 3 4 5
    // 4 3 2 1 5
    */

    /*  N 1546  
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double [] test = new double [N];
        
        for(int i = 0; i<N; i++){
            test[i] = sc.nextInt();
        }

        double max = test[0];

        for(int i =0 ; i< N; i++){
            if(max < test[i]){
                max = test[i];
            }
        }

        double sum = 0;

        for(int i = 0; i<N; i++){
            sum += test[i]/max*100;
        }

        double avg = sum/N;

        System.out.println(avg);

        
    } */
}
