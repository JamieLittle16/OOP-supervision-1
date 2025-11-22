public class VectorDemo {
  public static void VectorAdd(int[] v, int dx, int dy) {
    v[0] += dx;
    v[1] += dy;
  }

  public static void main(String[] args) {
    int[] v = new int[] { 0, 2 };
    VectorAdd(v, 1, 1);
    System.out.println(v[0] + " " + v[1]);
  }
}
