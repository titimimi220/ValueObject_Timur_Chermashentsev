package org.account;

public class Account {
    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String password;
    private final String confirmedPassword;
    private final String month;
    private final int day;
    private final int year;
    private final String gender;
    private final String phone;

    public Account(AccountBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.userName = builder.userName;
        this.password = builder.password;
        this.confirmedPassword = builder.confirmedPassword;
        this.month = builder.month;
        this.day = builder.day;
        this.year = builder.year;
        this.gender = builder.gender;
        this.phone = builder.phone;
    }

    public static class AccountBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String password;
        private String confirmedPassword;
        private String month;
        private int day;
        private int year;
        private String gender;
        private String phone;

        public AccountBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public AccountBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public AccountBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public AccountBuilder password(String password) {
            this.password = password;
            return this;
        }

        public AccountBuilder confirmedPassword(String confirmedPassword) {
            this.confirmedPassword = confirmedPassword;
            return this;
        }

        public AccountBuilder month(String month) {
            this.month = month;
            return this;
        }

        public AccountBuilder day(int day) {
            this.day = day;
            return this;
        }

        public AccountBuilder year(int year) {
            this.year = year;
            return this;
        }

        public AccountBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public AccountBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}
