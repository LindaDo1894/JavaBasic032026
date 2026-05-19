package StaticJava;

public class Counter1 {


        int count = 0; // sẽ lấy bộ nhớ khi instance được tạo ra. Bộ nhớ sẽ đk reset lại chứ k cộng dồn.

        Counter1() {
            count++;
            System.out.println(count);
        }


        public static void main(String args[]) {

            Counter1 c1 = new Counter1();
            Counter1 c2 = new Counter1();
            Counter1 c3 = new Counter1();

        }

}
