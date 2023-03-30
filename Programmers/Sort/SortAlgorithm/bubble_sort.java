class Sort {
    public void bubbleSortAsc(int[] arr) { // 오름차순

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j])
                    swap(arr,j,j-1);
            }
        }

    }
    public void bubbleSortDesc(int[] arr) { //내림차순
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]<arr[j])
                    swap(arr,j,j-1);
            }
        }
    }

    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}