package practice07;

public class Teacher extends Person{
    private Klass klass;
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher(String name, int age, Klass klass, Student student) {
        super(name, age);
        this.klass = klass;
        this.student = student;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);

    }
    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
       if(this.getKlass()==null) {
           return super.introduce() + " I am a Teacher. I teach No Class.";
       }else{
           return super.introduce()+" I am a Teacher. I teach "+this.getKlass().getDisplayName()+".";
       }

    }
    public String introduceWith(Student student){
        if(student.getKlass().getNumber()==this.getKlass().getNumber()){
        return  super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }else {
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
    }
}
