class Solution {
    public void rotate(int[][] matrix) {
        RotateImage(matrix);
    }
      public static void RotateImage(int[][] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }

        for(int i=0; i<arr.length; i++){
            reverse(arr[i], 0, arr[0].length-1);
        }
        
    }

    public static void reverse(int[] arr,int i, int j){

         while(i<j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
         }
    }
}