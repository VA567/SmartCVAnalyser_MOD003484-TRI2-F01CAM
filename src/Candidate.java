//Importing packages
import java.util.ArrayList; //This package is needed to create and use ArrayLists

public class Candidate {
    //Variables
    public String name; //Stores the candidate's full name as a string
    public String email; //Stores the candidate's email as a string
    public String education; //Stores the candidate's education as a string
    public int yearsOfExperience; //Stores the number of years of experience as an integer
    public ArrayList<String> skills; //Stores all the candidate's skills as a list

    public Candidate(String name, String email, String education, int yearsOfExperience, ArrayList<String> skills) {
        this.name = name;
        this.email = email;
        this.education = education;
        this.yearsOfExperience = yearsOfExperience;
        this.skills = skills;
    }

    public void displayInfo(){
        System.out.println("\nCandidate Name: " + name);
        System.out.println("Email Address: " + email);
        System.out.println("Education: " + education);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Skills: " + skills);
    }

}
