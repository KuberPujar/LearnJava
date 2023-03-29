package com.learn.java.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//the function accepts five Integer arrays and return Integer ArrayList

class ExamPerformanceResult {

    public static ArrayList<Integer> performance(Integer[] tamil, Integer[] english, Integer[] maths, Integer[] science,
            Integer[] social) {
        //write your code here
        
        ArrayList<Integer> performanceArrList=new ArrayList<>(20);
        if(tamil.length>0 && tamil!=null && english.length>0 && english!=null &&
        maths.length>0 && maths!=null && science.length>0 && science!=null &&   social.length>0 && social!=null)
        {
            int ttotal=0,tavg=0;
            Arrays.sort(tamil);
            Arrays.sort(english);
            Arrays.sort(maths);
            Arrays.sort(science);
            Arrays.sort(social);
            int passingMarks=35;
            int tCount=0;
            for(int i=0;i<tamil.length;i++)
            {
                ttotal=ttotal+tamil[i];
                if(tamil[i]<passingMarks){
                    tCount=+tCount;
                    tCount++;
                }
            }
            tavg=ttotal/tamil.length;
            performanceArrList.add(0,tavg);
            
            int etotal=0,eavg=0,eCount=0;
            for(int i=0;i<english.length;i++)
            {
                etotal=etotal+english[i];
                if(english[i]<passingMarks)
                {
                	eCount=+eCount;
                	   eCount++;
                }
            }
            eavg=etotal/english.length;
            performanceArrList.add(1,eavg);
            
            int mtotal=0,mavg=0,mCount=0;
            for(int i=0;i<maths.length;i++)
            {
                mtotal=mtotal+maths[i];
                if(maths[i]<passingMarks)
                {
                	mCount=+mCount;
                	   mCount++;
                }
            }
            mavg=mtotal/maths.length;
            performanceArrList.add(2,mavg);
            
            int stotal=0,savg=0,sCount=0;
            for(int i=0;i<science.length;i++)
            {
                stotal=stotal+science[i];
                if(science[i]<passingMarks)
                {
                	sCount=+sCount;
                	   sCount++;
                }
            }
            savg=stotal/science.length;
            performanceArrList.add(3,savg);
            
            int sstotal=0,ssavg=0,ssCount=0;
            for(int i=0;i<social.length;i++)
            {
                sstotal=sstotal+social[i];
                if(social[i]<passingMarks)
                {
                	ssCount=+ssCount;
                	   ssCount++;
                }
            }
            ssavg=sstotal/social.length;
            performanceArrList.add(4,ssavg);
            performanceArrList.add(5,(tamil[tamil.length-1]));
            performanceArrList.add(6,(english[english.length-1]));
            performanceArrList.add(7,(maths[maths.length-1]));
            performanceArrList.add(8,(science[science.length-1]));
            performanceArrList.add(9,(social[social.length-1]));
            
            performanceArrList.add(10,tamil[0]);
            performanceArrList.add(11,english[0]);
            performanceArrList.add(12,maths[0]);
            performanceArrList.add(13,science[0]);
            performanceArrList.add(14,social[0]);
            
            performanceArrList.add(15,tCount);
            performanceArrList.add(16,eCount);
            performanceArrList.add(17,mCount);
            performanceArrList.add(18,sCount);
            performanceArrList.add(19,ssCount);
        }
        
        return performanceArrList;
    }
}

public class ExamPerformance {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(b.readLine().trim());
		Integer[] tamil = new Integer[n];
		for (int i = 0; i < n; i++) {
			tamil[i] = Integer.parseInt(b.readLine().trim());
		}
		Integer[] english = new Integer[n];
		for (int i = 0; i < n; i++) {
			english[i] = Integer.parseInt(b.readLine().trim());
		}
		Integer[] maths = new Integer[n];
		for (int i = 0; i < n; i++) {
			maths[i] = Integer.parseInt(b.readLine().trim());
		}
		Integer[] science = new Integer[n];
		for (int i = 0; i < n; i++) {
			science[i] = Integer.parseInt(b.readLine().trim());
		}
		Integer[] social = new Integer[n];
		for (int i = 0; i < n; i++) {
			social[i] = Integer.parseInt(b.readLine().trim());
		}
		b.close();

		ArrayList<Integer> solution = ExamPerformanceResult.performance(tamil, english, maths, science, social);
		for (int i = 0; i < solution.size(); i++) {
			System.out.println(solution.get(i));
		}

	}

}