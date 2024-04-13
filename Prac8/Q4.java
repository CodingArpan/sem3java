import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file path: ");
        String src = sc.nextLine();
        System.out.println("Enter location file path: ");
        String targ = sc.nextLine();
        File f1 = new File(src);
        File f2 = new File(targ);

        FileInputStream fin = new FileInputStream(f1);
        FileOutputStream fout = new FileOutputStream(f2);
        try {
            int i = 0;
            while ((i = fin.read()) != -1) {
                fout.write((char) i);
                System.out.print((char) i);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error!");
        } finally {
            if (fin != null)
                fin.close();
            if (fout != null)
                fout.close();
            System.out.println("File copied successfully!");
        }
    }
}
