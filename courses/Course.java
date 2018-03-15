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
public class Course {
    private String courseTitle;
    private int maxStudents;
    private int numberOfLessons;
    private Lesson[] courseLesson;
    private int i=0;
    
    private Assessment courseAssessment;
    

    public Course(String courseTitle, int maxStudents, int numberOfLessons) {
        this.courseTitle = courseTitle;
        this.maxStudents = maxStudents;
        this.numberOfLessons = numberOfLessons;
        
        
        courseLesson=new Lesson[numberOfLessons];
    }
    
    public void addCourse(String lessonTitle, int durationMinutes, boolean requiresLab){
        courseLesson[i]=new Lesson(lessonTitle, durationMinutes, requiresLab);
        i++;
    }
    
    public void addAssessment(String AssessmentTitle, int maxMarks){
        courseAssessment=new Assessment(AssessmentTitle,maxMarks);
    }
    
    public void outputCourseDetail(){
        for (int j=0;j<i;j++){
            courseLesson[j].outputLessonDetails();
        }
        courseAssessment.outputAssessmentDetails();
    }
    
    
    
    
    
}
