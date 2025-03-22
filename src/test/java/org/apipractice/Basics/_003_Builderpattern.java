package org.apipractice.Basics;

public class _003_Builderpattern {

    public _003_Builderpattern step1(){
        System.out.println("step1");
        return this;
    }
    public _003_Builderpattern step2(){
        System.out.println("step2");
        return this;
    }

    public _003_Builderpattern step3( String param){
        System.out.println("step3");
        return this;
    }


    // we use the reference and call it one by one
public static void main(String[] args) {

 _003_Builderpattern bp = new _003_Builderpattern();
 bp.step1().step2().step3("pramod");

}
}
