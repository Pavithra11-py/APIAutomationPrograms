package org.apipractice.Basics;

public class _002_Nodesignpattern {
    public static void main(String[] args) {
        _002_Nodesignpattern np = new _002_Nodesignpattern();
        np.step1();
        np.step2();
        np.step3("Param");

    }

    public void step1() {
        System.out.println("Step1");
    }

    public void step2() {
        System.out.println("Step2");
    }

    public void step3(String param1) {
        System.out.println("Step3 " + param1);
    }

}
