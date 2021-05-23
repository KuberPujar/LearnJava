package com.learn.java.challenges;

import java.io.*;
import java.util.*;

public class TestClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine().trim());
		for (int t_i = 0; t_i < T; t_i++) {
			int N = Integer.parseInt(br.readLine().trim());
			String[] arr_A = br.readLine().split(" ");
			int[] A = new int[N];
			for (int i_A = 0; i_A < arr_A.length; i_A++) {
				A[i_A] = Integer.parseInt(arr_A[i_A]);
			}
			int Q = Integer.parseInt(br.readLine().trim());
			String[] arr_Queries = br.readLine().split(" ");
			long[] Queries = new long[Q];
			for (int i_Queries = 0; i_Queries < arr_Queries.length; i_Queries++) {
				Queries[i_Queries] = Long.parseLong(arr_Queries[i_Queries]);
			}

			int[] out_ = KthSmallest(N, A, Q, Queries);
			System.out.print(out_[0]);
			for (int i_out_ = 1; i_out_ < out_.length; i_out_++) {
				System.out.print(" " + out_[i_out_]);
			}

			System.out.println();

		}

		wr.close();
		br.close();
	}

	static int[] KthSmallest(int N, int[] A, int Q, long[] Queries) {
		// Write your code here
		int[] result = { 0 };
		if (N != 0 && A != null && Q != 0 && Queries != null && N == A.length && Q == Queries.length) {
			for (int i = 0; i < A.length; i++) {
               if(i==0)
               {
            	   result[i]=A[i];
               }
               
               for(int j=1;j<A.length;j++)
               {
            	   result[j]=A[i]|A[j];
               }
			}
		}
		return result;

	}
}