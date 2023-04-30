package homework;

public class AdapterSum3NrToSum2Nr {
    private Sum3Nr s3;

    public AdapterSum3NrToSum2Nr(Sum3Nr s3) {
        this.s3 = s3;
    }

    public int sum(int a, int b) {
        return s3.sum(a, b, 0);
    }
}
