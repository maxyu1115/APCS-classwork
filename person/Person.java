/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxhelloworld;

/**
 *
 * @author TheWanderingPath
 */
public class Person {
    private String language;
    private int age=0;
    
    public Person(String language){
        this.language=language;
    }
    
    public void grow(int temp){
        age+=temp;
    }
    
    public void sayhello(){
        if (this.language.equals("English")){
            System.out.println("Hello World!");
        }else{
            System.out.println("Ni Hou");
        }
    }
    
    public int getAge(){
        return age;
    }
}
