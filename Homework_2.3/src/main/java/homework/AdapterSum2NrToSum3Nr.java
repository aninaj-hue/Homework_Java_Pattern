package homework;

    public class AdapterSum2NrToSum3Nr {
        private Sum2Nr s2;

        public AdapterSum2NrToSum3Nr(Sum2Nr s2) {
            this.s2 = s2;
        }

        public int sum(int a, int b, int c) {
            return s2.sum(a, b) + s2.sum(c, 0);
        }
}
