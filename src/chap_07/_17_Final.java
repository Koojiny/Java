package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final

        // public (final) class ...
        // public (final) void ...
        // public, private, protected > abstract > static > final > ...

        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈"; // final 때문에 값 변경이 불가능
        actionCam.recordVideo(); // 부모 클래스의 메소드 호출
        actionCam.makeVideo();

        System.out.println("------------------------------------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();
    }
}
