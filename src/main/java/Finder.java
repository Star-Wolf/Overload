class Finder {
    public static int getMax(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result)
                result = arr[i];
        }
        return result;
    }
    public static int getMin(int[] arr){
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < result)
                result = arr[i];
        }
        return result;
        }

    }
    
