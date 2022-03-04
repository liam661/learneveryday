package liam.year22.design.builder;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/16 19:49
 **/
public class Person {
    String id;
    String name;
    int age;
    double weight;
    int score;
    Location loc;

    private Person() {}

    public static class PersonBuilder {
        Person person = new Person();

        public PersonBuilder basicInfo(String id, String name, int age){
            person.id = id;
            person.name = name;
            person.age = age;
            return this;
        }

        public PersonBuilder weight(double weight){
            person.weight = weight;
            return this;
        }

        public PersonBuilder score(int score){
            person.score = score;
            return this;
        }

        public PersonBuilder loc(String street, String roomNo){
            person.loc = new Location(street, roomNo);
            return this;
        }

        public Person build(){
            return person;
        }
    }
}

class Location{
    String street;
    String roomNo;

    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}

