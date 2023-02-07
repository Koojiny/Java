package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식
        // (전달값1, 전달값2, ...) ->  {코드 정의}
    }

    // 아래 코드를 람다식으로 변경해보자

    // 예제1
//    public void print() {
//        String s = "test";
//        System.out.println(s);
//    }

//    () -> {
//        String s = "test";
//        System.out.println(s);
//    }

    // 예제2
//    public void print(String s) {
//        System.out.println(s);
//    }

//    s -> System.out.println(s)

    // 예제3
//    public int add(int x, int y) {
//        return x + y;
//    }

//    (x, y) -> {return x + y;} // return 이 포함되는 경우 중괄호 무조건 포함
//    (x, y) -> x + y

}
