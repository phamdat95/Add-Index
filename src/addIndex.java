import java.util.Scanner;

public class addIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        String[] arrayValue = new String[size];
        String[] arrayNewValue = new String[size];
        int[] arrayIndex = new int[size];
        String b = scanner.nextLine();
        for (int i = 0; i < size; i++){
            System.out.println("Enter element of value " + (i+1) + ":");
            arrayValue[i] = scanner.nextLine();
            if (arrayValue[i].equals("")){
                arrayValue[i] = "0";
            }
        }
        for (int j = 0; j < size; j++){
            System.out.println("Enter element of new value " + (j+1)+":");
            arrayNewValue[j] = scanner.nextLine();
            if (arrayNewValue[j].equals("")){
                arrayNewValue[j] = " ";
            }
        }
        for (int i = 0; i < size; i++){
            arrayIndex[i] = i;
        }
        do {
            System.out.printf("%-15s", "Value:");
            for (int i = 0; i < size; i++){
                System.out.print(arrayValue[i] + " ");
            }
            System.out.println();
            System.out.printf("%-15s", "New value:");
            for (int i = 0; i < size; i++){
                System.out.print(arrayNewValue[i] + " ");
            }
            System.out.println();
            System.out.printf("%-15s", "Index:");
            for (int i = 0; i < size; i++){
                System.out.print(arrayIndex[i] + " ");
            }
            System.out.println();
            System.out.println("Enter value: ");
            value = scanner.nextInt();
            if (value < size - 1 && value > 1){
                for (int j = size; j > 0; j--){
                    arrayNewValue[j -1]= arrayNewValue[j-2];
                    if (j -1 ==value){
                        arrayNewValue[value] = "x";
                        break;
                    }
                }
            } else System.out.println("Can't insert!");
        } while (value != size);
    }
}
