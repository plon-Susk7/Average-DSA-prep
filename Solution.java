class Solution{

    public static void partition(int[] arr,int left,int right){
        
        int pivot = arr[right];
        int i = left-1;

        for(int j=left;j<right;j++){
            if(arr[j]<0){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[right] = temp;


    }

    public static void main(String[] args){
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, 3, 6};
        int left = 0;
        int right = arr.length-1;

        while(arr[right]>0){
            right--;
        }
        partition(arr,left,right);

        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}