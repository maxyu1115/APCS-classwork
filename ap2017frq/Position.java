/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class Position {
    int r,c;
    
    public Position(int r,int c){
        this.r=r;
        this.c=c;
    }
    
    public static Position findPosition(int num, int[][] intArr){
        int rows=intArr.length;
        int cols=intArr[0].length;
        for (int r=0; r<rows;r++){
            for (int c=0;c<cols;c++){
                if (intArr[r][c]==num)
                    return new Position(r,c);
            }
        }
        return null;
    }
    
    public static Position[][] getSuccessorArray(int[][] intArr){
        int rows=intArr.length;
        int cols=intArr[0].length;
        Position[][] sArr=new Position[rows][cols];
        for (int r=0; r<rows;r++){
            for (int c=0;c<cols;c++){
                sArr[r][c] = findPosition(intArr[r][c]+1,intArr);
            }
        }
        return sArr;
    }
    
}
