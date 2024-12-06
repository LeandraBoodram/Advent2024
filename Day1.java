import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("Day1Input.txt");
        System.out.println(fileData);
        ArrayList<String> one = new ArrayList<String>();
        ArrayList<String> two = new ArrayList<String>();
        int i = 0;
        System.out.println(fileData.get(i).length());
        while (i != fileData.size()){
            for (int j = 0; j != fileData.get(i).length(); j++){
                if (fileData.get(i).charAt(j) == ' '){
                    System.out.println(fileData.get(i).substring(0,j));
                    one.add(i, fileData.get(i).substring(0, j));
                    System.out.println(one);
                    i++;
                    j--;
                    System.out.println(j);

                }
               // if (fileData.get(i).charAt(j + 1) == ' '){
                    //two.add(fileData.get(i).substring(j, ));
                    // System.out.println(one);
               // }
                //

            }
            }

           // }
        //}

    }

//for (int j = 0; j < fileData.get(i).length() -1; j++){
//                System.out.println("i: " + fileData.get(i) + " j: " + fileData.get(j));
//            }

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}