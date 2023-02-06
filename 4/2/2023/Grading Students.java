public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer>l= new ArrayList<Integer>();
        for(int i:grades){ 
          int a=i;
          int b=((a/5)+1)*5;
          if((a>=38) && ((b-a)>=3))
            l.add(a);
          else if((a>=38)&&((b-a)<3))
            l.add(b);
          else if(a<38)
            l.add(a);
        }
        return l ;
    }
