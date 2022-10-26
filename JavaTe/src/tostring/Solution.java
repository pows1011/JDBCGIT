package tostring;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for(int i=2;i<=n;i++) {
        	if(i*i==n) {
        		i+=1;
        		answer=i*i;
        		break;
        	}
        }
        if(answer==0) {
        	answer=-1;
        }
        
        return answer;
    }
}