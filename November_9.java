public class November_9 {
  public static void main (String[] args) {
    int[] a = {0, 1, 1, 0, 1};
    // System.out.println(arrToString(prefix(a)));
    System.out.println(arrToString(prefixlin(a)));
  }

  public static String arrToString(int[] ary){
      String ans = "{";
      for (int i = 0; i < ary.length; i++) {
        if (i < ary.length-1) {
          ans += ary[i] + ", ";
        } else {
          ans += ary[i];
        }
      }
      return ans + "}";
    }


  public static int[] prefix(int[] a) {
    int[] ans = new int[a.length];
    for (int i=0;i<a.length;i++) {
      int sum = 0;
      for (int j=0;j<i+1;j++) {
        sum += a[j];
      }
      ans[i] = sum;
    }
    return ans;
  }

  public static int[] prefixlin (int[] a){
    int n = a.length;
    int[] pre = new int[n + 1];
    pre[0] = 0;

    for (int i = 1; i < n + 1; i++){
      pre[i] = pre[i -1] + a[i-1];
    }

    return pre;
  }
}
