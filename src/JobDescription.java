//Importing Packages
import java.util.ArrayList; //This package is required to use and create ArrayLists

public class JobDescription {
    //Variables
    public String jobTitle; //Stores job title as a String
    public ArrayList<String> requiredSkills; //Stores the required skills as an ArrayList
    public int requiredExperienceYears; //Stores the number of years of experience as an Integer

    //Creates a JobDescription object with the job title, required skills and the minimum number of years of experience
    public JobDescription(String jobTitle, ArrayList<String> requiredSkills, int requiredExperienceYears) {
        this.jobTitle = jobTitle;
        this.requiredSkills = requiredSkills;
        this.requiredExperienceYears = requiredExperienceYears;
    }

    //Prints the job description information
    public void displayJob() {
        System.out.println("\nJob Title: " + jobTitle);
        System.out.println("Required Skills: "+ requiredSkills);
        System.out.println("Minimum Experience: " + requiredExperienceYears);
    }



}
