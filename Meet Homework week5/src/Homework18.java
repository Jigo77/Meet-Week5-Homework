public class Homework18 {

    public static void main(String args[]){
        int maths=85,sci=80,eng=92,total;
        double per;

      /*  System.out.println("-----------------------------");
        System.out.println("| Subject    |      Marks   |");
        System.out.println("|____________|______________|");
        System.out.println("| Maths      |     |");*/

        System.out.println("        Meet Patel");
        System.out.println("---------------------------");
        System.out.println(" Subject    |      Marks   ");
        System.out.print("  Maths             ");
        System.out.println(maths);
        System.out.print("  Science           ");
        System.out.println(sci);
        System.out.print("  English           ");
        System.out.println(eng);
        System.out.println("---------------------------");
        total = maths+sci+eng;

        System.out.print(" Total             ");
        System.out.println(total);

        per=total/3;

        System.out.print(" Percentage        ");
        System.out.println(per);

    }
}
