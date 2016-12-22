package beans;

import java.util.Date;

public class Task {
    private Long id;
    // period ????
    private Date date;
    private User namagedBy; //?????
    // type enum ???
    private String note;
    private Date creationDate;
    private User createdBy;
    private Date modificationDate;
    private User modifiedBy;

    public Task() {
    }
}
