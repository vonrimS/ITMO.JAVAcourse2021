package com.company.Lesson05_ClassWork;

public class Account {
    private long id;
    private String code;
    private boolean isOpen;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}

class BankAccount{
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(1000_000_000L);
        account.setCode("546549879875613213543");
        account.setOpen(true);

        System.out.println(account.getId());
        System.out.println(account.getCode());
        System.out.println(account.isOpen());
    }
}
