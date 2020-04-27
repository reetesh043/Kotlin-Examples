package com.reet.kotlin;

public class Test {

    public static void main(String [] args){
        String str = "{error: Validation Failed...., errmsg: EMAIL_EXISTS, data: [{value: sujeeth91171@gmail.com, msg: EMAIL_EXISTS, param: email, location: body}]}";

        System.out.println(str.contains("EMAIL_EXISTS"));
    }
}
