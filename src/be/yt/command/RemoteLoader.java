package be.yt.command;

/**
 * User: Yves-T
 * Date: 20/11/12
 * Time: 9:12
 */
// this class is the client in the command pattern
public class RemoteLoader {
    public static void main(String[] args) {
        // init remote control (THE INVOKER)
        RemoteControl remoteControl = new RemoteControl();

        // setup objects to control the receivers
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("living room");

        // setup commands to control the receivers
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        // load the commands in the remote
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        // let's push some buttons
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWashPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWashPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWashPushed(2);
    }
}
