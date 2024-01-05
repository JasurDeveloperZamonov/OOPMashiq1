public class Main {
    public static void main(String[] args) {
        Person person=new Person("Malika","Namangan");
        Student student=new Student(person.getName(), person.getAdres(),"intelect",5,15);
        Staff staff=new Staff(person.getName(), person.getAdres(),"IT-School",1500);
        System.out.println("Person: "+person.getName()+"\nAdres: "+person.getAdres());
        System.out.println();
        System.out.println("Student: "+student.getName()+"\nAdres: "+student.getAdres()+"\nProgram: "+student.getProgram()
                +"\nYear: "+student.getYear()+"\nFee: "+student.getFee());
        System.out.println();
        System.out.println("Staff: "+staff.getName()+"\nAdres: "+staff.getAdres()+"\nSchool: "+staff.getSchool()+"\nPay: "+staff.getPay());
    }
}