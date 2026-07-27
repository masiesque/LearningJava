package br.com.masiesque.UinnerClass.Test;

public class InnerClassTest01 {

    private String name = "Kobe Bryant";

    class  Inner {

        public void printOutThere()
        {
            System.out.println("name:"+name);
        }
    }


    public static void main(String[] args) {

        InnerClassTest01 innerClassTest01 = new InnerClassTest01();
        InnerClassTest01.Inner inner = innerClassTest01.new Inner();
        inner.printOutThere();
    }
}
