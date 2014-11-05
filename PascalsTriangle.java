public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>> ();
        
        for (int i = 0; i < numRows; i++) {
            
            ArrayList<Integer> newRow = new ArrayList<Integer> ();
            newRow.add(1);
            
            if (i > 0) {
                
                for (int j = 0; j < result.get(i-1).size()-1; j++) {
                    //previousRow = results.get(i-1);
                    newRow.add(result.get(i-1).get(j) + result.get(i-1).get(j+1));
                }
                
                newRow.add(1);
            }

            result.add(newRow);
            
        }
        
        return result;
    }
}
