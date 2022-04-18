package manage;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class family {
    ArrayList<Human> humans = new ArrayList<>();
    private String address;
    private int number;
    Scanner a = new Scanner(System.in);

    public family() {
    }

    public family(String address, int number) {
        this.address = address;
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Human human() {
        System.out.println("----- Nhập thông tin thành viên");
        System.out.println("Nhập tên thành viên");
        String name = (a.nextLine());
        System.out.println(("Nhập tuổi thành viên"));
        int age = Integer.parseInt(a.nextLine());
        System.out.println("Nhập công việc");
        String job = a.nextLine();
        System.out.println("Nhập căn cước công dân");
        int id = Integer.parseInt(a.nextLine());
        System.out.println("-------------------------------");

        Human human = new Human(name, age, job, id);
        return human;
    }

    public void add() {
        Human hm = human();
        humans.add(hm);
    }

    public int findByName(String name) {
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void delete() {
        int viTri = findByName(a.nextLine());
        if (viTri != -1) {
            humans.remove(viTri);
        } else {
            System.out.println("Không có đâu bé ơiii");
        }
    }

    public void edit() {
        int indexOfHuman = findByName(a.nextLine());
        if (indexOfHuman == -1) {
            System.out.println("Không có");
        } else {
            humans.set(indexOfHuman, human());
        }
    }

    public void display() {
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i));
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("-------Menu-------");
            System.out.println("1. Thêm thành viên");
            System.out.println("2. Xóa thành viên");
            System.out.println("3. Sửa thành viên");
            System.out.println("4. Hiển thị");
            System.out.println("0. Thoát");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    display();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
