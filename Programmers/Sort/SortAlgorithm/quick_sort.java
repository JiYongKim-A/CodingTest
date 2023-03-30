class Sort {
    public void quickSortAsc(int[] arr, int first, int last) {
        if (first >= last)
            return;

        int pivot = first;
        int left = first + 1;
        int right = last;

        while (left <= right) {
            while (left <= last && arr[left] <= arr[pivot]) {
                left++;
            }
            while (right > first && arr[right] >= arr[pivot]) {
                right--;
            }
            if (left > right) {
                swap(arr, pivot, right);
            } else {
                swap(arr, left, right);
            }
        }
        quickSortAsc(arr, first, right - 1);
        quickSortAsc(arr, right + 1, last);

    }

    public void quickSortDesc(int[] arr, int first, int last) {

        if (first >= last)
            return;

        int pivot = first;
        int left = first + 1;
        int right = last;

        while (left <= right) {
            while (left <= last && arr[left] >= arr[pivot]) {
                left++;
            }
            while (right > first && arr[right] <= arr[pivot]) {
                right--;
            }
            if (left > right) {
                swap(arr, pivot, right);
            } else {
                swap(arr, left, right);
            }
        }
        quickSortDesc(arr, first, right - 1);
        quickSortDesc(arr, right + 1, last);
    }

    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}