package practise.Arrays;

import java.util.Comparator;

public class myComparator implements Comparator<meeting>
	{
	    @Override
	    public int compare(meeting o1, meeting o2)
	    {
	        if (o1.end < o2.end)
	        {
	             
	            // Return -1 if second object is
	            // bigger then first
	            return -1;
	        }
	        else if (o1.end > o2.end)
	         
	            // Return 1 if second object is
	            // smaller then first
	            return 1;
	             
	        return 0;
	    }
	}

