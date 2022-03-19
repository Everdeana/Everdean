#include <stdio.h>   // printf와 scanf_s 함수 사용하기 위해
 
#define STUDENT_COUNT        4   // 입력 받을 학생수
#define CLASS_COUNT          3   // 입력 받을 과목수
#define MAX_CLASS_NAME_LEN   5   // 과목 이름의 최대 길이(한글은 한 글자가  2바이트임!)
 
int main()
{
    // 학생별 점수를 저장할 2차원 배열을 선언!
    int score[STUDENT_COUNT][CLASS_COUNT];
    // 총점, 학생 번호, 학급 번호, 최솟값, 최댓값을 저장할 변수
    int total, s_num, c_num, min, max;
    // 과목 이름을 저장할 2차원 배열을 선언!
    char class_name[CLASS_COUNT][MAX_CLASS_NAME_LEN] = { "국어", "영어", "수학" };
 
    // 학생들의 성적을 입력받는다.
    for (s_num = 0; s_num < STUDENT_COUNT; s_num++) {
        printf("%d 번째 학생의 성적을 입력하세요\n", s_num + 1);
        // 국어, 영어, 수학 순서로 점수를 입력 받는다.
        for (c_num = 0; c_num < CLASS_COUNT; c_num++) {
            printf("%s 점수 : ", class_name[c_num]);
            scanf_s("%d", &score[s_num][c_num]);
        }
    }
 
    printf("\n입력한 성적의 학생별 점수와 평균\n");
    // 학생 개인별 총점의 최대, 최솟값을 구하기 위해 값을 초기화한다.
    // 최솟값은 나올수 있는 최댓값보다 1 큰값으로 초기화한다.
    min = CLASS_COUNT*100 + 1; 
    // 최댓값은 나올수 있는 최솟값보다 1작은 값으로 초기화한다.
    max = -1;
    // 학생수만큼 반복한다.
    for (s_num = 0; s_num < STUDENT_COUNT; s_num++) {
        printf("%d. ", s_num + 1);
        total = 0;  // 총점을 저장하기 위해 초기화한다.
        for (c_num = 0; c_num < CLASS_COUNT; c_num++) {
            // 과목별 점수를 출력한다.
            printf("%3d ", score[s_num][c_num]);
            // 과목별 점수를 합산한다.
            total += score[s_num][c_num];
        }
        // 현재 학생의 총점과 평균을 출력한다.
        printf(": %3d, %.2f\n", total, (float)(total) / CLASS_COUNT);
        // 현재 학생의 총점이 최솟값보다 적으면 최솟값을 갱신하고
        // 최댓값보다 크다면 최댓값을 갱신한다.
        if (min > total) min = total;
        else if (max < total) max = total;
    }
    // 학생들 중에 최고 점수와 최저 점수를 출력한다.
    printf("최고 점수 : %.2f, 최저 점수 : %.2f\n\n", 
            (float)(max)/CLASS_COUNT, (float)(min)/CLASS_COUNT);
 
    printf("입력한 성적의 과목별 점수와 평균\n");
    // 과목별 총점의 최대, 최솟값을 구하기 위해 값을 초기화한다.
    // 최솟값은 나올수 있는 최댓값보다 1 큰값으로 초기화한다.
    min = STUDENT_COUNT * 100 + 1;
    // 최댓값은 나올수 있는 최솟값보다 1작은 값으로 초기화한다.
    max = -1;
    // 과목수만큼 반복한다.
    for (c_num = 0; c_num < CLASS_COUNT; c_num++) {
        // 과목 이름을 출력한다.
        printf("[%s] ", class_name[c_num]);     
        total = 0; // 과목별 총점을 저장하기 위해 초기화한다.
        for (s_num = 0; s_num < STUDENT_COUNT; s_num++) {
            // 현재 과목의 점수를 출력한다.
            printf("%3d ", score[s_num][c_num]);
            // 과목의 점수를 합산한다.
            total += score[s_num][c_num];
        }
        // 현재 과목의 총점과 평균을 출력한다.
        printf(": %3d, %.2f\n", total, (float)(total) / STUDENT_COUNT);
        // 현재 과목의 총점이 최솟값보다 적으면 최솟값을 갱신하고
        // 최댓값보다 크다면 최댓값을 갱신한다.
        if (min > total) min = total;
        else if (max < total) max = total;
    }
    // 과목들 중에 최고 점수와 최저 점수를 출력한다.
    printf("최고 점수 : %.2f, 최저 점수 : %.2f\n",
            (float)(max)/STUDENT_COUNT, (float)(min)/STUDENT_COUNT);
    return 0;
} 
