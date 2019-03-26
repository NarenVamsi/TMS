package tms.realentities;


import lombok.Builder;

@Builder
public class User {
    private String employeeId;
    private String email;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private Long phoneNumber;
}
