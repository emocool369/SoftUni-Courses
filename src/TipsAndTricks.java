import Fundamentals.Exams.FinalExam.P3PlantDiscovery;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TipsAndTricks {


    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
       //BASIC

        //Math.abs(-2) = 2

       // %s - String
       // %d - digit/int
       // %02d
       // %f - double / floating part number
       // %.2f - 10.00
       // %.0f - 10

        /*проверки
        var % 2 == 0 - проверка за четно число
        var % 2 == 1 - проверка за нечетно число
        var % 10 == 5 - проверка дали числото завършва на 5
        var % 10 == 7 - проверка дали числото завършва на 7
         */

        /*модулно разделяне
        123456 % 10 == 6
        123456 % 100 == 56
         */

       /* Math.round(x) - round to nearest int
       Math.ceil(x) - round up to int
       Math.floor (x) - round down to int
        */

        /*how to read from console
        int num1 = Integer.parseInt(scan.nextLine());
        String name1 = scan.nextLine();
        char char1 = scan.nextLine().charAt(0);
        scan.nextLine().charAt(0);
         */

        /*String to char
        String name = "car";
        name.length(); - 3
        name.charAt(0); - c
        name.charAt(name.length() - 1); - r
         */

        /*how to reverse String, see also next explanation - P5Login, Fundamentals January 2023 Exercise 6.Loop etc
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String reverse = "";

        for (int i = username.length() - 1; i >= 0 ; i--) {
            reverse = reverse + username.charAt(i);
        }
         */
        /*
         String username = scan.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {

            char currentSymbol = username.charAt(i);
            password += currentSymbol;

        }
         */
        /*how to reverse String
        String username = scan.nextLine();
        String password = "";

        char character;
        for (int i = 0; i < username.length(); i++) {
            character = username.charAt(i);
            password = character + password;
        }
         */

        /*how to reverse String
        how to reverse string in java
You can reverse a string in Java using the StringBuilder class. The StringBuilder class has a reverse() method that can be used to reverse the order of characters in a string. Here is an example:

String original = "Hello, World!";
StringBuilder reversed = new StringBuilder();
reversed.append(original);
reversed = reversed.reverse();

or

String original = "Hello, World!";
String reversed = new StringBuilder(original).reverse().toString();

or

String original = "Hello, World!";
char[] chars = original.toCharArray();
for (int i = 0; i < chars.length / 2; i++) {
char temp = chars[i];
chars[i] = chars[chars.length - i - 1];
chars[chars.length - i - 1] = temp;
}
String reversed = new String(chars);

or

String original = "Hello, World!";
String reversed = new String(original.chars().mapToObj(c -> (char)c).toArray(),0,original.length());

You can then use the reversed variable to get the reversed string.

         */
        /*
        String username = "Acer";, how can i reverse username without stringbuilder
You can reverse a string without using the StringBuilder class by converting the string to a character array and then swapping the characters at the beginning and end of the array. Here's an example:

Copy code
String username = "Acer";
char[] chars = username.toCharArray();

for (int i = 0; i < chars.length / 2; i++) {
    char temp = chars[i];
    chars[i] = chars[chars.length - i - 1];
    chars[chars.length - i - 1] = temp;
}

String reversed = new String(chars);
In the above example, the username string is first converted to a character array using the toCharArray() method. Then, a for loop iterates through the array, swapping the characters at the beginning and end of the array. Finally, a new string is created from the reversed character array using the String constructor.
         */
        /*short reverse method
        how can i apply String reversed = new String(original.chars().mapToObj(c -> (char)c).toArray(),0,original.length()); into the above example

You can use the original.chars().mapToObj(c -> (char)c).toArray() method to reverse the string in the example as follows:

Copy code
String username = "Acer";
char[] chars = username.chars().mapToObj(c -> (char)c).toArray();
String reversed = new String(chars,0,username.length());
In this example, the username string is first converted to a stream of characters using the chars() method. Then, the mapToObj() method is used to map each character to an object of the Character class. The toArray() method is used to convert this stream of characters to an array.
Finally, a new string is created from the reversed character array using the String constructor with the arguments as the character array, starting index, and the length of the original string.

Note that the arguments passed to the String constructor are the reversed character array, the starting index, which is 0, and the length of the original string which is username.length().
         */

        // "String"
        // 'char'

        //print multiple chars
        //System.out.printf("%c%c",chMiddle1,chMiddle2);
        //result eT, 24

        //print the number of the chars
        //System.out.printf(chMiddle1+chMiddle2);
        //result ee->202; e=101

        /*222 how to find the number of digits in java
In Java, you can find the number of digits in an integer using the method Integer.toString(int).length(). Here is an example:

Copy code
int num = 12345;
int numOfDigits = Integer.toString(num).length();
System.out.println("Number of digits: " + numOfDigits);
This will output: "Number of digits: 5"

Another way is using log10 method of math class,

Copy code
int num = 12345;
int numOfDigits = (int) Math.log10(num) + 1;
System.out.println("Number of digits: " + numOfDigits);
This will also output: "Number of digits: 5"
         */

        /* 222  how to find the main digit
In Java, you can find the most significant digit (also known as the "main digit") of an integer using the method Integer.toString(int). Once you have converted the integer to a string, you can use the charAt(int) method to access the first character of the string, which will be the main digit. Here is an example:

Copy code
int num = 12345;
char mainDigit = Integer.toString(num).charAt(0);
System.out.println("Main digit: " + mainDigit);
This will output: "Main digit: 1"

Another way is using the division by 10 power of the number of digits in the number,

Copy code
int num = 12345;
int numOfDigits = (int) Math.log10(num) + 1;
int mainDigit = num/(int) Math.pow(10, numOfDigits-1);
System.out.println("Main digit: " + mainDigit);
This will also output: "Main digit: 1"
         */
        /*how to remove # when printing java
There are a few ways to remove the "#" character when printing a string in Java. One way is to use the replace() method of the String class to replace all occurrences of "#" with an empty string. Here's an example:

Copy code
String str = "Hello#World";
str = str.replace("#", "");
System.out.println(str); // Output: "HelloWorld"
Another way is to use the replaceAll() method of the String class to replace all occurrences of "#" with an empty string. Here's an example:

Copy code
String str = "Hello#World";
str = str.replaceAll("#", "");
System.out.println(str); // Output: "HelloWorld"
You can also use str.Split('#')[0] in C# to remove the # when printing.

Copy code
string str = "Hello#World";
Console.WriteLine(str.Split('#')[0]); // Output: "Hello"
You can also use string.Join("", str.Split('#')) in C# to remove the # when printing.

Copy code
string str = "Hello#World";
Console.WriteLine(string.Join("", str.Split('#'))); // Output: "HelloWorld"
You can use the substring() method of the String class to remove the # and all the characters after it. Here's an example:

Copy code
String str = "Hello#World";
int index = str.indexOf("#");
if (index != -1) {
    str = str.substring(0, index);
}
System.out.println(str); // Output: "Hello"
In the above example, the indexOf("#") method is used to find the position of the "#" character in the string. If it is found, the substring() method is used to remove the "#" and all the characters after it.
         */
/*
        String text = ""; //empty string, празен стринг
        char newChar = 0; //empty char
*/
  /*      //how to take ascii value of char
        char character = 'a';
        int ascii = character;
*//*
        String output = String.format("Name: %s, Age: %02d, Grade: %.2f%n", name, age, grade);
        System.out.printf(output); -> print + String.format
        */
        /*how to find length of string
        String str = "Hello, World!";
        int len = str.length();
        System.out.println("The length of the string is: " + len);
        result is 13
         */

        /*how to take every char from a String
        String password = scan.nextLine();
        char currentChar = password.charAt(i);
         */

        /*how to check, if character is letter or digit
        boolean digit = Character.isDigit(string.charAt(i));
        boolean letter = Character.isLetter(string.charAt(i));
         */

        /*  integer to String and then take the single integer of every char from the String
            String numberAsString = "" + number;
            for (int i = 0; i < numberAsString.length(); i++) {
                int currentDigit = Character.getNumericValue(numberAsString.charAt(i));

         */

        /*int to char
        int a=65;
        char c=(char)a;
        System.out.println(a);
         */

        //дължина на стринг
        //String name = scan.nextLine();
        //int length = name.length;

        /*String to int
        String input = "256"
        int number = Integer.parseInt(input);
        System.out.print(number); -> 256
         */

        //DecimalFormat
        /*
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(power(num, power)));
        */
        //result -> 256, or 166.375

        /*how to exit a loop, difference between break, return and continue
        break - results in the termination of the loop, it will come out of the loop and stops further iterations.
        break is used to exit (escape) the for-loop, while-loop, switch-statement that you are currently executing.
        break also ends switch
        continue - stops the current execution of the iteration and proceeds to the next iteration. continue will go directly to the next loop of a for or while.
        return - takes you out of the method.It stops executing the method and returns from the method execution.return will exit the entire method you are currently executing (and possibly return a value to the caller, optional).
         */
        /*
         public static void main(String[] args{
         while(true){
         break; - прекратява само while cicle, излизам от while cicle
         }
         */
        /*
         public static void main(String[] args{
         while(true){
         return; - прекратява целия main method - public static void main(String[] args
         }
         */
        /*
         public static void main(String[] args{
         while(true){
         continue; - прекратява само while cicle и отново се връща да изпълнява while cicle, тоест не излизам от while cicle
         }
         */

        /*
        In Java, break is used to exit a loop or switch statement,
        continue is used to skip an iteration of a loop, and
        return is used to exit a method and return a value (if the method is declared to return a value).

        For example, if you have a for loop and you want to exit the loop when a certain condition is met,
        you would use the break statement. Similarly, if you want to skip an iteration of a loop when a certain condition is met,
        you would use the continue statement.

        The return statement is used when a method has completed its execution and you want to return a value to the calling method.
        If the method is declared to return a value, then you would use a return statement followed by the value you want to return.
        If the method is declared to return void, you can use return statement without any value.
         */

        /*how to exit loop example
        void f()
        {
          int x = -1;
          while(true)
          {
          if(x == 0)
            break;         // escape while() and jump to execute code after the the loop
         else if(x == 1)
         return;        // will end the function f() immediately,
                       // no further code inside this method will be executed.

         do stuff and eventually set variable x to either 0 or 1
       ...
    }

    code that will be executed on break (but not with return).
    ....
    }

         */

        /*how to get length of integer
        int length = String.valueOf(i).length(); 256 -> 3
         */ //OR
        /*
        Method:
        public int countDig(int n){
        int count = 0;
        while(n !=0){
        n = n / 10;
        count += 1;
        }
        return count
        }
         */
        /*проверка за digit
            //for (char symbol : password.toCharArray()){
            //if(Character.isDigit(symbol)){
         */
        /*проверка за letter or digit
        //for (char symbol:password.toCharArray()){
            //if(!Character.isLetterOrDigit(symbol)){
            //return false;
            //}}
            //return true;
         */

        /*split
        String text = "Pesho|Gosho|Ivan|Petko|Martin";
        String[] names = text.split("\\|"); -> разделя по символа |, а не по оператора |
         String[] names = text.split("\\."); -> разделя по символа ., а не по оператора .
         */
        /*
        Note: The split() method takes regex as the first argument. If you need to use special characters such as: \, |, ^, *, + etc,
        you need to escape these characters. For example, we need to use \\+ to split at +.
         */
        /*how to split array by ":|:"
In Java, you can split an array of strings into multiple substrings based on a given delimiter using the split() method of the String class.

Here's an example of how you can use the split() method to split an array of strings by the delimiter ":|:":

Copy code
String[] arr = {"Hello:|:World", "I:|:am:|:learning:|:Java"};
for(int i=0;i<arr.length;i++) {
    String[] substrings = arr[i].split(":\\|:");
    for(String s : substrings) {
        System.out.println(s);
    }
}
This will output:

Copy code
Hello
World
I
am
learning
Java
In the above example, the split() method is used to split the string in the array by the delimiter ":|:". The delimiter is passed as a regular expression, in this case ":|:". The split() method returns an array of substrings, which are then printed out.

It's important to




emil vasilev
finish your sentence
It's important to note that the split() method splits the string into substrings based on the given delimiter and returns an array of these substrings. In the example above, the original array is an array of strings, so a nested loop is used to iterate through the original array and the substrings array.
         */

        /*Number Values Stoinosti
There are six numeric types four integer and two floating point:
byte 1 byte -128 to 127.
short 2 bytes -32,768 to 32,767.
int 4 bytes -2,147,483,648 to 2,147,483,647.
long 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,80.
float 4 bytes 7 decimal digits.
double 8 bytes 16 decimal digits.
         */

        /*Shabloni / Format Specifiers
        https://dzone.com/articles/java-string-format-examples
%a	floating point (except BigDecimal)	Hex output of floating point number
%b	Any type	“true” if non-null, “false” if null
-%c	character	Unicode character
-%d	integer (incl. byte, short, int, long, bigint)	Decimal Integer
%e	floating point	decimal number in scientific notation
-%f	floating point	decimal number
%g	floating point	decimal number, possibly in scientific notation depending on the precision and value.
%h	any type	Hex String of value from hashCode() method.
-%n	none	Platform-specific line separator.
%o	integer (incl. byte, short, int, long, bigint)	Octal number
-%s	any type	String value
%t	Date/Time (incl. long, Calendar, Date and TemporalAccessor)	%t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below.
%x	integer (incl. byte, short, int, long, bigint) Hex string.


Date and Time Formatting
Note: Using the formatting characters with “%T” instead of “%t” in the table below makes the output uppercase.

FLAG	NOTES
%tA	Full name of the day of the week, e.g. “Sunday“, “Monday“
%ta	Abbreviated name of the week day e.g. “Sun“, “Mon“, etc.
%tB	Full name of the month e.g. “January“, “February“, etc.
%tb	Abbreviated month name e.g. “Jan“, “Feb“, etc.
%tC	Century part of year formatted with two digits e.g. “00” through “99”.
%tc	Date and time formatted with “%ta %tb %td %tT %tZ %tY” e.g. “Fri Feb 17 07:45:42 PST 2017“
%tD	Date formatted as “%tm/%td/%ty“
%td	Day of the month formatted with two digits. e.g. “01” to “31“.
%te	Day of the month formatted without a leading 0 e.g. “1” to “31”.
%tF	ISO 8601 formatted date with “%tY-%tm-%td“.
%tH	Hour of the day for the 24-hour clock e.g. “00” to “23“.
%th	Same as %tb.
%tI	Hour of the day for the 12-hour clock e.g. “01” – “12“.
%tj	Day of the year formatted with leading 0s e.g. “001” to “366“.
%tk	Hour of the day for the 24 hour clock without a leading 0 e.g. “0” to “23“.
%tl	Hour of the day for the 12-hour click without a leading 0 e.g. “1” to “12“.
%tM	Minute within the hour formatted a leading 0 e.g. “00” to “59“.
%tm	Month formatted with a leading 0 e.g. “01” to “12“.
%tN	Nanosecond formatted with 9 digits and leading 0s e.g. “000000000” to “999999999”.
%tp	Locale specific “am” or “pm” marker.
%tQ	Milliseconds since epoch Jan 1 , 1970 00:00:00 UTC.
%tR	Time formatted as 24-hours e.g. “%tH:%tM“.
%tr	Time formatted as 12-hours e.g. “%tI:%tM:%tS %Tp“.
%tS	Seconds within the minute formatted with 2 digits e.g. “00” to “60”. “60” is required to support leap seconds.
%ts	Seconds since the epoch Jan 1, 1970 00:00:00 UTC.
%tT	Time formatted as 24-hours e.g. “%tH:%tM:%tS“.
%tY	Year formatted with 4 digits e.g. “0000” to “9999“.
%ty	Year formatted with 2 digits e.g. “00” to “99“.
%tZ	Time zone abbreviation. e.g. “UTC“, “PST“, etc.
%tz Time Zone Offset from GMT e.g. “-0800“.


Argument Index
An argument index is specified as a number ending with a “$” after the “%” and selects the specified argument in the argument list.

1
String.format("%2$s", 32, "Hello"); // prints: "Hello"

Formatting an Integer
With the %d format specifier, you can use an argument of all integral types including byte, short, int, long and BigInteger.

Default formatting:

1
String.format("%d", 93); // prints 93


Specifying a width:

1
String.format("|%20d|", 93); // prints: |                  93|


Left-justifying within the specified width:

1
String.format("|%-20d|", 93); // prints: |93                  |


Pad with zeros:

1
String.format("|%020d|", 93); // prints: |00000000000000000093|


Print positive numbers with a “+”:

 (Negative numbers always have the “-” included):

1
String.format("|%+20d|', 93); // prints: |                 +93|


A space before positive numbers.

A “-” is included for negative numbers as per normal.

1
String.format("|% d|", 93); // prints: | 93| String.format("|% d|", -36); // prints: |-36|


Use locale-specific thousands separator:

For the US locale, it is “,”:

1
String.format("|%,d|", 10000000); // prints: |10,000,000|


Enclose negative numbers within parentheses (“()”) and skip the "-":

1
String.format("|%(d|", -36); // prints: |(36)|


Octal output:

1
String.format("|%o|"), 93); // prints: 135


Hex output:

1
String.format("|%x|", 93); // prints: 5d


Alternate representation for octal and hex output:

Prints octal numbers with a leading “0” and hex numbers with leading “0x“.

1
String.format("|%#o|", 93);
2
// prints: 0135
3
​
4
String.format("|%#x|", 93);
5
// prints: 0x5d
6
​
7
String.format("|%#X|", 93);
8
// prints: 0X5D

String and Character Conversion
Default formatting:

Prints the whole string.

1
String.format("|%s|", "Hello World"); // prints: "Hello World"


Specify Field Length

1
String.format("|%30s|", "Hello World"); // prints: | Hello World|


Left Justify Text

1
String.format("|%-30s|", "Hello World"); // prints: |Hello World |


Specify Maximum Number of Characters

1
String.format("|%.5s|", "Hello World"); // prints: |Hello|


Field Width and Maximum Number of Characters

1
String.format("|%30.5s|", "Hello World"); | Hello|

         */




        //FUNDAMENTALS

        //Array / Масиви

        /*how to create new array in java
There are several ways to create a new array in Java. Here are a few examples:

Using the new keyword:
int[] myArray = new int[5]; // creates an array of 5 integers

Using an array literal:
int[] myArray = {1, 2, 3, 4, 5}; // creates an array with the given values

Using the Array class:
int[] myArray = Array.newInstance(int.class, 5); // creates an array of 5 integers

Using the Arrays class's copyOf method:
int[] originalArray = {1, 2, 3, 4, 5};
int[] newArray = Arrays.copyOf(originalArray, originalArray.length);

It is important to note that the size of an array in Java is fixed, once an array is created its size can't be changed.

You can also create multi-dimensional arrays in Java by adding one or more sets of square brackets after the type. For example:



int[] myArray = new int[4];
1 1 1 1

int[][] myArray = new int[3][4]; // creates a 2D array with 3 rows and 4 columns [3]-броя на редовете [4]-броя на колоните
1 1 1 1
1 1 1 1
1 1 1 1

Also you can create an ArrayList which is not fixed size and you can add or remove elements from it using add() and remove() methods respectively.

ArrayList<Integer> myArray = new ArrayList<Integer>();
It is important to note that the above example creates an empty ArrayList of integers, you can add elements to it using the add() method.
         */

        /* Split by , whitespace, -:, ?
        String[] parts = input.split("[,\\s\\-:\\?]");
         */

       /* String command = scan.nextLine();

        String commandName = command.split("\\: ")[0]; - \\: сплитва по символа :, а не по оператора :, така се получава допълнително празно място, иначе го няма и джъдж дава 0 точки
        String newValue = command.split("\\: ")[1];*/

       /* how to read make String into Array
       String articleData = scan.nextLine();

        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];*/

        String[] commandParts = scan.nextLine().split("\\|"); //how to separate via | -Gold|Silver|Wood

        //Read Array
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbers2 = Arrays.stream(scan.nextLine() //" 23 -2 321 87 42 90 -123"
                        .split(" ")) //["23","-2","321","87","42","90","-123"]
                .mapToInt(Integer::parseInt) //[23, -2, 321, 87, 42, 90, -123]
                .toArray();

        /*
        int fieldSize = Integer.parseInt(scanner.nextLine());
        int field = new int[fieldSize];
        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int arrayIndex : array){
        field[arrayIndex] = 1;
         */

        /*
        String command = scan.nextLine();
        String[] tokens = command.split(" ");
        int index = Integer.parseInt(tokens[0]); ->така индекса става число
        tokens[0] - стринг
        Integer.parseInt(tokens[0] - число
        */

        /*String to integer array
        String input = 256;
        String[] inputString = input.split("");
        int[] array = new int[input.length];
        for(int i = 0; i < input.length, i++);
        array[i] = Integer.parseInt(inputString[i]);
        }
        System.out.println(Array.toString(array));
         */

         /*String array to integer array
        String [] input = {"256", "457", "6744"};
        int size = input.length;
        int[] array = new int[input.length];
        for(int i = 0; i < input.length, i++);
        array[i] = Integer.parseInt(input[i]);
        }
        System.out.println(Array.toString(array));
         */

        /*how to remove blank spaces white spaces in String
        stringName = stringName.replace("\\s", "");
        where \\s is a single space in unicode

        The Java regex pattern \\s+ is used to match multiple whitespace characters when applying a regex search to your specified value.

        The pattern is a modified version of \\s which is used to match a single whitespace character.

replaceAll() With a Non-Empty Replacement
        "\\s" -
        String result = INPUT_STR.replaceAll("\\s", "_");
assertEquals("Text___With_____Whitespaces!___", result);
The replaceAll() method finds single whitespace characters and replaces each match with an underscore.
We have eleven whitespace characters in the input text. Thus, eleven replacements will occur.

     "\\s+" -
     String result = INPUT_STR.replaceAll("\\s+", "_");
assertEquals("Text_With_Whitespaces!_", result);
Due to the greedy quantifier +, the replaceAll() method will match the longest sequence of contiguous whitespace characters and replace each match with an underscore.
In our input text, we have three sequences of contiguous whitespace characters. Therefore, each of the three will become an underscore.

assertEquals(result1, result2);
If we compare the two replaceAll() calls, the one with \s+ is more efficient.
This is because it does the job with only three replacements while the call with \s will do eleven replacements.

replaceAll() With an Empty Replacement
String result1 = INPUT_STR.replaceAll("\\s", "");
assertEquals("TextWithWhitespaces!", result1);

String result2 = INPUT_STR.replaceAll("\\s+", "");
assertEquals("TextWithWhitespaces!", result2);

Another EXAMPLE
String result = myString.replaceAll("\\s", "");
assertThat(result).isEqualTo("IamawonderfulString!");

  Another EXAMPLE
        public class removeWhiteSpace {
    public static void main(String[] args) {

        String str1="Remove white spaces";

        //Removes the white spaces using regex
        str1 = str1.replaceAll("\\s+", "");

        System.out.println("String after removing all the white spaces : " + str1);
    }
}

        Java has inbuilt methods to remove the whitespaces from the string, whether leading, trailing, both, or all.
        trim() method removes the leading and trailing spaces present in the string.
        strip() method removes the leading and trailing spaces present in the string.

You get the extra element for "+name"'s case is because of non-empty value "name" after the delimiter.
The split() function only "trims" the trailing delimiters that result to empty elements at the end of an array.
        Examples of .split("\\+") output:

"+++++"     = { }                // zero length array because all are trailing delimiters
"+name+"    = { "", "name" }     // trailing delimiter removed
"name+++++" = { "name" }         // trailing delimiter removed
"name+"     = { "name" }         // trailing delimiter removed
"++name+"   = { "", "", "name" } // trailing delimiter removed
         */


        /*how to remove white spaces blank spaces is string array
         String[] inputAsArray = scanner.nextLine().split("\\s+");

         OR

         String command = scanner.nextLine();
         String[] tokens = command.split("\\s+");
         */

        /*Drive : Audi A6 : 543 : 47 how to split by : and remove all white spaces?
You can use the split() method of the String class to split the string by a specific delimiter, in this case the colon (:). The split() method returns an array of substrings, which can be accessed using array notation.

To remove any whitespace before and after each element of the array you can use the trim() method.

Here's an example of how you can split the string "Drive : Audi A6 : 543 : 47" by the colon (:) and remove the whitespaces:

String[] commandParts = command.trim().split(" : ");

OR

String input = "Drive : Audi A6 : 543 : 47";
String[] parts = input.split(":");
for (int i = 0; i < parts.length; i++) {
    parts[i] = parts[i].trim();
}
Alternatively, you can use a regular expression to split the string by colons and remove all whitespaces at the same time.

Copy code
String input = "Drive : Audi A6 : 543 : 47";
String[] parts = input.split("\\s*:\\s*");
In this example, the regular expression \\s*:\\s* is used to split the input string by a colon that may or may not be surrounded by whitespaces.

After this, the variable parts will contain an array of 4 elements: "Drive", "Audi A6", "543", "47".
Note that the whitespaces before and after the colons are removed.
         */

        /*text to charArray
        String text = "Mnogojako"
        text.toCharArray() ->['M','n','o','g','o','j','a','k','o']
        for(char Symbo: text.toCharArray()){
        if(symbol == 'a' || symbol == 'e'){
        count++;
         */

        /*how to split array at index
        String[] inputAsArray = scanner.nextLine().split("\\s+"); 1 3 5 7 9
        inputAsArray = getNewArray(inputAsArray, tokens[1]); -> 5 7 9 1 3

        method:
        private static String[] getNewArray(String[] inputAsArray, String token) {
            int index = Integer.parseInt(token);
            String[] newArray = new String[inputAsArray.length];
            if (index < 0 || index >= inputAsArray.length) {
                System.out.println("Invalid index");
                return inputAsArray;
            } else {
                int x = 0;
                for (int newStart = index + 1; newStart < inputAsArray.length; newStart++) {
                    newArray[x] = inputAsArray[newStart];
                    x++;
                }
                for (int newEnd = 0; newEnd <= index; newEnd++) {
                    newArray[x] = inputAsArray[newEnd];
                    x++;
                }

            }
            return newArray;
        }

         */

        /*int array to string array
        import java.util.Arrays;

class Main
{
    // Program to convert primitive integer array to string array in Java 8 and above
    public static void main(String[] args)
    {
        // input primitive integer array
        int[] intArray = { 1, 2, 3, 4, 5 };

        String[] strArray = Arrays.stream(intArray)
                                .mapToObj(String::valueOf)
                                .toArray(String[]::new);

        System.out.println(Arrays.toString(strArray));
    }
}
         */

        //string to char array
        String name = scan.nextLine(); //->journaldev
        char[] characters = name.toCharArray(); //->j o u r n a l d e v
        char[] charactersShort = new char[7];
        name.getChars(0,7, charactersShort, 0); //->journal


        /*how to fill array with numbers
        String input = scan.nextLine();
        }
        String[] inputString = input.split("");
            int[] array = new int[input.length()];

         for (int i = 0; i < input.length(); i++) {
                array[i] = Integer.parseInt(inputString[i]);

            }
        System.out.println(Array.toString(array));
         *///result String "2345", Array[2 3 4 5]

      /*  int index = 0; - how to start from next point every time
        for (int element: array) {
            index ++;

            for (int i = index; i < array.length; i++) {
                if(element + array[i] == n){
                    System.out.println(element + " " + array[i]);
                }
            }*/

// how to make String to String Array and then take the first part of the array to use is as command
        String commands = scan.nextLine();

        while (!commands.equals("end")) {

            String[] commandParts2 = commands.split(" ");
            String commandType = commandParts[0];

            switch (commandType) {
                case "swap":
                    int index1 = Integer.parseInt(commandParts[1]); // 3
                    int element1 = numbers2[index1]; // числото, което стои на индекс 3
                    int index2 = Integer.parseInt(commandParts[2]); // 4
                    int element2 = numbers2[index2]; // числото, което стои на индекс 4

                    numbers2[index1] = element2;
                    numbers2[index2] = element1;
                    break;
            }
            //

            /* String to Array, String to numbers Array
            String[] firstArray = array.split( " ");
        int[] arrayCurrent = new int[array.length()];

        for (int i = 0; i < array.length(); i++) {
            arrayCurrent[i] = Integer.parseInt(firstArray[i]);
             */


            /*String to Char Array
            import java.util.*;

public class StringtoCharArray {

  public static void main(String args[]) {
    String str = "Scaler"; // Given String

    // Creating array of string length
    char[] arr = new char[str.length()];

    // Copy character by character into array
    for (int i = 0; i < str.length(); i++) {
      arr[i] = str.charAt(i);
    }

    // Printing the character array
    for (char x : arr) {
      System.out.println(x);
    }
  }
}
             */

            /* how to read the number of characters in an array
            String treasureCount = String.join("", items);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }
            */


            //how to get number from an array
            int index1 = Integer.parseInt(commandParts[1]); //-> 3
            int element1 = numbers2[index1]; //the number that is on index 3 in the array ->87
            int index2 = Integer.parseInt(commandParts[2]); // 4
            int element2 = numbers2[index2]; // числото, което стои на индекс 4 ->56

            numbers2[index1] = element2; //87->56
            numbers2[index2] = element1; //56->87


            /* how to join 2 arrays
            String[] newChest = new String[items.length + 1];
            newChest[0] = commandParts[i];
            for (int k = 1; k < newChest.length; k++) {
            newChest[k] = items[k-1];
            }
            items = newChest;
             *//*
             String newChest = commandParts[i] + " " + String.join(" ", items)'
             items = newChest.split(" ");
             */

            /*how to find length of array
            int[] array = {45, 54, 897, 556464}
            int size = array.length;
             */

            /*how to add additional number to an array
            public static void triangleIncrease(int num){
            for (int i = 1; i <= num; i++) {
             int[] line = new int[i];
            int[] secondLine = new int[i];
            secondLine[0] = 1;
            for (int j = 2; j <= i; j++) {
                secondLine[j-1] = j;
            }
            line = secondLine;
            System.out.println(Arrays.toString(line).replace("[", "").replace(",", "").replace("]", ""));
            }
             */ //result:
            //1
            //1 2
            //1 2 3
            //1 2 3 4

            /*how to delete additional number from an array
            public static void triangleDecrease(int num){
            for (int i = num - 1; i > 0; i--) {
            int[] line = new int[i];
            int[] secondLine = new int[i];
            secondLine[0] = 1;
            for (int j = i; j > 0; j--) {
            secondLine[j-1] = j;
            }
            line = secondLine;
            System.out.println(Arrays.toString(line).replace("[", "").replace(",", "").replace("]", ""));
            }
             */ //result
            //1 2 3
            //1 2
            //1

            //how to sort the numbers within an array
            Arrays.sort(numbers);

            //how to Print Array
            System.out.println(Arrays.toString(numbers).replace("[", "").replace(",", "").replace("]", ""));

            /* another way to print

            for (int index = 0; index <= numbers.length - 1; index++) {
            if (index != numbers.length - 1) {
                System.out.print(numbers[index] + ", ");
            } else {
                System.out.println(numbers[index]);
            }

             */
            System.out.println(Arrays.toString(numbers));
        }

        /*        int distanceFuelKilometers = Integer.parseInt(commandParts[2]); i get here the following error Exception in thread "main" java.lang.NumberFormatException: For input string: "543 ", why
The error java.lang.NumberFormatException: For input string: "543 " is caused because the value of commandParts[2] is not a valid integer.

The parseInt() method of the Integer class is used to convert a string to an integer, but if the string is not a valid integer, the method throws a NumberFormatException. In your case, it seems that the string "543 " contains a space at the end, which is causing the parseInt() method to fail.

To fix this, you can use the trim() method to remove any whitespace from the beginning or end of the string before passing it to the parseInt() method:

Copy code
int distanceFuelKilometers = Integer.parseInt(commandParts[2].trim());
Alternatively, you could use regular expression to check if the string contains only digits, before converting it to int.

Copy code
if(commandParts[2].matches("^[0-9]*$"))
  int distanceFuelKilometers = Integer.parseInt(commandParts[2]);
else
  System.out.println("Invalid input, it should be a number");
This way you can check if the string is a number before trying to parse it to int, avoiding the exception.
         */


    }
    //Methods
    public static void printDataStudent(String name, int age, double grade){
        System.out.printf("Student: %s; Age: %d, Grade: %.2f%n", name, age, grade);
    }

    /*how to return 2 Strings
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(readFullName(scan));
    }
    public static String readFullName(Scanner sc){
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        return firstName + " " + lastName;
    }
}
     */ //result:
    //Emil
    //Vassilev
    //Emil Vassilev


    /*boolean Method
    public static boolean isValid(){
    if (5<10) {
    return true;
    } else {
    return false;
     */

    /*сппавняване на два стринг в метод
    public static String getMax(String name1, String name2){
       String result = "";

       if(name1.compareTo(name2) > 0){
           result = name1;
       } else {
           result = name2;
       }
return result;
    }
     */
/*how to print NxN Matrix
public static void printNXN (int num){

        for (int lines = 0; lines < num; lines++) {
            for (int rows = 0; rows < num; rows++) {
                System.out.print(num + " ");

            }
            System.out.println();
        }

    }
    result:
    3 3 3
    3 3 3
    3 3 3
 */

    //LISTS//

    /*
    List<String> names = new ArrayList<>();
    //Create a list of strings
    names.add("Peter");
    names.add("Maria");
    names.add("George");
    names.remove("Maria");
    for (String name : names)
     System.out.println(name);
    //Peter, George
     */

    /*
    List<Integer> nums = new ArrayList<>();
	    Arrays.asList(10, 20, 30, 40, 50, 60));
        nums.remove(2);
        nums.remove(Integer.valueOf(40));
        nums.add(100);
        nums.add(0, -100);
        for (int i = 0; i < nums.size(); i++)
        System.out.print(nums.get(i) + " ");
        result-> -100 10 20 50 60 100
     */

    /*
    List<E> holds a list of elements (like array, but extendable)
    Provides operations to add / insert / remove / find elements:
    size() – number of elements in the List<E>
    add(element) – adds an element to the List<E>
    add(index, element) – inserts an element to given position
    remove(element) – removes an element (returns true / false)
    remove(index) – removes element at index
    contains(element) – determines whether an element is in the list
    set(index, item) – replaces the element at  the given index
     */

    //READING LIST FROM CONSOLE

    /*
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int number = Integer.parseInt(sc.nextLine());
      list.add(number); //добавя елемент в листа
    }
     */

    /* reading direkt direct without to read String first
    List<String> travel = Arrays.stream(scan.nextLine().split("")).collect(Collectors.toList());
     */

    /*Reading List Values from a Single Line
    2 8 30 25 40 72 -2 44 56
    String values = sc.nextLine();
    List<String> items = Arrays.stream(values.split(" "))           ->правиме елементите поток от данни
		.collect(Collectors.toList());                              -> Convert a collection into List, потока от данни го нареждаме в лист от стрингове
    List<Integer> nums = new ArrayList<>();                         ->парсваме елементите към цяло число, така получаваме стринговете в листа да станат числа
    for (int i = 0; i < items.size(); i++)
     nums.add(Integer.parseInt(items.get(i)));                      ->взимам стринг от листа items, парсвам го към цяло число, тоест го правя число и го добавям в новия List nums

        //Съкратен вариант на горното
    List<Integer> items = Arrays.stream(values.split(" "))
    .map(Integer::parseInt).collect(Collectors.toList());
     */

    //четене и сортиране първо по големина от най-малко към най-голямо след което се обръща реда на подреждане от най-голямо към най-малко
    //reading and sorting first from ascending to descending (small to big number) then reversed from descending to ascending (big to small number)
    /*List<Integer> integers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).sorted(Collections.reverseOrder()).collect(Collectors.toList());

/* how to read and print characters in java
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    List<Character> charList = new ArrayList<>();
    // Add characters to the list
    charList.add('a');
    charList.add('b');
    charList.add('c');

    // Print the list of characters
    for (char c : charList) {
      System.out.println(c);
    }
  }
}
     */

/*манипулация на масив и преобразуване в списък
    /* String[] parts = mirrorPairs.toString().split("[#@]"); създавам нов масив като деля по @ или №
        String partsString = Arrays.toString(parts); масива го правя на стринг
        partsString = partsString.replaceAll("[\\[\\],]", ""); в масива заменям всички [ ] , с празно място
        String[] partArray = partsString.split("\\s+"); създавам нов масив като трия празните места
        partArray = Arrays.copyOfRange(partArray, 1, partArray.length); в новия масив на първия индекс е празно място, изтривам го
        List<String> finalList = new ArrayList<>(Arrays.asList(partArray)); създавам нов списък и наливам масива вътре
*/


    /* how to convert string list to characters list
    import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    List<String> stringList = new ArrayList<>();
    // Add strings to the list
    stringList.add("Hello");
    stringList.add("World");
    stringList.add("!");

    // Convert the list of strings to a list of characters
    List<Character> charList = new ArrayList<>();
    for (String s : stringList) {
      for (char c : s.toCharArray()) {
        charList.add(c);
      }
    }

    // Print the list of characters
    for (char c : charList) {
      System.out.println(c);
    }
  }
}
     */

    /*how to convert list of characters to list of string
    import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    List<Character> charList = new ArrayList<>();
    // Add characters to the list
    charList.add('H');
    charList.add('e');
    charList.add('l');
    charList.add('l');
    charList.add('o');

    // Convert the list of characters to a list of strings
    List<String> stringList = new ArrayList<>();
    for (char c : charList) {
      stringList.add(Character.toString(c));
    }

    // Print the list of strings
    for (String s : stringList) {
      System.out.println(s);
    }
  }
}
     */

    /*how to make list empty in java
    List<String> travel = Arrays.stream(scan.nextLine().split("")).collect(Collectors.toList());
    travel.clear();

     */

    /*how to clear part of a list from starting index to end index
                        list.size() = 8 (0 to 7)
                     int radius = 1 + (powerValueRadius * 2);   - index = 3, powerValueRadius = 2, result = 5
                    int radiusStart = index - powerValueRadius;  - = 1
                    int radiusEnd = index + powerValueRadius;    - = 5

                    if (radiusStart >= 0 && radiusEnd < targets.size()) {
                        targets.subList(radiusStart, radius+1).clear(); - взима подсписък с начало 1 трие 1,2,3,4,5 (радуис + 1, понеже, явно подсписъка не е вкл последното число)
     */

        /*Simple printing
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
         */

        /* Printing a list using a for-loop
         List<String> list = new ArrayList<>(Arrays.asList(
  		"one", "two", "three", "four", "five", "six"));
        for (int index = 0; index < list.size(); index++)
        System.out.printf("arr[%d] = %s%n", index, list.get(index));    ->принтира елемента на определен индекс
         */

        /*Printing using for each
        for(int element : numList){
        System.out.print(element + " ");
         */

        /*Printing a list using a String.join():
        List<String> list = new ArrayList<>(Arrays.asList(
         "one", "two", "three", "four", "five", "six"));
        System.out.println(String.join("; ", list));
        */

    /* Printing exact number of integers from a list отпечатване на точно определен брой цифри от листа
    //greaterNumbers = greaterNumbers.stream().limit(5).collect(Collectors.toList());
            //for (Integer number : greaterNumbers){
            //System.out.printf("%d ", number);
     */

    /*как се взима елемент от позиция в лист
    List<Double> numbersList = Arrays.stream(scan.nextLine().split(" "))
    .map(Integer::parseInt).toList();

    for(int i=0; i < numbersList.size(); i++){
    double firstElement = numbersList.get(i);
    double secondElement = numbersList.get(i + 1);
     */

    //int sizeList = numList.size();        -> дава размера на листа

    /* numList.set(i, numList.get(i) + numList.get(numList.size() - 1));        -> поставяне на позиция i резултатът от сбора
    numList.remove(numList.size() - 1);                                         -> изтривам последния елемент
     */

    /* resultList.addAll(firstList.subList(minSize, firstList.size()));        ->добавям колекция от първия лист от индекс х=минсайз до края на листа в края на новия лист resultlist
    */
    /*numList.remove(Integer.valueOf(item));                ->махам обект от лист, не индекса в листа
    Integer.valueOf(item)                                   ->правим елемента на обект
     */

    /*numList.remove(index);                ->индекса в листа
     */

    /*Sorting a list == reorder its elements incrementally: Sort()
        List<String> names = new ArrayList<>(Arrays.asList(
        "Peter", "Michael", "George", "Victor", "John"));
        Collections.sort(names);
        System.out.println(String.join(", ", names));
        // George, John, Michael, Peter, Victor

        Collections.sort(names);                                            ->сортира елементите
        Collections.reverse(names);                                         ->не сортира, само обръща реда на елементите
        System.out.println(String.join(", ", names));
        // Victor, Peter, Michael, John, George

         */

        //numList.isEmpty - Листа е празен

        //numList.removeIf(e -> e < 0); - премахва елемента в случай,че елемента е по-малък от нула

    /*for each loop in list foreach loop
     List<Integer> integers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        for (Integer currentInt : integers) {
            sum += currentInt;
        }
     */

    /*short foreach loop
     List<String> furniture = new ArrayList<>();
     furniture.forEach(System.out::println); - отпечатва на нов ред всеки един елемент от списъка
     */

    /*how to find characters length in a list in java
To find the length of the characters in a list in Java, you can use the size() method of the List interface. This method returns an integer value representing the number of elements in the list.

Here is an example of how you can use the size() method to find the length of a list of strings:

import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    words.add("apple");
    words.add("banana");
    words.add("orange");

    int length = words.size();
    System.out.println("The length of the list is: " + length);
  }
}
This would output "The length of the list is: 3" to the console.

Note that the size() method only returns the number of elements in the list, not the number of characters in the elements. If you want to find the total number of characters in the elements of the list, you will need to iterate over the list and sum the length of each element. Here is an example of how you can do this:

import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    words.add("apple");
    words.add("banana");
    words.add("orange");

    int totalLength = 0;
    for (String word : words) {
      totalLength += word.length();
    }
    System.out.println("The total number of characters in the list is: " + totalLength);
  }
}
This would output "The total number of characters in the list is: 14" to the console.
*/
/*how to print list as following Part <=> traP, leveL <=> Level, sAw <=> wAs
You can use a for-each loop to iterate through the elements in a list, and then use the reverse() method of the StringBuilder class to reverse each string. Here's an example:

Copy code
List<String> list = Arrays.asList("Part", "leveL", "sAw");
for (String str : list) {
    StringBuilder sb = new StringBuilder(str);
    sb.reverse();
    System.out.print(str+" <=> "+sb+", ");
}
You can also use the toCharArray() method of the String class to convert the string to a char array, then reverse the array using a loop, and then use the new String(char[]) constructor to create a new string from the reversed char array inside the for each loop.

Copy code
List<String> list = Arrays.asList("Part", "leveL", "sAw");
for (String str : list) {
    char[] charArray = str.toCharArray();
    for (int i = 0; i < charArray.length / 2; i++) {
        char temp = charArray[i];
        charArray[i] = charArray[charArray.length - i - 1];
        charArray[charArray.length - i - 1] = temp;
    }
    String reversed = new String(charArray);
    System.out.print(str+" <=> "+reversed+", ");
}
In the above example, for each iteration of the for-each loop, the current string in the list is retrieved, reversed, and then printed in the format you specified.

You can also use join() method of the String class to join the reversed string with the original string and <=> as separator.

Copy code
List<String> list = Arrays.asList("Part", "leveL", "sAw");
for (String str : list) {
    char[] charArray = str.toCharArray();
    for (int i = 0; i < charArray.length / 2; i++) {
        char temp = charArray[i];
        charArray[i] = charArray[charArray.length - i - 1];
        charArray[charArray.length - i - 1] = temp;
    }
    String reversed = new String(charArray);
    System.out.print(String.join(" <=> ", str, reversed)+", ");
}
You can also use string.Join(" <=> ", str, new string(str.Reverse().ToArray())) in C#.
 */

    /*    как се получава средноаритметично число в списък
    List<Integer> integers = Arrays.stream(scan.nextLine().split(" ")) - създавам списък integers
                .map(Integer::parseInt).collect(Collectors.toList());

    for (Integer currentInt : integers) {                               - сумирам всички числа в списъка
            sum += currentInt;
        }
        averageValue = sum * 1.0 / integers.size();                     - разделям сбора на размера на списъка
     */

    /*
    List<Integer> integers = Arrays.stream(scan.nextLine().split(" ")) - създавам списък integers
                .map(Integer::parseInt).collect(Collectors.toList());

     List<Integer> greaterNumbers = new ArrayList<>();                  - създавам втори списък greaterNumbers

        for (int number : integers) {                                   - проверявам всяко число в списък integers дали е по-голямо от средноаритметичното в integers
            if (number > averageValue) {
                greaterNumbers.add(number);                             - ако е да, добавям това число в новия списък greaterNumbers
            }
        }

     */

    /* hot to manipulate String list
    public class P4ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();

        while(!input.equals("end")){
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);

            int item = 0;
            int index = 0;
            switch (command){
                case "Add":
                    item = Integer.parseInt(commandLine.get(1));
                    numList.add(item);
                    break;
                case "Remove":
                    item = Integer.parseInt(commandLine.get(1));
                    numList.remove(Integer.valueOf(item));
                    break;
                case "RemoveAt":
                    item = Integer.parseInt(commandLine.get(1));
                    numList.remove(item);
                    break;
                case "Insert":
                    item = Integer.parseInt(commandLine.get(1));
                    index = Integer.parseInt(commandLine.get(2));
                    numList.add(index, item);
                    break;
            }

            input = scan.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
     */


/*how to take string from list and reverse it
In Java, you can use the get() method to retrieve a string from a list, and then use the reverse() method of the StringBuilder class to reverse the string. Here's an example:

List<String> list = Arrays.asList("apple", "banana", "cherry");
String str = list.get(1);
StringBuilder sb = new StringBuilder(str);
sb.reverse();
System.out.println(sb);  // Output: "ananab"
You can also use the toCharArray() method of the String class to convert the string to a char array, then reverse the array using a loop, and then use the new String(char[]) constructor to create a new string from the reversed char array.

List<String> list = Arrays.asList("apple", "banana", "cherry");
String str = list.get(1);
char[] charArray = str.toCharArray();
for (int i = 0; i < charArray.length / 2; i++) {
    char temp = charArray[i];
    charArray[i] = charArray[charArray.length - i - 1];
    charArray[charArray.length - i - 1] = temp;
}
String reversed = new String(charArray);
System.out.println(reversed);  // Output: "ananab"
 */

    /*how to take string from list and reverse it in for each loop java
In Java, you can use a for-each loop to iterate through the elements in a list and reverse each string using the reverse() method of the StringBuilder class. Here's an example:

List<String> list = Arrays.asList("apple", "banana", "cherry");
for (String str : list) {
    StringBuilder sb = new StringBuilder(str);
    sb.reverse();
    System.out.println(sb);
}
You can also use the toCharArray() method of the String class to convert the string to a char array, then reverse the array using a loop, and then use the new String(char[]) constructor to create a new string from the reversed char array inside the for each loop.

List<String> list = Arrays.asList("apple", "banana", "cherry");
for (String str : list) {
    char[] charArray = str.toCharArray();
    for (int i = 0; i < charArray.length / 2; i++) {
        char temp = charArray[i];
        charArray[i] = charArray[charArray.length - i - 1];
        charArray[charArray.length - i - 1] = temp;
    }
    String reversed = new String(charArray);
    System.out.println(reversed);
}
In the above example, for each iteration of the for-each loop, the current string in the list is retrieved, reversed, and then printed.
     */

    /*how to make multidimensional list and print the objects inside, задача Mirror Words от FinalExamRetake
             List<List<String>> mirrorPairs = new ArrayList<>(); правя списък от класа списък със стрингове, така мога да сложа в един списък, във всеки индекс по още един списък, напр.
             на индекс 0, слагам думите първо и второ, на индекс 1 слагам думите трето и четвърто:
             0-първо
              -второ
             1-трето
              -четвърто

             Pattern hiddenWordPattern = Pattern.compile("(@|#)(?<word>[A-Za-z]{3,})\\1\\1(?<mirror>[A-Za-z]{3,})\\1"); с този регекс откривам двойки от думи като например #tesT##Tset#
             Matcher matcher = hiddenWordPattern.matcher(text);

            String firstWord = matcher.group("word"); това е думата tesT
            String secondWord = new StringBuilder(matcher.group("mirror")).reverse().toString(); това е думата Tset, която я обръщам и става tesT
            if (firstWord.equals(secondWord)) { ако първата дума е равна на втората дума влизам в проверката
                mirrorPairs.add(List.of(firstWord, matcher.group("mirror"))); в мултидименсиалния списък слагам като резултат на индекс 0:
                0-tesT
                 -Tset

                 System.out.println(mirrorPairs.stream() - правя списъка на стрийм
                 .map(pair -> String.join(" <=> ", pair)) - слагам стрийма в мап и свързвам елементите в групи с <=>
                 .collect(Collectors.joining(", "))); - свързам групите с ,

                 Резултат:
                 Part <=> traP, leveL <=> Level, sAw <=> wAs
            }

     */


    //OBJECTS AND CLASSES

    /*

    The main difference between the classes is their accessibility and scope, where a

    static class is a nested class with restricted access ,
    public class can be accessed by any other class and
    private class can only be accessed within the same class in which it is defined.

    Whether to use a public, static, or private class depends on the specific requirements and design of your program.

A public class is accessible from any other class, and is useful when you want to allow other classes or packages to use or extend the functionality of the class.
A public class is a class that can be accessed by any other class in the same package or a different package.

A static class is used when you want to group together related static methods and fields.
It is useful when you don't need to create an instance of a class, but just want to call its methods directly.
A static class in Java is a class that can only have static members and can only be instantiated by calling its static methods.
It is essentially a way to group together related static methods and fields.
Static class is a nested class that is marked as static.
This means that it can only access static members of the enclosing class, and it cannot access non-static members of the enclosing class.

A private class is used when you want to hide the implementation details of a class and only allow the class or package in which it is declared to access it.
It is useful when you want to prevent other classes from creating instances of the class, or from subclassing it.
A private class, is a class that is declared as private and can only be accessed by the class or package in which it is declared.
It cannot be instantiated or subclassed by other classes.
A private class is a class that can only be accessed within the same class in which it is defined.
It is not visible to other classes in the same package or in different packages.


It's important to note that the OOP principles of encapsulation and information hiding should be considered when choosing the access modifier for a class.
     */


    //Create separate file for the class named after the name of the class "Songs"

    /* public class Songs {  //Alternative - static classSongs {

    //характеристиките на класа
    private String typeList;        //Alternative String typeList;
    private String name;            //            String name;
    private String time;            //            String time;

    //конструктор
    public Songs (String typeList, String name, String time){
    this.typeList = typeList;
    this.name = name;
    this.time = time;

    //getters
    public String getTypeList(){
    return this.typeList;
    public String getName(){
    return this.name;
    public String getTime(){
    return this.time;

    //така взимам стойностите на характеристиките
    for (Songs item : listOfSongs){
     if(item.getTypeList().equals(command)){
     System.out.println(item.getName());

    //setters
    public void setTypeList(String typeList){
    this.typeList = typeList;
    public void setName(String name){
    this.name = name;
    public void setTime(String time){
    this.time = time;

    //така се актуализира информацията в Main файла
    Songs song = new Songs();                          - създавам нов обект от класа Songs, и в следващите редове му обновявам характеристиките
    song.setTypeList(typeList);

     */

    /*Create second file called "Main" where I write the code

     public class Main {
     public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int n = Integer.parseInt(scan.nextLine());   - чета броя на песните

     List<Songs> listOfSongs = new ArrayList<>(); - създавам списък от класа Songs, където да сложа всички песни

     for (int i = 0; i < n; i++) {

     String songData = scan.nextLine();           - чета данните за всяка една песен
     String typeList = songData.split("_")[0];    - деля прочетеното от горния ред по _ и взимам първата позиция от масива
     String name = songData.split("\\:")[1];      - деля прочетеното от първия ред по :, но с \\ ескейпвам, за да укажа, че взимам символа, а не оператора и взимам позиция 1 от масива
     String time = songData.split(("-")[2];       - деля прочетеното от първия ред по - и взимам позиция 2 от масива

     Songs song = new Songs (typeList, name, time); - създавам нов обект от класа Songs със съотверните характеристики

     //Alternative
     String[] songData = scan.nextLine().split("_");    - създавам масив в който делия всяко прочитане на String по _
     String typeList = songData[0];                     - взимам записа от масива на позиция 0 и го слагам в отделен String
     String name = songData[1];                         - взимам записа от масива на позиция 1 и го слагам в отделен String
     String time = songData[2];                         - взимам записа от масива на позиция 2 и го слагам в отделен String


    //Alternative
    Songs song = new Songs();                          - създавам нов обект от класа Songs, и в следващите редове му обновявам характеристиките
    song.setTypeList(typeList);                        - променям вида на песента
    song.setName(name);                                - променям името на песента
    song.setTime(time);                                - променям времето на песента


     listOfSongs.add(song);                       - добавям всеки нов обект в списъка от песни
     }

     String command = scan.nextLine();             - чета командата какво да правя с направения списък

     if(command.equals("all")){
     for (Songs item : listOfSongs){                - цикъл в който създавам item, от класа Songs, и проверявам списъка с песни
     System.out.println(item.getName());            - когато дадена песен отговаря на командата, и взимам характеристиката name
     }
     }else{
     for (Songs item : listOfSongs){
     if(item.getTypeList().equals(command)){
     System.out.println(item.getName());
     }}}}}

     */



    /*
    In Java, the StringBuilder class is used to create mutable (modifiable) strings. It provides a convenient way to build strings by appending elements to the end of the string.

Here is an example of how to use the StringBuilder class to build a string:

public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    // Append elements to the string
    sb.append("Hello");
    sb.append(" ");
    sb.append("World");
    sb.append("!");

    // Convert the string builder to a string
    String s = sb.toString();

    // Print the string
    System.out.println(s);
  }
}

This code creates a StringBuilder object and appends four elements to it ("Hello", " ", "World", and "!"). Then it converts the StringBuilder object to a string using the toString method and prints the string.

Output: Hello World!

The StringBuilder class has a number of methods for modifying the string, such as insert, delete, replace, etc.

For example, you can use the insert method to insert a string at a specific position in the StringBuilder:
public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello World!");
    // Insert a string at position 6
    sb.insert(6, "there ");

    // Convert the string builder to a string
    String s = sb.toString();

    // Print the string
    System.out.println(s);
  }
}
This code creates a StringBuilder object with the string "Hello World!" and inserts the string "there " at position 6 using the insert method. Then it converts the StringBuilder object to a string using the toString method and prints the string.

Output:

Copy code
Hello there World!
The StringBuilder class is faster and more efficient than the StringBuffer class when used in a single-threaded environment. In a multi-threaded environment, you should use the StringBuffer class, which is thread-safe.






     */

/* indexOf and lastindex, for more info see file StringBuilder
    StringBuilder sb = new StringBuilder("Hello, World!");
if (sb.indexOf("World") != -1) {         //It's important to note that the
indexOf() method returns the index of the first occurrence of the substring, and the
lastIndexOf() returns the index of the last occurrence of the substring,
so if the substring is not present it will give -1 as the output.
        System.out.println("The string contains the substring.");
    } else {
        System.out.println("The string does not contain the substring.");
    }
    This will output "The string contains the substring." because the substring "World" is present in the StringBuilder object.

if(input.indexOf(indexSubstring) != - 1){                       //indexSubstring е стринг, от команда и се пише без кавички
                    int start = input.indexOf(indexSubstring);  //indexSubstring е стринг, от команда и се пише без кавички
                    int end = input.indexOf(indexSubstring) + indexSubstring.length();

                    String subString = input.substring(start, end);
                    StringBuilder reversed = new StringBuilder(subString);
                    reversed.reverse();

                    String attach = new String(reversed);
                    input.replace(start, end, attach);

                    System.out.println(input.toString());

    */

   /* how to check in stringbuilder if part of it equals another string
To check if a part of a StringBuilder object equals another string in Java, you can use the substring method to extract the part of the string and the equals method to compare it with the other string.

Here is an example of how to use the substring and equals methods to check if a part of a StringBuilder object equals another string:

Copy code
public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello World!");
    // Extract a part of the string
    String s1 = sb.substring(0, 5);
    // Compare the part of the string with another string
    if (s1.equals("Hello")) {
      System.out.println("The part of the string equals 'Hello'.");
    } else {
      System.out.println("The part of the string does not equal 'Hello'.");
    }
  }
}
This code creates a StringBuilder object with the string "Hello World!" and extracts a part of the string using the substring method. The substring method takes two arguments: the start index (inclusive) and the end index (exclusive) of the part of the string to be extracted. In this example, the part of the string "Hello" is extracted, which starts at index 0




*/

    /*how to check in stringbuilder if part of it equals another string if i do not know the start and end index

To check if a part of a StringBuilder object equals another string in Java, even if you don't know the start and end indexes of the part of the string, you can use the indexOf and substring methods.

The indexOf method searches for the first occurrence of a specified string within the StringBuilder object and returns the index of the occurrence. If the specified string is not found, it returns -1.

Here is an example of how to use the indexOf and substring methods to check if a part of a StringBuilder object equals another string:

Copy code
public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello World! Hello again!");
    // Find the index of the first occurrence of "Hello"
    int index = sb.indexOf("Hello");
    // Extract the part of the string
    String s1 = sb.substring(index, index + 5);
    // Compare the part of the string with another string
    if (s1.equals("Hello")) {
      System.out.println("The part of the string equals 'Hello'.");
    } else {
      System.out.println("The part of the string does not equal 'Hello'.");
    }
  }
}
This code creates a StringBuilder object with the string "Hello World! Hello again!" and uses the indexOf method to find the index of the first occurrence of the string "Hello". Then it extracts the part of the string using the substring method, with the start index being the index of the occurrence and the end index being the index of the occurrence plus the length of the string "Hello". Finally, it compares the part of the string with the string "Hello" using the equals method. If the part of the string equals "Hello", it prints a message saying "The part of the string equals 'Hello'.". If the part of the string does not equal "Hello", it prints a message saying "The part of the string does not equal 'Hello'.".

Output:

Copy code
The part of the string equals 'Hello'.
     */

    /*how to find out if part of stringbuilder equals another substring

To find out if part of a StringBuilder object equals another substring, you can use the IndexOf method. This method searches for the first occurrence of a specified string within the StringBuilder object, and returns the zero-based index position of the string if it is found. If the specified string is not found, the method returns -1.

Here's an example of how to use the IndexOf method:

StringBuilder sb = new StringBuilder("Hello, world!");

int index = sb.IndexOf("world");
if (index != -1)
{
    Console.WriteLine("The substring was found at index " + index);
}
else
{
    Console.WriteLine("The substring was not found");
}
This code will output "The substring was found at index 7", since the substring "world" is found at index position 7 in the StringBuilder object.

You can also use the IndexOf method with an optional parameter to specify the starting index position for the search, and another optional parameter to specify the number of characters in the StringBuilder object to search. This can be useful if you want to search for a substring within a specific part of the StringBuilder object.

For example in C#:

StringBuilder sb = new StringBuilder("Hello, world!");

int index = sb.IndexOf("world", 7, 5);
if (index != -1)
{
    Console.WriteLine("The substring was found at index " + index);
}
else
{
    Console.WriteLine("The substring was not found");
}
In this case, the search will start at index position 7 and only search the next 5 characters, so the search will find the substring "world" and output "The substring was found at index 7".
     */

    /*
    /*how to print stringbuilder
To print a StringBuilder object in Java, you can use the toString() method, which converts the contents of the StringBuilder to a String, and then print the String using the println() method or print() method.

Example:

StringBuilder sb = new StringBuilder("Hello, World!");
System.out.println(sb.toString());
or

StringBuilder sb = new StringBuilder("Hello, World!");
System.out.print(sb);
     */



    //OBJECT AND CLASSES

    /*how to increase value of integer parameter within object java
To increase the value of an integer parameter within an object in Java, you can use the following steps:

First, create a class for the object that has the integer parameter as one of its instance variables.

Next, create a method within the class that takes an integer as an argument and adds it to the current value of the integer parameter.

To increase the value of the integer parameter within an object, you can create an instance of the object and call the method on that object, passing in the value you want to add to the integer parameter.

For example, consider the following class:

Copy code
class MyObject {
  private int value;

  public MyObject(int value) {
    this.value = value;
  }

  public void increaseValue(int amount) {
    this.value += amount;
  }
}
To increase the value of the value parameter within an object of type MyObject, you can do the following:

Copy code
MyObject obj = new MyObject(5);
obj.increaseValue(3);
After calling the increaseValue method, the value of the value parameter within the obj object would be 8.
     */

    /* how to increase value of object parameter within the main method and after that divide that value by 2 java
To increase the value of an object parameter within the main method in Java and then divide that value by 2, you can use the following steps:

First, create a class for the object that has the parameter you want to increase as one of its instance variables.

Next, create a method within the class that takes an argument and adds it to the current value of the object parameter.

In the main method, create an instance of the object and call the method on that object, passing in the value you want to add to the object parameter.

After calling the method to increase the value of the object parameter, divide the updated value by 2 using the division operator (/).

Here's an example of how you might do this:

Copy code
class MyObject {
  private int value;

  public MyObject(int value) {
    this.value = value;
  }

  public void increaseValue(int amount) {
    this.value += amount;
  }
}

public class Main {
  public static void main(String[] args) {
    MyObject obj = new MyObject(5);
    obj.increaseValue(3);
    int newValue = obj.value / 2;
  }
}
In this example, the main method creates an instance of the MyObject class and calls the increaseValue method on it, passing in 3 as the argument. This will increase the value of the value parameter within the obj object by 3, so its final value will be 8. Then, the main method divides the updated value by 2, resulting in a final value of 4 for the newValue variable.

Note that if you want to update the value of the value parameter within the MyObject object itself, rather than just storing the result in a separate variable, you can simply use the assignment operator (=) to reassign the value of the value parameter to the result of the division. For example:

Copy code
obj.value = obj.value / 2;
This would update the value of the value parameter within the obj object to be 4.
     */
/* how to check, if one of the objects parameter within a list equals a specific word java
To check if one of the object parameters within a list equals a specific word in Java, you can use a loop to iterate over the objects in the list and check their parameters.

Here's an example of how you might do this:

Copy code
List<MyObject> list = new ArrayList<MyObject>();
list.add(new MyObject("apple"));
list.add(new MyObject("banana"));
list.add(new MyObject("cherry"));

boolean containsWord = false;
for (MyObject obj : list) {
  if (obj.getWord().equals("banana")) {
    containsWord = true;
    break;
  }
}
In this example, the containsWord variable will be set to true if one of the objects in the list has a word parameter that is equal to "banana".

Alternatively, you can use the stream API to check if any of the objects in the list have a word parameter that is equal to "banana". Here's an example of how you might do this:

Copy code
boolean containsWord = list.stream().anyMatch(obj -> obj.getWord().equals("banana"));
This will set the containsWord variable to true if any of the objects in the list have a word parameter that is equal to "banana".

Note that in both examples, the getWord method should be implemented in the MyObject class to return the word parameter of the object.




Regenerate response
 */

    /*loops
     /*  for (int k = 0; k < plants.size(); k++) {
                    if(plants.get(k).getPlantsName().equals(plantName)){
                        plants.get(k).setRarity(rarity);*/
    /*int index = 0;
            for (
    P3PlantDiscovery.Plants existingPlant : plants) {

        if (existingPlant.getPlantsName().equals(plantName)) {

            existingPlant.setRarity(rarity);
            index += 1;
            break;
        }
    }

     */

    /*how to increase value of object

    static class Plants

    int ratingsRepetitions;

    public void increaseValueIndex(int amount) {  - Method, който го извиквам във мейн метода и там се увеличава стойността н ratingsRepetitions, която е част
            this.ratingsRepetitions += amount;    - от структурата на класа Plants, и част от обектите, които се създават
        }

    psvm
     for (Plants plant2 : plants) {
                        if (plant2.getPlantsName().equals(name)) {

                            plant2.increaseValueIndex(1);
     */


    //REGULAR EXPRESSIONS REGEX

    //+ - 1 или безкрайно много
    //* - 0 или безкрайно много
    //? - 0 или 1

    //[A-Za-z] - \\w
    //[0-9] - \\d

    //(?<user>.....) - създаване на група

/*
import java.util.regex.*;
public class TEST {
    public static void main(String[] args) {
        String s = "A35, 35A, B503X, 1ABC5 " +
            "AB-10, 10-AB, A10-BA, BA-A10, etc... " +
            "10-10, open-office, etc.";
        Pattern regex = Pattern.compile(
            "# Match special word having one letter and one digit (min).\n" +
            "\\b                       # Match first word having\n" +
            "(?=[-/\\\\A-Za-z]*[0-9])  # at least one number and\n" +
            "(?=[-/\\\\0-9]*[A-Za-z])  # at least one letter.\n" +
            "[A-Za-z0-9]+              # Match first part of word.\n" +
            "(?:                       # Optional extra word parts\n" +
            "  [-/\\\\]                # separated by -, / or //\n" +
            "  [A-Za-z0-9]+            # Match extra word part.\n" +
            ")*                        # Zero or more extra word parts.\n" +
            "\\b                       # Start and end on a word boundary",
            Pattern.COMMENTS);
        Matcher regexMatcher = regex.matcher(s);
        while (regexMatcher.find()) {
            System.out.print(regexMatcher.group() + ", ");
        }
    }
}
 */
    /*Example
    (@|#)(?<word>[A-Za-z]{3,})\1\1(?<mirror>[A-Za-z]{3,})\1
    @|#: Matches either the "@" or "#" character. The pipe symbol | is used as an "or" operator in regular expressions.
    (?<word>[A-Za-z]{3,}): Matches a sequence of 3 or more letters (uppercase or lowercase). The ?<word> is a named capturing group, it is used to assign a name to the matched group.
    \1: Matches the same character as the first capturing group. The \1 is a back-reference, it refers to the first capturing group, in this case "@" or "#".
    (?<mirror>[A-Za-z]{3,}): Matches a sequence of 3 or more letters (uppercase or lowercase). The ?<mirror> is a named capturing group, it is used to assign a name to the matched group.
    This regular expression pattern will match a string that starts and ends with the same character ("@" or "#") and contains two groups of 3 or more letters in between. The two groups of letters are captured and can be accessed by their group names ("word" and "mirror").
     */

/*Example
package Fundamentals.Mai_2022.P31RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

public class P1Furniture {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        List<String> furniture = new ArrayList<>();
        double totalSum = 0;

        Pattern pattern = Pattern.compile(">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)");

        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(furnitureName);
                double currentFurniturePrice = price * quantity;
                totalSum += currentFurniturePrice;

            }

            input = scan.nextLine();
        }

        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);

    }
}

 */

    /*Example
    package Fundamentals.Exams.FinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

public class P2DestinationMapper {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String destinations = scan.nextLine();
        List<String> finalDestinations = new ArrayList<>();

        Pattern pattern = Pattern.compile("=[A-Z][A-Za-z]{2,}=|/[A-Z][A-Za-z]{2,}/");
        //([=/])([A-Z][A-Za-z]{2,})\1
        Matcher matcher = pattern.matcher(destinations);

        while (matcher.find()) {

            finalDestinations.add(matcher.group());
        }

        int numberOfDestinations = finalDestinations.size();
        int totalLenght = 0;

        for (String travelPoints : finalDestinations) {
            totalLenght += travelPoints.length();
        }

        int travelPoints = totalLenght - numberOfDestinations * 2;


        System.out.println("Destinations: " + finalDestinations.toString().replaceAll("[\\[\\]=/]", ""));
        System.out.printf("Travel Points: %d", travelPoints);
    }
}

     */

    /*
    package Fundamentals.Mai_2022.P31RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

public class P1Furniture {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        List<String> furniture = new ArrayList<>();
        double totalSum = 0;

        Pattern pattern = Pattern.compile(">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)");

        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(furnitureName);
                double currentFurniturePrice = price * quantity;
                totalSum += currentFurniturePrice;

            }

            input = scan.nextLine();
        }

        System.out.println("Bougth furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);

    }
}

     */

    /*Example i have a new class called Cars with characteristics car, mileage, fuel, how can i change the value of fuel into the main method in java?
To change the value of the "fuel" attribute of an instance of the Cars class in the main method, you would first need to create an instance of the Cars class, and then use the setter method of the class to change the value of the "fuel" attribute. Here's an example of how you might do this:

Copy code
public class Cars {
    private String car;
    private int mileage;
    private String fuel;

    // constructor
    public Cars(String car, int mileage, String fuel) {
        this.car = car;
        this.mileage = mileage;
        this.fuel = fuel;
    }

    // setter method for fuel
    public void setFuel(String newFuel) {
        this.fuel = newFuel;
    }

    // getter method for fuel
    public String getFuel() {
        return this.fuel;
    }
}

public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars("Tesla Model S", 1234, "Electric");
        System.out.println("Original fuel: " + car1.getFuel());
        car1.setFuel("Gasoline");
        System.out.println("New fuel: " + car1.getFuel());
    }
}
In this example, an instance of the Cars class is created in the main method, and its fuel attribute is set to "Electric" when it is created. Then, the setFuel() method is called on the instance, which changes the value of the fuel attribute to "Gasoline". After that, the getFuel() method is called on the instance, which returns the current value of the fuel attribute, which is "Gasoline". The output of this program would be:

Copy code
Original fuel: Electric
New fuel: Gasoline
In the above example, the class Cars has a private attribute named fuel and setter and getter method for fuel attribute. This way you can set and get the value of fuel attribute in the main method.

     */


    //ASSOCIATIVE ARRAYS

    /*
    In Java, a Hashtable is a data structure that stores key-value pairs, where each key is unique. So, by default, each key can only have one value associated with it in a Hashtable.

However, if you want to store multiple values for a single key, you have a few options:

You can store a list of values as the value for a single key. For example, you can store an ArrayList or a LinkedList as the value for a key in the Hashtable.
Copy code
Hashtable<String, List<String>> ht = new Hashtable<String, List<String>>();
List<String> list = new ArrayList<String>();
list.add("value1");
list.add("value2");
list.add("value3");
ht.put("key", list);
You can use a map as the value of a key, where the map stores the multiple values as key-value pairs.
Copy code
Hashtable<String, Map<String,Integer>> ht = new Hashtable<String, Map<String,Integer>>();
Map<String,Integer> map = new HashMap<String,Integer>();
map.put("value1",1);
map.put("value2",2);
map.put("value3",3);
ht.put("key", map);
You can use MultiMap, which is a special data structure that allows you to store multiple values for a single key.
Copy code
MultiMap<String, String> multiMap = new MultiValueMap<String, String>();
multiMap.put("key1", "value1");
multiMap.put("key1", "value2");
multiMap.put("key1", "value3");
Please note that MultiMap can be found in libraries like Apache Commons Collection or Google Guava, you will have to import them before using it.
     */

    /*
    i have as key string and as values two integers, how can i create hashtable that contains that
You can create a Hashtable that has a key of type String and values of type Integer using the following syntax:

Copy code
Hashtable<String, Pair<Integer,Integer>> ht = new Hashtable<String, Pair<Integer,Integer>>();
Here, the Hashtable is declared with the key type String and value type Pair, which is a class that contains two integers.

Here is an example on how you can use it:

Copy code
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Hashtable<String, Pair<Integer,Integer>> ht = new Hashtable<String, Pair<Integer,Integer>>();
        ht.put("key1", new Pair<Integer,Integer>(1,2));
        ht.put("key2", new Pair<Integer,Integer>(3,4));
        System.out.println(ht.get("key1")); // output: (1,2)
        System.out.println(ht.get("key2")); // output: (3,4)
    }
}
Here, the Pair class is not a built-in class in Java, so you will have to create it by yourself like this:

Copy code
class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        super();
        this.first = first;
        this.second = second;
    }

    public int hashCode() {
        int hashFirst = first != null ? first.hashCode() : 0;
        int hashSecond = second != null ? second.hashCode() : 0;

        return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }

    public boolean equals(Object other) {
        if (other instanceof Pair) {
            Pair otherPair = (Pair) other;
            return
            ((  this.first == otherPair.first ||
                ( this.first != null && otherPair.first != null &&
                  this.first.equals(otherPair.first))) &&
             (  this.second == otherPair.second ||
                ( this.second != null && otherPair.second != null &&
                  this.second.equals(otherPair.second))) );
        }

        return false;
    }

    public String toString()
    {
           return "(" + first + ", " + second + ")";
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }
}
You can use the put() method to add key-value pairs to the Hashtable, and the get() method to retrieve the value associated with a given key.

You can also use the containsKey() method to check if a key is present in the Hashtable, and the remove() method to remove a key-value pair from the Hashtable.arr
     */

    /*how to access characteristics of object and compare into for each loop

    i have a list with 3 objects in it, the first object is at index 0 with name p3need, with 3 characteristics carModel, mileage and fuel. how can i reach in a for each cycle the characteristics carModel, so when the loop starts it does not compare with the index 0 p3need but with the cahracteristics carModel
To access the "carModel" characteristic of the first object in a list of objects, you can use a for-each loop to iterate through the list, and then use the dot notation to access the characteristic of the object.

Here's an example of how you can do this:

Copy code
List<Car> carsList = new ArrayList<>();
carsList.add(new Car("p3need","Tesla", 1234, "Electric"));
carsList.add(new Car("p4need","Nissan", 1234, "Gasoline"));
carsList.add(new Car("p5need","BMW", 1234, "Diesel"));

for (Car car : carsList) {
    if(car.getName().equals("p3need")){
        String carModel = car.getCarModel();
        System.out.println(carModel);
    }
}
In this example, the variable carsList is a list of Car objects, and the for-each loop iterates through the list, assigning each object to the variable "car" in each iteration. Then, inside the loop, an if statement checks if the name attribute of the car is equals to "p3need" and if so, it retrieves the carModel attribute using the getCarModel() method and print it.

You can also use the stream API of java 8, which is another approach to access the carModel characteristic of the first object in the list, here's an example of how you can do it:

Copy code
String carModel = carsList.stream()
                        .filter(car -> car.getName().equals("p3need"))
                        .findFirst()
                        .map(Car::getCarModel)
                        .orElse(null);
System.out.println(carModel);
In this example, the carsList stream is filtered to find the first Car object where the name attribute is equals to "p3need". The map function is then used to extract the carModel attribute, and the orElse function is used to return the carModel value or null if no such car is found.




emil vasilev
for (Car car : carsList) {
    if(car.getName().equals("Tesla")){ - how can i do this?
To check if the carModel attribute of a Car object in the carsList is equal to "Tesla", you can use the if statement as you have shown in your question, but instead of checking the name attribute, you should check the carModel attribute:

Copy code
for (Car car : carsList) {
    if(car.getCarModel().equals("Tesla")){
        System.out.println("Tesla car found!");
    }
}
In this example, the for-each loop iterates through the carsList and for each iteration, it checks if the carModel attribute of the current car object is equal to "Tesla" using the getCarModel() method and the equals() method. If the condition is true, the loop will print "Tesla car found!".

Alternatively, you can use the stream API of java 8 to achieve the same result, here's an example of how you can do it:

Copy code
carsList.stream()
        .filter(car -> car.getCarModel().equals("Tesla"))
        .findFirst()
        .ifPresent(car -> System.out.println("Tesla car found!"));
In this example, the carsList stream is filtered to find the first Car object where the carModel attribute is equals to "Tesla" using the filter method and the getCarModel() method. The findFirst() method returns an Optional<Car> representing the first matching element in the stream. If the Optional is not empty, the ifPresent function will execute the provided Consumer.

     */

    /*print of a map
    map
                    .entrySet()
                    .stream()
                    .sorted((a, b) -> Integer.compare(b.getValue()[0], a.getValue()[0]))
                    .forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue()[0], entry.getValue()[1]));
Sure, this code snippet is using a few features of the Java Stream API to sort and print the contents of a Map.

Here is a breakdown of what's happening in this code:

map.entrySet(): This retrieves a set of all the entries in the map, where each entry is a key-value pair. This set is then passed to the stream() method.

stream(): This converts the set of entries into a stream, which allows for various operations to be performed on the elements of the stream.

sorted((a, b) -> Integer.compare(b.getValue()[0], a.getValue()[0])): This sorts the stream of entries based on the first element of the value, which is an array of two integers. The sorting is done in descending order (b.getValue()[0], a.getValue()[0]), so the entry with the highest value will be at the start of the stream.

forEach(entry -> ...): This iterates over each entry in the stream and performs the specified action, in this case printing the entry.

entry.getKey(): This gets the key of the entry, which is a string.

entry.getValue()[0]: This gets the first element of the value, which is an array of two integers.

entry.getValue()[1]: This gets the second element of the value, which is an array of two integers.

System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue()[0], entry.getValue()[1]): This prints the key, the first element of the value, and the second element of the value in a specific format.

So in summary, this code snippet is sorting the entries of a map in descending order of the first element of the value array and then printing the key, the first element of the value array and the second element of the value array.

It's important to note that the above code snippet assumes that the map contains key-value pairs where the key is a string and the value is an array of two integers, and that the forEach method is invoked on a valid stream.

     */
    /*
    how can i change it to print into the order the keys were entered
If you want to print the entries of a map in the order they were entered, you can do so by iterating over the map directly instead of using the Stream API.
Here is an example of how you can print the entries of a map in the order they were entered:

Copy code
for(Map.Entry<String, int[]> entry : map.entrySet()) {
    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue()[0], entry.getValue()[1]);
}
This code uses a traditional for-each loop to iterate over the map's entry set, which preserves the insertion order.
The entrySet() method returns a set view of the mappings contained in this map. The set is backed by the map, so changes to the map are reflected in the set, and vice-versa. If the map is modified while an iteration over the set is in progress (except through the iterator's own remove operation), the results of the iteration are undefined.

Alternatively, if you are using Java 8 or later, you can use the forEach() method on the map itself, like this:

Copy code
map.forEach((k,v) -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", k, v[0], v[1]));
This code uses the forEach() method on the map, which iterates over the entries in the order they were inserted. The lambda expression passed to the forEach() method is applied to each entry in the map, and prints the key, the first element of the value, and the second element of the value in a specific format.

It is important to note that the above code snippet assumes that the map contains key-value pairs where the key is a string and the value is an array of two integers.




emil vasilev
i need the whole expression
Sure, here is the whole code that prints the entries of a map in the order they were entered:

Copy code
Map<String, int[]> map = new LinkedHashMap<>();
map.put("car1", new int[] {100, 20});
map.put("car2", new int[] {150, 30});
map.put("car3", new int[] {200, 40});

for(Map.Entry<String, int[]> entry : map.entrySet()) {
    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue()[0], entry.getValue()[1]);
}
or

Copy code
Map<String, int[]> map = new LinkedHashMap<>();
map.put("car1", new int[] {100, 20});
map.put("car2", new int[] {150, 30});
map.put("car3", new int[] {200, 40});

map.forEach((k,v) -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", k, v[0], v[1]));
In this example, I am creating a LinkedHashMap which is a Hash table and linked list implementation of the Map interface, with predictable iteration order, which means that the order of elements is the order in which elements were added.

Then I am adding three entries to the map, with keys "car1", "car2", and "car3", and values which are arrays of two integers.

After that, I am using a for-each loop to iterate over the map's entry set, and the forEach() method on the map, to iterate over the entries in the order they were inserted, and printing the key, the first element of the value, and the second element of the value in a specific format.

This way you can print your map in the order the keys were entered.
     */
}