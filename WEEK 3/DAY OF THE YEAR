# WEEK3:DAY OF THE YEAR

class Solution {

&#x20;   public int dayOfYear(String date) {

&#x20;       // Parse year, month, and day from the string

&#x20;       int year = Integer.parseInt(date.substring(0, 4));

&#x20;       int month = Integer.parseInt(date.substring(5, 7));

&#x20;       int day = Integer.parseInt(date.substring(8, 10));

&#x20;       

&#x20;       // Days in each month for a non-leap year

&#x20;       int\[] daysInMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

&#x20;       

&#x20;       // Check for a leap year

&#x20;       // A year is a leap year if it is divisible by 4, except for end-of-century years 

&#x20;       // which must be divisible by 400. (Note: Constraints limit the year up to 2019, 

&#x20;       // meaning 1900 is the only century year to consider, which is NOT a leap year).

&#x20;       if ((year % 4 == 0 \&\& year % 100 != 0) || (year % 400 == 0)) {

&#x20;           daysInMonths\[2] = 29;

&#x20;       }

&#x20;       

&#x20;       // Sum up the days of the preceding months plus the current day

&#x20;       int totalDays = day;

&#x20;       for (int i = 1; i < month; i++) {

&#x20;           totalDays += daysInMonths\[i];

&#x20;       }

&#x20;       

&#x20;       return totalDays;

&#x20;   }

}

## OUTPUT:



Case 1

Case 2

Input

date =

"2019-01-09"

Output

9

Expected

9

