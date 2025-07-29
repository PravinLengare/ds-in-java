import hash_table.com.HashTable;

public class Main {
    public static void main(String[] args) {

        HashTable newHashTable = new HashTable();
        newHashTable.set("p",3);
        newHashTable.set("q",4);
        newHashTable.set("r",5);
        newHashTable.set("s",6);
        newHashTable.set("t",7);

        newHashTable.printTable();


        System.out.println("The get value of p key is : "+newHashTable.get("p"));
        System.out.println("The get value of p key is : "+newHashTable.get("a"));

        System.out.println(newHashTable.keys());

    }
}