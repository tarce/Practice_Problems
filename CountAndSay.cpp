class Solution {
public:
    string countAndSay(int n) {
        
        string seq = "1";  
        int iter = 1;  
        
        while (iter < n) {  
            
            string newSeq;  
            char last = seq[0];  
            int count = 0;  
            
            for (int i = 0; i <= seq.size(); i++) { 
                
                if(seq[i] ==last) { count ++; }  
                else {
                    newSeq.append(to_string(count));
                    newSeq.push_back(last);  
                    last = seq[i]; 
                    count =1;  
                } 
                
            } 
            seq = newSeq;  
            iter++; 
            
        }  
      return seq;  
      
    }
};
