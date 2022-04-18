package manage;

public class Human {
    private String name;
    private int age;
    private String job;
    private int id;

    public Human() {
    }

    public Human(String name, int age, String job, int id) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Thành Viên{" +
                "Tên : " + name +
                ", Tuổi : " + age +
                ", Công Việc : " + job +
                ", CCCD : " + id +
                '}';
    }
}
