package builder;

/**
 * Created by gurinder on 24/7/16.
 */
public class Employee {
    private final int id;
    private final String name;
    private final String dept;
    private final String phone;

    private Employee(int id, String name, String dept, String phone) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getPhone() {
        return phone;
    }

    static class Builder {
        private int id;
        private String name;
        private String dept;
        private String phone;

        public Builder() {
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDept(String dept) {
            this.dept = dept;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Employee build() {
            return new Employee(id, name, dept, phone);
        }
    }
}
