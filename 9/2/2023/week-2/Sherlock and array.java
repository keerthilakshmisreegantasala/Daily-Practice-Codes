 public static String balancedSums(List<Integer> arr) {
      int sum=0,cs=0;
       for(int i=0;i<arr.size();i++){
           sum+=arr.get(i);
       }
       for(int i=arr.size()-1;i>=0;i--){
           cs+=arr.get(i);
           if(sum==cs){
               return "YES";
           }
           sum-=arr.get(i);
       }
       return "NO";

    }

}
