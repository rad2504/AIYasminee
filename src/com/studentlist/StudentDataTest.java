package com.studentlist;

import java.util.ArrayList;

public class StudentDataTest {
    public static void main(String[] args) throws NoAcessForNonTeachingStaff, WrongStaffInput, RollNumberAlreadyMentioned {

        // write your code here
        OperationsOnStudentData operationPerform=new OperationsOnStudentData("Radhika",7,'t');
        ArrayList<Long> regNo=new ArrayList<>();
        ArrayList<String> name=new ArrayList<>();

        regNo.add(456666L);
        name.add("ABC");
        regNo.add(56477L);
        name.add("RCD");
        regNo.add(6547L);
        name.add("RRR");

        operationPerform.setRolNo(regNo,67555L,'t');
        operationPerform.setNames(name,"RK",'t');
        operationPerform.removeName(name,"RK",'t');
        operationPerform.removeListOfRolNo(regNo,67555L,'t');
        operationPerform.setRolNo(regNo,555L,'t');

        ArrayList<String> getStudentNames=operationPerform.getListOfNames();
        ArrayList<Long> getStudentRollNo=operationPerform.getListOfRolNo();
        for (Long aLong : getStudentRollNo) {
            System.out.println(aLong);
        }
        for (String getStudentName : getStudentNames) {
            System.out.println(getStudentName);
        }
    }
    ArrayList<OperationsOnStudentData> student= new ArrayList<>();
    student.add();


}
