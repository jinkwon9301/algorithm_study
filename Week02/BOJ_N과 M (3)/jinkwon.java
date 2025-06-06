import java.util.*;
import java.io.*;

class Main {
  static int N, M;
  static int[] arr;
  static boolean[] visited;
  static StringTokenizer st;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    arr = new int[N];
    visited = new boolean[N];

    dfs(0);
    System.out.print(sb.toString());
  }

  private static void dfs(int depth) {
    // 종료 조건
    if (depth == M) {
      for (int i = 0; i < M; i++) {
        sb.append(arr[i] + " ");
      }
      sb.append("\n");
      return;
    }

    // 재귀 호출
    for (int i = 0; i < N; i++) {
      arr[depth] = i + 1;
      dfs(depth + 1);
    }
  }
}
