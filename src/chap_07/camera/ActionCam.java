package chap_07.camera;

public class ActionCam extends Camera {
    public final String lens; //= "광각렌즈"; // 첫 번째 방법
//    public final String lens = "광각렌즈"; //  두 번째 방법
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public final void makeVideo() {
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
