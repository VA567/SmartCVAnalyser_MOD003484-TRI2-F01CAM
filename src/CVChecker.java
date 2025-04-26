public class CVChecker {
    //Calculates a score based on how well the candidate matches the job description
    public static int calculateMatchScore(Candidate candidate, JobDescription job){
        //Variables
        int score = 0; //Stores the raw score as an integer

        //Calculates the score for the skills
        for (String requiredSkill : job.requiredSkills) {
            if (candidate.skills.contains(requiredSkill)) {
                score += 10;
            }
        }

        //Calculates score for the experience
        if (candidate.yearsOfExperience >= job.requiredExperienceYears) {
            score += 10;
        }

        return score;
    }
}
