/*
File names and extensions. Write a program that prompts the user for
the drive letter ( C ), the path ( \Windows\System ), the file name ( Readme ),
and the extension ( txt ). Then print the complete file name C:\Windows\System\Readme.txt.
(If you use UNIX or a Macintosh, skip the drive name
and use / instead of \ to separate directories.)
*/

import java.util.Scanner;

public class P2_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter drive letter: ");
        String driveLetter = in.nextLine();
        System.out.print("Please enter the path: ");
        String path = in.nextLine();
        System.out.print("Please enter the file name: ");
        String filename = in.nextLine();
        System.out.print("Please the extension: ");
        String extension = in.nextLine();

        String wholeFilename = driveLetter + ":" + path + "\\" + filename + "." + extension;
        System.out.println("Completed filename is: " + wholeFilename);
        in.close();
    }
}