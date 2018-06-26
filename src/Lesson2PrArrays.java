import java.util.Arrays;

public class Lesson2PrArrays {

    public static void main(String[] args) {
        Lesson2PrArrays pr  = new Lesson2PrArrays();
        int[] test = {1,2,3,4,5,6,7,8, -1, -2, -3, -4, -5, -6, -7, -8, 0};
        int[] test2 = {1,2,3,4,5, -4, -5, -6, -7, -8, 0, 22, 35, 19, 7, 22, 16};
        int[] test3 = {1, 3, 5};
//        System.out.println("Task 1");
 //       pr.task1(test);
//
//        System.out.println("Task 2");
//        pr.task2(test);

//        System.out.println("Task 3");
//        System.out.println("Maximal: " + pr.task3(test));

//        System.out.println("Task 4");
//        pr.task4(test);

//        System.out.println("Task 5");
//        pr.task5(test);

//        System.out.println("Task 6");
//        pr.task6(test);

//        System.out.println("Task 7");
//        pr.task7(test);

//        System.out.println("Task 8");
//        System.out.println(Arrays.toString(pr.task8(test)));

//        System.out.println("Task 9");
//        System.out.println(Arrays.toString(pr.task9(test)));

//        System.out.println("Task 10");
//        pr.task10(test);

//        System.out.println("Task 11");
//        System.out.println(Arrays.toString(pr.task11(test, test2)));

//        System.out.println("Task 12");
//        System.out.println(Arrays.toString(pr.task12(test, test2)));

//        System.out.println("Task 13");
//        System.out.println(Arrays.toString(pr.task13(test)));

//        System.out.println("Task 14");
//        System.out.println(Arrays.toString(pr.task14(test)));

//        System.out.println("Task 15");
//        pr.task15(test);

//        System.out.println("Task 16");
//        System.out.println(Arrays.toString(pr.task16(test, test2)));

//         System.out.println("Task 17");
//         System.out.println(Arrays.toString(pr.task17(test)));

//        System.out.println("Task 18");
 //       System.out.println(Arrays.toString(pr.task18(test,test2)));
    }


    //Было бы неплохо сделать то же самое без использования строк
    //Хотя, удобство этого решения в возможности использования reverse()
    //Вместо StringBuilder лучше использовать StringJoiner, это избавит от лишнего пробела в конце
    //Нет смысла копировать массив, он не изменяется в методе
    public  void task1(int[] arr1){
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            s.append(arr[i]).append(' ');
        }
        System.out.println(s.toString());
        System.out.println(s.reverse().toString());
    }

    //То же замечание, не нужно копировать массив
    //Переменную, содержащую сумму стоило бы назвать соответственно, обычно i используется как счетчик цикла
    public void  task2(int[] arr1){
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            i+=arr[j]; //добавить пробелы, раз они есть в других местах
        }
        System.out.println(i);
    }

    //Ненужное копирование...

    public int task3(int[] arr1){
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if(arr[j]>max)max=arr[j]; //неаккуратно, нарушает JCC
            /*if(arr[j] > max) {
                max = arr[j];
            }*/
        }
        return max;
    }

    //Насчет копирования дальше повторяться не буду
    public void  task4(int[] arr1){
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        int min = arr[0];
        int index = 0;
        for (int j = 0; j < arr.length; j++) { //можно и с 1, как в прошлом примере
            if(arr[j]<min){ //пробелы
                min=arr[j];
                index = j;
            }
        }
        System.out.println("Minimal " + min);
        System.out.println("Index " + index);
    }

    public void  task5(int[] arr1){
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        int sum = 0;
        int q = 0; //как-то не содержательно, лучше назвать quantity
        for (int j = 0; j < arr.length; j++) {
            if((arr[j]%2) == 0){
                sum+=arr[j];
                q++;
            }
        }
        System.out.println("Summ: " + sum);
        System.out.println("Quantity: " + q);
    }

    public void  task6(int[] arr1) {
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        int sum = 0;
        int q = 0;
        for (int j = 0; j < arr.length; j++) {
            if ((arr[j] % 2) == 0 && arr[j] >= 20 && arr[j] <= 30) {
                sum += arr[j];
                q++;
            }
        }
        System.out.println("Summ: " + sum);
        System.out.println("Quantity: " + q);
    }

    //Выбор 0 в качестве управляющего значения неудачен, код работает некорректно, например на массиве {1, 3, 5}
    //Лучше задавать 2 булевых переменных evenFound = false и oddFound = false
    //На примере четного максимума: идти по массиву, пока не встретишь четное число
    //Присвоить максимуму его значение, присвоить evenFound = true
    //Дальше сравнивать новое четное число с максимумом
    //Внизу есть закомментированный пример, который корректно работает
    public void  task7(int[] arr1) {
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        int max = 0;
        int min = 0;
        boolean isZero1 = true;
        boolean isZero2 = true;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]%2 == 0){
                if(arr[j]>max)max=arr[j];
                if(isZero1 && arr[j]==0)isZero1=!isZero1;
            }
            else {
                if(arr[j]<min)min=arr[j];
                if(isZero2 && arr[j]==0)isZero2=!isZero2;
            }
        }
        if(max == 0 && isZero1) System.out.println("No maximal");
        else System.out.println("Maximal " + max);
        if(min == 0 && isZero2) System.out.println("No minimal");
        else System.out.println("Minimal " + min);

        /*int max = 0;
        int min = 0;

        boolean evenFound = false;
        boolean oddFound = false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                //Двойной тернарный оператор
                //Если четное число уже попадалось в массиве, сравнить текущее с максимумом, и присвоить
                //максимуму большее из них, иначе, если это первое четное число в массиве, присвоить его максимуму
                max = evenFound ? Math.max(arr1[i], max) : arr1[i];
                evenFound = true;
            } else {
                min = oddFound ? Math.min(arr1[i], min) : arr1[i];
                oddFound = true;
            }
        }

        System.out.println(evenFound ? "Maximal even number: " + max : "No even numbers found");
        System.out.println(oddFound ? "Minimal odd number: " + min : "No odd numbers found");*/
    }

    public int[] task8(int[] arr1) {
        int[] arr = Arrays.copyOf(arr1, arr1.length); //вот тут копирование необходимо, да
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0)arr[i] *= -1; //JCC, неаккуратно
        }
     return arr;
    }

    public int[]  task9(int[] arr1){
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>0)arr[i]++;
            else if(arr[i]<0)arr[i]=--arr[i]; //пробелы...
        }
        return arr;
    }

    //переменные названы не содержательно
    public void task10(int[] arr1){
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        int medA = meanArithmetic(arr);
        int q = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>medA)q++;
        }

        System.out.println("Medium: " + medA);
        System.out.println("Quantity: " + q);

    }

    public int[] task11 (int[] arr11, int[] arr22) {
        int[] arr1 = Arrays.copyOf(arr11, arr11.length);
        int[] arr2 = Arrays.copyOf(arr22, arr22.length);
        int[] res = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i]=arr1[i]+arr2[i]; //пробелы
        }

        return res;
    }

    public int[] task12 (int[] arr11, int[] arr22) {
        int[] arr1 = Arrays.copyOf(arr11, arr11.length);
        int[] arr2 = Arrays.copyOf(arr22, arr22.length);

        int[] res = new int[arr1.length+arr2.length];

        //Можно было использовать System.arrayCopy()
        for (int i = 0; i < arr1.length; i++) {
            res[i]=arr1[i];
        }
        for (int i = arr1.length, j=0; i < res.length; i++, j++) {
            res[i]=arr2[j];
        }

        return res;

    }

    public int[] task13(int[] arr1){
        int[] arr = Arrays.copyOf(arr1, arr1.length);

        int min = arr[0];
        int index = 0;  //лучше было бы назвать minIndex или indexOfMin, с max аналогично
        int max = arr[0];
        int index1 = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]<min){
                min=arr[j];
                index = j;
            }
            if(arr[j]>max){
                max=arr[j];
                index1 = j;
            }
        }
       arr[index]=max;
        arr[index1]=min;
        return arr;
    }

    public int[] task14(int[] arr1){
        int[] arr = Arrays.copyOf(arr1, arr1.length);

        int min = arr[0];
        int q1 = 1; //трудно понять, что хранят q1 и q2, как я понял, количество мин и макс элементов,
        int max = arr[0];
        int q2 = 1; //стоило бы назвать содержательнее
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]<min){
                min=arr[j];
                q1=1;
            }
            else if(arr[j]==min)q1++; //это очень плохо и сбивает с толку, не стоит писать выражение в той же строке
            if(arr[j]>max) {
                max = arr[j];
                q2 = 1;
            }
            else if(arr[j]==max)q2++;
        }
        int[] res = new int[arr.length-(q1+q2)];
        for (int i = 0, j = 0; i < res.length; i++, j++) {
            if (arr[j] != max && arr[j] != min)res[i]=arr[j]; //то же самое, я вообще сначала подумал, что это условие
            else {

                i--;
            }
        }
        return res;
    }

    public void task15(int[] arr1){

        int[] arr = Arrays.copyOf(arr1, arr1.length);

        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<0)counter++;                  //значение 0 в этой реализации является положительным, так не должно быть
        }
        int[] min = new int[counter];              //неудачное название, лучше positives / negatives
        int[] plus = new int[arr.length-counter];

        for(int i = 0, j = 0, n = 0; i<arr.length; i++){ //i, j, k, но это мелочи
            if(arr[i]<0){
                min[j]=arr[i];
                j++;
            }
            else {
                plus[n]=arr[i];
                n++;
            }
        }
        System.out.println("Positive: " + Arrays.toString(min));
        System.out.println("Negative: " + Arrays.toString(plus));

        /*int negativesCount = 0;
        int positivesCount = 0;

        for (int i: arr1) { //можно пльзоваться форичом, тут i это сам элемент массива
            if (i < 0) { //даже одиночные выражения стоит заключать в фигурные скобки, это повышает читабельность
                negativesCount++;
            } else if (i > 0) {
                positivesCount++;
            }
        }

        int[] negatives = new int[negativesCount];
        int[] positives = new int[positivesCount];

        for (int i = 0, j = 0, k = 0; i < arr1.length; i++) {
            if(arr[i] < 0){
                negatives[j] = arr1[i];
                j++;
            }
            else if (arr[i] > 0) {
                positives[k] = arr[i];
                k++;
            }
        }

        System.out.println("Negatives: " + Arrays.toString(negatives));
        System.out.println("Negatives: " + Arrays.toString(positives));*/
    }

    public int[] task16(int[] arr11, int[] arr22){
        int[] arr1 = Arrays.copyOf(arr11, arr11.length);
        int[] arr2 = Arrays.copyOf(arr22, arr22.length);

        int counter = 0;
        for(int i = 0; i < arr1.length; i++){
            if(((Math.abs(arr1[i]) % 2) == 1) && ((Math.abs(arr2[i]) % 2) == 1))counter++; //опять перенос
            //в условии можно использовать такое выражение: if((arr1[i] & arr2[i] & 1) == 1)
        }
        int[] res = new int[counter*2];
        for (int i = 0, j=0; i < arr1.length; i++) {
            if((arr1[i] & arr1[i] & 1) == 1){
                res[j++]=arr1[i];
                res[j++]=arr2[i];
            }
        }
        return res;
    }

    //Тут я уже не понял, чем это отличается от 14 таски
    public int[] task17(int[] arr){
        int min = arr[0];
        int q1 = 0;
        int minIndex = 0;
        int max = arr[0];
        int q2 = 0;
        int maxIndex = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]<min){
                min=arr[j];
                q1=0;
                minIndex=j;
            }
            else if(arr[j]==min)q1++;
            if(arr[j]>max) {
                max = arr[j];
                q2 = 0;
                maxIndex=j;
            }
            else if(arr[j]==max)q2++;
        }
        int[] res = new int[arr.length-(q1+q2)];
        for (int i = 0, j = 0; i < res.length; i++, j++) {
            if ((arr[j] != max && arr[j] != min) || (j == maxIndex || j == minIndex))res[i]=arr[j];
            else {

                i--;
            }
        }
        return res;
    }

    public int[] task18(int[] arr11, int[] arr22){
        int[] arr1 = Arrays.copyOf(arr11, arr11.length);
        int[] arr2 = Arrays.copyOf(arr22, arr22.length);

        int mid1 = meanArithmetic(arr1);
        int mid2 = meanArithmetic(arr2);
        int[] arr3 = task12(arr1,arr2); //concatenate arrays
        int counter = 0;
        //Проще было пройтись по каждому из массивов
        //Результаты min и max сохранить в переренные, чтобы не вычислять на каждой итерации заново
        for (int i = 0; i < arr3.length; i++) {
            if ((arr3[i] < Math.max(mid1,mid2)) && (arr3[i] > Math.min(mid1,mid2)))counter++;
        }
        int[] res = new int[counter];
        for (int i = 0, j = 0; i < arr3.length; i++) {
            if ((arr3[i] < Math.max(mid1,mid2)) && (arr3[i] > Math.min(mid1,mid2))){
                res[j]=arr3[i];
                j++;
            }
        }
        return res;
    }

    /**
     *
     * @param arr
     * @return arithmetic mean
     */

    //лучше было бы возвращать double
    public int meanArithmetic(int[] arr){
        int medA = arr[0];
        for (int i = 1; i < arr.length; i++) {
            medA+=arr[i];
        }
        medA/=arr.length;
        return medA;
    }

}
