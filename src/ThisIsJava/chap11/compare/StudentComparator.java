package compare;

import java.util.Comparator;

import compare.CompareExample.Student;

abstract class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		/*
		 * if(a.sno<b.sno) return -1; else if(a.sno == b.sno) return 0; else return 1;
		 */
		return Integer.compare(a.sno, b.sno);
	}
}