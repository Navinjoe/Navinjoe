package javva8;

public class movies {
     private String name;
     private Integer collec;
    private  Integer year;

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

//    public void setCollec(Integer collec) {
//        this.collec = collec;
//    }
    public Integer getCollec() {
        return collec;
    }

//    public void setYear(Integer year) {
//        this.year = year;
//    }

    public Integer getYear(){
        return year;
    }

    public movies(String name, Integer collec, Integer year){
        this.name=name;
        this.year =year;
        this.collec=collec;
    }
}

