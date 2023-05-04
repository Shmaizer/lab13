package ru.javacore;

/**
 * Hello world!
 *
 */
public class App 
{
    static class Tester
    {
        private String name;
        private String surname;
        private int expirienceInYears;
        private int englishLevel;
        private double salary;
        public Tester(String name,String surname,int expirienceInYears)
        {
            this(name,surname,expirienceInYears,1,1.0);
        }
        public Tester(String name,String surname,int expirienceInYears,int englishLevel)
        {
            this(name,surname,expirienceInYears,englishLevel,0.0);
        }
        public Tester(String name,String surname,int expirienceInYears,int englishLevel,double salary)
        {
            this.name = name;
            this.surname = surname;
            this.expirienceInYears = expirienceInYears;
            this.englishLevel = englishLevel;
            this.salary = salary;
        }

        public void getInfo(){
            System.out.println("Имя: "+this.name+" Фамилия: "+this.surname+" Опыт работы: "+this.expirienceInYears+" Уровень анг.: "+this.englishLevel+" Зарплата: "+this.salary);
        }
        public static void getSInfo(Tester tester){
            System.out.println("Имя: "+tester.name+" Фамилия: "+tester.surname+" Опыт работы: "+tester.expirienceInYears+" Уровень анг.: "+tester.englishLevel+" Зарплата: "+tester.salary);
        }
        public void rasSalary(){
            System.out.println("Зарплата(1): "+this.salary);
        }
        public void rasSalary(double dop){
            System.out.println("Зарплата(2): "+(this.salary+dop));
        }
        public void rasSalary(double dop, double x){
            System.out.println("Зарплата(3): "+(this.salary+dop)*x);
        }
    }
    public static void getSInfo(Tester tester){
        System.out.println("Имя: "+tester.name+" Фамилия: "+tester.surname+" Опыт работы: "+tester.expirienceInYears+" Уровень анг.: "+tester.englishLevel+" Зарплата: "+tester.salary);
    }
    public static void main( String[] args )
    {
        Tester n0 = new Tester("Валерий","Абмётка",10);
        getSInfo(n0);
        //System.out.println("Hello");
    }
}
