class Person {
    private String name;

    public String getName(){
        return name;
    }

    public Person(String personName) {
        name = personName;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }

    public static void main(String[] args) {
        Person brett = new Person("John");
        System.out.println(brett.getName());

        brett.sayHello();

        brett.setName("Brett");
        System.out.println(brett.getName());

        brett.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
