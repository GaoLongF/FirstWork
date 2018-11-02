public class Test {
    public static void main(String args[]){
        //实例化对象
        Person man1=new Person("张x",20,56.6,12345,"cqupt");
        Person man2=new Person("张xx",21,56.61,123456,"cqupt");
        Person man3=new Person("张xxx",22,56.62,1234567,"cqupt");
        Person man4=new Person("张xxxx",23,56.63,12345678,"cqupt");
        Person man5=new Person("张xxxxx",24,56.64,123456789,"cqupt");
        //打印对象信息
        System.out.print(man1+"\n"+man2+"\n"+man3+"\n"+man4+"\n"+man5+"\n");
    }
}
