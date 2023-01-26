package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String ex1 = "901231-1234567";
        String ex2 = "030708-4567890";

        System.out.println(ex1.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        System.out.println(ex2.substring(0, 8));

        System.out.println(ex1.substring(0, ex1.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전까지
    }
}
