package com.itea.homeworks.task8.prototype;

public class PersonFactory {
    Person person;

    public PersonFactory(Person person) {
        this.person = person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    Person clonePerson(){
        return (Person) person.clone();
    }
}
