
public class Test_Student_BirthDate {

    public static void main(String[] args) {
        Student student = new Student(111223333, 1970, 5, 3);
        BirthDate date = student.getBirthDate();
        date.setYear(2010); // Now the student birth year is changed!  }}
        System.out.println("ID: "+ student.getId()+", "+ student.getBirthDate());
    }

}
