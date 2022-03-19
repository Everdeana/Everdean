<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2차원 배열 처리 - 학생성적처리 프로그램</title>
</head>
<body>
	<h2>학생 성적 프로그램</h2>
	<%
		Scanner sc = new Scanner(System.in);
        boolean run = true;
        int student_num = 0;
        int scores [] = null;
        int max_score = 0;
        double avg_score= 0;
        int sum2 =0;
        int no_2_count =0;
        int max = 0;
        double avg = 0;
    
        
        while(run) {
            System.out.println("----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
            System.out.print("선택");
            int select_no = Integer.parseInt(sc.nextLine());
            
            if( select_no ==1) {
                System.out.print("학생수:");
                student_num = Integer.parseInt(sc.nextLine());
                scores = new int[student_num];
            } else if(select_no ==2){
                if(student_num < 1) {
                    System.out.println("학생수를 입력하지 않으셨습니다.");
                } else {
                    for(int i=0; i<student_num; i++) {
                        System.out.print("scores["+i+"]1의 점수를 입력하세요.");
                        scores[i] = Integer.parseInt(sc.nextLine());
                        no_2_count++;
                    }
                }
            } else if(select_no ==3) {
                if(student_num <1) {
                    System.out.println("학생수를 입력하지 않으셨습니다.");
                } else if(no_2_count<1) {
                    System.out.println("학생점수를 입력하지 않으셨습니다.");
                } else {
                    for(int i=0; i<student_num; i++) {
                        System.out.println(scores[i]);
                    }
                }
            } else if(select_no ==4) {
                if(student_num <1 || scores.length <0) {
                    System.out.println("학생수와 학생 점수가 입력되지 않았습니다.");
                } else {
                        for(int i =0; i<student_num; i++) {
                            if(max<scores[i]) {
                                max = scores[i];
                            }
                            sum2 += scores[i];
                        }
                        avg = (double)sum2/student_num;
                        System.out.println("최고 점수 : " + max);
                        System.out.println("평균 점수 : " + avg);
                        System.out.println("총점수 :"+sum2);
                }
            } else if (select_no ==5) {
                run = false;
                System.out.println("프로그램이 종료됩니다.");
            }            
        }
        %>
</body>
</html>
