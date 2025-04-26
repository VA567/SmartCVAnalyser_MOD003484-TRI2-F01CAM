//Importing Packages
import java.io.SyncFailedException;
import java.util.ArrayList; //This package is required to use and create ArrayLists
import java.util.Scanner; //This package is required to get user input and store it as a variable
import java.io.IOException; //Required for catching errors

public class SmartCVAnalyser {
    public static void main(String[] args) {
        //Variables
        int yearsOfExperience;

        Scanner readUserInput = new Scanner(System.in); //Create scanner object

        System.out.println("Enter file path"); //Prompt the user
        String filePath = readUserInput.nextLine(); //Gets file path from user and stores it as a string
        String candidateFileContent = FileParser.readTxtFile(filePath); //Uses the file parser read txt file method that will find the file with the file path and read it

        String[] lines = candidateFileContent.split("\n"); //Splits the file so each line can be read separately

        //This will be replaced with the text parser
        //Stores the skills the candidate has
        ArrayList<String> candidateSkills = new ArrayList<>();

        for (int i = 4; i < lines.length; i++) {
            candidateSkills.add(lines[i]);
        }

        //Stores the skills required for the job
        ArrayList<String> jobSkills = new ArrayList<>();
        jobSkills.add("Java");
        jobSkills.add("Python");
        jobSkills.add("HTML");

        yearsOfExperience = Integer.parseInt(lines[3]); //Cast the data type of the variable from a string to an integer

        //Creates Candidate object
        Candidate c1Test = new Candidate(lines[0], lines[1], lines[2], yearsOfExperience, candidateSkills);

        //Creates JobDescription object
        JobDescription jd1Test = new JobDescription("Junior Engineer", jobSkills, 3); //This can be changed

        //Calculates Score
        int matchScore = CVChecker.calculateMatchScore(c1Test, jd1Test); //Calculates candidate's score by comparing it with the job requirements, this is store as an integer
        int maxScore = (jd1Test.requiredSkills.size() * 10) + 10; //Calculates and stores the maximum score as an integer

        //Printing the results
        System.out.println("---- Candidate File Contents ----");
        System.out.println(candidateFileContent);

        System.out.println("\n--- Candidate Information ---");
        c1Test.displayInfo();

        System.out.println("\n--- Job Description ---");
        jd1Test.displayJob();

        System.out.println("\n--- Match Score Results ---");
        System.out.println("Candidate Match Score: " + matchScore + " /" + maxScore);
    }
}
