//https://leetcode.com/problems/shortest-word-distance-iii/
public class ShortestWordDist3 {

  public static int shortestWordDistance(String[] words, String word1, String word2) {
    int i1 = -1, i2 = -1;
    int minDistance = words.length;
    for (int i = 0; i < words.length; i++) {
      if (words[i].equals(word1)) {
        i1 = i;
      } else if (words[i].equals(word2)) {
        i2 = i;
      }

      if (i1 != -1 && i2 != -1) {
        minDistance = Math.min(minDistance, Math.abs(i1 - i2));
      }
    }
    return minDistance;
  }

  public static void main(String[] args) {
    int res = shortestWordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
        "makes", "coding");
    System.out.println(res);
  }
}
