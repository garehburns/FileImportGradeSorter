package fileimportgradesorter;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileImportGradeSorter {
    public static void main(String[] args) throws IOException {
        
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;
        int group5 = 0;
        int group6 = 0;
        int group7 = 0;
        int group8 = 0;
        
        Scanner file = new Scanner(Paths.get("input.txt"), "UTF-8");
        
        int n = file.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = file.nextInt();
            
            if (num <= 24)
                group1++;
            else if (num <= 49)
                group2++;
            else if (num <= 74)
                group3++;
            else if (num <= 99)
                group4++;
            else if (num <= 124)
                group5++;
            else if (num <= 149)
                group6++;
            else if (num <= 174)
                group7++;
            else if (num <= 200)
                group8++;
        }
        
        System.out.println("[0 - 24]: " + group1);
        System.out.println("[25 - 49]: " + group2);
        System.out.println("[50 - 74]: " + group3);
        System.out.println("[75 - 99]: " + group4);
        System.out.println("[100 - 124]: " + group5);
        System.out.println("[125 - 149]: " + group6);
        System.out.println("[150 - 174]: " + group7);
        System.out.println("[175 - 200]: " + group8);
        
    }
}
