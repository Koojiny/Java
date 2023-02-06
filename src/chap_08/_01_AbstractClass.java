package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction) : 몰라도 되는 상세 부분은 숨기고 꼭 필요한 부분만 공개
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스) : 객체 생성 불가 (모호한 상태로는 객체를 만들 수 없다)
        // 추상 메소드 (추상 클래스 또는 인터페이스에서 사용 가능한, 껍데기만 있는 메소드)

        // Camera camera = new Camera(); // 추상 클래스이므로 객체 생성 불가능
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

        // 다형성에 의해 부모 클래스로 객체 생성해도 기능은 동일하게 진행
        Camera factoryCam1 = new FactoryCam();
        factoryCam1.showMainFeature();

        Camera speedCam1 = new SpeedCam();
        speedCam1.showMainFeature();
    }
}
