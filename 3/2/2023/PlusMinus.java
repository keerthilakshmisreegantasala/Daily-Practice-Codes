public static void plusMinus(List<Integer> arr) {
         float posCount = 0, negCount = 0, zerCount = 0;
         int len=arr.size();
         for(int i: arr){
           if(i > 0)
             posCount++;
           if(i < 0)
             negCount++;
           if(i == 0)
             zerCount++;
    }
    System.out.printf("%f%n", posCount/len, 6);
    System.out.printf("%f%n", negCount/len, 6);
    System.out.printf("%f%n", zerCount/len, 6);

    }
}
