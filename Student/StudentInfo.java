package Student;

public class StudentInfo {
    String name, _class;
    int roll;
    float percent;

    public StudentInfo(String name, String _class, int roll, int[] subs){
        this.name = name;
        this._class = _class;
        this.roll = roll;
        this.percent = Studentper.getPercent(subs);
    }

    public void display(){
        System.out.println("name: "+ name);
        System.out.println("class: "+ _class);
        System.out.println("roll no: "+ roll);
        System.out.println("percentage: "+ percent +"%");

    }

}
