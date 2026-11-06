public class nation {
    public enum GOVERNMENT {
        KINGDOM,
        EMPIRE,
        REPUBLIC
    }
    private double sizeSQKM;
    private GOVERNMENT government;
    private int foundedyear;
    private int dissolvedyear = 2026;

    public static int num_of_listed_countries = 0;
    public nation(double size, GOVERNMENT government, int foundation, int dissolution){
        sizeSQKM = size;
        this.government = government;
        foundedyear = foundation;
        dissolvedyear = dissolution;
        num_of_listed_countries ++;
    }
    public nation(double size, GOVERNMENT government, int foundation){
        sizeSQKM = size;
        this.government = government;
        foundedyear = foundation;
    }

    public int getLifetime(){
        return dissolvedyear-foundedyear;
    }

}