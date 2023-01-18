package Fundamentals.Mai_2022.P21ObjectsAndClasses;

import java.util.*;

public class P04Songs {

    static class Song {
        String typeList;
        String name;
        String time;

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Song> listSongs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputSongArr = scan.nextLine().split("_");
            String inputType = inputSongArr[0];
            String inputName = inputSongArr[1];
            String inputTime = inputSongArr[2];

            Song currentSong = new Song();
            currentSong.setTypeList(inputType);
            currentSong.setName(inputName);
            currentSong.setTime(inputTime);

            listSongs.add(currentSong);
        }
        String command = scan.nextLine();
        if (command.equals("all")) {
            for (Song item : listSongs) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : listSongs) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }

    }

}
