package be.yt.command;

/**
 * User: Yves-T
 * Date: 20/11/12
 * Time: 10:16
 */
public class RemoteLoaderWithUndo {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWashPushed(0);
        System.out.println(remoteControl);

        System.out.println("Pushing undo....\n");
        remoteControl.undoButtonWashPushed();

        remoteControl.offButtonWashPushed(0);
        remoteControl.onButtonWasPushed(0);

        System.out.println(remoteControl);

        System.out.println("Pushing undo....\n");
        remoteControl.undoButtonWashPushed();
    }
}
