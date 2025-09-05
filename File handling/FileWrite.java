import java.io.*;   

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("myfile.text");
            String str = " if  pahle se kuchh is file me rha hoaga  to ye sab delete krkeye likh degaa Hello, welcome to file handling in Java .";
            byte[] b = str.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Data written to file successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
