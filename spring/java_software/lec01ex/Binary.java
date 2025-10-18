public class Binary {
    public static void main(String[] args) {
        int binary = 111514;
        String buffer = "";
        for (int i=binary; i>0; i/=2) {
            buffer = (i%2) + buffer;
        }
        System.out.println(buffer);
    }
}
