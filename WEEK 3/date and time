**week3:java date and time** 

**import java.io.\*;**

**import java.math.\*;**

**import java.security.\*;**

**import java.text.\*;**

**import java.util.\*;**

**import java.util.concurrent.\*;**

**import java.util.function.\*;**

**import java.util.regex.\*;**

**import java.util.stream.\*;**

**import static java.util.stream.Collectors.joining;**

**import static java.util.stream.Collectors.toList;**

**class Result {**



&#x20;   **public static String findDay(int month, int day, int year) {**

&#x20;       **Calendar cal = Calendar.getInstance();**



&#x20;       **cal.set(year, month - 1, day);**



&#x20;       **return cal.getDisplayName(**

&#x20;           **Calendar.DAY\_OF\_WEEK,**

&#x20;           **Calendar.LONG,**

&#x20;           **Locale.ENGLISH**

&#x20;       **).toUpperCase();**

&#x20;   **}**

**}**

**public class Solution {**

&#x20;   **public static void main(String\[] args) throws IOException {**

&#x20;       **BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));**

&#x20;       **BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT\_PATH")));**



&#x20;       **String\[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\\\s+$", "").split(" ");**



&#x20;       **int month = Integer.parseInt(firstMultipleInput\[0]);**



&#x20;       **int day = Integer.parseInt(firstMultipleInput\[1]);**



&#x20;       **int year = Integer.parseInt(firstMultipleInput\[2]);**



&#x20;       **String res = Result.findDay(month, day, year);**



&#x20;       **bufferedWriter.write(res);**

&#x20;       **bufferedWriter.newLine();**



&#x20;       **bufferedReader.close();**

&#x20;       **bufferedWriter.close();**

&#x20;   **}**

**}**



**output:Input (stdin)**

**08 05 2015**

**Your Output (stdout)**

**WEDNESDAY**

**Expected Output**

**WEDNESDAY**



