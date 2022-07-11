class GFG {

    static void rotate(int arr[][]) 
    {
        int r=arr.length;
        int c=arr[0].length;
        
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        
        int i=0;
        int x=r-1;
        int y=c-1;
        
        while(i<(r/2)){
            for(int j=0;j<c;j++){
                int temp=arr[x][j];
                arr[x][j]=arr[i][j];
                arr[i][j]=temp;
            }
            i++;
            x--;
        }
        
    }
}