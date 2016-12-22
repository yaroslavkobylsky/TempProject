package beans;

import java.util.Date;

public class Company {
    private Long id;
    //----tags ???
    private String name;
    //managedBy ???
    private String phone;
    private String email;
    private String web;
    private String address;
    private Date creationDate;
    private User createdBy;
    private Date modificationDate;
    private User modifiedBy;

    public Company() {
    }
}
