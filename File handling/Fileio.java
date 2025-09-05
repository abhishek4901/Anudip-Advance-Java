/*
 * file handling -- for storing data permanently in  file
 * we read data from file and write into the file 
 *  stream-- flow of data(the is collection of byte)
 * in java have 3 stream
 * 1. input sttream -- System.in
 * 2. output stream-- System.out
 * 3. error --System.err
 *   file handing use package --for input output we used java.oi package
 *  file-- output(by stream) -- java program -- input( by stream) - file(read)
 * flush() -- clean to byte function
 * file ka last  char -1 hota h
 * string ka last  char null hota h
 * 
 *  1 .when we read data from file it is compulsory to present that file.
 *  2. we write the file if file is not present then create a new file and write the data
 *  3. if file is present then overwrite 
 * 
 * Question  1. wap to print total no of character , word , line in a file 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.io.*;


public class Fileio{
        public static void main(String[] args) {
            
try { 
    int ch;
    FileInputStream fis = new FileInputStream("Fileio.java");//file read
    while((ch = fis.read())!= -1){

        // System.out.println(ch);
        System.out.print((char)ch);// for read whole this file data (output whole code of this file)
    }
    fis.close();//you  can use  in finally block
} catch (Exception e) {
    System.out.println(e);
}


}
}