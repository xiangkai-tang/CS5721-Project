package model;

import java.sql.Timestamp;
import java.util.List;

public class UserModel {
    private Long userId;
    private String firstName;
    private String lastName;
    private int gender;
    private Timestamp birthDate;
    private String address;
    private String email;
    private String contactNum;
    private List<UserAccountModel> userAccountList;
    private List<UserPayeeModel> userPayeeList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public List<UserAccountModel> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(List<UserAccountModel> userAccountList) {
        this.userAccountList = userAccountList;
    }

    public List<UserPayeeModel> getUserPayeeList() {
        return userPayeeList;
    }

    public void setUserPayeeList(List<UserPayeeModel> userPayeeList) {
        this.userPayeeList = userPayeeList;
    }
}
