package com.robertocannella;

import java.util.HashSet;
import java.util.Locale;

public class InterviewProcess {
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmails = new HashSet<>();
        String localName;
        String domainName;
        for (String email : emails) {
            domainName = email.substring(email.indexOf("@"));
            localName = email.substring(0, email.indexOf("@"));

            if (localName.contains("+"))
                 localName = localName.substring(0, localName.indexOf("+"));
            if (localName.contains("."))
                 localName = localName.replace(".","");

            localName = localName.concat(domainName);
            uniqueEmails.add(localName);
        }

        return uniqueEmails.size();
    }
}
