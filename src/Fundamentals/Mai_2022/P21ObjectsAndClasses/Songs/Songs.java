package Fundamentals.Mai_2022.P21ObjectsAndClasses.Songs;

public class Songs {

    private String typeList;
    private String name;
    private String time;


    public Songs (String typeList, String name, String time){
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public String getTypeList(){
        return this.typeList;
    }

    public String getName(){
        return this.name;
    }

    public String getTime(){
        return this.time;
    }


    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTime(String time){
        this.time = time;
    }
}
