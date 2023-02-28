package Fundamentals.Exams.MidExam4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3PhoneShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> phoneList = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());

        String commands = scan.nextLine();

        boolean isInTheList = false;

        while (!commands.equals("End")) {

            String[] commandParts = commands.split(" - ");

            String command = commandParts[0];
            String namePhone = commandParts[1];

            switch (command) {
                case "Add":
                    isInTheList = false;

                    for (String phone : phoneList) {
                        if (phone.equals(namePhone)) {
                            isInTheList = true;
                            break;
                        }
                    }

                    if (!isInTheList) {
                        phoneList.add(namePhone);
                    }


                    break;
                case "Remove":
                    isInTheList = false;
                    for (String phone : phoneList) {
                        if (phone.equals(namePhone)) {
                            isInTheList = true;
                            break;
                        }
                    }

                    if (isInTheList) {
                        phoneList.remove(namePhone);
                    }
                    break;
                case "Bonus phone":
                    String[] phones = namePhone.split(":");
                    String oldPhone = phones[0];
                    String newPhone = phones[1];

                    isInTheList = false;
                    int index = 0;

                    for (String phone : phoneList) {
                        index++;
                        if (phone.equals(oldPhone)) {
                            isInTheList = true;
                            break;
                        }
                    }

                    if (isInTheList) {
                        phoneList.add(index, newPhone);
                    }

                    break;
                case "Last":
                    isInTheList = false;
                    for (String phone : phoneList) {
                        if (phone.equals(namePhone)) {
                            isInTheList = true;
                            break;
                        }
                    }

                    if (isInTheList) {
                        String tempPhone = namePhone;
                        phoneList.remove(namePhone);
                        phoneList.add(phoneList.size(), namePhone);

                    }
                    break;
            }


            commands = scan.nextLine();
        }


        System.out.println(String.join(", ", phoneList));

        }

    }

