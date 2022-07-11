class Solution 
    { 
        //Function to search a given number in row-column sorted matrix.
        static boolean search(int matrix[][], int n, int m, int x) 
        {  
            
            int i=0;
            int j = m-1;
            
            while(i<n && j>=0){
                int p = matrix[i][j];
                if(x>p){
                    i++;
                }
                else if(x<p){
                    j--;
                }
                else{
                    return true;
                }
            }
            return false;
     
            
        } 
    } 
    