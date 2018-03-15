/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxcourses;

/**
 *
 * @author TheWanderingPath
 */
public class Assessment {
    private String AssessmentTitle;
    private int maxMarks;

    public Assessment(String AssessmentTitle, int maxMarks) {
        this.AssessmentTitle = AssessmentTitle;
        this.maxMarks = maxMarks;
    }

    public void outputAssessmentDetails() {
        System.out.println("Assesment{" + "AssessmentTitle=" + AssessmentTitle + ", maxMarks=" + maxMarks + '}');
    }
    
    
}
