package com.stardust.giacplugin;

/**
 * Created by Stardust on 2016/7/23.
 */
public class Computer {

    public static String calculate(String expression) {
        return org.giac.calculator.calc.Computer.compute(expression);
    }

    public static String calculateForGraph(String expression) {
        return org.giac.calculator.calc.Computer.computeForGraph(expression);
    }

    public static String getGraph() {
        return org.giac.calculator.calc.Computer.getGraph();
    }

    public static String computeTex(String expression) {
        return org.giac.calculator.calc.Computer.computeTex(expression);
    }

    public static String parseTex(String expression) {
        return org.giac.calculator.calc.Computer.parseTex(expression);
    }
}
