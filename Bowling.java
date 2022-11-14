public class Bowling {
    //Strike: next 2 bowls are double: 10 + (2 * bowl1) + (2 * bowl2)
    //Spare: next bowl not next 2: 10 + (2 * bowl1)
    //Open frame: Less than 10

    //TDD: Test driven dev, write a simple test, write code to make the test pass, red fail, green pass
    //Makes it easy to catch error in code, ends up with code that's completely tested, make specific tests.
    public static int BowlingCalculator(int[][] scores, int frame11, int frame12) {
        int bowl1 = 0;
        int bowl2 = 0;
        int totalScore = 0;
        boolean wasSpare = false;
        boolean wasStrike = false;


        for(int i = 0; i < scores[0].length; i++) {
            bowl1 = scores[0][i];
            bowl2 = scores[1][i];

            if(wasSpare) {
                totalScore += bowl1;
            }
            if(wasStrike) {
                if(bowl1 == 10) {
                    if(i + 1 < 10) {
                        totalScore += bowl1 + scores[0][i + 1];
                    }
                    else if(i + 1 >= 10) {
                        totalScore += bowl1;
                    }
                }
                else {
                    totalScore += bowl1 + bowl2;
                }
            }

            if(bowl1 == 10) {
                wasSpare = false;
                wasStrike = true;
                totalScore += 10;
            }
            else {
                if(bowl1 + bowl2 == 10) {
                    totalScore += 10;
                    wasSpare = true;
                    wasStrike = false;
                    System.out.println("spare");
                }
                else {
                    totalScore += bowl1 + bowl2;
                    wasSpare = false;
                    wasStrike = false;
                }
            }

            System.out.println("score: " + totalScore + " 1: " + bowl1 + " 2: " + bowl2);
        }

        if(frame11 == 10 && frame12 == 10) {
            return totalScore + frame11 + frame12 + 10;
        }
        return totalScore + frame11 + frame12;
    }
}