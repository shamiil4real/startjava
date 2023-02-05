public class MyFirstGame {

    public static void main(String[] args) {
        int playerNum = 1;
        int goalNum = 89;

        while (playerNum != goalNum) {
            if (playerNum > goalNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                if (playerNum - goalNum >= 50) {
                    playerNum -= 50;
                } else if (playerNum - goalNum >= 25) {
                    playerNum -= 25;
                } else if (playerNum - goalNum >= 10) {
                    playerNum -= 10;
                } else if (playerNum - goalNum >= 5) {
                    playerNum  -= 5;
                } else {
                    playerNum--;
                }
            } else {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                if (goalNum - playerNum >= 50) {
                    playerNum += 50;
                } else if (goalNum - playerNum >= 25) {
                    playerNum += 25;
                } else if (goalNum - playerNum >= 10) {
                    playerNum += 10;
                } else if (goalNum - playerNum >= 5) {
                    playerNum  += 5;
                } else {
                    playerNum++;
                }
            }
        }

        if (playerNum == goalNum) {
            System.out.println("Вы победили!");
        }
    }
}