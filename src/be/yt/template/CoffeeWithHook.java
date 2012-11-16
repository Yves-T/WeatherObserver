package be.yt.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: Yves-T
 * Date: 16/11/12
 * Time: 11:52
 */
public class CoffeeWithHook extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee trough filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) return true;
        else return false;
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO Error trying to read your answer");
        }
        if (answer == null) {
            return "No";
        }
        return answer;
    }
}
