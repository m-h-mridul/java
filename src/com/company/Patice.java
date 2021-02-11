package com.company;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patice {
        public static void main(String []argh){

                    String text    =
                            "This is the text to be searched " +
                                    "for occurrences of the http:// pattern.";

                    String patternString = "This is the";

                    Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
                    Matcher matcher = pattern.matcher(text);

                    System.out.println("lookingAt = " + matcher.lookingAt());
                    System.out.println("matches   = " + matcher.matches());
                }

        }

