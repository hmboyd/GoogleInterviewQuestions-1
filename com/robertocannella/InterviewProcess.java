package com.robertocannella;

import com.sun.jdi.request.StepRequest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class InterviewProcess {
    public static int numUniqueEmails(String[] emails) {
        //hashset to hold unique email address
        Set<String> emailSet = new HashSet<>();

        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            //iterate through each character array of each email address
            for (char c : email.toCharArray()) {
                if (c == '.') continue;
                if (c == '+' || c == '@') break;
                sb.append(c);
            }
            //get domain name and append to latest local name
            sb.append(email.substring(email.indexOf("@")));
            //add unique email id to set- to avoid duplicates
            emailSet.add(sb.toString());
        }
        return emailSet.size();
    }
//        // leetCode implementation.
//        Set<String> uniqueEmails = new HashSet<>();
//
//        for(String email: emails) {
//            String[] sections = email.split("@");
//
//            String[] local = sections[0].split("\\+");
//
//            uniqueEmails.add(local[0].replace(".", "") + "@" + sections[1]);
//        }
//        return uniqueEmails.size();
//    }
        // initial implementation
//
//        HashSet<String> uniqueEmails = new HashSet<>();
//
//        String localName;
//        String domainName;
//        for (String email : emails) {
//
//            domainName = email.substring(email.indexOf("@"));
//            localName = email.substring(0, email.indexOf("@"));
//
//            if (localName.contains("+"))
//                 localName = localName.substring(0, localName.indexOf("+"));
//            if (localName.contains("."))
//                 localName = localName.replace(".","");
//
//            localName = localName.concat(domainName);
//            uniqueEmails.add(localName);
//        }
//
//        return uniqueEmails.size();
//    }
}
