class ArraySearch00 {
    public static void main(String[] args) {
        char[] data = {'d', 'a', 'c', 'e', 'b', 'Z',  '@',  'X'};
        printArray(data);
    }

    static void printArray(char[] data) {
        for (char one : data) {
            System.out.print(one + " ");
        }
        System.out.println();
    }
}