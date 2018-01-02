
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class AP_1 {

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i] == scores[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i]) {
                return false;
            }
        }
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        int temp1 = 0;
        int temp2 = 0;

        for (int i = 0; i < scores.length / 2; i++) {
            temp1 += scores[i];
            temp2 += scores[scores.length / 2];
        }
        temp1 = temp1 / (scores.length / 2);
        temp2 = temp2 / (scores.length / 2);
        if (temp1 > temp2) {
            return temp1;
        }
        return temp2;
    }
    
    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) { //!#@$%!#%!@#$!#@$
                count++;
            }
        }
        return count;
    }

public String[] wordsFront(String[] words, int n) {
  String[] ans=new String[n];
  for (int i=0;i<n;i++){
    ans[i]=words[i];
  }
  return ans;
}

public List wordsWithoutList(String[] words, int len) {
  List<String> ans=new ArrayList<String>();
  for (int i=0;i<words.length;i++){
    if (words[i].length() != len) {  
      ans.add(words[i]);
    }
  }
  return ans;
}


}
