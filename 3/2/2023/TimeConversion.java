public static String timeConversion(String s) {
      
        int times= Integer.parseInt(s.substring(0,2));
        String time = s.substring(8);
        time = time.toLowerCase();
        boolean night = time.equals("pm");
        if(night){
            if(times != 12){ 
                times += 12;
                return "" + times + s.substring(2,8);
            }
        } 
        else{
            if(times == 12){ 
                return "00" + s.substring(2,8);
            }
        }
        return s.substring(0,8);
    }
    
