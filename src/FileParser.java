//Importing Packages
import java.io.*;
//Packages needed for reading Docx files
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.util.List;
//Packages needed for reading PDF files
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.IOException;
import org.apache.pdfbox.Loader;

public class FileParser {
    //File reading method
    public static String readTxtFile(String filePath) {
        StringBuilder content = new StringBuilder(); //Faster strings

        //Tries to read the file with BufferedReader to read it faster
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line; //Creates an empty string, this variable will temporarily store each line from the file

            //reads one line at a time
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n"); //adds a new line character at the end to improve readability
            }
        }

        //Catches the errors
        catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage()); //Prints an error message
        }

        return content.toString(); //Converts the StringBuilder into a string and sends it back to the origin
    }

    public static String readDocxFile(String filePath){
        StringBuilder content = new StringBuilder();

        try (FileInputStream fis = new FileInputStream(filePath);
             XWPFDocument document = new XWPFDocument(fis)) {

            List<XWPFParagraph> paragraphs = document.getParagraphs();
            for (XWPFParagraph para : paragraphs) {
                content.append(para.getText()).append("\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the DOCX file: " + e.getMessage());
        }

        return content.toString();
    }

    public static String readPdfFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try (PDDocument document = Loader.loadPDF(new File(filePath))){
            PDFTextStripper pdfStripper = new PDFTextStripper();
            content.append(pdfStripper.getText(document));
        } catch (Exception e) {
            System.out.println("An error occurred while reading the PDF file: " + e.getMessage());
        }

        return content.toString();
    }
}