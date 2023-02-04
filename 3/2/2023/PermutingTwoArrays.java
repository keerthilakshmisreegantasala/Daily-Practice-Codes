public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B,Collections.reverseOrder());
        int len = A.size();
        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i=0;i<len;i++){
            arr1.add(A.get(i)+B.get(i));
        }
        
        for(int j: arr1){
            if(j<k){
                return "NO";
            }
        }
        return "YES";
    }

}
