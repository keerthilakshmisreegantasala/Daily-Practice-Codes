    public static List<Integer> breakingRecords(List<Integer> scores) {
        int max = 0;
        int min = 0;
        int maximum = scores.get(0);
        int minimum = scores.get(0);
        for(int i=1;i<scores.size();i++){
            int val = scores.get(i);
            if(val>maximum){
                maximum = val;
                max++;
            }
            if(val<minimum){
                minimum = val;
                min++;
            }
        }
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(max);
        pair.add(min);
        return pair;
        
        }
    }
