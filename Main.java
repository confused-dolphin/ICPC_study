import java.io.*;
import java.util.Scanner;

public class Main {
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
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int [] arr = new int [N];
        
        arr =Integer.parseInt(br.readLine().split(" "));
    
    }


}
