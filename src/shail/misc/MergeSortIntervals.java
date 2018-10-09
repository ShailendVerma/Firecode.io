package shail.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortIntervals {

    public static void main(String args[]){
        //[[1,3], [2,6], [8,10], [15,18]]
        List<Interval> intervals = Arrays.asList(
                new Interval(1,3),new Interval(2,6),
                new Interval(8,10),new Interval(15,18));
        System.out.println(mergeIntervals(intervals));
    }

    public static List<Interval> mergeIntervals(List<Interval> intervalsList) {
        if(intervalsList.isEmpty())return intervalsList;
        
        intervalsList.sort(Comparator.comparingInt(interval -> interval.start));
        ArrayList<Interval> merged = new ArrayList<>();
        Interval current =  intervalsList.get(0);
        merged.add(current);
        for(int i = 1 ;i < intervalsList.size();  i++)
        {
            Interval next = intervalsList.get(i);
            if(current.end >= next.start)
            {
                current.end = (current.end < next.end)?next.end:current.end;
            }else {
                current = next;
                merged.add(next);
            }

        }

        return merged;

    }
}
