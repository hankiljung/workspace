package test;

import java.util.Scanner;

public class 문제1_21 {
    public static void main(String[] args) {
        int studentNum = 0;
        int[] scores = null;  // 학생 점수를 저장할 배열
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("1. 학생수  |  2. 점수입력  |  3. 점수리스트  |  4. 분석  |  5. 종료");
            System.out.println("--------------------------------");
            System.out.print("선택 : ");
            int selNum = sc.nextInt();

            switch (selNum) {
                case 1:
                    // 학생 수 입력 받기
                    System.out.print("학생 수를 입력하세요 : ");
                    studentNum = sc.nextInt();
                    scores = new int[studentNum]; // 점수 배열 생성
                    System.out.println("학생 수가 " + studentNum + "명으로 설정되었습니다.");
                    break;

                case 2:
                    // 점수 입력 받기
                    if (scores == null) {
                        System.out.println("먼저 학생 수를 설정해야 합니다.");
                    } else {
                        for (int i = 0; i < studentNum; i++) {
                            System.out.print((i + 1) + "번 학생의 점수를 입력하세요 : ");
                            scores[i] = sc.nextInt();
                        }
                        System.out.println("점수 입력이 완료되었습니다.");
                    }
                    break;

                case 3:
                    // 점수 리스트 출력
                    if (scores == null) {
                        System.out.println("먼저 학생 수와 점수를 입력해야 합니다.");
                    } else {
                        System.out.println("학생들의 점수 리스트:");
                        for (int i = 0; i < studentNum; i++) {
                            System.out.println((i + 1) + "번 학생: " + scores[i] + "점");
                        }
                    }
                    break;

                case 4:
                    // 분석: 최고 점수 및 평균 점수 계산
                    if (scores == null) {
                        System.out.println("먼저 학생 수와 점수를 입력해야 합니다.");
                    } else {
                        int maxScore = scores[0];  // 최고 점수 초기화
                        int sum = 0;  // 점수 합계
                        for (int i = 0; i < studentNum; i++) {
                            if (scores[i] > maxScore) {
                                maxScore = scores[i];  // 최고 점수 갱신
                            }
                            sum += scores[i];  // 점수 합산
                        }
                        double average = (double) sum / studentNum;  // 평균 계산
                        System.out.println("최고 점수: " + maxScore);
                        System.out.printf("평균 점수: %.2f\n", average);
                    }
                    break;

                case 5:
                    // 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;  // 프로그램 종료

                default:
                    System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
                    break;
            }
        }
    }
}
