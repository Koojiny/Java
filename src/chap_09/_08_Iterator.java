package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>(); // 다형성에 의해 객체 생성 가능
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println("---------------------");
        iterator = list.iterator(); // 커서를 처음 위치로 이동
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------------");

        // (알 수 없음)을 삭제해보자
        iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.contains("(알 수 없음)")) {
                iterator.remove(); // 삭제
            }
        }

        iterator = list.iterator(); // 커서를 처음 위치로 이동
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("---------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map.iterator(); // 제공되지 않음
        Iterator<String> iterMapKey = map.keySet().iterator();
        while (iterMapKey.hasNext()) {
            System.out.println(iterMapKey.next());
        }
        System.out.println("---------------------");

        Iterator<Integer> iterMapValue = map.values().iterator();
        while (iterMapValue.hasNext()) {
            System.out.println(iterMapValue.next());
        }
        System.out.println("---------------------");

        // key & value 함께 출력
        Iterator<Map.Entry<String, Integer>> iterMap = map.entrySet().iterator();
        while (iterMap.hasNext()) {
            System.out.println(iterMap.next());
        }
    }
}
