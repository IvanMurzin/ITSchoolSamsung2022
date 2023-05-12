package ru.ivanmurzin.testserver.model;

public class User {
    public static class Pet {
        private String name;
        private String type;
        private int age;

        public Pet(String name, String type, int age) {
            this.name = name;
            this.type = type;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


    private Long id;
    private String name;
    private String email;
    private Pet pet;

    public User(Long id, String name, String email, Pet pet) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
