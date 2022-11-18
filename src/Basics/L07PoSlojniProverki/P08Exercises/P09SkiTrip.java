package Basics.L07PoSlojniProverki.P08Exercises;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int daysVacation = Integer.parseInt(scan.nextLine());
        String typeRoom = scan.nextLine();
        String note = scan.nextLine();

        int nights = daysVacation - 1;
        double totalCost = 0;
        //room for one person - 18 lv/night
        //apartment - 25 lv/night
        //president apartment - 35/night

        if (daysVacation < 10) {
            if (typeRoom.equals("room for one person")) {
                totalCost = nights * 18;
                if (note.equals("positive")) {
                    totalCost *= 1.25;
                } else if (note.equals("negative")) {
                    totalCost = totalCost  - (totalCost *0.1);
                }
            } else if (typeRoom.equals("apartment")) {
                totalCost = nights * 25;
                totalCost = totalCost - (totalCost * 0.3);
                if (note.equals("positive")) {
                    totalCost *= 1.25;
                } else if (note.equals("negative")) {
                    totalCost = totalCost  - (totalCost *0.1);
                }
            } else if (typeRoom.equals("president apartment")) {
                totalCost = nights * 35;
                totalCost = totalCost - (totalCost * 0.1);
                if (note.equals("positive")) {
                    totalCost *= 1.25;
                } else if (note.equals("negative")) {
                    totalCost = totalCost  - (totalCost *0.1);
                }
            }
        } else if (daysVacation >= 10 && daysVacation <= 15) {
            if (typeRoom.equals("room for one person")) {
                totalCost = nights * 18;
                if (note.equals("positive")) {
                    totalCost *= 1.25;
                } else if (note.equals("negative")) {
                    totalCost = totalCost  - (totalCost *0.1);
                }
            } else if (typeRoom.equals("apartment")) {
                totalCost = (nights * 25);
                totalCost = totalCost - (totalCost * 0.35);
                if (note.equals("positive")) {
                    totalCost *= 1.25;
                } else if (note.equals("negative")) {
                    totalCost = totalCost  - (totalCost *0.1);
                }
            } else if (typeRoom.equals("president apartment")) {
                totalCost = nights * 35;
                totalCost = (totalCost * 0.15);
                if (note.equals("positive")) {
                    totalCost *= 1.25;
                } else if (note.equals("negative")) {
                    totalCost = totalCost  - (totalCost *0.1);
                }


            }
        } else if (daysVacation > 15) {
            if (typeRoom.equals("room for one person")) {
                totalCost = nights * 18;
                if (note.equals("positive")) {
                    totalCost *= 1.25;
                } else if (note.equals("negative")) {
                    totalCost = totalCost  - (totalCost *0.1);
                }
            } else if (typeRoom.equals("apartment")) {
                totalCost = nights * 25;
                totalCost = totalCost - (totalCost * 0.5);
                if (note.equals("positive")) {
                    totalCost *= 1.25;
                } else if (note.equals("negative")) {
                    totalCost = totalCost  - (totalCost *0.1);
                }
            } else if (typeRoom.equals("president apartment")) {
                totalCost = nights * 35;
                totalCost = totalCost - (totalCost * 0.2);
                if (note.equals("positive")) {
                    totalCost *= 1.25;
                } else if (note.equals("negative")) {
                    totalCost = totalCost  - (totalCost *0.1);
                }
            }
        }


        System.out.printf("%.2f",totalCost);
                }
                }