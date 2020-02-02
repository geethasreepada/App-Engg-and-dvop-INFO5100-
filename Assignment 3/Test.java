public class Test {
    public static void main(String[] args) {
        Student student = new Student("Geetha", 22);
        Course course = new Course("Information Sciences");

        System.out.println(course.Registerstudent(student));
    }
}
     class Student {
         String name;
         int id;

    public Student(String name,int id){
        this.name=name;
        this.id=id;}
        public  String getName(){
        return this.name;}
        public  int getId() {
            return this.id;

        }

    }
    class Course {
        String coursename;
        int numberofstudentsregistered=0;
        int maxcapacity = 10;
        Student[] registered=new Student[maxcapacity];
        public Course(String coursename){
            this.coursename=coursename;
        }

   public Student[] getStudents(){
           return registered;
        }
        public Boolean isfull() {
            if (numberofstudentsregistered == maxcapacity) {
                return true;
            } else {
                return false;
            }
        }
            public String Registerstudent (Student student){
       String message="m";
                if (isfull()) {
                    System.out.println("Capacity is full");
                } else {

                    message= "A student " + student.name + "with id" + student.id + "is registered for the course:"+this.coursename;

                }
               return message;
                }


    }








