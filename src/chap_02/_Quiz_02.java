package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 내 답안
        int a = 115;
        int b = 121;

        String answer1 = (a >= 120) ? ("키가 " + b + "cm 이므로 탑승 가능합니다") : ("키가 " + a + "cm 이므로 탑승 불가능합니다");
        System.out.println(answer1);

        String answer2 = (b >= 120) ? ("키가 " + b + "cm 이므로 탑승 가능합니다") : ("키가 " + a + "cm 이므로 탑승 불가능합니다");
        System.out.println(answer2);

        // 모범 답안
        int height = 120;
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result);
    }
}
