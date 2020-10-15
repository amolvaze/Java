import java.util.*;
class Person {

    String fname;

    int age;

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Person(String fname,  int age) {
        this.fname = fname;

        this.age = age;
    }

    @Override
    public String toString() {
        return fname  + age;
    }
}

class Main {
  public static void main(String[] args) {
     List<Person> persons = new ArrayList();
    persons.add(new Person("tarun", 28));
    persons.add(new Person("arun", 29));
    persons.add(new Person("varun", 12));
    persons.add(new Person("arun", 22));

  Collections.sort(persons, new Comparator<Person>() {

   public int compare(Person t1, Person t2) {
   int comp = t1.getFname().compareTo(t2.getFname());
   if(comp!=0){
     return comp;
   } 
  
  return t1.getAge()-t2.getAge();

   }

  });

    System.out.println(persons+" ");
  }
}
