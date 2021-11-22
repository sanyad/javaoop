package Abstract.work_one;

public class Main {
    public static void main(String[] args) {
        Document doc = new BaseDocument();
        System.out.println();
        Document pro = new BaseDocument("pro");
        System.out.println();
        Document exp = new BaseDocument("exp");
    }
}
