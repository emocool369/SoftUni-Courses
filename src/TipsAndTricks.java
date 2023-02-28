import Fundamentals.Exams.FinalExam.P3PlantDiscovery;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*
public class TipsAndTricks {

/*
как се качва зип файл в джъдж
дясно копче на пакета и Open in Explorer
там пакета се прави на зип файл
в джъдж избираме, че ще качаме зип файл, а не код от падащото меню до Submit
 */




 /*
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
/*how to print string with first capital letter
To capitalize the first letter of a string in Java, you can use the toUpperCase() method in combination with the substring() method to modify the input string.

Here's an example code snippet that demonstrates how to capitalize the first letter of a string in Java:
String input = "car";
String output = input.substring(0, 1).toUpperCase() + input.substring(1);

System.out.println(output); // prints "Car"

In this code, we first create a variable input and assign the string "car" to it. Then, we create a variable output and assign the capitalized version of the input string to it.

To capitalize the first letter of the input string, we call the substring() method twice: once to extract the first letter of the string (input.substring(0, 1)), and once to extract the remainder of the string (input.substring(1)). We then call the toUpperCase() method on the first letter to capitalize it. Finally, we concatenate the capitalized first letter with the rest of the string using the + operator.

When we call System.out.println(output), it prints the capitalized string "Car".

 */

/*how to print % inside printf
System.out.printf("Collected only %.2f%% of the plunder.", sumPlunder / expectedPlunder * 100);
 */

/*how to compare two texts and get the one that is bigger
if(firstText.compareTo(secondText) > 0)
return firstText;
}else{
return secondText;
 */

/*random
public static String printPhrase (){

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        Random rand = new Random();
        int randomIndex = rand.nextInt(phrases.length);
        String randomString = phrases[randomIndex];
        return randomString;

    }
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
        /*how to find length of string, value of string, number of string
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

        //DecimalFormat - how to print определен брой числа след десетичната запетая в случай, че ги има
        /*

        double num = 1.146000;
        DecimalFormat decimalFormat = new DecimalFormat("0.###");
        String formattedNum = decimalFormat.format(num);
        System.out.println(formattedNum); //1.146

        DecimalFormat df = new DecimalFormat("0.##");
        double result = calculation(operator, firstNum, secondNum); -> извиквам метод
        System.out.println(df.format(result));


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

        /*how to write in while several conditions
         while (!(input.equals("special") || input.ls("regular")))

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
There are six numeric types four integer and two floating point:                                колко памет заемат
byte 1 byte -128 (-2на7ма) to 127 (2на7ма - 1).                                                 = 8 bit
short 2 bytes -32,768 (-2на15а) to 32,767. (2на15а - 1)                                         = 16 bit
int 4 bytes -2,147,483,648 (-2на31) to 2,147,483,647 (2на31 - 1).                               = 32 bit
long 8 bytes -9,223,372,036,854,775,808 (-2на63) to 9,223,372,036,854,775,80. (2на63 - 1)       = 64 bit
float 4 bytes 7 decimal digits. - real number types
double 8 bytes 16 decimal digits.
Floating-point types are:
float (±1.5X10на−45 to ±3.4X10на38)
32-bits, the precision of 7 digits
double (±5.0X10на−324 to ±1.7X10на308)
64-bits, the precision of 15-16 digits
The default value of floating-point types:
Is 0.0F for the float type
Is 0.0D for the double type
float floatPI = 3.141592653589793238f; "f" Suffix
double doublePI = 3.141592653589793238;
System.out.println("Float PI is: " + floatPI);   - 3.1415927
System.out.println("Double PI is: " + doublePI); - 3.141592653589793

Floating-Point Division
System.out.println(10 / 4);    // 2 (integral division)
System.out.println(10 / 4.0);  // 2.5 (real division)
System.out.println(10 / 0.0);  // Infinity
System.out.println(-10 / 0.0); // -Infinity
System.out.println(0 / 0.0);   // NaN (not a number)
System.out.println(8 % 2.5);   // 0.5 (3 * 2.5 + 0.5 = 8)
System.out.println(10 / 0);    // ArithmeticException


BigDecimal - аритметични операции с висока прецизност / финансови калкулации
BigDecimal number = new BigDecimal(0);
number = number.add(BigDecimal.valueOf(2.5));       - добавяме
number = number.subtract(BigDecimal.valueOf(1.5));  - изваждаме
number = number.multiply(BigDecimal.valueOf(2));    - умножаваме
number = number.divide(BigDecimal.valueOf(2));      - делиме

how to calculate number times number, число на степен
Math.pow(radius, 2) = радиус на степен 2

how to decrease integer in java by 10 %
In Java, you can decrease an integer by a certain percentage (in this case, 10%) by first multiplying the integer by that percentage as a decimal (0.1 in this case), and then subtracting the result from the original integer.

Here's an example of how you can decrease an integer by 10% in Java:

Copy code
int num = 100;
int decrease = (int) (num * 0.1);
num -= decrease;
System.out.println(num);
This code first multiplies the integer num by 0.1, which is 10% as a decimal. Then it subtracts the result from the original value of num and assigns it back to num. The final value of num will be 90.

You can also use the shorthand operator *= and -= to achieve the same thing

Copy code
int num = 100;
num *= 0.9;
System.out.println(num);
This code will also output 90


Type Conversion
Type can be changed (converted) to another type
Implicit type conversion (lossless): variable of the bigger type(e.g. Double) takes a smaller value (e.g. float)
Implicit conversion:
float heightInMeters = 1.74f;
double maxHeight = heightInMeters;
Explicit type conversion (lossy) – when precision can be lost:
Explicit conversion:
double size = 3.14;
int intSize = (int) size;


Boolean Type
Boolean variables (boolean) hold true or false:
int a = 1;
int b = 2;
boolean greaterAB = (a > b);
System.out.println(greaterAB);  // False
boolean equalA1 = (a == 1);
System.out.println(equalA1);    // True

boolean isSpecial = sum == 5 || sum == 7 || sum == 11;

The Character Data Type

Has a '\0' default value
Takes 16 bits of memory (from U+0000 to U+FFFF)

how to see the number of a char, как да видя числото на чар
char symbol = 'a';
System.out.printf("The code of '%c' is: %d%n", symbol, (int) symbol);
result The code of 'a' is: 97

int sum = symbol + 10;
System.out.println(sum);
result 107

how to get char from a number
char c = (char) i; i = 10,11,12 usw, i wird gekast

how to read char from console
char char1 = scan.nextLine().charAt(0);


if(Character.isUpperCase(input)){
System.out.println("upper-case");
}else if (Character.isLowerCase(input)){
System.out.println("lower-case");

aaa
aab
aac

 int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    char firstChar = (char) ('a' + i);
                    char secondChar = (char) ('a' + j);
                    char thirdChar = (char) ('a' + k);

                    System.out.printf("%c%c%c%n", firstChar,secondChar,thirdChar);

                }

            }

        }
         */
/*
Escaping Characters
Escaping sequences are:
Represent a special character like ', " or \n (new line)
Represent system characters (like the [TAB] character \t)

Commonly used escaping sequences are:
\'  for single quote   - искам да принтирам '
\"  for double quote   - искам да принтирам "
\\  for backslash      - искам да принтирам \
\n  for a new line
/*

\ for denoting any other Unicode symbol u-> uXXX, показваше ми грешка, вместо uXXXX
*//*
char symbol = 'a'; // An ordinary character
symbol = '\u006F'; // Unicode character code in a
                   // hexadecimal format (letter 'o')
symbol = '\u8449'; // 葉 (Leaf in Traditional Chinese)
symbol = '\''; // Assigning the single quote character
symbol = '\\'; // Assigning the backslash character
symbol = '\n'; // Assigning new line character
symbol = '\t'; // Assigning TAB character
symbol = "a";  // Incorrect: use single quotes! symbol = 'a';
*/
        /*

The String Data Type

Has a default value null (no value)
Strings are enclosed in quotes:
String s = "Hello, JAVA";

Strings can be concatenated
Using the + operator

String file = "C:\\Windows\\win.ini"; - The backslash \ is escaped by \\

Format strings insert variable values by pattern:
String firstName = "Emil";
String lastName = "Vassilev";
String fullName = String.format("%s %s", firstName, lastName);
System.out.printf("Your full name is %s.", fullName);

We can concatenate strings and numbers by the + operator:
int age = 21;
System.out.println("Hello, I am " + age + " years old");

         */
        /*
byte centuries = 20;
short years = 2000;
int days = 730484;
long hours = 17531616;

System.out.printf("%d centuries = %d years = %d days = %d hours.",
                                    centuries, years, days, hours)
//20 centuries = 2000 years = 730484 days = 17531616 hours.

         /*
        integer literals:

        The '0x' and '0X' prefixes mean a hexadecimal value
        E.g. 0xFE, 0xA8F1, 0xFFFFFFFF

        The 'l' and 'L' suffixes mean a long
        E.g. 9876543L, 0L

int hexa = 0xFFFFFFFF; //-1
long number = 1L;      //1


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

        //Arrays / Масиви
/*
String[] stringArr = scanner.nextLine().split("\\s+");

int[] integerArr = Arrays .stream(scanner.nextLine().split("\\s+")) .mapToInt(Integer::parseInt) .toArray();

double[] doubleArr = Arrays .stream(scanner.nextLine().split("\\s+")) .mapToDouble(Double::parseDouble) .toArray();
 */
 // масив - последователност от елементи
        //0 1 2 3 4 - масив с 5 елемента. array.length = 5
        //5 6 5 7 8

        /*how to create new array in java
There are several ways to create a new array in Java. Here are a few examples:

Allocating an array of 5 integers
double[] numbers = new double[5];
String[] input = new String[5];
String[] input = {
"Monday",
"Tuesday",
"Sunday"
};
input[0] = "Monday";
int[] numbers = {
1,2,3,4,5
};
int[] numbers = new int[5]; // creates an array of 5 integers, масив от 5 елемента
//0 1 2 3 4 - масив с 5 елемента.
//0 0 0 0 0
array.length = 5
Assigning values to the array elements
for (int i = 0; i < numbers.length; i++)
  numbers[i] = 1;
/0 1 2 3 4 - масив с 5 елемента.
//1 1 1 1 1
Accessing array elements by index
numbers[3] = numbers[1] + numbers[4];
//0 1 2 3 4 - масив с 5 елемента.
//1 1 1 2 1
numbers[5] = 1; // ArrayIndexOutOfBoundsException

//Read Array
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbers2 = Arrays.stream(scan.nextLine() //" 23 -2 321 87 42 90 -123"
                        .split(" ")) //["23","-2","321","87","42","90","-123"]
                .mapToInt(Integer::parseInt) //[23, -2, 321, 87, 42, 90, -123]
                .toArray();

Using an array literal:
int[] myArray = {1, 2, 3, 4, 5}; // creates an array with the given values

Reading Arrays from the Console
First, read the array length from the console
int n = Integer.parseInt(sc.nextLine());
Next, create an array of given size n and read its elements:
int[] numbers = new int[n];
for (int i = 0; i < n; i++) {     //for (int i = 0; i < numbers.lenth; i++)
  numbers[i] = Integer.parseInt(sc.nextLine());
}

how to read integer array
int[] array = new int[2];
array[0] = scan.nextInt();
array[1] = scan.nextInt();

Reading Array Values from a Single Line
2 8 30 25 40 72 -2 44 56
String values = sc.nextLine();
String[] items = values.split(" ");
int[] numbers = new int[items.length];

for (int i = 0; i < items.length; i++)
 numbers[i] = Integer.parseInt(items[i]);

Shorter: Reading Array from a Single Line
Read an array of integers using functional programming:
String inputLine = sc.nextLine();
String[] items = inputLine.split(" ");
String[] items = scan.nextLine.split(" ");    - чета, разделям по спейс и пълня масива
int[] numbers = Arrays.stream(items)
  .mapToInt(e -> Integer.parseInt(e)).toArray();

int[] numbers = Arrays
 .stream(sc.nextLine().split(" "))          -> манипулирай това, което въвеждам
 .mapToInt(Integer::parseInt)            -> превърни го в числа
 .toArray();                                -> числата ги сложи в масив

To read the numbers in the format you provided as an array in Java, you could use a Scanner object to read each line of input and then use a loop to store each number in an array. Here is an example:

scss
Copy code
Scanner sc = new Scanner(System.in);
int[] arr = new int[3];
for (int i = 0; i < arr.length; i++) {
    arr[i] = sc.nextInt();
}
You can then access the individual elements of the array using the indices, for example, arr[0] would give you the first number in the list (3).

 double[] numbers = Arrays
 .stream(sc.nextLine().split(" "))
 .mapToDouble(Double::parseDouble)
 .toArray();

 int[] numbers = Arrays
 .stream(sc.nextLine().split(" "))
 .mapToInt(e -> Integer.parseInt(e)).toArray();

String[] input = scan.nextLine().split(" ");

 String[] input = Arrays
 .stream(sc.nextLine().split(" "))          -> манипулирай това, което въвеждам
 .toArray();                                -> сложи въведеното в масив

String[] input = Arrays
 .stream(sc.nextLine().split("\\+s "))      -> манипулирай това, което въвеждам, сплит по 1 или няколко спейса
 .toArray();                                -> сложи въведеното в масив


how to sort integer array in ascending order and print the result:

int[] output = { 3, 87, 2, 90};

Arrays.sort(output);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);

            result: 2, 3, 87, 90


daniela topuzakova style of spliting into array
for (int i = 1; i <= n; i++) {
            String data = scan.nextLine();
            String name = data.split("\\s+")[0];
            int age = Integer.parseInt(data.split("\\s+")[1]);

Printing Arrays On the Console
String[] arr = {"one", "two"};
// == new String [] {"one", "two"};
// Process all array elements
for (int i = 0; i < arr.length; i++) {
   System.out.printf("arr[%d] = %s%n", i, arr[i]);
}

принтиране с for
for (int i = 0; i < integerArr.length; i++) {
System.out.print(integerArr[i] + " ");
}

Принтиране с foreach
for (int item : integerArr) {
System.out.print(item + " ");
}

Принтиране със String.join() – с този метод може да се принтира само String масив
System.out.println(String.join(", ", numbersAsStringArr));


Int масив със String.join() – трябва да създаден нов String[], в който да сложим елементите и да ги направим от числа в String
int[] integerArr = Arrays.stream(scanner.nextLine().split("\\s+")) .mapToInt(Integer::parseInt).toArray();
String[] numbersAsStringArr = new String[integerArr.length];
for (int i = 0; i < integerArr.length; i++) {
numbersAsStringArr[i] = String.valueOf(integerArr[i]);
}
System.out.println(String.join(", ", numbersAsStringArr));

how to print array with every word on a single line
System.out.println(String.join(System.lineSeparator(), array));
test1
test3
test2

Принтиране с replaceAll() – няма значение какъв е типът на данните в масива
System.out.println(Arrays.toString(integerArr).replaceAll("[\\[\\]]", ""));

Printing String array using String.join
String[] input = {10, 20, 30};
System.out.println(String.join(" ", input);     // works only for Strings
Result 10 20 30
System.out.println(String.join(", ", input);
Result 10, 20, 30
System.out.println(String.join(System.lineSeparator(), input);
Result
10
20
30

Print an Array with Foreach
int[] numbers = { 1, 2, 3, 4, 5 };
for (int number : numbers) {
   System.out.print(number + " ");
}
Result 1 2 3 4 5

Print int array
System.out.println(Arrays.toString(firstArray).replace("[", "").replace(",", "").replace("]",""));

how to make array value to integer
int finalNumber = Integer.parseInt(Integer.toString(numbers[0]));

Using the Array class:
int[] myArray = Array.newInstance(int.class, 5); // creates an array of 5 integers

Using the Arrays class's copyOf method:
int[] originalArray = {1, 2, 3, 4, 5};
int[] newArray = Arrays.copyOf(originalArray, originalArray.length);

It is important to note that the size of an array in Java is fixed, once an array is created its size can't be changed.

how to copy one smaller array into a bigger one
int[] newArray = {1}; int[] newArray2 = {0,0}; how can i copy newArray into newArray 2 and get 1,0 as result
There are a few ways to copy the elements of one array into another array in Java, one of them is using the System.arraycopy() method.

Here's an example of how you could use this method to copy the elements of newArray into newArray2:

scss
Copy code
int[] newArray = {1};
int[] newArray2 = {0,0};
System.arraycopy(newArray, 0, newArray2, 0, newArray.length);
Alternatively, you can use a loop to copy the elements from one array to another array.

css
Copy code
for(int i = 0; i < newArray.length; i++) {
    newArray2[i] = newArray[i];
}
After copy newArray2 will be [1,0]

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
/*how to read and split string into array
String items = "Tomatoes!Potatoes!Bread";
String[] itemsArray = items.split("!");

OR in one line

String[] itemsArray = scanner.nextLine().split("!");
 */

        /* Split by , whitespace, -:, ?
        String[] parts = input.split("[,\\s\\-:\\?]");
         */

       /* String command = scan.nextLine();

        String commandName = command.split("\\: ")[0]; - \\: сплитва по символа :, а не по оператора :, така се получава допълнително празно място, иначе го няма и джъдж дава 0 точки
        String newValue = command.split("\\: ")[1];*/

//int element = Integer.parseInt(command.split(" ")[1]);

//String command = scam.nextLine();
//if(command.contains("Add")){}

       /* how to read make String into Array
       String articleData = scan.nextLine();

        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];*/

      //  String[] commandParts = scan.nextLine().split("\\|"); //how to separate via | -Gold|Silver|Wood

        /*how to read string, then turn it into array
        String commands = scan.nextLine();

        while(!commands.equals("Go Shopping!")){

            String[] commandParts = commands.split(" ");

            String command = commandParts[0];
            String grocery = commandParts[1];
         */

        /*how to add element to array and increase its length, как да добавим нов елемент към масив и удължим дължината му
        String newChest = itemParts[i] + " " + String.join(" ", treasureChest);
                            treasureChest = newChest.split(" ");

                            or

                            String[] tempChest = new String[treasureChest.length + 1];
                            tempChest[0] = commandParts[i];
                            System.arraycopy(treasureChest, 0, tempChest, 1, treasureChest.length);
                            treasureChest = tempChest;
         */

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

        /* String[] groceriesList= scan.nextLine().split("!"); how can i add a new item at the start of the list and make the list longer with 1 more position in java
There are several ways to add a new item at the start of an array and make the list longer with one more position in Java. One way is to create a new array that is one position larger than the original array, then copy the elements of the original array into the new array starting at index 1. Finally, you can assign the new item to the first position of the new array. Here's an example:

Copy code
import java.util.Scanner;

Scanner scan = new Scanner(System.in);
String[] groceriesList = scan.nextLine().split("!");

// create a new array one position larger than the original array
String[] newGroceriesList = new String[groceriesList.length + 1];

// add the new item at the first position of the new array
newGroceriesList[0] = "Carrots";

// copy the elements of the original array into the new array starting at index 1
System.arraycopy(groceriesList, 0, newGroceriesList, 1, groceriesList.length);

// make the original array reference the new array
groceriesList = newGroceriesList;
Another way to do this is by using the ArrayList class from the java.util package which allows to add elements at the start of the list and the list will automatically increase in size.

Copy code
import java.util.ArrayList;
ArrayList<String> groceriesList = new ArrayList<String>();
groceriesList.add(0,"Carrots"); // add at start of the list
Please note that the second method is more efficient as it does not require to copy all elements from the old array to the new array.

         */
        /*how to remove element from array
        If you want to use a foreach loop and don't want to use a List, one way to remove an element from an array is to create a new array and copy all elements except the one you want to remove.

Copy code
String[] groceriesList = {"Tomatoes","Potatoes","Bread"};
int counter = 0;
for (String item : groceriesList) {
    if (!item.equals("Potatoes")) {
        counter++;
    }
}

String[] newGroceriesList = new String[counter];
counter = 0;
for (String item : groceriesList) {
    if (!item.equals("Potatoes")) {
        newGroceriesList[counter] = item;
        counter++;
    }
}
groceriesList = newGroceriesList;
In this example, we first use a foreach loop to count the number of elements in the new array that are not "Potatoes". Then, we create a new array with that size, and use a second foreach loop to copy all elements of the original array that are not "Potatoes" to the new array. Finally, we assign the new array to the original array.

Please note that this method is less efficient than using an ArrayList or an Iterator, as it requires to copy all elements from the old array to the new array, also you will end up with a new array, which is not always what you want.
         */

        /*how to remove element from arraylist
        String[] groceriesList = {"Tomatoes","Potatoes","Bread"};
for (int i = 0; i < groceriesList.length; i++) {
    if (groceriesList[i].equals("Potatoes")) {
        for (int j = i; j < groceriesList.length - 1; j++) {
            groceriesList[j] = groceriesList[j + 1];
        }
        break;
    }
}

         */

        /*how to remove item and place it at the back of the array
        String[] groceriesList = {"Tomatoes","Potatoes","Bread"}; how can i remove element from the list and place it at the end of the array without using list
If you want to remove an element from the middle of an array and place it at the end of the array without using a List, you can use a for loop and a counter variable to achieve this. Here's an example:

Copy code
String[] groceriesList = {"Tomatoes","Potatoes","Bread"};
String itemToMove = "Potatoes";
int counter = 0;

for (int i = 0; i < groceriesList.length; i++) {
    if (!groceriesList[i].equals(itemToMove)) {
        groceriesList[counter] = groceriesList[i];
        counter++;
    }
}
groceriesList[counter] = itemToMove;
In this example, we first use a for loop to iterate through the elements of the original array, and copy all elements that are not equal to the element you want to remove (in this example "Potatoes") to the new array. We increment the counter variable each time an element is copied. After the for loop, the element to move (in this case "Potatoes") is added to the end of the array at position counter.

Please note that this method is less efficient than using an ArrayList or an Iterator, as it requires to copy all elements from the old array to the new array.

Also, you can use this method with a for-each loop and a variable to keep track of the element to move:

Copy code
String[] groceriesList = {"Tomatoes","Potatoes","Bread"};
String itemToMove = "";
int counter = 0;

for (String item : groceriesList) {
    if (!item.equals("Potatoes")) {
        groceriesList[counter] = item;
        counter++;
    } else {
        itemToMove = item;
    }
}
groceriesList[counter] = itemToMove;
This will give you the same result.

Please note that this method is less efficient than using an ArrayList or an Iterator, as it requires to copy all elements from the old array to the new array.

If you want to do this in one pass you can use a while loop:

Copy code
String[] groceriesList = {"Tomatoes","Potatoes","Bread"};
String itemToMove = "Potatoes";
int counter = 0;
int index = 0;
while (index < groceriesList.length) {
    if (!groceriesList[index].equals(itemToMove)) {
        groceriesList[counter] = groceriesList[index];
        counter++;
    } else {
        itemToMove = groceriesList[index];
    }
    index++;
}
groceriesList[counter] = itemToMove;
This will also give you the same result.
         */
        /*how to make array to list and list to array back again and remove an element
        import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

String[] groceriesList = {"Tomatoes","Potatoes","Bread"};
List<String> list = new ArrayList<>(Arrays.asList(groceriesList));

for (String item : list) {
    if (item.equals("Potatoes")) {
        list.remove(item);
    }
}
groceriesList = list.toArray(new String[0]);
In this example, we first convert the array to a List using the Arrays.asList() method, then we use a foreach loop to iterate through the elements of the List and remove an element using the remove() method. Finally, we convert the List back to an array using the toArray() method.

Please note that this method will create a new array and copy all elements except the one you want to remove, also you can use Iterator as I mentioned in the previous answer to avoid the ConcurrentModificationException.
         */

        /*how to remove element from array with for loop
        String[] groceriesList = {"Tomatoes","Potatoes","Bread"};
int counter = 0;
for (int i = 0; i < groceriesList.length; i++) {
    if (!groceriesList[i].equals("Potatoes")) {
        groceriesList[counter] = groceriesList[i];
        counter++;
    }
}

String[] newGroceriesList = new String[counter];
System.arraycopy(groceriesList, 0, newGroceriesList, 0, counter);
In this example, we first create a variable called counter that is used to keep track of the number of elements in the new array. We then use a for loop to iterate through the elements of the original array. If the current element is not "Potatoes", we copy it to the new array at the position represented by the counter variable, then increment the counter variable. After the for loop, we create a new array with the size of counter variable, and copy all the elements of the original array to the new array. Finally, we assign the new array to the original array.

Please note that this method is less efficient than using an ArrayList or an Iterator, as it requires to copy all elements from the old array to the new array.

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

        /*string to char array
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

        /*how to print array
        how to print this array
In Java, you can use a for loop to iterate through an array and print each element. For example, if you have an array called myArray, you can use the following code to print all the elements of the array:

System.out.println(Arrays.toString(line).replace("[", "").replace(",", "").replace("]", ""));

Copy code
for (int i = 0; i < myArray.length; i++) {
    System.out.println(myArray[i]);
}
You can also use for-each loop to print the array element

Copy code
for (int element : myArray) {
    System.out.println(element);
}
Another way to print the array is to use Arrays.toString() method.

Copy code
System.out.println(Arrays.toString(myArray));
You can use any of the above approach to print the array, depending on your specific requirements.

         */

      /*  int index = 0; - how to start from next point every time
        for (int element: array) {
            index ++;

            for (int i = index; i < array.length; i++) {
                if(element + array[i] == n){
                    System.out.println(element + " " + array[i]);
                }
            }*/

/*how to make single string to string array

String input = "bread";

// create a new string array with one element and assign the input string to it
String[] words = new String[]{ input };

// print the contents of the string array
for (String word : words) {
    System.out.println(word);
}

ALTERNATIVE

String input = "bread";

// convert the input string to a char array
char[] chars = input.toCharArray();

// create a new string array with the same length as the char array
String[] words = new String[chars.length];

// copy each character from the char array to the string array
for (int i = 0; i < chars.length; i++) {
    words[i] = String.valueOf(chars[i]);
}

// print the contents of the string array
for (String word : words) {
    System.out.println(word);
}
In this example, the toCharArray method converts the input string to a char array containing the characters 'b', 'r', 'e', and 'a'. The for loop copies each character from the char array to a new string array words with the same length, by using the String.valueOf method to convert each character to a string. The resulting string array words contains four elements: "b", "r", "e", and "a". The second for loop prints the contents of the string array.

Note that in this example, we create a new string array with the same length as the char array, because each element of a string array must be a string. If you only need to iterate over the characters of the string, you can simply use the char array returned by the toCharArray method.

 */

/*how to make String to String Array and then take the first part of the array to use is as command
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


            /*how to get number from an array
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

            /*how to sort the numbers within an array
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

             *//*
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



    //Methods / Методи
/*

1. Void Methods / извършва действие / напр. печат/принтира нещо

public static void main(String[] args) {
String text = scan.nextLine();
  printText();
}
public static void printText(String text) {
  System.out.println(text);
}


Another Example

public static void main(String[] args) {
  printNumbers(5, 10);
}
static void printNumbers(int start, int end) {
  for (int i = start; i <= end; i++) {
    System.out.printf("%d ", i);
  }
}

Another example
public static void printStudent(String name, int age, double grade) {
    System.out.printf("Student: %s; Age: %d, Grade: %.2f\n",
        name, age, grade);
}

Another Example
public static void main(String[] args) {
  printSign(Integer.parseInt(sc.nextLine()));
}

public static void printSign(int number) {
  if (number > 0)
    System.out.printf("The number %d is positive.", number);
  else if (number < 0)
    System.out.printf("The number %d is negative.", number);
  else
    System.out.printf("The number %d is zero.", number);
}

Another Example
public static void main(String[] args) {
  printInWords(Double.parseDouble(sc.nextLine()));
}
public static void printInWords(double grade) {
  String gradeInWords = "";
  if (grade >= 2 && grade <= 2.99)
    gradeInWords = "Fail";
  //TODO: make the rest
  System.out.println(gradeInWords);
}


2. Return Methods / връщат стойност

public static void main(String[] args) {
 readFullName();
}
public static String readFullName(Scanner sc) {
  String firstName = sc.nextLine();
  String lastName = sc.nextLine();
  return firstName + " " + lastName;
}

Another Example
public static void main(String[] args) {
  double width = Double.parseDouble(sc.nextLine());
  double height = Double.parseDouble(sc.nextLine());
  double area = calcRectangleArea(width, height);
  System.out.printf("%.0f%n",area);
}
public static double calcRectangleArea(double width,
                                       double height) {
  return width * height;
}

Another Example
public static void main(String[] args) {
  String inputStr = sc.nextLine();
  int count = Integer.parseInt(sc.nextLine());
  System.out.println(repeatString(inputStr, count));
}
private static String repeatString(String str, int count) {
  String result = "";
  for (int i = 0; i < count; i++) result += str;
  return result;
}


Another Example
public static double mathPower(double number, int power) {
  double result = 1;
  for (int i = 0; i < power; i++)
    result *= number;
  return result;
}

VALUE TYPES

public static void main(String[] args) {
   int num = 5;
   increment(num, 15);
   System.out.println(num); -> num == 5
}

public static void increment(int num, int value) {
   num += value; -> num == 20
}

REFERENCE TYPES
public static void main(String[] args) {
  int[] nums = { 5 };
  increment(nums, 15);
  System.out.println(nums[0]); -> nums[0] == 20
}

public static void increment(int[] nums, int value) {
  nums[0] += value; -> nums[0] == 20;
}


*/

        /*
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

/*multidimentional array
String input = scan.nextLine();

        String[] rooms = input.split("\\|");
        String[][] roomsParts = new String[rooms.length][2];
        for (int i = 0; i < rooms.length; i++) {
            String[] parts = rooms[i].split(" ");
            roomsParts[i] = parts;
        }
          for (int i = 0; i < roomsParts.length; i++) {
            String roomsName = roomsParts[i][0];
            String roomsValue = roomsParts[i][1];

        result:
        0 - "rat" "10"
        1 - "bat" "20"
        2 - "potion" "10"
 */

    //LISTS//Листове

//String, Integer, Double, Char, Boolean

//List<Boolean> isValid = new ArrayList<>();
//isValid.add(true);
//isValid.add(false);
    /*

List<String> stringList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

List<Integer> integerList = Arrays .stream(scanner.nextLine().split("\\s+")) .map(Integer::parseInt) .collect(Collectors.toList());
List<Integer> integers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).sorted(Collections.reverseOrder()).collect(Collectors.toList());

List<Double> doubleList = Arrays .stream(scanner.nextLine().split("\\s+")) .map(Double::parseDouble) .collect(Collectors.toList());





    List<Double> grades = new ArrayList<>(Arrays.as:ist(5.6, 3.4, 6.0));

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
        nums.remove(2); ->index 2
        nums.remove(Integer.valueOf(40)); ->element 40
        nums.add(100);
        nums.add(0, -100);
        for (int i = 0; i < nums.size(); i++)
        System.out.print(nums.get(i) + " ");
        result-> -100 10 20 50 60 100
     */

    /*методи
    List<E> test holds a list of elements (like array, but extendable)
    Provides operations to add / insert / remove / find elements:
    test.size() – number of elements in the List<E>
    test.size() - 1 - the last element in the List<Е>
    test.add(element) – adds an element to the List<E>
    test.add(index, element) – inserts an element to given position
    test.addAll(numList) - може да добавим всички елементи от една колекция в друга. Добавят се в края на колекцията.
    test.remove(element) – removes an element (returns true / false) -> names.remove("Peter");
    test.remove(index) – removes element at index -> names.remove(2);
    test.removeIf(number -> number < 0) - removes element,if the element answers a condition, remove number, if number is < 0,so negative
    test.removeAll(Arrays.asList(9)); - removes all elements that are equal to element 9
    test.remove(Integer.valueOf(element)) - премахва елемент, ако съществува в листа. Ако елемента е примитивен тип данни (double, int), чрез ValueOf() трябва да го превърнем в референтен тип данни, за да знае компилатора, че това е елемент. Ако го оставим int компилатора ще припознае числото като индекс, а не като елемент от листа. Ако елемента не съществува няма да ни даде ексепшън, просто ще игнорира командата.
    test.contains(element) – determines whether an element is in the list, връща булева стойност: true – ако елемента се съдържа в листа
    test.set(index, item) – replaces the element at  the given index
    test.get(index) - takes the element at the given index
    test.indexOf(element) - връща цяло число – Индекс, на който се намира елемента
    test.isEmpty - връща булева стойност: true – при празен лист, с 0 елемента
    Collections.sort(test) - сортираме елементите в листа
    Collections.reverse(integerList) – обръщаме реда на елементите в листа, независимо от това дали са сортирани или не.
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

    Milk!Pepper!Salt!Water!Banana
    List<String> travel = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());
     */

    /*how to see if a list contains an item with for each loop
    for (String item : groceriesList){
                        if(groceriesList.contains(item)){
                            isInTheList = true;
                        }
     */
//String command = scan.nextLine();
//if(command.startsWith("contains"))
//if(command.contains("Add"))
//if(command.equals("Add"))

    /*Reading List Values from a Single Line
    2 8 30 25 40 72 -2 44 56
    List<Integer> = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    List<Double> = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
    List<String> = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

    String values = scan.nextLine();
    List<String> items = Arrays.stream(values.split(" "))           ->правиме елементите поток от данни
		.collect(Collectors.toList());                              -> Convert a collection into List, потока от данни го нареждаме в лист от стрингове
    List<Integer> nums = new ArrayList<>();                         ->парсваме елементите към цяло число, така получаваме стринговете в листа да станат числа
    for (int i = 0; i < items.size(); i++)
     nums.add(Integer.parseInt(items.get(i)));                      ->взимам стринг от листа items, парсвам го към цяло число, тоест го правя число и го добавям в новия List nums

        //Съкратен вариант на горното how to read integers into list
    List<Integer> items = Arrays.stream(values.split(" "))
    .map(Integer::parseInt).collect(Collectors.toList());
     */
    /*
    List<Integer> integers = Arrays.stream(scan.nextLine().split(" "))                                    //how to read integers into list
                .map(Integer::parseInt).collect(Collectors.toList());
     */
/*PRINTING LISTS how to print list
System.out.println(String.join(", ", list);

принтиране с for
for (int i = 0; i < integerList.size(); i++) {
System.out.print(integerList.get(i) + " ");
}

Принтиране с foreach
for (int item : integerList) {
System.out.print(item + " ");
}

Принтиране със String.join() – с този метод може да се принтира само String колекция
System.out.println(String.join(", ", stringList));

Int лист със String.join() – трябва да създаден нов List<String>, в който да сложим елементите и да ги направим от числа в String
List<Integer> integerList = Arrays .stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt) .collect(Collectors.toList());
List<String> stringList = new ArrayList<>(integerList.size());
for (int i = 0; i < integerList.size(); i++) {
stringList.add(String.valueOf(integerList.get(i)));
}
System.out.println(String.join(", ", stringList));

Принтиране с replaceAll() – няма значение какъв е типът на данните в листа
System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));

List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 6, 12, 34, 56, 87));
System.out.println(numbers.toString()
.replace("[", "")
.replace("]", ""));
 */
/*
SORTING LISTS, how to sort lists
List<Integer> numbers = new ArrayList<>(Arrays.asList(52, -5, 124, 2, 45, 23));
Collections.sort(numbers);
System.out.println(numbers.toString()); -> [-5, 2,...]
Collections.reverse(numbers);
System.out.println(numbers.toString()); -> [124, 52,...]
System.out.println(numbers.toString()
.replace("[", "")
.replace("]", "")
.replaceAll(",", ""));-> -5 2 23 45 52 124
OR
for(int number : numbers){
system.out.print(number + " ");

*/
    /*
    how can i create array for this rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000 in java
You can create an array in Java by using the String.split() method to split the string into individual elements, then storing each element in an array. Here's an example of how you might create an array for the string you provided:

Copy code
String input = "rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000";
String[] items = input.split("\\|");
You can then access the individual elements of the array using the array index, for example items[0] would give you the first element "rat 10" in this case.

Alternatively, you can also use java's ArrayList class to achieve the same.

Copy code
String input = "rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000";
List<String> items = new ArrayList<>(Arrays.asList(input.split("\\|")));
You can then access the elements of the arraylist using the index, for example items.get(0) would give you the first element "rat 10" in this case.




emil vasilev
i want to split rat 10 into rat and 10
You can use the String.split() method to split the string into two parts, the first part being "rat" and the second part being "10". Here's an example of how you might split the string "rat 10":

Copy code
String input = "rat 10";
String[] parts = input.split(" ");
String itemName = parts[0]; // "rat"
String itemValue = parts[1]; // "10"
You can also use String.substring() method to separate the string into two parts, Here's an example of how you might do it:

Copy code
String input = "rat 10";
String itemName = input.substring(0,input.indexOf(" ")); // "rat"
String itemValue = input.substring(input.indexOf(" ")+1); // "10"
You can then use the variables itemName and itemValue to store the separated values.

You can use the above methods to separate the elements of the array or arraylist created earlier, if you have multiple elements in the array/arraylist.

Copy code
for (String item : items) {
    String[] parts = item.split(" ");
    String itemName = parts[0];
    String itemValue = parts[1];
    // do something with the item name and value
}
or

Copy code
for (String item : items) {
    String itemName = item.substring(0,item.indexOf(" "));
    String itemValue = item.substring(item.indexOf(" ")+1);
    // do something with the item name and value
}



emil vasilev
i want to split it while i am reading the list rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000
You can use the String.split() method to split the string into individual elements, then use a loop to iterate over each element and split it again into two parts, the first part being the item name and the second part being the item value. Here's an example of how you might do it:

Copy code
String input = "rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000";
String[] items = input.split("\\|");
for (String item : items) {
    String[] parts = item.split(" ");
    String itemName = parts[0];
    String itemValue = parts[1];
    // do something with the item name and value
}
Similarly, You can use String.substring() method to separate the string into two parts, Here's an example of how you might do it:

Copy code
String input = "rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000";
String[] items = input.split("\\|");
for (String item : items) {
    String itemName = item.substring(0,item.indexOf(" "));
    String itemValue = item.substring(item.indexOf(" ")+1);
    // do something with the item name and value
}
In both cases, the loop iterates over each element of the items array, and the itemName and itemValue variables are used to store the separated values for each element.

You can also use ArrayList instead of array, the code will look like this:

Copy code
String input = "rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000";
List<String> items = new ArrayList<>(Arrays.asList(input.split("\\|")));
for (String item : items) {
    String[] parts = item.split(" ");
    String itemName = parts[0];
    String itemValue = parts[1];
    // do something with the item name and value
}
or

Copy code
String input = "rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000";
List<String> items = new ArrayList<>(Arrays.asList(input.split("\\|")));
for (String item : items) {
    String itemName = item.substring(0,item.indexOf(" "));
    String itemValue = item.substring(item.indexOf(" ")+1);
    // do something with the item name and value
}
You can then use the variables itemName and itemValue to store the separated values.

If you don't have a list that includes the parts of the input string, you can create one using an ArrayList or any other suitable data structure. Here's an example of how you might do it using an ArrayList:

Copy code
String input = "rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000";
String[] items = input.split("\\|");
List<String[]> itemPartsList = new ArrayList<>();

for (String item : items) {
    String[] parts = item.split(" ");
    itemPartsList.add(parts);
}
You can iterate over the list to access the item name and value

Copy code
for(String[] item: itemPartsList){
    String itemName = item[0];
    String itemValue = item[1];
    // do something with the item name and value
}
You can also use a 2D array instead of ArrayList, the code will look like this:

Copy code
String input = "rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000";
String[] items = input.split("\\|");
String[][] itemPartsArray = new String[items.length][2];

for (int i=0; i<items.length; i++) {
    String[] parts = items[i].split(" ");
    itemPartsArray[i] = parts;
}
You can iterate over the array to access the item name and value

Copy code
for(String[] item: itemPartsArray){
    String itemName = item[0];
    String itemValue = item[1];
    // do something with the item name and value
}
In both cases, the variable itemPartsList or itemPartsArray holds the parts of the input string, with each element of the list/array representing one item from the input string, and each element being an array containing the item name and value.

    how can i access the elements into itemPartsArray
You can access the elements of the itemPartsArray 2D array using the array indices.
For example, if you want to access the first element of the array, you would use the indices itemPartsArray[0][0] for item name and itemPartsArray[0][1] for item value.

Here's an example of how you might use a loop to iterate over the elements of the itemPartsArray and access the item name and value:

Copy code
for (int i = 0; i < itemPartsArray.length; i++) {
    String itemName = itemPartsArray[i][0];
    String itemValue = itemPartsArray[i][1];
    // do something with the item name and value
}
You can also use enhanced for loop (for-each) to iterate over the elements of the itemPartsArray and access the item name and value:

Copy code
for (String[] item : itemPartsArray) {
    String itemName = item[0];
    String itemValue = item[1];
    // do something with the item name and value
}
In both cases, the loop iterates over each element of the itemPartsArray and the itemName and itemValue variables are used to store the item name and value for each element.

    Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] rooms = input.split("\\|");
        List<String[]> roomsParts = new ArrayList<>();

        for(String item : rooms){
            String[] parts = item.split(" ");
            roomsParts.add(parts);
        } how to access here the parts of roomParts list
Once you have stored the parts of the input string in the roomsParts list, you can access the individual elements of the list using the list index.
For example, if you want to access the first element of the list, you would use the index roomsParts.get(0)[0] for room name and roomsParts.get(0)[1] for room value.

Here's an example of how you might use a loop to iterate over the elements of the roomsParts list and access the room name and value:

Copy code
for (int i = 0; i < roomsParts.size(); i++) {
    String roomName = roomsParts.get(i)[0];
    String roomValue = roomsParts.get(i)[1];
    // do something with the room name and value
}
You can also use enhanced for loop (for-each) to iterate over the elements of the roomsParts list and access the room name and value:

Copy code
for (String[] room : roomsParts) {
    String roomName = room[0];
    String roomValue = room[1];
    // do something with the room name and value
}
In both cases, the loop iterates over each element of the roomsParts list and the roomName and roomValue variables are used to store the room name and value for each element.

You can use the above code snippet after reading the input from the user using the scanner class as you have already shown in your question.
     */

    //четене и сортиране първо по големина от най-малко към най-голямо след което се обръща реда на подреждане от най-голямо към най-малко
    //reading and sorting first from ascending to descending (small to big number) then reversed from descending to ascending (big to small number)
    /*List<Integer> integers = Arrays.stream(scan.nextLine().split(" "))                                    //how to read integers into list
                .map(Integer::parseInt).sorted(Collections.reverseOrder()).collect(Collectors.toList());

/*
i have the following list 10@10@10@2, how can i decrease the second number 10 by 2
You can use the set() method to replace the element at a specific index in the list with a new value. Here's an example of how you can decrease the second element (index 1) in the list by 2:

Copy code
List<Integer> integers = Arrays.asList(10, 10, 10, 2);
integers.set(1, integers.get(1) - 2);
You can also use the List.set() method along with the Arrays.stream() and Collectors.toList() method to decrease the second element in the list

Copy code
List<Integer> integers = Arrays.stream(scan.nextLine().split("@"))
                               .mapToInt(Integer::parseInt)
                               .boxed()
                               .collect(Collectors.toList());
integers.set(1, integers.get(1) - 2);
Alternatively, you can use the List.set() along with the Stream.map() method to replace the element at a specific index

Copy code
List<Integer> integers = Arrays.stream(scan.nextLine().split("@"))
                               .mapToInt(Integer::parseInt)
                               .boxed()
                               .collect(Collectors.toList());
integers.set(1, integers.get(1) - 2);
The above code will decrease the second element in the list by 2.
Alternatively, if you want to use the Stream.map() method to update the element at a specific index in the list, you can use the List.set() method within the lambda expression passed to the Stream.map() method. Here is an example:

Copy code
List<Integer> integers = Arrays.stream(scan.nextLine().split("@"))
                               .mapToInt(Integer::parseInt)
                               .boxed()
                               .collect(Collectors.toList());

List<Integer> updatedIntegers = IntStream.range(0, integers.size())
                                         .mapToObj(i -> i == 1 ? integers.set(i, integers.get(i) - 2) : integers.get(i))
                                         .collect(Collectors.toList());
This code creates a new List<Integer> named updatedIntegers, where the second element (index 1) in the list is decreased by 2.
     */


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

    /*remove element from list with for each
    In Java, you can use the foreach loop to iterate through the elements of an ArrayList and remove an element using the remove() method of the Iterator class. Here's an example:

Copy code
import java.util.ArrayList;
import java.util.Iterator;

ArrayList<String> groceriesList = new ArrayList<String>();
groceriesList.add("Tomatoes");
groceriesList.add("Potatoes");
groceriesList.add("Bread");

for (String item : groceriesList) {
    if (item.equals("Potatoes")) {
        groceriesList.remove(item);
    }
}
However, you should be aware that if you use the remove() method inside a foreach loop, it will give you a ConcurrentModificationException because the foreach loop is not synchronized with the remove() method. To solve this, you should use the Iterator class to iterate through the elements of the ArrayList and call the remove() method on it.

Copy code
import java.util.ArrayList;
import java.util.Iterator;

ArrayList<String> groceriesList = new ArrayList<String>();
groceriesList.add("Tomatoes");
groceriesList.add("Potatoes");
groceriesList.add("Bread");

Iterator<String> itr = groceriesList.iterator();
while (itr.hasNext()) {
    String item = itr.next();
    if (item.equals("Potatoes")) {
        itr.remove();
    }
}
With this way, you can safely remove an element from an ArrayList using a foreach loop.

     */
        /*Simple printing
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
         */

    /*
    how to print this array 4 4 4 3 in java
    System.out.println(Arrays.toString(elevator).replaceAll("[\\[\\],]", ""));

    System.out.println(Arrays.toString(elevator).replace("[\\[\\],]", " ")); why replace does not work
The replace method in the example you provided is intended to remove the square brackets and commas from the output of Arrays.toString(elevator). However, the regular expression passed as the first argument to replace is not correct.

The replace method in Java takes two arguments, the first one is the string to be replaced and the second one is the replacement string. In the provided example, the regular expression "[\\[\\],]" is passed as the first argument, which is intended to match square brackets and commas. However, this regular expression does not match those characters.

To match square brackets and commas, the regular expression should be "[\\[\\],]"

Copy code
System.out.println(Arrays.toString(elevator).replaceAll("[\\[\\],]", " "));
This will replace all "[", "]" and "," with a space in the output of Arrays.toString(elevator)

Alternatively, you can use join method from the String class which can be used to join all elements of the array and append the separator between them

Copy code
String.join(" ", Arrays.toString(elevator).replaceAll("[\\[\\]]","").split(","));
This will give you the same output as above without using regular expression


In Java, you can use a for loop to iterate through the array and print each element. For example:

Copy code
int[] arr = {4, 4, 4, 3};
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
This will print the output: "4 4 4 3"

Alternatively, you can use the Arrays.toString(int[]) method to print all elements of an int array in one line.

Copy code
import java.util.Arrays;
int[] arr = {4, 4, 4, 3};
System.out.println(Arrays.toString(arr));
This will print the output: "[4, 4, 4, 3]"
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
        System.out.println(String.join(", ", list);
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
    /*how to print list

    The easiest and most efficient way to print the list groceriesList at the end of the program would be to use the forEach method and a lambda expression, as shown below:

Copy code
groceriesList.forEach(item -> System.out.print(item + " "));
This will iterate through each item in the list and print it, followed by a space.
Alternatively, you can use the for loop, which is also simple to implement:

Copy code
for (String item : groceriesList) {
    System.out.print(item + " ");
}
Both of the above options will print the list in a single line with space separated.
     */
    /*priting and skiping the last ,
    You can skip the last comma by using a conditional statement inside the loop that checks if the current item is the last one in the list.
Here are two ways you can do that:

Copy code
for (int i = 0; i < groceriesList.size(); i++) {
    System.out.print(groceriesList.get(i));
    if (i < groceriesList.size() - 1) {
        System.out.print(", ");
    }
}
This way is using a for loop and checking if the current index is less than the size of the list subtracted by 1, if it is, it will print a comma after the item.

Another way is by using a for-each loop, and checking if the current item is the last element of the list:

Copy code
for (int i = 0; i < groceriesList.size() - 1; i++) {
    System.out.print(groceriesList.get(i) + ", ");
}
System.out.print(groceriesList.get(groceriesList.size() - 1));
This way is using a for-each loop and iterating through the list, but only up to the second-last element. Then print the last element without comma.

Both of the above options will print the list in a single line, with commas separating all elements except the last one.
     */

    /*
    List<Integer> integers = Arrays.stream(scan.nextLine().split("@")).collect(Collectors.toList()); how to make that right, when considered that the list includes integers
You can use the mapToInt() method to convert the stream of strings to a stream of integers before collecting them into a list. Here's an example:

Copy code
List<Integer> integers = Arrays.stream(scan.nextLine().split("@"))
                               .mapToInt(Integer::parseInt)
                               .boxed()
                               .collect(Collectors.toList());
The mapToInt() method is used to convert the stream of strings to a stream of integers using the Integer::parseInt method reference. The boxed() method is then used to convert the stream of primitives back to a stream of objects, so that it can be collected into a List<Integer>.

Alternatively, you can use the Collectors.toList() method on the mapToInt() method

Copy code
List<Integer> integers = Arrays.stream(scan.nextLine().split("@"))
                               .mapToInt(Integer::parseInt)
                               .boxed()
                               .collect(Collectors.toList());
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
    /*
    how can i add into a list with integers in the middle of the list the following -2a
You can use the insert() method to insert an element at a specific index in a list. For example, if you have a list called my_list and you want to insert the value -2a at index 3, you would use the following code:

Copy code
my_list.insert(3, -2*a)
Please note that if 'a' is not defined before this line, you will get an error.




emil vasilev
how can i define 'a' before that line
You can define the variable 'a' before using it in the insert() method by assigning a value to it. For example, you can define 'a' as an integer:

Copy code
a = 5
or as a float:

Copy code
a = 5.0
You can also define 'a' as a result of an expression or a function:

Copy code
a = some_function()
Copy code
a = 2 + 3
It's important to make sure that the value of 'a' is defined before it is used in the insert() method, otherwise you'll get a NameError.




emil vasilev
i want to have 'a' as a char
In Python, a character is represented as a string of length 1. To define 'a' as a character, you can assign a single character in single quotes to the variable 'a':

Copy code
a = 'a'
You can also use




emil vasilev
in java
In Java, a character is represented by the char data type. To define 'a' as a character, you can assign a single character in single quotes to the variable 'a':




emil vasilev
java: how can i add into a list with integers in the middle of the list the following -2a, where 'a' is a char
In Java, you can use the List interface and one of its implementing classes, such as ArrayList, to add elements to a list.
To add the value -2a at index 3, you can use the following code:

Copy code
List<Integer> myList = new ArrayList<>();
char a = 'a';
myList.add(3, -2*(int)a);
Please note that this will add the ASCII value of 'a' (97) multiplied by -2, not the character '-2a'
Also, since a char is a primitive type you can't multiply it by -2 directly, you have to cast it to int.




emil vasilev
i want to add the character '-2a'
In Java, the List interface and its implementing classes such as ArrayList are designed to store objects, not primitive types like char.
You can use a List<String> to store a list of string, and add the value '-2a' at index 3, you can use the following code:

Copy code
List<String> myList = new ArrayList<>();
myList.add(3, "-2a");
Also, you can use List<Character> to store a list of characters, and add the value '-2' at index 3 and 'a' at index 4 :

Copy code
List<Character> myList = new ArrayList<>();
myList.add(3, '-');
myList.add(4, '2');
myList.add(5, 'a');
Please note that in this case you are storing the characters '-', '2' and 'a' separately, not the string "-2a".




emil vasilev
i have the following list in java 1 1 2 2 3 3 4 4, and variable moves++; how can i add in the middle of the list the following -moves'a'
You can use the add() method of the List interface and its implementing classes such as ArrayList to add an element at a specific index in a list. To add the value "-moves'a'" in the middle of the list, you can use the following code:

Copy code
List<String> myList = new ArrayList<>(Arrays.asList("1", "1", "2", "2", "3", "3", "4", "4"));
int moves = 1;
int middleIndex = myList.size()/2;
myList.add(middleIndex, "-" + moves + "a");
Here, myList.size()/2 will give you the middle index of the list. Then, you are adding a new element at that index with the value "-moves'a'".
Please note that the value of the moves variable should be incremented before this line of code.




emil vasilev
i am getting the error required type Integer, provided String, how can I fix that
In Java, the type of the elements in the list must be specified when the list is created. The error you're getting is because you are trying to add a String value to a List<Integer>.
To fix this error you have two options:

Change the type of the List to List<String> and use it as I described above.
Copy code
List<String> myList = new ArrayList<>(Arrays.asList("1", "1", "2", "2", "3", "3", "4", "4"));
int moves = 1;
int middleIndex = myList.size()/2;
myList.add(middleIndex, "-" + moves + "a");
Convert the value you want to add to the list to the correct data type, in this case Integer, before adding it to the list.
Copy code
List<Integer> myList = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4));
int moves = 1;
int middleIndex = myList.size()/2;
myList.add(middleIndex, -1*moves);
Please note that in the second option you are not adding the character 'a' to the list, you are adding the integer value of moves multiplied by -1.
Also, since you are adding an integer, you can't concatenate it with a character 'a' like in the first option, instead you need to multiply it by -1 to get the negative value.
     */


    //OBJECTS AND CLASSES Обекти и класове

//Когато създавам нов обект, името на файла трябва да бъде същото както името на обекта, който искам да ползвам
//Напр файл с име Person.java
//създавам в друг файл нов обект Person newPerson = new Person(name, age);

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
    private String typeList;        //Alternative String typeList; -> тук обаче може извън класа да се променя това поле, например в кода мога директно да напиша Songs.typeList = "tova e test"; и така да му променя стойността, това е неконтролирано достъпване и промяна на стойност
    private String name;            //            String name;
    private String time;            //            String time;
    private List<Double> grade;

    //конструктор, може да създаваме един или повече конструктори с един или повече характеристики на класа едновременно
    public Songs (String typeListObj, String name, int time, List<Double> gradeObj){
    this.typeList = typeListObj;
    this.name = name;
    this.time = time;

    Songs test = new Songs ("lovesong", "KennyG", 3);

    public Songs (String typeList){
    this.typeList = typeList;

    Songs test = new Songs ("Springsong");

    //getters
    public String getTypeList(){
    return this.typeList;
    return "NewList" + this.typeList;
    public String getName(){
    return this.name;
    public int getTime(){
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
    public void setTime(int time){
    this.time = time;

    //така се актуализира информацията в Main файла
    Songs song = new Songs();                          - създавам нов обект от класа Songs, и в следващите редове му обновявам характеристиките
    song.setTypeList(typeList);

    Alt+Insert -> toString

        @Override
        public String toString(){
        String formattedType = "";
        if(this.type.equals("car")){
        formattedTpe = "Car";
        }else if(this.type.equals("truck")){
         formattedTpe = "Truck";
        }
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsePower: %d", formattedType, this.model, this.color, this.horsepower);

     за да отпечатам vehicle:
     String enteredModel = scan.nextLine();
     for(Vehicle currentVehicle : vehiclesList){
     if(enteredModel.equals(vehicle.getModel())){
     System.out.println(vehicle);
     break;
     }

        Pet pet = new Pet("Rex", 13, "Ivan");
        System.out.println(pet);
        result: groomingSalon.Pet@6d03e736 (това е default {package}.{class}@{address}
        solution: System.out.println(pet.toString()); със toString преобразуваме в текст, може и така System.out.println(pet);
        В класа Pet пиша:
        @Override
        public String toString(){
        return this.name + " " + this.age + " " - (" + this.owner + ")";
        result: Rex 13 - (Ivan)
        @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }

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

/*как да сравняване елементи в обекта в даден лист
Създаваме клас Student със следните характеристики:

В класа пиша
public double getGrade(){
return this.grade;
}
В мейн кода пиша
studentsList.sort(Comparator.comparing(Student::getGrade).reversed();
studentsList.sort(Comparator.comparing(Student::getGrade).reversed().thenComparing(Comparator.comparing(Student::getFirstName)));

Alternative:

To sort a list of Student objects using the Collections.sort() method, you need to implement the Comparable interface in the Student class and override the compareTo() method to define the natural ordering of Student objects based on their grades.

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    // getters and setters

    @Override
    public int compareTo(Student otherStudent) {
        return Double.compare(this.grade, otherStudent.grade);
    }
}

//methods
    public void editContent(String newContent) {
        this.content = newContent;
    }

    Как се ползва метод
    public void editContent(String newContent) { -> метод в класа
        this.content = newContent;
    }

	Article article = new Article(title, content, author); -> обект в мейн файла

	case "Edit":
                    String newContent = commands.split(": ")[1];
                    article.editContent(newContent); -> промяна на характеристика на обекта
                    break;

@Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }

In the compareTo() method, we compare the grade of the current student with the grade of the other student.

Then, in your main method, after adding all the students to the list, you can sort the list by calling Collections.sort():
Collections.sort(listofStudents);
This will sort the list in ascending order of grades. If you want to sort the list in descending order of grades, you can reverse the list after sorting:
Collections.sort(listofStudents);
Collections.reverse(listofStudents);
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

StringBuilder = new StringBuiler ("tovaetestnaemo");
indexSubstring = "test";

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
/*


    [A-Za-z] - \w
    [abc] - Find one character from the options between the brackets
    [^abc] -	Find one character NOT between the brackets
    [0-9] - \d matches a digit (equivalent to [0-9])
    \d{2} - {2} matches the previous token exactly 2 times
    \d{1,5} - {1,5} matches the previous token between 1 and 5 times, as many times as possible, giving back as needed (greedy)

    //(?<user>.....) - създаване на група

    Metacharacters
    Metacharacter	Description
    |	Find a match for any one of the patterns separated by | as in: cat|dog|fish
    .	Find just one instance of any character
    .	Any character (may or may not match terminator)
    ^	Finds a match as the beginning of a string as in: ^Hello
    $	Finds a match at the end of the string as in: World$
    \d	Find a digit, short of [0-9]
    \D	Any non-digit, short for [^0-9]
    \s	Find a whitespace character, short for [\t\n\x0B\f\r]
    \S	Any non-whitespace character, short for [^\s]
    \w	Any word character, short for [a-zA-Z_0-9]
    \W	Any non-word character, short for [^\w]
    \b	A word boundary
    \b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
    \B	A non word boundary
    \	Find the Unicode character specified by the hexadecimal number xxxx -  това се пише след \ - uxxxx


    Quantifiers
    Quantifier	Description
    n+	Matches any string that contains at least one n
    n*	Matches any string that contains zero or more occurrences of n
    n?	Matches any string that contains zero or one occurrences of n
    + - 1 или безкрайно много
    * - 0 или безкрайно много
    ? - 0 или 1
    n{x}	Matches any string that contains a sequence of X n's
    n{x,y}	Matches any string that contains a sequence of X to Y n's
    n{x,}	Matches any string that contains a sequence of at least X n's

    Regex Character classes
    No.	Character Class	Description
    1	[abc]	a, b, or c (simple class)
    2	[^abc]	Any character except a, b, or c (negation)
    3	[a-zA-Z]	a through z or A through Z, inclusive (range)
    4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
    5	[a-z&&[def]]	d, e, or f (intersection)
    6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
    7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)

    "(\\w)\\1+"
    The \\w matches any word character (letter, digit, or underscore) and the \\1+ matches whatever was in the first set of parentheses,
    one or more times. So you wind up matching any occurrence of a word character, followed immediately by one or more of the same word character again.
Repeated characters in "abcdbaa" : [a]
Repeated characters in "abcdbaabb" : [a, b]

package com.sample.app;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

 private static List<String> repeatedChars(String str) {

  Pattern pattern = Pattern.compile("(\\w)\\1+");
  Matcher matcher = pattern.matcher(str);

  List<String> list = new ArrayList<>();
  while (matcher.find()) {
   list.add(matcher.group(1));
  }

  return list;
 }

 public static void main(String args[]) throws FileNotFoundException {
  System.out.println("Repeated characters in \"abcdbaa\" : " + repeatedChars("abcdbaa"));
  System.out.println("Repeated characters in \"abcdbaabb\" : " + repeatedChars("abcdbaabb"));
 }
}
*/
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
"=[A-Z][A-Za-z]{2,}=|/[A-Z][A-Za-z]{2,}/") или
(?<symbols>[=/])(?<destinations>[A-Z][a-zA-Z]{2,})\1
(?<symbols>[=/]) - Surrounded by "=" or "/" on both sides (the first and the last symbols must match)
(?<destinations>[A-Z][a-zA-Z]{2,}) - After the first "=" or "/" there should be only letters (the first must be upper-case, other letters could be upper or lower-case)
The letters must be at least 3

(?<symbols>[=/])(?<destinations>[A-Z][a-zA-Z]{2,})(\\k<symbols>) в програмата за регекс се пише (\k<symbols>), в интелиджей (\\k<symbols>) 
(\\k<symbols>) - Matches the same symbol that was captured in the symbols group.
(?<=\k<symbols>) - Uses a positive lookbehind to assert that the previous character is the same symbol that was captured in the symbols group.
(?<symbols>\k<symbols>) - Captures the same symbol that was captured in the symbols group in a new group called symbols. This is used to ensure that the first and last symbols match.


=Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i=
result
=Hawai=
/Cyprus/

 */




    /*Example
    (@|#)(?<word>[A-Za-z]{3,})\1\1(?<mirror>[A-Za-z]{3,})\1
    @|#: Matches either the "@" or "#" character. The pipe symbol | is used as an "or" operator in regular expressions.
    (?<word>[A-Za-z]{3,}): Matches a sequence of 3 or more letters (uppercase or lowercase). The ?<word> is a named capturing group, it is used to assign a name to the matched group.
    \1: Matches the same character as the first capturing group. The \1 is a back-reference, it refers to the first capturing group, in this case "@" or "#".
    (?<mirror>[A-Za-z]{3,}): Matches a sequence of 3 or more letters (uppercase or lowercase). The ?<mirror> is a named capturing group, it is used to assign a name to the matched group.
    This regular expression pattern will match a string that starts and ends with the same character ("@" or "#") and contains two groups of 3 or more letters in between. The two groups of letters are captured and can be accessed by their group names ("word" and "mirror").
     */

/*
 (?![#|]\|)
 Certainly! (?![#|]\|) is a negative lookahead assertion in a regular expression, which is used to check that a pattern does not match immediately after the current position in the input string.

In the regular expression [#|]([A-Za-z\s]+)[#|](\d{2}/\d{2}/\d{2})[#|](\d{1,5})(?![#|]\|), the negative lookahead assertion (?![#|]\|) is used to ensure that the pattern [#|]\| does not occur immediately after the third capturing group, which captures the item price.

Specifically, [#|]\| matches either "#" or "|" followed by a "|" character. The negative lookahead assertion (?!...) checks that the pattern inside the parentheses does not occur after the current position in the input string. If the pattern does occur, the regular expression fails to match.

So in this case, (?![#|]\|) checks that there is no "#" or "|" character immediately followed by a "|" character after the item price. This ensures that the regular expression only matches input strings where the ending character is "#" or "|".
 */

/*Example
You can use the following regular expression to extract the food info from the given pattern:

(?<symbols>[#\\|])(?<name>[A-za-z\\s]+)(\\1)(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})(\\1)(?<calories>[\\d]{1,5})(\\1)
(?<symbols>[#\\|]): named capture group symbols, which matches either # or |.
(?<name>[A-za-z\\s]+): named capture group name, which matches one or more lowercase or uppercase letters or whitespace characters.
(\\1): matches the same symbol that was matched in the symbols capture group (i.e., # or |).
(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2}): named capture group date, which matches a date in the format dd/mm/yy.
(\\1): matches the same symbol that was matched in the symbols capture group.
(?<calories>[\\d]{1,5}): named capture group calories, which matches a number with 1-5 digits.


([#|])([A-Za-z\s]+)\1(\d{2}/\d{2}/\d{2})\1(\d{1,5})\1
([#|]) - either # or |
\1 only one of the ([#|])



[#|]([A-Za-z]+)[#|](\d{2}/\d{2}/\d{2})[#|](\d{1,5})[#|]
[#|] - a character group that matches either # or |
([A-Za-z]+) - a capturing group that matches one or more uppercase or lowercase letters
(\d{2}/\d{2}/\d{2}) - a capturing group that matches a date in dd/mm/yy format
\d matches a digit (equivalent to [0-9])
\d{2} - {2} matches the previous token exactly 2 times
\d{1,5} - {1,5} matches the previous token between 1 and 5 times, as many times as possible, giving back as needed (greedy)

[#|]([A-Za-z\s]+)#(\d{2}/\d{2}/\d{2})#(\d{1,5})[#|]
Here's how to interpret the regular expression:

[#|] - a character group that matches either # or |
([A-Za-z\s]+) - a capturing group that matches one or more uppercase or lowercase letters, or whitespace characters
# - matches the # character
(\d{2}/\d{2}/\d{2}) - a capturing group that matches a date in dd/mm/yy format
# - matches the # character
(\d{1,5}) - a capturing group that matches an integer between 0-10000
[#|] - a character group that matches either # or |
To extract the food info from a string input, you can use the Pattern and Matcher classes from the java.util.regex package as follows:

java
Copy code
import java.util.regex.Matcher;
import java.util.regex.Pattern;

String input = "#Bread#19/03/21#4000#|Invalid|03/03.20||Apples|08/10/20|200||Carrots|06/08/20|500||Not right|6.8.20|5|";

Pattern pattern = Pattern.compile("[#|]([A-Za-z\\s]+)#(\\d{2}/\\d{2}/\\d{2})#(\\d{1,5})[#|]");
Matcher matcher = pattern.matcher(input);

while (matcher.find()) {
    String item_name = matcher.group(1);
    String expiration_date = matcher.group(2);
    int calories = Integer.parseInt(matcher.group(3));

    // do something with the extracted food info
}
This code will iterate over all matches of the regular expression in the input string and extract the item name, expiration date, and calories for each match. Note that you may want to add error handling code to handle cases where the regular expression does not match the input string.
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
