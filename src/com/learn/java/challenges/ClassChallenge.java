package com.learn.java.challenges;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

class SubjectDetails implements Comparable<SubjectDetails> {
	private String subjectName;
	private LocalTime startDate;
	private LocalTime endDate;

	public SubjectDetails(String subjectName, LocalTime startDate, LocalTime endDate) {
		super();
		this.subjectName = subjectName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public LocalTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalTime startDate) {
		this.startDate = startDate;
	}

	public LocalTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalTime endDate) {
		this.endDate = endDate;
	}

	// sort subjects by lowest time
	@Override
	public int compareTo(SubjectDetails o) {
		return this.startDate.compareTo(o.startDate);
	}

}

class StartDateToNextEndDtComp implements Comparator<SubjectDetails> {

	@Override
	public int compare(SubjectDetails o1, SubjectDetails o2) {
		return o1.getStartDate().compareTo(o2.getStartDate());
	}

}
class EndDateToNextEndDtComp implements Comparator<SubjectDetails> {

	@Override
	public int compare(SubjectDetails o1, SubjectDetails o2) {
		return o1.getEndDate().compareTo(o2.getEndDate());
	}

}

public class ClassChallenge {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		LinkedList<SubjectDetails> subList = null;
		int days = scanner.nextInt();
		for (int i = 0; i < days; i++) {
			subList = new LinkedList<SubjectDetails>();
			int noOfSub = scanner.nextInt();
			for (int j = 0; j < noOfSub; j++) {
				String subject = scanner.next();
				subject += scanner.nextLine();
				String s1[] = subject.split(" ");
				String subj = String.valueOf(s1[0]);
				LocalTime startDate = LocalTime.parse(String.valueOf(s1[1]), DateTimeFormatter.ofPattern("HH:mm"));
				LocalTime endDate = LocalTime.parse(String.valueOf(s1[2]), DateTimeFormatter.ofPattern("HH:mm"));
				subList.add(new SubjectDetails(subj, startDate, endDate));
			}
			/*
			 * for (SubjectDetails s : subList) { System.out.println("subj::" + subj +
			 * " startDate:" + startDate + " endDate:" + endDate); LocalTime lt =
			 * LocalTime.parse(startDate, DateTimeFormatter.ofPattern("HH:mm"));
			 * System.out.println(lt.getHour()); System.out.println(lt.getMinute());
			 * LocalTime lt1 = LocalTime.parse(endDate,
			 * DateTimeFormatter.ofPattern("HH:mm")); if(lt1.compareTo(lt)>1)
			 * System.out.println(lt); System.out.println(lt1.getHour());
			 * System.out.println(lt1.getMinute()); }
			 */
			int count = 0;
			Collections.sort(subList);
			for (int j = 0; j <subList.size(); j++) {
				System.out.println(subList.get(j).getSubjectName()+" "+subList.get(j).getStartDate()+" "+subList.get(j).getEndDate());
				for (int z =j+ 1; z <subList.size(); z++) {
				
				
					if ((subList.get(j).getStartDate().compareTo(subList.get(z).getStartDate())<1) && (subList.get(j).getEndDate().compareTo(subList.get(z).getEndDate())>1)) {
						System.out.println("inside logic");
						count++;
					}
				}	
			}
			
			System.out.println(count);
		}

	}

}
