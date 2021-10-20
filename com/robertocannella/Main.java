package com.robertocannella;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
       // String[] emails = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        int numberOfEmails = InterviewProcess.numUniqueEmails(emails);
        System.out.println(Arrays.toString(emails));
        System.out.println(numberOfEmails);
    }
}
