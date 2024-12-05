public class GameTester {
    public static void main(String[] args) {

        System.out.println("Tests will only work with a working default constructor.\n");

        GameTester.testToString();

        GameTester.testSetName();

        GameTester.testSetBet();

        GameTester.testSetOdds();

        GameTester.testSetAll();

        GameTester.testFullConstructor();

        GameTester.testCopyConstructor();

        GameTester.testGetName();

        GameTester.testGetBet();

        GameTester.testGetOdds();

        GameTester.testEquals();
    }
    
    public static void testToString() {

        Game test = new Game();

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing: toString\n");

        System.out.println("toString output:");
        System.out.println(test.toString() + "\n");

        System.out.println("Expected output:\nName: Game || Bet: 100.0 || Odds: 2.0");

        System.out.println("-------------------------------------------------------------");
    }
    
    public static void testSetName() {

        Game test = new Game();

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing: setName\n");

        System.out.println("toString output before setName:");
        System.out.println(test.toString() + "\n");

        System.out.println("Expected output:\nName: Game || Bet: 100.0 || Odds: 2.0\n");

        test.setName("Slots");

        System.out.println("toString output after setName:");
        System.out.println(test.toString() + "\n");

        System.out.println("Expected output:\nName: Slots || Bet: 100.0 || Odds: 2.0");

        System.out.println("-------------------------------------------------------------");
    }
    
    public static void testSetBet() {
        
        Game test = new Game();

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing: setBet\n");

        System.out.println("toString output before setBet:");
        System.out.println(test.toString() + "\n");

        System.out.println("Expected output:\nName: Game || Bet: 100.0 || Odds: 2.0\n");

        test.setBet(200);

        System.out.println("toString output after setBet:");
        System.out.println(test.toString() + "\n");

        System.out.println("Expected output:\nName: Game || Bet: 200.0 || Odds: 2.0");

        System.out.println("-------------------------------------------------------------");
    }   
    
    public static void testSetOdds() {

        Game test = new Game();

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing: setOdds\n");

        System.out.println("toString output before setOdds:");
        System.out.println(test.toString() + "\n");

        System.out.println("Expected output:\nName: Game || Bet: 100.0 || Odds: 2.0\n");

        test.setOdds(3);

        System.out.println("toString output after setOdds:");
        System.out.println(test.toString() + "\n");

        System.out.println("Expected output:\nName: Game || Bet: 100.0 || Odds: 3.0");

        System.out.println("-------------------------------------------------------------");
    }
    
    public static void testSetAll() {
        
        Game test = new Game();

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing: setAll\n");

        System.out.println("toString output before setAll:");
        System.out.println(test.toString() + "\n");

        System.out.println("Expected output:\nName: Game || Bet: 100.0 || Odds: 2.0\n");

        test.setAll("Slots", 200, 3);

        System.out.println("toString output after setAll:");
        System.out.println(test.toString() + "\n");

        System.out.println("Expected output:\nName: Slots || Bet: 200.0 || Odds: 3.0");

        System.out.println("-------------------------------------------------------------");
    }
    
    public static void testFullConstructor() {

        Game test = new Game("Slots", 200, 3);

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing: Full Constructor\n");

        System.out.println("toString output:");
        System.out.println(test.toString() + "\n");

        System.out.println("Expected output:\nName: Slots || Bet: 200.0 || Odds: 3.0");

        System.out.println("-------------------------------------------------------------");
    }
    
    public static void testCopyConstructor() {

        Game base = new Game("Slots", 200, 3);

        Game test = new Game(base);

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing: Copy Constructor\n");

        System.out.println("toString output:");
        System.out.println(test.toString() + "\n");

        System.out.println("Expected output:\nName: Slots || Bet: 200.0 || Odds: 3.0");

        System.out.println("-------------------------------------------------------------");
    }
    
    public static void testGetName() {

        Game test = new Game();

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing: getName\n");

        System.out.println("getName output:");
        System.out.println(test.getName() + "\n");

        System.out.println("Expected output:\nGame");

        System.out.println("-------------------------------------------------------------");
    }
    
    public static void testGetBet() {

        Game test = new Game();

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing: getBet\n");

        System.out.println("getBet output:");
        System.out.println(test.getBet() + "\n");

        System.out.println("Expected output:\n100.0");

        System.out.println("-------------------------------------------------------------");
        }
    
    public static void testGetOdds() {
        
        Game test = new Game();

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing: getOdds\n");

        System.out.println("getOdds output:");
        System.out.println(test.getOdds() + "\n");

        System.out.println("Expected output:\n2.0");

        System.out.println("-------------------------------------------------------------");
    }
    
    public static void testEquals() {

        Game test = new Game();

        Game compare1 = new Game("Game", 100, 2);

        Game compare2 = new Game("Slots", 200, 3);

        Game compare3 = new Game("Game", 100, 3);

        Game compare4 = new Game("Slots", 100, 2);

        System.out.println("-------------------------------------------------------------");

        System.out.println("Testing: equals\n");

        System.out.println("First comparison output:");
        System.out.println(test.equals(compare1) + "\n");

        System.out.println("Expected output:\ntrue\n");

        System.out.println("Second comparison output:");
        System.out.println(test.equals(compare2) + "\n");

        System.out.println("Expected output:\nfalse\n");

        System.out.println("Third comparison output:");
        System.out.println(test.equals(compare3) + "\n");

        System.out.println("Expected output:\nfalse\n");

        System.out.println("Fourth comparison output:");
        System.out.println(test.equals(compare4) + "\n");

        System.out.println("Expected output:\nfalse\n");

        System.out.println("-------------------------------------------------------------");
    }
}