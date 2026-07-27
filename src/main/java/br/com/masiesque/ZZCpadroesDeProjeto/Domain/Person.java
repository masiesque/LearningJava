package br.com.masiesque.ZZCpadroesDeProjeto.Domain;

public class Person {
    
    private String firstName;
    private String lastName;
    private  String userName;
    private String email;


    private Person(String name, String lastName, String userName, String email) {
        this.firstName = name;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public static final class PersonBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        private PersonBuilder() {
        }

        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            Person person = new Person(null, lastName, userName, email);
            person.firstName = this.firstName;
            return person;
        }
    }
}
