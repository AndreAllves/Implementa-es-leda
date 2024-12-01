public class MdcRecursivo {
    public static void main(String[] args) {
        System.out.println(mdcRecursivo(20, 15));
    }

    private static int mdcRecursivo(int a, int b){
        if(b == 0)
            return a;
    return mdcRecursivo(b, a % b);
    }
}