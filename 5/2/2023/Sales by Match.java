public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
     int count=0;
     HashSet<Integer>h=new HashSet<>();
     for(int i=0;i<n;i++){
        if(!h.contains(ar.get(i))){
            h.add(ar.get(i));
        }
        else{
            h.remove(ar.get(i));
            count++;
            }
        }
        return count;
  }
}

