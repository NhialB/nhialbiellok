//selection sort and merge sort in java

public class Sorting {
  
  static int comparisons;
 
  public static void main(String[] args) {
  int n=10000;
  int[]array= new int[n];
  System.out.println("arrays before sorting:");
  for(int i=0;i<array.length;i++){
    array[i]=(int)(Math.random()*(n+1));
    System.out.print(array[i]+" ");
    
  }
  System.out.println();
   sort(array);
   for(int i:array){
     System.out.print(i+" ");
   }
   System.out.println();
  int z= mergeSort(array,0,n-1);

   System.out.println("merge sort after sorting:");
   for(int i:array){
     System.out.print(i+" ");
   }
   System.out.println();
   System.out.print(z+" exchanges and "+comparisons+" comparisons");
  }
  
  
  public static void sort(int[]a){
  
    int comparisons=0;
    int exchanges=0;
    for(int i=0;i<a.length;i++){
      int minIndex=i;
      for(int j=i+1;j<a.length;j++){
        if(a[j]<a[minIndex]){
          comparisons++;
          minIndex=j;
        }
        
      }
     if(minIndex!=i){
      exchanges++;
      int temp =a[minIndex];
      a[minIndex]=a[i];
      a[i]=temp;
      }
      
    }
     System.out.println("you have "+comparisons+" comparisons and "+exchanges+" exchanges");
      
}

public static int mergeSort(int[] intArray, int first,int last) {
    
     int compares = 0;
     if(first < last) {
      int mid = (first + last) / 2;

      compares += mergeSort(intArray, first, mid);
      compares += mergeSort(intArray, mid + 1, last);
      compares += Merge(intArray, first, mid, last);

 }

 return compares;
}

public static int Merge(int[] intArray, int first, int mid, int last) { 
comparisons = 0;
int first1 = first, last1 = mid; 
int first2 = mid + 1, last2 = last; 
int temp[] = new int[intArray.length]; 
int index = first1;

while(first1 <= last1 && first2 <= last2) {
    if(intArray[first1] < intArray[first2]) {
       temp[index] = intArray[first1++];
       comparisons++;
    }
    else
        temp[index] = intArray[first2++];
        index++;
        comparisons++;
 }

 while(first1 <= last1)
    temp[index++] = intArray[first1++];

 while(first2 <= last2)
    temp[index++] = intArray[first2++];

 for(index = first; index <= last; index++)
    intArray[index] = temp[index];


 return comparisons;
}


   
}
