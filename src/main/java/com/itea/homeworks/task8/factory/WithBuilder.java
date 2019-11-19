package com.itea.homeworks.task8.factory;

public class WithBuilder implements Pattern{
    private String name;
    private String surname;
    private int age;
    private double weight;

    public static class Builder {
        private WithBuilder withBuilder;

        public Builder() {
            withBuilder = new WithBuilder();
        }

        public Builder withName(String name){
            withBuilder.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            withBuilder.surname = surname;
            return this;
        }

        public Builder withAge(int age){
            withBuilder.age = age;
            return this;
        }

        public Builder withWeight(double weight){
            withBuilder.weight = weight;
            return this;
        }
    }
}
