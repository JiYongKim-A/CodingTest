class Sort {
    public void ascHeapSort(int[] arr) {
        maxHeapfiy(arr, arr.length);
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            maxHeapfiy(arr, i);
        }
    }

    public void descHeapSort(int[] arr) {
        minHeapfiy(arr, arr.length);
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            minHeapfiy(arr, i);
        }
    }

    private void maxHeapfiy(int[] arr, int last) {
        for (int j = 1; j < last; j++) {
            int child = j;
            while (child > 0) {
                int parent = (child - 1) / 2;
                if (arr[child] > arr[parent]) {
                    swap(arr, parent, child);
                }
                child = parent;
            }
        }
    }

    private void minHeapfiy(int[] arr, int last) {
        for (int j = 1; j < last; j++) {
            int child = j;
            while (child > 0) {
                int parent = (child - 1) / 2;
                if (arr[child] < arr[parent]) {
                    swap(arr, parent, child);
                }
                child = parent;
            }
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}