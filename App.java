public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa<Integer> mhs1 = new Mahasiswa<Integer>("Tama", 20220);
        Mahasiswa<String> mhs2 = new Mahasiswa<String>("Tama", "20220");
        Mahasiswa<Double> mhs3 = new Mahasiswa<Double>("Tama", 20220.0);
        
        mhs1.info();
        mhs2.info();
        mhs3.info();

        System.out.println("=====================");
        Concatenation X = new Concatenation();
        X.add(1, "Jorge");
        X.add(2, "Jorge", "Lorenzo");
        System.out.println("=====================");

        System.out.println("\n=====================");
        Iteratorr list = new Iteratorr();
        list.getName();
        System.out.println("=====================");

        System.out.println("\n=====================");
        CheckCollection Name = new CheckCollection();
        Name.getInfo();
        System.out.println("=====================");

        System.out.println("\n=====================");
        Daftar ListName = new Daftar();
        ListName.getInfo();
        System.out.println("=====================");

        System.out.println("\n=====================");
        HasSet HashSet = new HasSet();
        HashSet.getInfo();
        System.out.println("=====================");

        System.out.println("\n=====================");
        LinkedHasSet Linked = new LinkedHasSet();
        Linked.getInfo();
        System.out.println("=====================");

    }
}