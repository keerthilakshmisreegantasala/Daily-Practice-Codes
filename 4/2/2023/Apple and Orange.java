public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
        int app=0;
        int ora=0;
        for(int i:apples){
            if(i+a>=s&&i+a<=t){
                app++;
            }
        }
        for(int j:oranges){
            if(j+b>=s&&j+b<=t){
                ora++;
            }
        }
        System.out.println(app);
        System.out.println(ora);
    }
}
