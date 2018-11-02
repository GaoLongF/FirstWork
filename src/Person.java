public class Person {
    //成员属性
    private String name;
    private int age;
    private double weight;
    private int qqnum;
    private String school;

    public Person() {

    }

    //通过构造函数初始化
    public Person(String name, int age, double weight, int qqnum, String school) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.qqnum = qqnum;
        this.school = school;
    }
    //重载tostring方法
    @Override
    public String toString() {
        return "信息如下：\n" +
                "\"name\":\"" + name + "\",\n" +
                "\"age\":" + age +",\n"+
                "\"weight\":" + weight +",\n"+
                "\"QQnum\":" + qqnum +",\n"+
                "\"school\":\"" + school+"\"";
    }
}
