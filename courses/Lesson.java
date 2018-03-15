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
public class Lesson {
    private String lessonTitle;
    private int durationMinutes;
    private boolean requiresLab;
    
    public Lesson(String l, int dm, boolean rl){
        lessonTitle=l;
        durationMinutes=dm;
        requiresLab=rl;
    }
    
    public void outputLessonDetails(){
        System.out.println(lessonTitle+": Duration Minutes:"+durationMinutes+" and needs lab:"+requiresLab);
    }
}
