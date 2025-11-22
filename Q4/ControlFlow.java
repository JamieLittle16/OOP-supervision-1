import java.util.Arrays;

public class ControlFlow {
  static int sum(int[] a) {
    int total = 0;
    for (int num : a) {
      total += num;
    }
    return total;
  }

  static int[] cumsum(int[] a) {
    int total = 0;
    for (int i = 0; i < a.length; i++) {
      total += a[i];
      a[i] = total;
    }
    return a;
  }

  static int[] positives(int[] a) {
    // Would work but not really in the spirit of it
    // return Arrays.stream(a).filter(x -> x > 0).toArray();
    int count = 0;
    for (int num : a) {
      if (num > 0) {
        count++;
      }
    }
    int[] rtn = new int[count];
    int i = 0;
    for (int num : a) {
      if (num > 0) {
        rtn[i] = num;
        i++;
      }
    }
    return rtn;
  }

  public static void main(String[] args) {
    System.out.println(sum(new int[] { 1, 3, 4, 5 }));
    System.out.println(Arrays.toString(cumsum(new int[] { 1, 2, 3 })));
    System.out.println(Arrays.toString(positives(new int[] { 1, -1, 2, -3, 5, 6 })));
  }
}
