package org.example;
import org.json.simple.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class C2toC1Adapter {

    private double nr1, nr2 = 0;

    public C2toC1Adapter(String jsonString) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        JSONObject x = gson.fromJson(jsonString, JSONObject.class);
        this.nr1 = (double) x.get("nr1");
        this.nr2 = (double) x.get("nr2");

    }

    public void setNr1(double n1) {
        this.nr1 = nr1;
    }

    public void setNr2(double n2) {
        this.nr2 = nr2;
    }

    public double sum() {

        return C1.getSum(this.nr1, this.nr2);
    }
}
