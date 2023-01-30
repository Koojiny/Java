package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 내 풀이
        int fee = 0;
        int money = 4000;
        int hour = 5;
        String car = "일반";

        for (int i = 0; i < hour; i++) {
            fee += money;
        }
        if (fee > 30000) {
            fee = 30000;
        }
        if (car == "경차" || car == "장애인") {
            fee = fee / 2;
        }
        System.out.println("주차 요금은 " + fee + " 원입니다.");

        // 모범 답안(강의)
//        int hour = 10; // 주차 시간
//        boolean isSmallCar = false; // 경차 여부
//        boolean withDisabledPerson = true; // 장애인 차량 여부
//
//        int fee = hour * 4000; // 주차 정산 요금 (시간당 4000 원 곱하기)
//
//        // 30000원 초과 시 일일 최대 요금으로 수정
//        if (fee > 30000) {
//            fee = 30000; // 일일 최대 요금 적용
//        }
//
//        // 경차 또는 장애인 차량인 경우 50% 할인
//        if (isSmallCar || withDisabledPerson) {
//            fee /= 2; // 50% 할인 적용
//        }
//
//        // 실행 결과 출력
//        System.out.println("주차 요금은 " + fee + " 원입니다.");
    }
}
