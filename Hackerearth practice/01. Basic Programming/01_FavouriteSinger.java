import java.util.*;

class FavouriteSinger{
  public static void main(String a[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    long arr[] = new long[n];
    for(int i=0; i<n; i++) {
      arr[i] = s.nextLong();
    }
    s.close();

    // Make all arr-element's entry in map
    Map<Long, Integer> map = new HashMap<Long, Integer>();
    for(int i=0; i<n; i++) {
      if(map.containsKey(arr[i]) == true) {
        int val = map.get(arr[i]);
        map.put(arr[i], val+1);
      }
      else {
        map.put(arr[i], 1);
      }
    }

    // Traverse in map
    int maxFreq = 0, maxFreqCount = 0;
    for(Map.Entry<Long, Integer> ele: map.entrySet()) {
      if(ele.getValue() > maxFreq) {
        maxFreq = ele.getValue();
        maxFreqCount = 1;
      }
      else if(ele.getValue() == maxFreq) {
        maxFreqCount++;
      }
    }

    // No. of favourite singers == maxFreqCount
    System.out.println(maxFreqCount);
    return;
  }
}