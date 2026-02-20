class Solution {
    public int peakIndexInMountainArray(int[] arr) {
     int strt=1;
     int end=arr.length-2;
     while (strt<=end){
        int mid = strt+(end-strt)/2;
     if(arr[mid-1]<arr[mid]&&arr[mid]>arr[mid+1]){
        return mid ;
     }
     else if(arr[mid-1]<arr[mid]){
        strt=mid+1;
     }else{
      end=mid-1;
     }
     }
     
     return -1;
    }
}