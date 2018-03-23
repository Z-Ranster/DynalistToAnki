/**
  * The purpose of this program is to take documents from Dynalist
  * and make AnkiCards in bulk.
  * @version 0.0
  * @author Zak Olech
  **/

import java.util.*;
import java.awt.*;
import java.io;

/*
- Todo:
- Add javadoc to file
*/

public class DynalistToAnki{
  /**
    * @param version The version of the program.
    **/
  public static final double version = 0.0;

  /**
    * Main method
    * @param args An array of incoming string.
    **/
  public static void main(String[] args){
    Scanner terminal = new Scanner(System.in);
    Scanner inputFile;
    String[] desktopLocation = System.getProperty("user.home") + "/Desktop";

    System.out.printf("Welcome to DynalistToAnki V%f .\n",version);

    if(loadFile()){

    }
    if(!createFolder(desktopLocation, inputFile.getName?){
        /*
        Error handeling to say that the folder could not be created and the program should exit
        */
    }
    lookForData();
    createCSV();
    shutdownProgram();
  }

  public static boolean loadFile(){
    System.out.println("Please enter the name of the file you
                        would like to load: (dynalistDocument.html))");
    System.out.println("Please note that this file must be located on you desktop.")

    String inputFile = terminal.nextString();
    while(){

    }

    return inputFile;
  }

  /**
    * A method used to create a folder on the users desktop.
    * @param desktopLocation A string that contains the useres desktop location.
    * @param folderName A string that contains the name of the folder to be created.
    **/
  public static boolean createFolder(String[] desktopLocation, String[] folderName){
    String[] folderPath = desktopLocation + "\\" + folderName;
    File dir = new File(folderPath);

    return dir.mkdir();
  }

  public static void lookForData(){

  }

  public static void createCSV() {

  }

  public static void shutdownProgram() {

  }
}

/**
  * The object template used to store card data in.
  **/
public class cardTemplate{
  public String[] tags, question, answer, memoryLink, context;
}
