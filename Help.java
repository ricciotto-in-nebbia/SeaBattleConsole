public class Help {
    public static void main(String[] args) { //проверяем рандом на разнообразие
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = (int) (Math.random()*8);
        }
        int[] stat = new int[10];
        for (int i = 0; i < 100; i++) {
            stat[a[i]] += 1;
        }
        for (int i = 0; i < stat.length; i++) {
            System.out.println(i + " -- " + stat[i]);
        }
    }
}
