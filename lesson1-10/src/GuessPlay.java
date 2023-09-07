public class GuessPlay {
    public static void main(String[] args) {
        int totalGuessCount = 5;
        int leftToGuess = totalGuessCount;
        if (leftToGuess > 0) {
            try {

                int rangeStart = 1;
                int rangeEnd = 9;
                boolean gameEnd = false;

                while (!gameEnd) {
                    int mod = rangeEnd - rangeStart;
                    if (rangeStart < 0 || rangeEnd < 0) {
                        System.out.println("必须为正数");
                    }
                    if (mod <= 1) {
                        System.out.println("非法的数字范围：（" + rangeStart + "," + rangeEnd + ")");

                    }
                    int BigRandom = (int) (Math.random() * 100 * rangeEnd);
                    int numberToGuess = rangeStart + (BigRandom % mod);
                    if (numberToGuess <= rangeStart) {
                        numberToGuess = rangeStart + 1;

                    } else if (numberToGuess >= rangeEnd) {
                        numberToGuess = rangeEnd - 1;
                    }


                    int x = 0;


                    while (leftToGuess > 0) {

                        System.out.println("请输入猜测的数字，范围在(" + rangeStart + "," + rangeEnd + ")" + "输入负一结束游戏");
                        int guess = System.in.read() - 48;
                        if (guess < 0 && guess != -38) {
                            gameEnd = true;
                            System.out.println("用户结束游戏");
                            break;
                        }
                        if (guess == -38) {
                            break;
                        }

                        if (x == guess) {
                            break;
                        }
                        x = guess;

                        leftToGuess--;
                        if (guess > numberToGuess) {
                            System.out.println("输入的数字比目标数字大");
                            System.out.println("剩余" + leftToGuess);

                        } else if (guess < numberToGuess) {
                            System.out.println("输入的数字比目标数字小");
                            System.out.println("剩余" + leftToGuess);

                        } else {

                            System.out.println("输入的数字正确");
                            break;
                        }
                    }
                }


            } catch (Exception e) {
            }
        }
    }


    }

