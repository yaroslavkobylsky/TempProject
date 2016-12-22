package beans;

import java.util.Date;

public class Contact {
    private Long id;
    private String firstName;
    private String lastName;
    // tags ??????????????
    private User managedBy; //???
    private String position; //?????????
    // phone type ??????????
    private String phone;
    private String email;
    private String skype;
    private Company company;
    private String note;
    private Date creationDate;
    private User createdBy;
    private Date modificationDate;
    private User modifiedBy;
}
