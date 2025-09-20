package ICPC_STUDY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buferred {
    // public static void main(String[] args) throws IOException {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    //     String line = br.readLine();
    //     int number = Integer.parseInt(br.readLine());

    //     System.out.println(line);
    //     System.out.println(number);

    // }
}


// System.in
// 키보드 입력을 1byte씩 읽음 

//InputStreamReader 
// 바이트형식으로 들어오는 스트림을 문자 스트림으로 변환 해주는 클래스 
// 한글,일본어 등 (영어제외) 2byte씩 읽을 때 빠르게 씀

//throws IOException 
// 입출력 도중 발생하는 예외 
// ex 파일이 없거나, 입력이 끊기거나 등 
// 반드시 Buffered 메서드를 사용할 때 있어야함 ! 

// readLine()
// BufferedReader 의 메서드 
// 한 줄 자체를 "문자열" 로 읽음 -> 반환도 String으로 함 

//Integer.parseInt()
//문자열을 int로 변환 
//객체로 감싸지는 wrapper 클래스 


