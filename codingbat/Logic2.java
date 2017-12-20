/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        if (small >= goal % 5 && (big * 5 + small) >= goal) {
            return true;
        }
        return false;
    }
    
    public int loneSum(int a, int b, int c) {
        if (a == b) {
            if (a == c) {
                return 0;
            }
            return c;
        } else if (b == c) {
            return a;
        } else if (a == c) {
            return b;
        }
        return a + b + c;

    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }


}
