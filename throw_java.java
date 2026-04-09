class throw_java {
    static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Age must be over 18");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
