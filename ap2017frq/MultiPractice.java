/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class MultiPractice implements StudyPractice{
    int a,b;
    
    public MultiPractice(int a1, int b1){
        a=a1;
        b=b1;
    }
    
    @Override
    public String getProblem(){
        return a+" TIMES "+b;
    }
    @Override
    public void nextProblem(){
        b++;
    }
}
