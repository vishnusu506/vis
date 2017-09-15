import java.util.Date;
import java.util.ArrayList;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int size;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	 public StudentGroup()
	 {
		 students = new int[20];
		 size=0;
	 }
	public StudentGroup(int length) {
		this.students = new Student[length];
		length=new int[20];
		size=0;
	}
	public StudentGroup(int cap)
	{
		int cap;
		if(cap<20)
			students=new int[cap];
		size=0;
	}
	public void bal(int mincap)
	{
		int ocap= students.length;
		if(mincap>ocap)
		{
			int newcap=(ocap*2);
			if(newcap<mincap)
				newcap=ocap;
			students=Array.copyOf(students,newcap);
		}
		
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students==null)
			throw new IllegalArgumentException("array is null");
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		if(index<0 || index >= students.length)
			throw new IllegalArgumentException("no data in array");
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudent(Student student, int index) {
		if(students==null)
			throw new IllegalArgumentException("array is empty");
		for(int i=0;i<students.length;i++)
		{
			if(i==index)
				students[i]=student;
		}
		
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		if(students==null)
			throw new IllegalArgumentException("array is em,pty");
		students[0]=student;
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		if(students==null)
			throw new IllegalArgumentException("array is em,pty");
		students[students.length-1]=student;
		// Add your implementation here
		
	}

	@Override
	public void add(Student student, int index) {
		if(students==null && (index<0 ||index>=students.length))
			throw new IllegalArgumentException("array is em,pty");
		for(int i;i<=students.length;i++)
		{
			if(i==index)
				students[i]=student;
		}
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		if(students==null)
			throw new IllegalArgumentException("array is em,pty");
		for(int i;i<=students.length;i++)
		{
			if(i==index)
			{				
			students[i]==null;
			}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
