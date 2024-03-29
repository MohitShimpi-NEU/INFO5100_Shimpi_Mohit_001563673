/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.universityy;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Admin.Adminn;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author mohit shimpi
 */
public class University {

    ArrayList<Department> departmentList;
    String universityName;
    Adminn admin;

    public Adminn getAdmin() {
        return admin;
    }

    public void setAdmin(Adminn admin) {
        this.admin = admin;
    }

    public University(String universityName) {
        this.universityName = universityName;
        departmentList = new ArrayList<>();

    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;

    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        while (!quit) {
            printMainMenu();
            System.out.println("Enter ur choice :");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    boolean lk = false;
                    while (!lk) {
                        System.out.println("__________________________________");
                        System.out.println("|         Enter Admin id:        |");
                        String id = scanne();
                        System.out.println("|         Enter Password:        |");
                        String password = scanne();
                        System.out.println("__________________________________");

                        if (passwordmatcher(id, password)) {

                            printAdminMenu();
                            lk = true;
                        } else {
                            System.out.println("please Enter Correct Credentials and try again:/n");
                        }
                    }
                    //admin.adminStart();

                    break;
                case 2:
                    int k = printDepartmens();

                    boolean blk = false;
                    while (!blk) {
                        System.out.println("_________________________________________");
                        System.out.println("|            Enter Student id:          |");
                        String id = scanne();
                        System.out.println("|            Enter Password:            |");
                        String password = scanne();
                        System.out.println("_________________________________________");

                        if (passwordmatcher2(id, password, departmentList.get(k - 1))) {
                            printStudentMenu(departmentList.get(k - 1), id);
                            blk = true;

                        } else {

                            System.out.println("please Enter Correct Credentials and try again:/n");
                        }
                    }

                    break;
                case 3:
                    int kk = printDepartmens();
                    boolean lblk = false;
                    while (!lblk) {
                        System.out.println("________________________________________");
                        System.out.println("|           Enter Faculty id:          |");
                        String id = scanne();
                        System.out.println("|           Enter Password:            |");
                        String password = scanne();
                        System.out.println("________________________________________");

                        if (passwordmatcher(id, password, departmentList.get(kk - 1))) {

                            printFacultyMenu(departmentList.get(kk - 1), id);
                            lblk = true;
                        } else {
                            System.out.println("please Enter Correct Credentials and try again:/n");
                        }
                    }
                    break;

                case 4:
                    quit = true;
                    break;

                case 5:
                    printMainMenu();
                    break;

            }
        }

    }

    public void printMainMenu() {
        
            System.out.println("______________________________________________________");
            System.out.println("|        Welcome to NEU Portal:                       |");
            System.out.println("|              1.Admin                                |");
            System.out.println("|              2.Student                              |");
            System.out.println("|              3.Faculty                              |");
            System.out.println("|              4.EXIT                                 |");
            System.out.println("|              5.To reprint menu                      |");
            System.out.println("_______________________________________________________");
            
        

    }

    public int printDepartmens() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select Departrment:");
        for (int i = 0; i < departmentList.size(); i++) {
            System.out.println(i + 1 + ". " + departmentList.get(i).getDepartmentName());
        }

        return sc.nextInt();
    }

    public boolean passwordmatcher(String id, String password) {

        if (admin.getName().equals(id)) {
            return admin.getPassword().equals(password);
        } else {
            return false;
        }

    }

    public boolean passwordmatcher(String id, String password, Department d) {

        if (d.getFacultydirectory().findTeachingFaculty(id) == null) {
            return false;
        } else {
            return d.getFacultydirectory().findTeachingFaculty(id).getFacultyPassword().equals(password);
        }

    }

    public boolean passwordmatcher2(String id, String password, Department d) {

        if (d.getStudentDirectory().findStudent(id) == null) {
            return false;
        } else {
            return d.getStudentDirectory().findStudent(id).getStudentPassword().equals(password);
        }

    }

    public void addDepartment(Department dp) {
        departmentList.add(dp);
    }

    public void printStudentMenu(Department dp, String id) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("for student --> " + dp.getStudentDirectory().findStudent(id).getStudentName());
        printstudentoptions();

        boolean quit = false;
        while (!quit) {

            System.out.println("enter your choice: (press 5 to reprint the menu 4 to exit)");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    changePassword(dp, id);

                    break;
                case 2:
                    System.out.println("Enter Course Schedule:");
                    String kk = scanne();
                    getScoreCard(dp, id, kk);
                    break;
                case 3:
                    getSC(dp, id);
                    break;

                case 5:
                    printstudentoptions();
                    break;

                case 4:
                    quit = true;
                    break;

            }
        }
    }

    public void printFacultyMenu(Department dp, String id) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("For Faculty --> " + dp.getFacultydirectory().findTeachingFaculty(id).getFacultyName());
        printfacultyoptions();

        boolean quit = false;
        while (!quit) {

            System.out.println("Enter your choice: {press 4 to reprint the menu 3 to exit}");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("______________________________________");
                    System.out.println("|        Enter Student ID:           |");
                    String cn = scanne();
                    System.out.println("|        Enter Course ID:            |");
                    String ck = scanne();
                    System.out.println("|        Enter Semester:             |");
                    String csk = scanne();
                    System.out.println("|        Enter Student Marks:        |");
                    int cff = scanner.nextInt();
                    System.out.println("______________________________________");

                    dp.getStudentDirectory().findStudent(cn).getCourseLoadBySemester(csk).assigngrades(ck, cff);

                    break;
                case 2:
                    System.out.println("Enter Student ID:");
                    String cnn = scanne();
                    getSC(dp, cnn);
                    break;

                case 4:
                    printfacultyoptions();
                    break;

                case 3:
                    quit = true;
                    break;

            }
        }
    }

    public void printAdminMenu() {
        Scanner scanner = new Scanner(System.in);

        printadminoptions();

        boolean quit = false;
        while (!quit) {

            System.out.println("Select your choice: (Press 11 to reprint the menu 10 to exit)");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewDepartmentToUniversity();

                    break;
                case 2:
                    int mm = printDepartmens();
                    addCoursesToDepartment(departmentList.get(mm - 1));
                    break;
                case 3:
                    int gm = printDepartmens();
                    addCoursesToCourseSchedule(departmentList.get(gm - 1));
                    break;
                case 4:
                    int gmc = printDepartmens();
                    addStudentToTheDepartment(departmentList.get(gmc - 1));
                    break;

                case 5:
                    int ghc = printDepartmens();
                    registerstudenttocourse(departmentList.get(ghc - 1));
                    break;

                case 6:
                    printadminoptions();
                    break;
                case 7:
                    int gk = printDepartmens();
                    departmentList.get(gk - 1).getStudentDirectory().printStudentDirectory();
                    break;

                case 8:
                    int ggk = printDepartmens();
                    System.out.println("|         Enter Semester:           |");
                    String ss = scanne();
                    System.out.println("Total Revenue:  -> " + departmentList.get(ggk - 1).calculateRevenuesBySemester(ss));
                    break;

                case 9:
                     int gmk = printDepartmens();
                    System.out.println("|          Enter Student ID:        |");
                    String kkc= scanne();
                    getSC(departmentList.get(gmk-1),kkc);
                    break;
                case 11:
                    printadminoptions();
                    break;
                case 10:
                    quit = true;
                    break;

            }
        }
    }

    public void changePassword(Department d, String id) {
        boolean k = false;
        while (!k) {
            System.out.println("_______________________________________________________");
            System.out.println("|         Enter Old Password:         |");
            String kk = scanne();
            if (d.getStudentDirectory().findStudent(id).getStudentPassword().equals(kk)) {
                System.out.println("|     Enter New Password:         |");
                String kkc = scanne();
                d.getStudentDirectory().findStudent(id).setPassword(kkc);
                System.out.println("Password UPDATED SUCCESSFULLY..");
                System.out.println("____________________________________________________");
                k = true;
            } else {
                System.out.println("Old Password Incorrect. TRY AGAIN.");
            }
        }
    }

    public void getScoreCard(Department d, String id, String sem) {

        d.getStudentDirectory().findStudent(id).fetchcourselistfromtranscript().get(sem).printScorecard();
    }

    public void getSC(Department d, String id) {
        for (CourseLoad cc : d.getStudentDirectory().findStudent(id).fetchcourselistfromtranscript().values()) {
            cc.printScorecard();
        }
    }

    public void printfacultyoptions() {
            System.out.println("_______________________________________________________");
            System.out.println("|             NEU Faculty Portal:                     |");
            System.out.println("|              1.Change Password                      |");
            System.out.println("|              2.Scorecard {per Semester}             |");
            System.out.println("|              3.Cummulative Scorecard                |");
            System.out.println("|              4.EXIT                                 |");
            System.out.println("|              5.To reprint menu                      |");
            System.out.println("_______________________________________________________");    
     
    }

    public void printstudentoptions() {
            System.out.println("_______________________________________________________");    
            System.out.println("|             NEU Student Portal:                     |");
            System.out.println("|              1.Change Password                      |");
            System.out.println("|              2.Scorecard {per Semester}             |");
            System.out.println("|              3.Cummulative Scorecard                |");
            System.out.println("|              4.EXIT                                 |");
            System.out.println("|              5.To reprint menu                      |");
            System.out.println("_______________________________________________________"); 
    }

    public void printadminoptions() {
            System.out.println("__________________________________________________________");
            System.out.println("|             NEU Admin Portal:                          |");
            System.out.println("|              1.Add Univerity Department                |");
            System.out.println("|              2.Add Department Courses                  |");
            System.out.println("|              3.Create Course Schedule                  |");
            System.out.println("|              4.Add Student to Department               |");
            System.out.println("|              5.Assign Course to Student                |");
            System.out.println("|              6.Remove Student                          |");
            System.out.println("|              7.Student Directory                       |");
            System.out.println("|              8.Department Revenue                      |");
            System.out.println("|              9.Produce MarkSheet (by Student ID)       |");
            System.out.println("|              10.Exit                                   |");
            System.out.println("|              11.To reprint menu                        |");
            System.out.println("__________________________________________________________");
    }

    public static String scanne() {
        Scanner scanner = new Scanner(System.in);
        String sk = scanner.nextLine();
        return sk;
    }

    private void addNewDepartmentToUniversity() {
        Scanner scanner = new Scanner(System.in);
        boolean k = false;
        while (!k) {
            System.out.println("|         Enter New Departments Name:       |");
            Department d = new Department(scanne());
            departmentList.add(d);

            System.out.println("You want to add more Department to University? Press y/n");
            if (scanne().equals("y")) {

            } else {
                k = true;

            }
        }
    }

    public void addCoursesToDepartment(Department d) {
        Scanner scanner = new Scanner(System.in);
        boolean k = false;
        while (!k) {

            System.out.println("|      Enter Course Name:              |");
            String cn = scanne();
            System.out.println("|      Enter Course id:                |");
            String ck = scanne();
            System.out.println("|      Enter Credits for the course:   |");
            int cff = scanner.nextInt();
            d.newCourse(cn, ck, cff);

            System.out.println("You want to add more course to Department " + d.getDepartmentName() + "? Press y/n");
            if (scanne().equals("y")) {

            } else {
                k = true;

            }
        }
    }

    public void addStudentToTheDepartment(Department d) {
        Scanner scanner = new Scanner(System.in);
        boolean k = false;
        while (!k) {
            System.out.println("|        Enter Student Name:       |");
            String cn = scanne();
            System.out.println("|        Enter Student id:         |");
            String ck = scanne();

            if (d.getStudentDirectory().findStudent(ck) == null) {
                Person person = new Person(cn, ck, "111");

                d.getStudentDirectory().newStudentProfile(person);
            } else {
                System.out.println("Unsuccessfull.. Student ID Exists-> " + d.getStudentDirectory().findStudent(ck).getStudentName() + ".");
            }

            System.out.println("If You want to add more Student to the Department " + d.getDepartmentName() + "? Press y/n");
            if (scanne().equals("y")) {

            } else {
                k = true;

            }
        }

    }

    public void addCoursesToCourseSchedule(Department d) {
        Scanner scanner = new Scanner(System.in);
        boolean k = false;
        while (!k) {
            System.out.println("You want to create new semester" + "? Press y/n");

            if (scanne().equals("y")) {
                System.out.println("|         Enter new semeter:                  |");
                System.out.println("_______________________________________________");
                String kk = scanne();
                d.newCourseSchedule(kk);
                System.out.println("Do you want to add courses to this Semester?");
                if (scanne().equals("y")) {
                    addcoursescontinuously(d, kk);
                }
            } else {
                System.out.println("_________________________________________________");
                System.out.println("|   Enter Existing Semester to add courses?     |");
                addcoursescontinuously(d, scanne());
                k = true;

            }
        }
    }

    public void addcoursescontinuously(Department d, String smester) {
        Scanner scanner = new Scanner(System.in);
        boolean k = false;
        while (!k) {
            d.getCourseCatalog().printCourseList();
            System.out.println("Please enter course number you want to add:");
            String kkc = scanne();
            d.getCourseSchedule(smester).newCourseOffer(kkc);
            d.getCourseSchedule(smester).getCourseOfferByNumber(kkc).generatSeats(20);
            System.out.println("Want to add more courses?");
            if (scanne().equals("y")) {
            } else {
                k = true;
            }
        }
    }

    public CourseSchedule checkIfCourseScheduleExist(String semr, Department d) {

        if (d.getCourseSchedule(semr) == null) {
            CourseSchedule cs = d.newCourseSchedule(semr);
            return cs;
        } else {
            return d.getCourseSchedule(semr);
        }

    }

    public void registerstudenttocourse(Department d) {
        System.out.println("enter student id:");
        String kk = scanne();
        System.out.println("enter course number:");
        String cn = scanne();
        System.out.println("enter semseter:");
        String ckk = scanne();

        d.RegisterForAClass(kk, cn, ckk);
    }

    public void registeringStudentWithClass(Department d, String id) {

        System.out.println("Enter semester for registration");
        String sem = scanne();
        d.getCourseCatalog().printCourseList();
        System.out.println("Enter course number in which you want to register:");
        String semr = scanne();

        //      departmentList.get(mmm-1)student.newCourseLoad("Fall2020");
        if (checkIfCourseScheduleExist(sem, d).getCourseOfferByNumber(semr) == null) {
            CourseOffer cpo = checkIfCourseScheduleExist(sem, d).newCourseOffer(semr);

            if (d.getStudentDirectory().findStudent(id).checkCourseLoadAvail(sem) == null) {
                CourseLoad cl = d.getStudentDirectory().findStudent(id).newCourseLoad(sem);

                cl.registerStudent(cl.newSeatAssignment(cpo));

            } else {
                CourseLoad cll = d.getStudentDirectory().findStudent(id).checkCourseLoadAvail(sem);

                cll.registerStudent(cll.newSeatAssignment(cpo));

            }
        } else {
            CourseOffer cop = checkIfCourseScheduleExist(sem, d).getCourseOfferByNumber(semr);

            if (d.getStudentDirectory().findStudent(id).checkCourseLoadAvail(sem) == null) {
                CourseLoad cl = d.getStudentDirectory().findStudent(id).newCourseLoad(sem);

                cl.registerStudent(cl.newSeatAssignment(cop));

            } else {
                CourseLoad cll = d.getStudentDirectory().findStudent(id).checkCourseLoadAvail(sem);

                cll.registerStudent(cll.newSeatAssignment(cop));

            }
        }
    }

}
