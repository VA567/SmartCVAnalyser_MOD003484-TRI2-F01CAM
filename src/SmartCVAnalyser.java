//Importing Packages
import java.util.ArrayList; //This package is required to use and create ArrayLists

public class SmartCVAnalyser {
    public static void main(String[] args) {

        String filePath = "scr/candidate_data.txt"; //The file path
        String candidateFileContent = FileParser.readTxtFile(filePath); //Uses the file parser read txt file method that will find the file with the file path and read it

        //This will be replaced with the text parser
        //Stores the skills the candidate has
        ArrayList<String> candidateSkills = new ArrayList<>();
        candidateSkills.add("Java");
        candidateSkills.add("Python");
        candidateSkills.add("SQL");

        //Stores the skills required for the job
        ArrayList<String> jobSkills = new ArrayList<>();
        jobSkills.add("Java");
        jobSkills.add("Python");
        jobSkills.add("HTML");

        //Creates Candidate object
        Candidate c1Test = new Candidate("Victor A", "vicand0502@test.com", "BSc Cyber Sec", 1, candidateSkills);

        //Creates JobDescription object
        JobDescription jd1Test = new JobDescription("Junior Engineer", jobSkills, 3);

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
