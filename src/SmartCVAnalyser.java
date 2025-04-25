import java.util.ArrayList;

public class SmartCVAnalyser {
    public static void main(String[] args) {
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Java");
        skills.add("Python");
        skills.add("Excel");

        Candidate c1Test = new Candidate("Victor A", "vicand0502@test.com", "BSc Cyber Sec", 1, skills);

        c1Test.displayInfo();
    }
}
