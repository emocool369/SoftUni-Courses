package Fundamentals.Mai_2022.P21ObjectsAndClasses.Songs;

import Fundamentals.Mai_2022.P21ObjectsAndClasses.P04Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Songs> listOfSongs = new ArrayList<>();



        for (int i = 0; i < n; i++) {


        String songData = scan.nextLine();

        String typeList = songData.split("_")[0];
        String name = songData.split("_")[1];
        String time = songData.split("_")[2];


       Songs song = new Songs(typeList, name, time);

        listOfSongs.add(song);
        }

       String command = scan.nextLine();

        if (command.equals("all")){
            for (Songs item : listOfSongs) {
                System.out.println(item.getName());
            }
            } else {
                for (Songs item : listOfSongs){
                    if(item.getTypeList().equals(command)){
                        System.out.println(item.getName());
                    }
                }
            }
        }
    }

