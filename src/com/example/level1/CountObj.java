package com.example.level1;

public class CountObj {
    static int count=0;
    public CountObj(){
        count++;
    }
        public static int getcount()
        {
            return count;
        }
    public static void main(String[] args) {
        CountObj obj1=new CountObj();
        CountObj obj2=new CountObj();
        CountObj obj3=new CountObj();
        System.out.println("The number of obj are:" + CountObj.getcount());
        }
    }
