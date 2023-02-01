package chap_07;

public class BlackBox {
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 번호

    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 ++ 연산을 통해서 값을 증가)
    static boolean canAutoReport = false; // 자동 신고 기능

    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
        this(); // 기본 생성자 호출 후 진행하게 함

        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    // 자동 신고 기능 메소드를 만들어보자
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        } else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10; // 전체 영상 갯수
    }

    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위 (분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() { // 인스턴 메소드 : 객체가 만들어져야 객체로 접근할 수 있는 메소드, 각 객체마다 서로 다른 동작을 하게 된다
        record(true, true, 5);
    }

    static void callServiceCenter() { // 클래스 메소드 : static 키워드가 붙음. 객체가 만들어지지 않고도 (클래스이름.메소드이름) 으로 바로 접근이 가능하다
//        modelName = "test"; // 인스턴스 변수는 객체가 만들어져야 만들어지는 인스턴스 변수이기 때문에 static class method 내에서는 직접 접근이 불가
        canAutoReport = false;
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }
}
