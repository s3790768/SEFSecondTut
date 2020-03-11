public class BubbleSort {

    public BubbleSort(){
    }

    private void sort(int listOfItems[]){
      int n = listOfItems.length;
      for(int i = 0; i < n-1; i++){
          for(int j = 0; j < n - i -1; j++){
              if(listOfItems[j] > listOfItems[j + 1]){
                  int temp = listOfItems[j];
                  listOfItems[j] = listOfItems[j + 1];
                  listOfItems[j + 1] = temp;
              }
          }
      }
      for (int i=0; i<n; i++)
          System.out.print(listOfItems[i] + " ");
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int array1[] = {70,61,72,83,38};
        ob.sort(array1);
        int array2[] = {7,2,76,4,99};
        ob.sort(array2);
        int array3[] = {28,9,13,78,19};
        ob.sort(array3);
        int array4[] = {68,84,41,62,18};
        ob.sort(array4);
    }
}
