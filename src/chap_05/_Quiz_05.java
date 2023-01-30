package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 내 풀이
        int[] size = new int[10];

        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (i * 5);
            System.out.println("사이즈 " + size[i] + " (재고 있음)");
        }

        System.out.println("--------------------------");

        // 모범 답안(강의)
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int Size : sizeArray) {
            System.out.println("사이즈 " + Size + " (재고 있음)");
        }
    }
}
