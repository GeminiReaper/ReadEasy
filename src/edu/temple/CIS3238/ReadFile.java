package edu.temple.CIS3238;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

public class ReadFile {

    public void readtxt() throws FileNotFoundException {

        Scanner s = new Scanner(new File("/Users/Ali/Downloads/Lab1.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()) {
            list.add(s.next());
        }
        s.close();
        for (int i = 0; i < list.size(); i++) {
            
            System.out.print(list.get(i) + " ");
            try {
                Thread.sleep(1000); // we can use the user input here linked with the GUI text field
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void readpdf() {

    }

}
