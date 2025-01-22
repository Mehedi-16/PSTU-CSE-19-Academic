public class main2 {
    public static void main(String[] args) {
        member m1= new member();
        m1.name="Mehedi";
        m1.address="Kurigram";
        m1.age=21;
        m1.salary=20201;
        System.out.println("-----Member Details:-----");
        System.out.println("name:   "+m1.name);
        System.out.println("age:  "+m1.age);
        m1.printsalary();
        
        employe e1= new employe();
        e1.name="kaiyum mota";
        e1.phn= 012021;
        System.out.println();
        System.out.println("-----Empoloye detrails---");
        System.out.println("Name: "+e1.name);
        System.out.println("phn: "+e1.phn);

        

    }
}
