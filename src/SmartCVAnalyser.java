import java.util.ArrayList;

public class SmartCVAnalyser {
    public static void main(String[] args) {
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Java");
        skills.add("Python");
        skills.add("Excel");

        ArrayList<String> requiredSkills = new ArrayList<String>();
        requiredSkills.add("Java");
        requiredSkills.add("Python");
        requiredSkills.add("HTML");

        Candidate c1Test = new Candidate("Victor A", "vicand0502@test.com", "BSc Cyber Sec", 1, skills);

        c1Test.displayInfo();

        JobDescription jd1Test = new JobDescription("Junior Engineer", requiredSkills, 3);

        jd1Test.displayJob();
    }
}
