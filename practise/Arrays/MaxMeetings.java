package practise.Arrays;

import java.util.*;
 
// Comparator function which can compare
// the ending time of the meeting ans
// sort the list

 

 
class GFG{
     
// Function for finding maximum meeting in one room
public static void maxMeeting(ArrayList<meeting> al, int s)
{
     
    // Initialising an arraylist for storing answer
    ArrayList<Integer> m = new ArrayList<>();
     
    int time_limit = 0;
     
    myComparator mc = new myComparator();
     
    // Sorting of meeting according to
    // their finish time.
    Collections.sort(al, mc);
     
    // Initially select first meeting.
    m.add(al.get(0).pos);
     
    // time_limit to check whether new 
    // meeting can be conducted or not.
    time_limit = al.get(0).end;
     
    // Check for all meeting whether it 
    // can be selected or not.
    for(int i = 1; i < al.size(); i++)
    {
        if (al.get(i).start > time_limit)
        {
             
            // Add selected meeting to arraylist
            m.add(al.get(i).pos);
             
            // Update time limit
            time_limit = al.get(i).end;
        }
    }
     
    // Print final selected meetings.
     for(int i = 0; i < m.size(); i++)
        System.out.print(m.get(i) + 1 + " ");
}
 
// Driver Code 
public static void main (String[] args)
{
     
    // Starting time
    int s[] = { 1, 3, 0, 5, 8, 5 };
     
    // Finish time
    int f[] = { 2, 4, 6, 7, 9, 9 }; 
     
    // Defining an arraylist of meet type
    ArrayList<meeting> meet = new ArrayList<>();
    for(int i = 0; i < s.length; i++)
     
        // Creating object of meeting
        // and adding in the list
        meet.add(new meeting(s[i], f[i], i));
         
    // Function call
    maxMeeting(meet, meet.size());
}

}