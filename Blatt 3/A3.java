public class A3{
    public static void main(String[] args) {
        Mensch[] myArr1 = {
            new Mensch(15,'W',"Lena"),
            new Mensch(21,'M',"Peter"),
            new Student(22, 'M', "Hans", "2323"),
            new Student(22, 'W', "Frida", "2321")
        };
        for (Mensch ele : myArr1) {
            System.out.print(ele.getTyp()+":");
            if(ele instanceof Student){
                ((Student)ele).ausgabe();
            }
            else{
                System.out.println(ele.getName());
            }
        }
    }
}