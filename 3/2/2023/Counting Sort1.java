 public static List<Integer> countingSort(List<Integer> arr) {
       ArrayList<Integer> countarr = new ArrayList<>();
       for(int i = 0; i < 100; i++){
          countarr.add(0);
       }
       for(int value : arr){
        countarr.set(value, countarr.get(value)+1);
       }
       return countarr;
    }
}
