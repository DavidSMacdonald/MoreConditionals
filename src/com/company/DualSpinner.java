package com.company;
public class DualSpinner {
    /** Precondition: min < max
     */
    /*The spin method simulates a spin of a fair spinner.
     * The method returns a random integer between min and max,
     * inclusive. Complete the spin method below by assigning
     * this random integer to result.
     */
    public int spin(int min, int max)
    {
        int result;
//add code here
        result = (int)((max-min) * Math.random() + min + 0.5);
        return result;
    }

    /** Simulates one round of the game as described in part (b).
     */
    public void playRound()
    {
        int ps;
        int cs;
        ps = spin(1,10);
        cs = spin(2,8);
        if (ps>cs) {
            System.out.println("You win! " + (ps-cs) + " points.");
        } else if (ps == cs){
            System.out.println("Tie. " + 0 + " points.");
            playRound();
        } else {
            System.out.println("You lose. " + (ps-cs) + " points.");
        }
    }
    public static void main(String[] args) {
        DualSpinner ds = new DualSpinner();
        for(int i = 0; i < 10; i++){
            ds.playRound();
        }
    }

    /* output */
//    Tie. 0 points.
//    You win! 1 points.
//    You win! 4 points.
//    You lose. -3 points.
//    You lose. -1 points.
//    You lose. -2 points.
//    Tie. 0 points.
//    You win! 7 points.
//    You lose. -3 points.
//    You lose. -2 points.
//    You win! 3 points.
//    You lose. -2 points.
}