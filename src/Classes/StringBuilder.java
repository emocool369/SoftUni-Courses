package Classes;

public class StringBuilder {

    /*
    Java StringBuilder Class
Java StringBuilder class is used to create mutable (modifiable) String. The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. It is available since JDK 1.5.

Important Constructors of StringBuilder class
Constructor	Description
StringBuilder()	It creates an empty String Builder with the initial capacity of 16.
StringBuilder(String str)	It creates a String Builder with the specified string.
StringBuilder(int length)	It creates an empty String Builder with the specified capacity as length.

Important methods of StringBuilder class
Method	Description
public StringBuilder append(String s)	It is used to append the specified string with this string. The append() method is overloaded like append(char), append(boolean), append(int), append(float), append(double) etc.
public StringBuilder insert(int offset, String s)	It is used to insert the specified string with this string at the specified position. The insert() method is overloaded like insert(int, char), insert(int, boolean), insert(int, int), insert(int, float), insert(int, double) etc.
public StringBuilder replace(int startIndex, int endIndex, String str)	It is used to replace the string from specified startIndex and endIndex.
public StringBuilder delete(int startIndex, int endIndex)	It is used to delete the string from specified startIndex and endIndex.
public StringBuilder reverse()	It is used to reverse the string.
public int capacity()	It is used to return the current capacity.
public void ensureCapacity(int minimumCapacity)	It is used to ensure the capacity at least equal to the given minimum.
public char charAt(int index)	It is used to return the character at the specified position.
public int length()	It is used to return the length of the string i.e. total number of characters.
public String substring(int beginIndex)	It is used to return the substring from the specified beginIndex.
public String substring(int beginIndex, int endIndex)	It is used to return the substring from the specified beginIndex and endIndex.
Java StringBuilder Examples
Let's see the examples of different methods of StringBuilder class.

/*how to insert single space into stringbuilder java

In Java, you can insert a single space into a StringBuilder object using the insert() method. This method takes two arguments: the index at which to insert the space, and the space character itself. Here's an example of how you can use the insert() method to insert a space into a StringBuilder object:

StringBuilder sb = new StringBuilder("Hello,World!");
sb.insert(5, " ");
System.out.println(sb);
This will output "Hello, World!", and the space is inserted at the index 5.

Alternatively, you can also use the append() method to add a space to the end of the string in the StringBuilder object.

StringBuilder sb = new StringBuilder("Hello,World!");
sb.append(" ");
System.out.println(sb);
This will also output "Hello, World!" and the space is added to the end of the string.

It's important to note that the insert() method can be used to insert any character or string at any position in the StringBuilder. The append() method can be used to add any character or string to the end of the StringBuilder.
     */

    /*how to check, if stringbuilder contains substring
In Java, you can check if a StringBuilder object contains a substring using the indexOf() method. This method returns the index of the first occurrence of the substring within the StringBuilder, or -1 if the substring is not found.

Here's an example of how you can use the indexOf() method to check if a StringBuilder contains a substring:

StringBuilder sb = new StringBuilder("Hello, World!");
if (sb.indexOf("World") != -1) {         //It's important to note that the
indexOf() method returns the index of the first occurrence of the substring, and the
lastIndexOf() returns the index of the last occurrence of the substring, so
if the substring is not present it will give -1 as the output.
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


Alternatively you can use toString() method to convert the StringBuilder to a string, and then use the contains() method to check if the string contains a substring.

StringBuilder sb = new StringBuilder("Hello, World!");
if (sb.toString().contains("World")) {
    System.out.println("The string contains the substring.");
} else {
    System.out.println("The string does not contain the substring.");
}
This will also output "The string contains the substring."

It's important to note that these methods are case-sensitive so if you want to check for a substring without caring about the case, you can convert the string to lowercase or uppercase before using these methods.

     */

    /* how to cut out substring, reverse it and add it at the end of stringbuilder
You can cut out a substring from a StringBuilder, reverse it, and add it to the end of the StringBuilder using the following steps:

Use the substring() method to extract the desired substring.
Use the reverse() method of the StringBuilder class to reverse the substring.
Use the append() method to add the reversed substring to the end of the StringBuilder.
Here's an example of how you can accomplish this:

StringBuilder sb = new StringBuilder("Hello, World!");
int start = 7;
int end = 12;
String sub = sb.substring(start, end);
StringBuilder reversed = new StringBuilder(sub);
reversed.reverse();
sb.append(reversed);
System.out.println(sb);
This will output "Hello, World!dlroW"

In the above example, the substring is extracted from index 7 to 12 and reversed. Then the reversed substring is appended to the end of the original StringBuilder object.

It's important to note that the substring() method is inclusive of the start index and exclusive of the end index. So the substring from index 7 to 12 will be "World"
     */

    /*how to determine start and end index of substring within StringBuilder
In Java, you can use the indexOf() method of the StringBuilder class to determine the start index of a substring within the StringBuilder, and the lastIndexOf() method to determine the end index of the substring.

Here's an example of how you can use these methods to determine the start and end index of a substring within a StringBuilder:

StringBuilder sb = new StringBuilder("Hello, World!");
int start = sb.indexOf("World");
int end = sb.indexOf("World") + "World".length();
System.out.println("Start index: " + start);
System.out.println("End index: " + end);
This will output "Start index: 7" and "End index: 11", because the substring "World" starts at index 7 and ends at index 11 in the StringBuilder.

It's important to note that the indexOf() method returns the index of the first occurrence of the substring, and the lastIndexOf() returns the index of the last occurrence of the substring, so if the substring is not present it will give -1 as the output.

Alternatively you can use the matcher() method of the Matcher class to find the start and end index of a substring within a StringBuilder.

StringBuilder sb = new StringBuilder("Hello, World!");
String substring = "World";
Matcher matcher = Pattern.compile(substring).matcher(sb);
if (matcher.find()) {
    System.out.println("Start index: " + matcher.start());
    System.out.println("End index: " + matcher.end());
}
This will give the same output as the above example.
     */

    /*how to make stringbuilder to string
In Java, you can convert a StringBuilder object to a String using the toString() method of the StringBuilder class. This method returns a string that represents the contents of the StringBuilder.

Here's an example of how you can use the toString() method to convert a StringBuilder to a String:

StringBuilder sb = new StringBuilder("Hello, World!");
String str = sb.toString();
System.out.println(str);
This will output "Hello, World!", the contents of the StringBuilder are now stored in the variable str as a String.

Alternatively, you can also use the String class constructor that accepts a CharSequence as input to convert a StringBuilder object to a String object.

StringBuilder sb = new StringBuilder("Hello, World!");
String str = new String(sb);
System.out.println(str);
This will also output "Hello, World!" and the contents of the StringBuilder are now stored in the variable str as a String object.

It's important to note that once a StringBuilder object is converted to a String object, you can not modify the contents of the String object, but you can still modify the StringBuilder object.
     */
    /* how to change all occurrences of a given substring with replacement text within stringbuilder
In Java, you can change all occurrences of a given substring with replacement text within a StringBuilder object by using the replace() method of the StringBuilder class.

Here's an example of how you can use the replace() method to replace all occurrences of a substring with replacement text:

StringBuilder sb = new StringBuilder("Hello, World! Hello, World!");
String substring = "World";
String replacement = "Java";
int start = 0;
int end = sb.length();
while((start = sb.indexOf(substring, start)) != -1) {
    sb.replace(start, start + substring.length(), replacement);
    start += replacement.length();
}
System.out.println(sb);
This will output "Hello, Java! Hello, Java!" and all occurrences of the substring "World" are replaced with "Java" within the StringBuilder object.

case "ChangeAll":
                    String replacement = command[2];
                    int start = 0;
                    int end = input.length();
                    while((start = input.indexOf(indexSubstring, start)) != -1){    //докато старт = резултат различен от -1, -1 става, когато не може да се намери събстринг
                        //input.indexOf(indexSubstring, start) - това търси в целия стрингбилдер събстринга и показва на кое число,индекс започва събстринга, напр тук 2,3,11
                        //когато вече няма повтаряне на събстринга, input.indexOf(indexSubstring, start) е равно на -1
                        input.replace(start, start + indexSubstring.length(), replacement);
                        start += replacement.length();                              //след като намерим събстринг и го заменим, увеличаваме стойността на старт с дължината
                                                                                    //на събстринга, за да търсим в следващото повтаряне на цикъла от позиция след събстринга
                    }
                    System.out.println("input");

//It's important to note that the
indexOf() method returns the index of the first occurrence of the substring, and the
lastIndexOf() returns the index of the last occurrence of the substring, so
if the substring is not present it will give -1 as the output.

Alternatively you can use the replaceAll() method of the StringBuilder class but it uses a regular expression to match the substring which can be more complex.

StringBuilder sb = new StringBuilder("Hello, World! Hello, World!");
sb.replaceAll("World", "Java");
System.out.println(sb);
This will also output "Hello, Java! Hello, Java!" and all occurrences of the substring "World" are replaced with "Java" within the StringBuilder object.

It's important to note that the replace() method will only replace the first occurrence of the substring, if you want to replace all occurrences of a substring with replacement text within a StringBuilder, you have to use a loop with indexOf() method as shown in first example.
     */
    /*how to print stringbuilder
To print a StringBuilder object in Java, you can use the toString() method, which converts the contents of the StringBuilder to a String, and then print the String using the println() method or print() method.

Example:

StringBuilder sb = new StringBuilder("Hello, World!");
System.out.println(sb.toString());
or

StringBuilder sb = new StringBuilder("Hello, World!");
System.out.print(sb);
     */
/*
1) StringBuilder append() method
The StringBuilder append() method concatenates the given argument with this String.

StringBuilderExample.java
Play Video


class StringBuilderExample{
public static void main(String args[]){
StringBuilder sb=new StringBuilder("Hello ");
sb.append("Java");//now original string is changed
System.out.println(sb);//prints Hello Java
}
}
Output:

Hello Java
2) StringBuilder insert() method
The StringBuilder insert() method inserts the given string with this string at the given position.

StringBuilderExample2.java

class StringBuilderExample2{
public static void main(String args[]){
StringBuilder sb=new StringBuilder("Hello ");
sb.insert(1,"Java");//now original string is changed
System.out.println(sb);//prints HJavaello
}
}
Output:

HJavaello
3) StringBuilder replace() method
The StringBuilder replace() method replaces the given string from the specified beginIndex and endIndex.

StringBuilderExample3.java

class StringBuilderExample3{
public static void main(String args[]){
StringBuilder sb=new StringBuilder("Hello");
sb.replace(1,3,"Java");
System.out.println(sb);//prints HJavalo
}
}
Output:

HJavalo
4) StringBuilder delete() method
The delete() method of StringBuilder class deletes the string from the specified beginIndex to endIndex.


StringBuilderExample4.java

class StringBuilderExample4{
public static void main(String args[]){
StringBuilder sb=new StringBuilder("Hello");
sb.delete(1,3);
System.out.println(sb);//prints Hlo
}
}
Output:

Hlo
5) StringBuilder reverse() method
The reverse() method of StringBuilder class reverses the current string.

StringBuilderExample5.java

class StringBuilderExample5{
public static void main(String args[]){
StringBuilder sb=new StringBuilder("Hello");
sb.reverse();
System.out.println(sb);//prints olleH
}
}
Output:


olleH
6) StringBuilder capacity() method
The capacity() method of StringBuilder class returns the current capacity of the Builder. The default capacity of the Builder is 16. If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.

StringBuilderExample6.java

class StringBuilderExample6{
public static void main(String args[]){
StringBuilder sb=new StringBuilder();
System.out.println(sb.capacity());//default 16
sb.append("Hello");
System.out.println(sb.capacity());//now 16
sb.append("Java is my favourite language");
System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
}
}
Output:


16
16
34
7) StringBuilder ensureCapacity() method
The ensureCapacity() method of StringBuilder class ensures that the given capacity is the minimum to the current capacity. If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.

StringBuilderExample7.java

class StringBuilderExample7{
public static void main(String args[]){
StringBuilder sb=new StringBuilder();
System.out.println(sb.capacity());//default 16
sb.append("Hello");
System.out.println(sb.capacity());//now 16
sb.append("Java is my favourite language");
System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
sb.ensureCapacity(10);//now no change
System.out.println(sb.capacity());//now 34
sb.ensureCapacity(50);//now (34*2)+2
System.out.println(sb.capacity());//now 70
}
}
Output:

16
16
34
34
70
     */
}
