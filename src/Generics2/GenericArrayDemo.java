package Generics2;
    public class GenericArrayDemo {

        public static void main(String[] args) {

            // Массив String.
            String[] names = new String[] { "Tom", "Jerry" };

            GenericArray<String> gArray = new GenericArray<String>(names);

            String last = gArray.getLastElement();

            System.out.println("Last Element = " + last);
        }

    }

