package com.example.domo.model;


public class User{
    private Long id;
        private String fullName;
            @Column(unique=true)
                private String email;
                    private String password;
                        private String ADMIN; 
                            private String USER;
                                private LocalDateTime createdAt;
                                    public Long getId() {
                                            return id;
                                                }
                                                    public void setId(Long id) {
                                                            this.id = id;
                                                                }
                                                                    public String getFullName() {
                                                                            return fullName;
                                                                                }
                                                                                    public void setFullName(String fullName) {
                                                                                            this.fullName = fullName;
                                                                                                }
                                                                                                    public String getEmail() {
                                                                                                            return email;
                                                                                                                }
                                                                                                                    public void setEmail(String email) {
                                                                                                                            this.email = email;
                                                                                                                                }
                                                                                                                                    public String getPassword() {
                                                                                                                                            return password;
                                                                                                                                                }
                                                                                                                                                    public void setPassword(String password) {
                                                                                                                                                            this.password = password;
                                                                                                                                                                }
                                                                                                                                                                    public String getADMIN() {
                                                                                                                                                                            return ADMIN;
                                                                                                                                                                                }
                                                                                                                                                                                    public void setADMIN(String aDMIN) {
                                                                                                                                                                                            ADMIN = aDMIN;
                                                                                                                                                                                                }
                                                                                                                                                                                                    public String getUSER() {
                                                                                                                                                                                                            return USER;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                    public void setUSER(String uSER) {
                                                                                                                                                                                                                            USER = uSER;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                    public LocalDateTime getCreatedAt() {
                                                                                                                                                                                                                                            return createdAt;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                    public void setCreatedAt(LocalDateTime createdAt) {
                                                                                                                                                                                                                                                            this.createdAt = createdAt;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                    public User(Long id, String fullName, String email, String password, String aDMIN, String uSER,
                                                                                                                                                                                                                                                                                LocalDateTime createdAt) {
                                                                                                                                                                                                                                                                                        this.id = id;
                                                                                                                                                                                                                                                                                                this.fullName = fullName;
                                                                                                                                                                                                                                                                                                        this.email = email;
                                                                                                                                                                                                                                                                                                                this.password = password;
                                                                                                                                                                                                                                                                                                                        ADMIN = aDMIN;
                                                                                                                                                                                                                                                                                                                                USER = uSER;
                                                                                                                                                                                                                                                                                                                                        this.createdAt = createdAt;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                public User() {
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                        


                                                                                                                                                                                                                                                                                                                                                        }