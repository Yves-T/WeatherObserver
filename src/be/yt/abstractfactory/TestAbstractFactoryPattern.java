package be.yt.abstractfactory;


import javafx.application.Platform;

import java.util.Map;
import java.util.Set;

/**
 * User: Yves-T
 * Date: 18/11/12
 * Time: 15:04
 */
public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        GUIBuilder guiBuilder = new GUIBuilder();
        AbstractWidgetFactory widgetFactory = null;

        // check what platform we're on
        ProcessBuilder processBuilder = new ProcessBuilder();
        Map<String, String> enviromentMap = processBuilder.environment();

        if (enviromentMap.get("OS").toLowerCase().contains("windows")) {
            widgetFactory = new MsWindowWidgetFactory();
        } else {
            widgetFactory = new MacOsXWindowWidgetFactory();
        }
        guiBuilder.buildWindow(widgetFactory);
    }
}
