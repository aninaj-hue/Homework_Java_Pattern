package org.example;

public class Main {

    public static void main(String[] args) {

        C2 c2 = new C2("{\"nr1\":50 ,\"nr2\":95}");
        String jsonString = c2.getJsonString();
        C2toC1Adapter c2toc1adapter = new C2toC1Adapter(jsonString);
        System.out.println(c2toc1adapter.sum());
    }

}