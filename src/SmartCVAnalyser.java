/*
SID: 2404938
Team Name: Diverse Pen Testers
 */

//Importing Packages
import java.util.ArrayList; //This package is required to use and create ArrayLists
import java.util.Scanner; //This package is required to get user input and store it as a variable

public class SmartCVAnalyser {
    public static void main(String[] args) {
        //Variables
        int yearsOfExperience;
        Scanner readUserInput = new Scanner(System.in); //Create scanner object
        String[] lines = null;
        String candidateFileContent = "";

        System.out.println("Enter file path"); //Prompt the user
        String filePath = readUserInput.nextLine(); //Gets file path from user and stores it as a string

        //Detects if the file path ends with .txt
        if (filePath.endsWith(".txt")) {
            candidateFileContent = FileParser.readTxtFile(filePath);//Uses the file parser to read txt file
            candidateFileContent = candidateFileContent.replaceAll("(?m)^[ \t]*\r?\n", ""); //
            lines = candidateFileContent.split("\n"); //Splits the file so each line can be read separately
        }

        else if (filePath.endsWith(".docx")) {
            candidateFileContent = FileParser.readDocxFile(filePath); //Uses the file parser to read the docx file
            candidateFileContent = candidateFileContent.replaceAll("(?m)^[ \t]*\r?\n", "");
            lines = candidateFileContent.split("\n");
        }

        else if (filePath.endsWith(".pdf")) {
            candidateFileContent = FileParser.readPdfFile(filePath);
            candidateFileContent = candidateFileContent.replaceAll("(?m)^[ \t]*\r?\n", "");
            lines = candidateFileContent.split("\n");
        }
        else {
            System.out.println("\n- File extension not accepted. Only pdf, docx and txt is supported\n");
        }

        System.out.println("Enter the job title");
        String jobTitle = readUserInput.nextLine();

        //Stores the skills the candidate has
        ArrayList<String> candidateSkills = new ArrayList<>();

        for (int i = 4; i < lines.length; i++) {
            candidateSkills.add(lines[i].toLowerCase());
        }

        //Stores the skills required for the job
        System.out.println("Enter the number of skills");
        String numberOfSkills = readUserInput.nextLine();

        int numberOfSkillsInt = Integer.parseInt(numberOfSkills);

        ArrayList<String> jobSkills = new ArrayList<>();

        for (int i = 0; i < numberOfSkillsInt; i++) {
            System.out.println("Enter the skill " + (i + 1));
            String jobSkill1 = readUserInput.nextLine();
            jobSkills.add(jobSkill1.toLowerCase());
        }

        System.out.println("Enter the minimum years of experience");
        String experienceRequired = readUserInput.nextLine(); //gets the user's input for the number of years of experience required
        int experienceRequiredInt = Integer.parseInt(experienceRequired); //Casts the data type from string to integer

        yearsOfExperience = Integer.parseInt(lines[3].trim()); //Cast the data type of the variable from a string to an integer, trim removes hidden characters, like spaces, from the beginning and end of the string

        //Creates Candidate object
        Candidate c1Test = new Candidate(lines[0], lines[1], lines[2], yearsOfExperience, candidateSkills);

        //Creates JobDescription object
        JobDescription jd1Test = new JobDescription(jobTitle.toLowerCase(), jobSkills, experienceRequiredInt);

        //Calculates Score
        int matchScore = CVChecker.calculateMatchScore(c1Test, jd1Test); //Calculates candidate's score by comparing it with the job requirements, this is store as an integer
        int maxScore = (jd1Test.requiredSkills.size() * 10) + 10; //Calculates and stores the maximum score as an integer

        //Printing the results
        System.out.println("\n--- Candidate Information ---");
        c1Test.displayInfo();

        System.out.println("\n--- Job Description ---");
        jd1Test.displayJob();

        System.out.println("\n--- Match Score Results ---");
        System.out.println("Candidate Match Score: " + matchScore + " /" + maxScore);
    }
}
