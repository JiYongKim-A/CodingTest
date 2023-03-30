class Sort {
    public void insertionSortAsc(int[] arr) { //오름차순
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j - 1, j);
                j--;
            }
        }
    }

    public void insertionSortDesc(int[] arr) { //내림차순
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] < arr[j]) {
                swap(arr, j - 1, j);
                j--;
            }
        }
    }

    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}