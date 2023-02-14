package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류의 종류
        // 1) 컴파일 오류 :코드에 문제가 있어 실행조차 안되는 오류
        // int i = "문자열";
        // 2) 런타임 오류 (에러 error, 예외 exception) : 컴파일은 되지만 실행하는 과정에서 문제가 발생하는 오류
        // int[] arr = new int[3];
        // arr[5] = 100;

        try {
            // System.out.println(3 / 0);

            // int[] arr = new int[3];
            // arr[5] = 100;

            Object obj = "test";
            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("이런 에러가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
