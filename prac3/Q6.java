 class Q6 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello World");
        System.out.println("String s = " + s);
        System.out.println("s.append(\"!\") = " + s.append("!"));
        System.out.println("s.insert(2, \"Hi \") = " + s.insert(2,"Hi"));
        System.out.println("s.replace(3, 6, \"Bye\") = " + s.replace(3, 6, "Bye"));
        System.out.println("s.reverse() = " + s.reverse());
        System.out.println("s.delete(0, 3) = " + s.delete(0, 3));

    }
}
