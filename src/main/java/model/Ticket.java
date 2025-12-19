package com.example.domo.model;

public class Ticket{
    @Id
     private Long id;
     private String subject;
     private String description;
     private String OPEN;
     private String IN_PROGRESS;
     private String RESOLVED;
     private String CLOSED;
     private LocalDateTime createdAt;
     public Long getId() {
         return id;
     }
     public void setId(Long id) {
         this.id = id;
     }
     public String getSubject() {
         return subject;
     }
     public void setSubject(String subject) {
         this.subject = subject;
     }
     public String getDescription() {
         return description;
     }
     public void setDescription(String description) {
         this.description = description;
     }
     public String getOPEN() {
         return OPEN;
     }
     public void setOPEN(String oPEN) {
         OPEN = oPEN;
     }
     public String getIN_PROGRESS() {
         return IN_PROGRESS;
     }
     public void setIN_PROGRESS(String iN_PROGRESS) {
         IN_PROGRESS = iN_PROGRESS;
     }
     public String getRESOLVED() {
         return RESOLVED;
     }
     public void setRESOLVED(String rESOLVED) {
         RESOLVED = rESOLVED;
     }
     public String getCLOSED() {
         return CLOSED;
     }
     public void setCLOSED(String cLOSED) {
         CLOSED = cLOSED;
     }
     public LocalDateTime getCreatedAt() {
         return createdAt;
     }
     public void setCreatedAt(LocalDateTime createdAt) {
         this.createdAt = createdAt;
     }
     public Ticket(Long id, String subject, String description, String oPEN, String iN_PROGRESS, String rESOLVED,
            String cLOSED, LocalDateTime createdAt) {
        this.id = id;
        this.subject = subject;
        this.description = description;
        OPEN = oPEN;
        IN_PROGRESS = iN_PROGRESS;
        RESOLVED = rESOLVED;
        CLOSED = cLOSED;
        this.createdAt = createdAt;
     }
     public Ticket() {
     }
     

}