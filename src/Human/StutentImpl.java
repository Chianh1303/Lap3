package Human;

public class StutentImpl extends People implements Student {

    public StutentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }


    @Override
    public void eat() {
        System.out.println("eat banana");
    }
    @Override
    public void sleep() {
        System.out.println("go to sleep");
    }


    @Override
    public void registerCourse(String course) {

    }


    @Override
    public void attendClass() {
        // lệnh thực thi
    }
}



