package com.i27academy.builds

class Calculator {
    def jenkins

    //constructor
    Calculator(jenkins){
        this.jenkins = jenkins
    }

    def add(fnumber, snumber ){
        //add 2 numbers
        return fnumber+snumber
    }
}