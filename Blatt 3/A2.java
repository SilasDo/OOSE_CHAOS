public class A2{
    public static void main(String[] args) {
        //c
        Mensch myMensch = new Mensch(22, 'M', "Dekaw");
        Student myStudent = new Student(22, 'W', "Frida", "232152512");
        System.out.println(myMensch.getTyp());
        System.out.println(myStudent.getTyp());
        myStudent.ausgabe();

        //d
        Mensch[] myArr = {
            new Mensch(15,'W',"Lena"),
            new Mensch(21,'M',"Peter"),
            new Student(22, 'M', "Hans", "232152511"),
            new Student(22, 'W', "Frida", "232152513")
        };
        for (Mensch ele : myArr) {
            System.out.println(ele.getTyp()+" - "+ele.getName());
        }
    }
}
//a
class Mensch{
    protected int alter;
    protected char geschlecht;
    protected String name;

    public Mensch(int alter,char geschlecht,String name){
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.name =name;
    }

    public String getTyp(){
        return "Mensch";
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//b
class Student extends Mensch{
    protected String matrikelnummer;
    public Student(int alter,char geschlecht,String name,String matrikelnummer){
        super(alter, geschlecht, name);
        this.matrikelnummer = matrikelnummer;
    }
    public String getTyp(){
        return "Student";
    }


    public String getMatrikelnummer() {
        return matrikelnummer;
    }
    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }
    
    public void ausgabe(){
        System.out.println(matrikelnummer+" "+name+" "+geschlecht+" "+alter);
    }
}