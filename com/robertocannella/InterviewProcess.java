package com.robertocannella;


import java.util.*;

public class InterviewProcess {
    public static int oddEvenJumps(int[] arr) {
    // [1,2,3,4,5,6,7]
        //
        // odd
        // even
        int n  = arr.length;
        int result = 1;

        boolean[] higher = new boolean[n];
        boolean[]lower = new boolean[n];

        higher[n - 1] = lower[n - 1] = true;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        map.put(arr[n - 1], n - 1);
        for (int i = n - 2; i >= 0; --i) {
            Map.Entry<Integer, Integer> hi = map.ceilingEntry(arr[i]);
            Map.Entry<Integer, Integer> lo = map.floorEntry(arr[i]);
            if (hi != null)
                higher[i] = lower[hi.getValue()];
            if (lo != null)
                lower[i] = higher[lo.getValue()];
            if (higher[i])
                result++;

            map.put(arr[i], i);
        }
        return result;
    }
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
            //get domain name and append to the latest local name
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
