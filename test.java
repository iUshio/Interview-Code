
public class test {
    // 现有一个可以生成 [0, 4] 随机整数的函数，如何用它得到一个可以生成 [0, 6] 随机整数的函数
    public static void main(String[] args) {
        int[] result = new int[7];
        for (int i = 0; i < 50000; i++) {
            int r = rand6();
            result[r]++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("num:" + i + " times: " + result[i]);
        }
    }

    public static int rand4() {
        // 大于等于 0.0 且小于 1.0
        double rand = Math.random() * 5;
        return (int) rand;
    }

    public static int rand6() {
        int result = rand4() * 5 + rand4();

        while (result > 20) {
            result = rand4() * 5 + rand4();
        }
        return result / 3;
    }
}