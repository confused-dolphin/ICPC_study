// 자바에서 문자열 = String 

// String
// - 문자배열(char[])로 관리됨 
// - 객체가 절대로 바뀌지 않음 
// 주로 Buferred를 사용함 

// 문자열 함수 
// 1. charAt(idx)
// -문자열에서 idx위치 있는 문자(char)를 하나 반환
// -아스키 코드 이용 하기 : 'A'
// ch - 'A' : ch에 들어있는 문자의 알파벳상 인덱스 (0부터 시작)
// -> ch 가 A 이면 0이 나옴 

// 2. substring(beginidx, endidx)
// - beginidx ~ (endidx-1) 안의 값 출력 

// 3. length()
// - 문자열의 길이(문자개수)반환 

// 4. indexof("str")
// - 해당 문자열이 처음 등장하는 인덱스를 반환 

// 5. lastIndexof("str")
// - 마지막으로 등장하는 인덱스 반환

// 6. a.equals(b)
// -> 문자열 a와  문자열 b를 서로 비교해 T/F 반환 

// 7. "apple".replace('a', 'b')
// -> 문자 치환 //. bpple

// 8. "a1b2c3".replaceAll("[0-9]","")
// -> 정규식 기반 치환 //abc

// 9.String [] arr = str.split(",")
// -> 특정 구분자로 문자열을 나눔 


//알아야할 것 
// //s  : 공백 (스페이스,탭,줄바꿈)
// ^ : 부정
// a-zA-Z : 알파벳 모든 문자 

package ICPC_STUDY;

public class String {

}
