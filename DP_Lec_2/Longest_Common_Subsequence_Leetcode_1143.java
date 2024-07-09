package DP_Lec_2;

import java.util.Arrays;

public class Longest_Common_Subsequence_Leetcode_1143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="abcde";
        String s2="ace";
    //    int [][]dp=new int[s1.length()][s2.length()];
    //    for(int i=0;i<dp.length;i++) {
     //   	for(int j=0;j<dp[0].length;j++) {
        //		dp[i][j]=-1;
        //	}
     //   }
        for(int[]a:dp) {
        	Arrays.fill(a, -1);
        }
      //  System.out.println(lcs(s1,s2,0,0));
        System.out.println(lcs2(s1,s2,s1.length()-1,dp));
	}
     public static int lcs(String s1,String s2,int i,int j,int[][]dp) {
    	 if(i==s1.length()||j==s2.length()) {
    		 return 0;
    	 }
    	 if(dp[i][j]!=-1) {
    		 return dp[i][j];
    	 }
    	 int ans=0;
    	 if(s1.charAt(i)==s2.charAt(j)) {
    		 ans=1+lcs(s1,s2,i+1,j+1,dp);  //dp[i+1][j+1] 		 
    	 }else {
    		 int a=lcs(s1,s2,i+1,j,dp);  //dp[i+1][j+1]
    		 int b=lcs(s1,s2,i,j+1,dp);  //dp[i+1][j+1]
    		 ans=Math.max(a, b);
    	 }
    	 //return ans;
    	 return dp[i][j]=ans;
     }
     public static int lcs2(String s1,String s2,int i,int j,int[][]dp) {
    	 if(i<0||j<0) {
    		 return 0;
    	 }
//    	 if(i==s1.length()||j==s2.length()) {
//    		 return 0;
//    	 }
    	 if(dp[i][j]!=-1) {
    		 return dp[i][j];
    	 }
    	 int ans=0;
    	 if(s1.charAt(i)==s2.charAt(j)) {
    		 ans=1+lcs2(s1,s2,i+1,j+1,dp);  //dp[i+1][j+1] 		 
    	 }else {
    		 int a=lcs2(s1,s2,i+1,j,dp);  //dp[i+1][j]
    		 int b=lcs2(s1,s2,i,j+1,dp);  //dp[i][j+1]
    		 ans=Math.max(a, b);
    	 }
    	 return dp[i][j]=ans;
     }
}
