package com.myprojects;

public class Sorting {
static  int count=0,swap;
  public static void main(String[] args) {
  
   int[]array={8,3,9,4,7,2,6};
  selectionSort(array);
  System.out.print(count+","+swap);
  }
  public static int[] selectionSort(int[]list){
    int i,j,minValue,minIndex,temp=0;
    for(i=0;i<list.length-1;i++){
      minValue=list[i];
      minIndex=i;
      for(j=i+1;j<list.length-1;j++){
        if(list[j]<minValue){
          minValue=list[j];
          minIndex=j;
          count++;
        }
      }
      if(minValue<list[j]){
        temp=list[i];
        list[i]=list[minIndex];
        list[minIndex]=temp;
        swap++;
      }
    }
    return list;
  }
}
