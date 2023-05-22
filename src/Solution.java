import java.nio.channels.Pipe;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k){
    HashMap<Integer,Integer>mymap=new HashMap<>();
    for (int num:nums)
    {
        if (!mymap.containsKey(num))
            mymap.put(num,1);
        else {
            mymap.put(num,mymap.get(num)+1);
        }
    }
        int []output=new int[k];
        PriorityQueue<int[]>heap=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for (Map.Entry<Integer,Integer>temp:mymap.entrySet())
        {
            heap.add(new int[]{temp.getKey(), temp.getValue()});
        }
        for (int i=0;i<k;i++)
        {
            output[i]=heap.poll()[0];
        }
        return output;
    }
}
