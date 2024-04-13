class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

class Q3 {
    public static void main(String[] args) {
        try {
            int age = 8;
            if (age < 18) {
                throw new InvalidAgeException("Invalid age");
            } else {
                System.out.println("Valid age");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }
}