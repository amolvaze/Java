public static boolean arraySum(List<Integer> inputs, List<Integer> tests) {
    // Write your code here
      Set<Integer> myTest = new HashSet<>(tests);
      
      for(int i=0; i< inputs.size(); i++){
          for(int j=0; j < inputs.size(); j++){
              if(i !=j) {
                int  sum = inputs.get(i) + inputs.get(j);
                if(myTest.contains(sum)){
                    return true;
                }
              }
          }
          
      }
      
       return false;
    }
