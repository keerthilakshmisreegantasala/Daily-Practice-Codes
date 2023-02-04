public static List<Integer> matchingStrings(List<String>    strings, List<String> queries) {
    // Write your code here
     int count=0;
     ArrayList<Integer> res = new ArrayList<>(queries.size());
     for(String i: queries){
        for(String j: strings){
            if(i.equals(j)){
                count+=1;
            }
            else{
                count+=0;
            }
        }
            res.add(count);
            count=0;
        }
    return res;
    }
}
