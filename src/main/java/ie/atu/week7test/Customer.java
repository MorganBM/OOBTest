package ie.atu.week7test;

public class Customer {
        private String customerId;
        private String name;
        private String email;
        private String phoneNumber;

    public Customer() {
        this.customerId = "";
        this.name = "";
        this.email = "";
        this.phoneNumber = "";
    }

    public Customer(String customerId, String name, String email, String phoneNumber) {
        this.customerId = "";
        this.name = "";
        this.email = "";
        this.phoneNumber = "";
    }

    public void setCustomerId() {
        this.customerId = "";
    }

    public void setName() {
        this.name = "";
    }

    public void setEmail() {
        this.email = "";
    }

    public void setPhoneNumber() {
        this.phoneNumber = "";
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}



