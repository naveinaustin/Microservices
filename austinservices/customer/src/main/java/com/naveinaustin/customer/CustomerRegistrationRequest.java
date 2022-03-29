package com.naveinaustin.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;

    //Replaced with @NoArgsConstructor
   /* public CustomerRegistrationRequest() {

    }*/

   //Replaced with @AllArgsConstructor
    /*public CustomerRegistrationRequest(String firstName,
                                       String lastName,
                                       String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }*/

    //Replaced with @Data
    /*public String getFirstName() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }*/
}
