// DO파일
package jspproject.ch11;


public class Member {
  // 회원 정보멤버 변수
  private String name;
  private String email;
  
  // 인수 있는 생성자
  public Member(String name, String email) {
    this.name = name;
    this.email = email;
  }
  // 기본 생성자인 경우 다음과 같이 신규 정보로 초기화
  public Member() {
    name="홍길동";
    email="test@test.net";
  }
  
  // Generate Getters and Setters
}
