package com.company.Lesson03_ClassWork;

public class Main {
    public static void main(String[] args) {

        /*int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));

        int n = 10;
        int[] num = new int[n];
        System.out.println(Arrays.toString(num));

        float [] num1;
        num1 = new float[] {1.0f, 2.0f};
        System.out.println(Arrays.toString(num1));

        int [] arrays = new int[4];
        arrays [0] = 1;
        arrays [1] = 2;
        arrays [2] = arrays[0] + arrays[1];
        arrays [3] = 4;
        System.out.println(Arrays.toString(arrays));

        byte[] numbers1 = {0, 1,2,3,4,5,7,7};
        String arrayAsString = Arrays.toString(numbers1);
        System.out.println(arrayAsString);

        long[] bigNums = {20000000L, 30000000000L, 2000200300L, 1000839829873L,1};
        Arrays.sort(bigNums);
        System.out.println(Arrays.toString(bigNums));

        System.out.println(Arrays.equals(arrays, num));

        int size = 10;
        char[] chars = new char[size];

        Arrays.fill(chars, 0, size/2, 'a');
        Arrays.fill(chars, size/2, size, 'b');
        System.out.println(Arrays.toString(chars));


        int x = 10;
        int[] squares = new int[x];
        for (int i = 0; i < squares.length; i++){
            squares[i] = i*i;
        }

        System.out.println(Arrays.toString(squares));

        char[] symbols = {'a', 'c', 'b', 'd', 'a',  'f'};
        int counter = 0;
        for (int i =0; i< symbols.length; i++){
            if(symbols[i] == 'a'){
                counter++;
            }
        }

        for(char var : symbols){
            if(var == 'a'){
                counter++;
            }
        }


        System.out.println(counter);


        int[] test = {0, 1, 2, 4, 3, 2, 0, 2};
        System.out.println(Arrays.toString(removeElement(test, 2)));
    }

    public static int[] removeElement(int[] array, int val) {
        int offset = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                offset++;
            } else {
                array[i - offset] = array[i];
            }
        }
        int [] newArray = new int [array.length -offset];
        for (int i =0; i< newArray.length; i++){
            newArray[i] = array[i];
        }


        //System.arraycopy(array, 0, newArray, 0, newArray.length);

        return newArray;
    }*/
    }
}
