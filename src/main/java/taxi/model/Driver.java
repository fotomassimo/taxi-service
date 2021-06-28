package taxi.model;

import java.util.Objects;

public class Driver {
    private Long id;
    private String firstName;
    private String lastName;
    private String licenseNumber;
    private String login;
    private String password;
    private byte[] salt;

    public Driver(String firstName, String lastName, String licenseNumber,
                  String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenseNumber = licenseNumber;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getSalt() {
        return salt;
    }

    public void setSalt(byte[] salt) {
        this.salt = salt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Driver driver = (Driver) o;
        return Objects.equals(id, driver.id)
                && Objects.equals(firstName, driver.firstName)
                && Objects.equals(lastName, driver.lastName)
                && Objects.equals(licenseNumber, driver.licenseNumber)
                && Objects.equals(login, driver.login)
                && Objects.equals(password, driver.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, licenseNumber, login, password);
    }

    @Override
    public String toString() {
        return "Driver{"
                + " id=" + id
                + ", firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + ", licenseNumber='" + licenseNumber + '\''
                + ", login='" + login + '\''
                + '}';
    }
}
