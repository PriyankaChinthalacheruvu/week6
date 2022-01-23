package com.greatlearning.designpatter2;

public class Employee {

    //mandatory
    private int accno;
    private String typacc;
    private String branch;
    private int balance;

    //optional
    private int atm_transactions;
    private String emiSchedule;

    // Creating Constr. Using EmployeeBuilder
    public Employee(EmployeeBuilder employee) {
        this.accno= employee.accno;
        this.typacc= employee.typacc;
        this.branch= employee.branch;
        this.balance = employee.balance;

        this.atm_transactions= employee.atm_transactions;
        this.emiSchedule= employee.emiSchedule;
    }


    public static class EmployeeBuilder { // BUILDER DESIGN PATTERN

        //mandatory
        private int accno;
        private String typacc;
        private String branch;
        private int balance;

        //optional
        private int atm_transactions;
        private String emiSchedule;

        public EmployeeBuilder(int accno,String typacc,String branch,int balance){
            this.accno=accno;
            this.typacc=typacc;
            this.branch=branch;
            this.balance=balance;

        }
//Design Pattern
        public EmployeeBuilder setAtm_transactions(int atm_transactions){
            this.atm_transactions=atm_transactions;
            return this;
        }

        public EmployeeBuilder setEmiSchedule(String emiSchedule){
            this.emiSchedule=emiSchedule;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }


    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getTypacc() {
        return typacc;
    }

    public void setTypacc(String typacc) {
        this.typacc = typacc;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //getter setter for optional

    public int getAtm_transactions() {
        return atm_transactions;
    }

    public void setAtm_transactions(int atm_transactions) {
        this.atm_transactions = atm_transactions;
    }

    public String getEmiSchedule() {
        return emiSchedule;
    }

    public void setEmiSchedule(String emiSchedule) {
        this.emiSchedule = emiSchedule;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "accno=" + accno +
                ", typacc='" + typacc + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", atm_transactions=" + atm_transactions +
                ", emiSchedule='" + emiSchedule + '\'' +
                '}';
    }
}
