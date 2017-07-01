package org.matt.codefights.arcade.intro;


public class TheJourneyBegins {

    int add(int param1, int param2) {
        return param1 + param2;
    }

    int centuryFromYear(int year) {

        int r = year / 100;

        if (year % 100 != 0) {
            r++;
        }
        return r;
    }
}
