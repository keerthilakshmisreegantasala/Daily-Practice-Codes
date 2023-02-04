 public static int diagonalDifference(List<List<Integer>> arr) { 
    // Write your code here
    int lSum = 0;
    int rSum = 0;
    for(int i = 0; i < arr.size(); i++) { 
        lSum += arr.get(i).get(i);
    }
    for(int i = 0; i < arr.size(); i++) { 
        rSum += arr.get(i).get((arr.size()-1) - i);
    }
    return Math.abs(lSum - rSum);
    
    }

}
