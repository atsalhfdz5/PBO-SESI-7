public class App {
    public static void main(String[] args) {
        Mahasiswa<String> mhs1 = new Mahasiswa<String>("Atsal", "2022");
        Mahasiswa<Integer> mhs2 = new Mahasiswa<Integer>("Atsal", 2022);
        Mahasiswa<Double> mhs3 = new Mahasiswa<Double>("Atsal", 2022.0);

        mhs1.info();
        mhs2.info();
        mhs3.info();

        Concatenation X = new Concatenation();
        X.add(1, "Budi");
        X.add(1, "Budi", "12345");
        X.add(1, "Budi", "12345", "123");
    }
}

