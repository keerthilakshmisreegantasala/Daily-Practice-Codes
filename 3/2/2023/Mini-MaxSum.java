 public static void miniMaxSum(List<Integer> arr) {
        long min = Collections.max(arr);
        long max = Collections.min(arr);
        long sum = 0;
        for (int i=0; i < arr.size(); i++){
                sum += arr.get(i);
        }

        System.out.println((sum-min)+" "+(sum-max));
    }
} 
