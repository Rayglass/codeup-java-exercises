public class ServerNameGenerator {

    private static final String[] adjectives = {"automated", "twisted", "reliable", "effective", "powerful", "revolutionary", "mind-boggling", "decentralized", "dynamic", "hybrid"};
    private static final String[] nouns = {"dodge", "chevy", "ford", "honda", "toyota", "gmc", "bmw", "mercedes", "lincoln", "cadillac"};

    private static String getRandomElement(String[] array) {
        int index = (int) (Math.random() * array.length);
        return array[index];
    }

    public static void main(String[] args) {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);
        String serverName = adjective + "-" + noun;
        System.out.println("Your server name is: " + serverName);
    }
}






