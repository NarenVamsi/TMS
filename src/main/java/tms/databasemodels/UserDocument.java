package tms.databasemodels;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDocument {
    private String employeeCode;
    private String employeeId;
    private String email;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private Long phoneNumber;
}
