import java.util.Arrays;
class MinHeap{
  private int[] heap;
  private int maxSize = 10;

  public MinHeap(){
          heap = new int[maxSize];
          heap[0] = 0;
  }

  private int getParent(int index) {
      return index/2;
  }

  private int getLeftChild(int index) {
      return index * 2;
  }

  private int getRightChild(int index) {
      return index * 2 + 1;
  }

  private void swap(int index1, int index2) {
      int temp = heap[index1];
      heap[index1] = heap[index2];
      heap[index2] = temp;
  }
  private int smaller (int index1 ,int index2){
      return heap[index1] < heap[index2] ? index1 : index2;
  }



  private void upHeapify() {
      int rearIndex = heap[0];
      while(rearIndex>1&&heap[getParent(rearIndex)]>=heap[rearIndex]){
          swap(rearIndex,getParent(rearIndex));
          rearIndex /= 2;
      }
  }

  private void downHeapify() {
      int rootIndex = 1;
      //왼쪽 자식의 존재는 조건에서 이미 존재하는 것으로 확인 됨
      while (rootIndex * 2 <= heap[0]) {
          // 우측 자식이 존재 했을 경우
          if (rootIndex * 2 + 1 <= heap[0]) {
              // 좌측 우측 비교후 swap
              int smaller = smaller(getLeftChild(rootIndex), getRightChild(rootIndex));
              if(heap[rootIndex]<= heap[smaller]){
               break;
              }
              swap(rootIndex,smaller);
              rootIndex = smaller;
          }else{ // 좌측 자식만 존재하는 경우
              if (heap[rootIndex] <= heap[getLeftChild(rootIndex)]) {
                  break;
              }
              swap(rootIndex, getLeftChild(rootIndex));
              rootIndex *= 2;
          }
      }
  }

  private void resize() {
      maxSize *= 2;
      int[] newHeap = Arrays.copyOf(heap, maxSize);
      heap = newHeap;
  }

  public void add(int value) {
      if(heap[0]+1 >= maxSize){
          resize();
      }
      heap[++heap[0]] = value;
      upHeapify();
  }

  public int extractRoot() {
      int root = heap[1];
      heap[1] = heap[heap[0]];
      heap[heap[0]] = 0;
      heap[0]--;
      downHeapify();
      return root;
  }


  public void printHeap() {
      for (int i = 0; i < heap.length; i++) {
          System.out.println("index = "+i+", value = "+heap[i]);
      }
  }
}