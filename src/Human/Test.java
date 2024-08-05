package Human;

public class Test {

        public static void main(String[] args) {
            StutentImpl student = new StutentImpl("Tuan Anh", 25, true);


            student.eat();
            student.sleep();
            student.registerCourse("Programming Node JS");
            student.attendClass();
        }
    }


