/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

// create 2 sorted arrays of start times and end times
// create pointer at start of both arrays
// create count variable

// if pointer at start array is less than pointer 
// at end array increment count and increment start pointer

// else increment end array and decrement count

// do this till pointer reaches end of start

// return max count


class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        
        if (n == 1) {
            return 1;
        }
        
        int start[] = new int[n];
        int end[] = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int startP = 0;
        int endP = 0;
        int count = 0;
        int maxCount = 0;

        while (startP < intervals.size()) {
            if (start[startP] < end[endP]) {
                count++;
                startP++;
                maxCount = Math.max(maxCount, count);
            } else {
                count--;
                endP++;
            }
        }

        return maxCount;
    }
}
