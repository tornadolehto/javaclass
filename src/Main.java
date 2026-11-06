public class Main {

    public static void main(String[] args){
        nation Bolivia = new nation(1098581, nation.GOVERNMENT.REPUBLIC, 1825);
        nation GermanEmpire = new nation(540858, nation.GOVERNMENT.EMPIRE, 1871, 1918);
        System.out.println(Bolivia.getLifetime());
        System.out.println(GermanEmpire.getLifetime());
        System.out.println(nation.num_of_listed_countries);
    }
}

