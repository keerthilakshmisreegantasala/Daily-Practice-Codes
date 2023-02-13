 public static String sort(String s){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }     

    public static String gridChallenge(List<String> grid) {
    
    // Write your code here
     ArrayList<String> a=new ArrayList<>();
       for(int i=0;i<grid.size();i++){
           String s=sort(grid.get(i));
           a.add(s);
       }
       int size=a.get(0).length();
       for(int i=1;i<a.size();i++){
           for(int j=0;j<size;j++){
               if(a.get(i-1).charAt(j)>a.get(i).charAt(j)){
                   return "NO";
               }
           }
       }
       return "YES";
    }
    
