package com.example.ahmed.jumbleapp;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
//import javax.swing.JOptionPane;

/**
 * The dictionary, which is the model of this app.
 *
 * @author Franck van Breugel
 */
public class Dictionary
{
    private String word;
    private String secondword="htis";
    private String realshit;
    private ArrayList<String> list = new ArrayList<String>();
    /**
     * Initializes this dictionary from the given stream.  Each line of the file contains a
     * single word.
     *
     * @param stream stream from which a file containing the words of this dictionary can be read.
     */

                    public Dictionary(InputStream stream)
    {
        Scanner input = new Scanner(stream);

        while (input.hasNextLine())
        {
            this.word = input.nextLine();
           this.list.add(this.word);
        }input.close();
    }


    /**
     * Returns the list of words that are unscramblings of the given word.
     *
     * @param word word to be unscrambled.
     * @return list of words that are unscramblings of the given word.
     */
    public List<String> getUnscramblings(String word)
    {
        ArrayList<String> mylist = new ArrayList<String>();
        for(String x :this.list)
        {
            char[] first = word.toCharArray();
            char[] second = x.toCharArray();
         	Arrays.sort(first);
         	Arrays.sort(second);
         	if( Arrays.equals(first, second)==true)
            {
         	    mylist.add(x);
         	}
        }
        return mylist;//new ArrayList<String>();
    }
}