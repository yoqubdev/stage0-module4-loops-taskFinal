package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable=new MultiplicationTable();
        multiplicationTable.printTable(5);
    }
    public void printTable(int numberTableToPrint){

        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" x "+""+ numberTableToPrint+" = "+i*numberTableToPrint);
        }

    }
}
