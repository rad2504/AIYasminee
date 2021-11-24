package com.studentlist;

import java.util.ArrayList;
import java.util.Objects;
//import java.util.*;


public class OperationsOnStudentData {
    protected String name;
    protected long roegNo;
    protected char staff;
//    List<List> studentdata=new ArrayList<>();
    public OperationsOnStudentData(String name,long rolNo,char staff) throws WrongStaffInput
    {
        this.name=name;
        this.roegNo =rolNo;
        this.staff=staff;
        if(staff!='t' && staff!='T' && staff!='n' && staff!='N')
        {
            throw new WrongStaffInput();
        }
    }

    ArrayList<String> listOfNames=new ArrayList<>();
    ArrayList<Long> listOfRolNo =new ArrayList<>();

    public ArrayList<String> getListOfNames() {
        return listOfNames;
    }

    public ArrayList<Long> getListOfRolNo() {
        return listOfRolNo;
    }

    public void setNames(ArrayList<String> listOfNames,String name,char staff) throws NoAcessForNonTeachingStaff{
        if(staff!='t' && staff!='T')
        {
            throw new NoAcessForNonTeachingStaff();
        }
        listOfNames.add(name);
    }

    public void setRolNo(ArrayList<Long> listOfRolNo, long RolNo, char staff) throws NoAcessForNonTeachingStaff, RollNumberAlreadyMentioned{
        if(staff!='t' && staff!='T')
        {
            throw new NoAcessForNonTeachingStaff();
        }
        for (Long aLong : listOfRolNo) {
            if (Objects.equals(aLong, RolNo)) {
                throw new RollNumberAlreadyMentioned();

            }
        }

        listOfRolNo.add(RolNo);
    }

    public void removeName(ArrayList<String> listOfNames,String name,char staff) throws NoAcessForNonTeachingStaff
    {
        if(staff!='t' && staff!='T')
        {
            throw new NoAcessForNonTeachingStaff();
        }
        int flag=0;
        for(int i=0;i<listOfNames.size();i++)
        {
            if(Objects.equals(listOfNames.get(i), name))
            {
                flag=1;
                listOfNames.remove(name);

            }
        }
        if(flag==0)
        {
            System.out.println("Name is not present in the list");
        }

    }

    public void removeListOfRolNo(ArrayList<Long> listOfRolNo,long rolNo,char staff) throws NoAcessForNonTeachingStaff
    {
        if(staff!='t' && staff!='T')
        {
            throw new NoAcessForNonTeachingStaff();
        }
        int flag=0;
        for(int i=0;i<listOfRolNo.size();i++)
        {
            if(Objects.equals(listOfRolNo.get(i),rolNo))
            {
                flag=1;
                listOfRolNo.remove(rolNo);


            }
        }
        if(flag==0)
        {
            System.out.println("RolLNo is not present in the list");
        }

    }


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
//    ArrayList<OperationsOnStudentData> student=new ArrayList<OperationsOnStudentData>();
//    student.add();
}
