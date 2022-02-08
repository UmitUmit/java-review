public class Q11 {



        private int numberBags;
        boolean call;

        public Q11() {
            this(2);
            call = false;
            // Line 2
        }

        public Q11(int numberBags) {
            this.numberBags = numberBags;
        }

        public static void main(String[] args) {

            Q11 seed = new Q11();
            System.out.println(seed.numberBags);

        }

    }

