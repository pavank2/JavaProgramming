package practise;

public class ContainerClass {

	    public static int maxArea(int[] height) {
	    	int maxVol=0,currentVol=0;
	        int h=0;
	        int len = height.length;
	        int i=0,j=len-1;
	        int left=i,right=j;
	        
	        h= (height[i]<height[j])? height[i]:height[j];
	        maxVol = (len-1)*h;
	        
	        while(i!=j){
	            
	            
	           h = (height[i+1]<height[j])? height[i+1]:height[j];
	           currentVol = (j-i-1)*h;
	          
	            if (currentVol>maxVol){
	                maxVol=currentVol;
	               left=i+1;
	               right=j;
	            }
	          
	             h = (height[i]<height[j-1])? height[i]:height[j-1];
	           currentVol = (j-i-1)*h;
	          
	            if (currentVol>maxVol){
	                maxVol=currentVol;
	                left=i;
	                right=j-1;
	            }
	            
	             h = (height[i+1]<height[j-1])? height[i+1]:height[j-1];
	           currentVol = (j-i-1)*h;
	          
	            if (currentVol>maxVol){
	                maxVol=currentVol;
	                left=i+1;
	                right=j-1;
	            }
	            
	            i++;
	            j--;
	        }     
	        
	        return maxVol;
	    
	    }
	
	public static void main(String[] args) {
		
    int[] height = {1,8,6,2,5,4,8,3,7};
    
    System.out.println(maxArea(height));
	}

}
