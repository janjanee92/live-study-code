import com.jihan.javastudycode.week7.PackageTest;

public class UnnamedPackage {
    public static void main(String[] args) {
        System.out.println("Unnamed package");
        UnnamedPackage2 un2 = new UnnamedPackage2();    // default package
        PackageTest pt = new PackageTest();             // com.jihan.javastudycode.week7 package
    }
}
