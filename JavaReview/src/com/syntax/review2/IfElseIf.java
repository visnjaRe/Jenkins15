package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {

        /*
        We use it when we have more conditions to test.
         if(boolean condition) code A;}
         }else if( boolean condition) { code B; }
         }else if(boolean condition){ code C;
}
         */

        /* Check homework
        if you completed more than 25 ->Great Job
        if you completed more than >20 ->Good Job
        if you completed more than >10 -> Ok job
        if you completed more than >5 -> not a good job

         */
        int homework=30;

        if(homework>25) {
            System.out.println("Great job");
        }else if(homework>20) {
            System.out.println("Good job");
        }else if(homework>10) {
            System.out.println("Ok job");
        }else if(homework>5) {
            System.out.println("Not a good job");
        }
        System.out.println(".................");

        String browser="chrome";
        if(browser.equals("chrome")) {
            System.out.println("TEst cases executed on chrome browser");
        }else if(browser.equals("safari")) {
            System.out.println("Test cases are executed on safarti browser");
        } else if (browser.equals("firefox")) {
            System.out.println("TEst cases are executed on firefox browser");
        }


    }
}
