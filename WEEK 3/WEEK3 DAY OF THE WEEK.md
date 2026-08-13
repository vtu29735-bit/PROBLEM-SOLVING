# WEEK3 DAY OF THE WEEK:

import java.time.LocalDate;



class Solution {

&#x20;   public String dayOfTheWeek(int day, int month, int year) {

&#x20;       LocalDate date = LocalDate.of(year, month, day);

&#x20;       // Get the English name of the day (e.g., "SUNDAY", "MONDAY", etc.)

&#x20;       // LeetCode expects the first letter capitalized and the rest lowercase.

&#x20;       String dayOfWeek = date.getDayOfWeek().name();

&#x20;       

&#x20;       return dayOfWeek.substring(0, 1).toUpperCase() + 

&#x20;              dayOfWeek.substring(1).toLowerCase();

&#x20;   }



}

## output:

Case1

Input

day =

31

month =

8

year =

2019

Output

"Saturday"

Expected

"Saturday"

