import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("Day2Input.txt");
        ArrayList<String[]> grid = new ArrayList<>();
        for (int i = 0; i < fileData.size(); i++){
            grid.add(i, fileData.get(i).split(" "));
            System.out.println(Arrays.toString(grid.get(i)));
            boolean increase = isIncreasing(grid.get(i));
            System.out.println(increase);
            boolean decrease = isDecrease(grid.get(i));
            System.out.println(decrease);
            int difference = checkDifference(grid.get(i));
            System.out.println(difference);
//            for (int j = 0; j < (grid.get(i).length); j++){
//                int firstVal = Integer.parseInt(grid.get(i)[j]);
//                if (j++ < (grid.get(i).length - 1)) {
//                    int secondVal = Integer.parseInt(grid.get(i)[j + 1]);
//                    System.out.println(firstVal);
//                    System.out.println(secondVal);
//                }
//                //if ()
//            }
        }
    }

    public static boolean isIncreasing(String[] numbers) {
        if (Integer.parseInt(numbers[0]) < Integer.parseInt(numbers[1])){
            return true;
        }
        return false;
    }

    public static boolean isDecrease(String[] numbers) {
        if (Integer.parseInt(numbers[0]) > Integer.parseInt(numbers[1])){
            return true;
        }
        return false;
    }

    public static int checkDifference(String[] numbers) {
        if (isIncreasing(numbers)){
            for (int i = 0; i < numbers.length; i++){
                System.out.println(numbers[i]);
                while (i + )
                    if ((Integer.parseInt(numbers[i + 1]) - Integer.parseInt(numbers[i]) <= 2)){
                        System.out.println("safe");
                    }
            }
        }
        return 0;
    }


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
