public static int lonelyinteger(List<Integer> a) {
        int[] arr = new int[1000];
        Arrays.fill(arr, 0);
        for(int x: a){
            arr[x] = arr[x]+1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1) 
            return i;
        }
        return -1;
    }
}
