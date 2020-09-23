package gg.matas.app0.homeWork.P7;

public class Inhe {
    public static void main(String[] args){
        OS os0 = new OS(2012);
        Mac mac0 = new Mac(2017, "200$", 32);
        System.out.println(os0);
        System.out.println(mac0);
    }
}

class OS {
    int releaseDate;

    public OS(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public OS () {}

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "OS{" +
                "releaseDate=" + releaseDate +
                '}';
    }
}

class Mac extends OS {
    String price;
    int bitArchitecture;

    public Mac(int releaseDate, String price, int bitArchitecture) {
        super(releaseDate);
        this.price = price;
        this.bitArchitecture = bitArchitecture;
    }

    @Override
    public String toString() {
        return "Mac{" +
                "releaseDate=" + releaseDate +
                ", price='" + price + '\'' +
                ", bitArchitecture=" + bitArchitecture +
                '}';
    }
}
