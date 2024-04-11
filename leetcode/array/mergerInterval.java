/*
56.合并区间
 */
package leetcode.array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class mergerInterval {
    public int[][] merge(int[][] intervals) {
    if (intervals.length == 0){
        return new int[0][0];
    }
    Arrays.sort(intervals,new Comparator<int[]>(){
        public int compare(int[] a,int[] b){
            return Integer.compare(a[0],b[0]);
        }
    });
    ArrayList<int[]> merged = new ArrayList<>();
    int[] currentinterval = intervals[0];
    merged.add(currentinterval);
    for (int[] interval : intervals){
        if(currentinterval[1] >= interval[0]){
            currentinterval[1] = Math.max(currentinterval[1],interval[1]);
        }else{
            currentinterval = interval;
            merged.add(currentinterval);
        }
    }
    return merged.toArray(new int[merged.size()-1][]);
    }

    public static void main(String[] args) {
        int[][] test1 = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        mergerInterval solution = new mergerInterval();
        int[][] res = solution.merge(test1);
        System.out.print("结果是:");
        for(int[] interval : res) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
