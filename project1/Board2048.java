/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max2048;

/**
 *
 * @author TheWanderingPath
 */
public class Board2048 {
    private final int gSize=Max2048.gridSize;
    public int[][] board=new int[gSize][gSize];
    
    private final int[] rand24={1,1,1,2};
    
    //initializes board with 2 blocks
    public Board2048(){
        //generates 0 board
        for (int r=0;r<gSize;r++){
            for (int c=0;c<gSize;c++){
                board[r][c]=0;
            }
        }
        //starts off with two blocks
        randGen();
        randGen();

        
    }
    
    //returns false if game hasn't ended
    public boolean checkEnd(){
        //checks if there are still empty spaces
        for (int r=0;r<gSize;r++){
            for (int c=0;c<gSize;c++){
                if (board[r][c]==0){
                    return false;
                }
            }
        }
        
        //checks if there are still valid moves
        for (int r=0;r<gSize;r++){
            for (int c=0;c<gSize-1;c++){
                if (board[r][c]==board[r][c+1]){
                    return false;
                }
            }
        }
        for (int c=0;c<gSize;c++){
            for (int r=0;r<gSize-1;r++){
                if (board[r][c]==board[r+1][c]){
                    return false;
                }
            }
        }
        
        //nothing can be done, return false
        return true;
    }
    
    
    public void gravApplier(int grav){
        gravSorter(grav);
        gravMerger(grav);
        randGen();
    }
    
    //need optimization!!! remove loop, only sort the nth row/column
    private void gravSorter(int grav){
        int a;
        int temp;
        //right
        if (grav==1){
            for(int r=0;r<gSize;r++){
                a=3;
                for(int c=gSize-1;c>=0;c--){
                    if (board[r][c]!=0){
                        temp=board[r][c];
                        board[r][c]=0;
                        board[r][a]=temp;
                        a--;
                    }
                }
            }
        }
        //left
        else if(grav==3){
            for(int r=0;r<gSize;r++){
                a=0;
                for(int c=0;c<gSize;c++){
                    if (board[r][c]!=0){
                        temp=board[r][c];
                        board[r][c]=0;
                        board[r][a]=temp;
                        a++;
                    }
                }
            }
        }
        //up
        else if(grav==2){
            for(int c=0;c<gSize;c++){
                a=0;
                for(int r=0;r<gSize;r++){
                    if (board[r][c]!=0){
                        temp=board[r][c];
                        board[r][c]=0;
                        board[a][c]=temp;
                        a++;
                    }
                }
            }
        }
        //down
        else if(grav==4){
            for(int c=0;c<gSize;c++){
                a=3;
                for(int r=gSize-1;r>=0;r--){
                    if (board[r][c]!=0){
                        temp=board[r][c];
                        board[r][c]=0;
                        board[a][c]=temp;
                        a--;
                    }
                }
            }
        }
    }
    
    private void gravMerger(int grav){
        //right
        if (grav==1){
            for(int r=0;r<gSize;r++){
                for(int c=gSize-1;c>=1;c--){
                    if (board[r][c]!=0 && board[r][c]==board[r][c-1]){
                        board[r][c]++;
                        board[r][c-1]=0;
                        gravSorter(grav);
                    }
                }
            }
        }
        //left
        else if(grav==3){
            for(int r=0;r<gSize;r++){
                for(int c=0;c<gSize-1;c++){
                    if (board[r][c]!=0 && board[r][c]==board[r][c+1]){
                        board[r][c]++;
                        board[r][c+1]=0;
                        gravSorter(grav);
                    }
                }
            }
        }
        //up
        else if(grav==2){
            for(int c=0;c<gSize;c++){
                for(int r=0;r<gSize-1;r++){
                    if (board[r][c]!=0 && board[r][c]==board[r+1][c]){
                        board[r][c]++;
                        board[r+1][c]=0;
                        gravSorter(grav);
                    }
                }
            }
        }
        //down
        else if(grav==4){
            for(int c=0;c<gSize;c++){
                for(int r=gSize-1;r>=1;r--){
                    if (board[r][c]!=0 && board[r][c]==board[r-1][c]){
                        board[r][c]++;
                        board[r-1][c]=0;
                        gravSorter(grav);
                    }
                }
            }
        }
    }
    
    private void randGen(){
        int randX=0;
        int randY=0;
    
        while(true){
            randX=(int)(Math.random()*4);
            randY=(int)(Math.random()*4);
            if (board[randX][randY]==0){
                board[randX][randY]=rand24[(int)(Math.random()*4)];
                break;
            }
        }
    }
    
    
}
