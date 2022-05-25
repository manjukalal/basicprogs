public class coinflip {

    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int counter = 1;
        double randNum = 0.0;
        int flips = 10;

        while(counter <= flips)
        {
            randNum = Math.random();
            System.out.println(counter + "\t" + randNum);

            if(randNum < .5)
            {
                heads++;
                System.out.println("\t heads");
            }
            else
            {
                tails++;
                System.out.println("\t tails");
            }
            counter++;
        }

        System.out.println();
        System.out.println("totol  of Heads = " + heads);
        System.out.println("total of Tails = " + tails);

        int percentage1 = (100*heads)/10;
       int percentage2 = (100*tails)/10;
        System.out.println("totol percentage  of Heads = " + percentage1);
        System.out.println("totol percentage  of Heads = " + percentage2);
    }
}

