class Room {
    int length, breadth;

   Room(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.print(length * breadth);
    }
}

class BedRoom extends Room {
    int height;

    BedRoom(int l, int b, int h) {
        super(l, b);
        height = h;
        length = l;
        breadth = b;
    }

     void volume() {
        System.out.print(length * breadth * height);
    }

}

class Q1 {
    public static void main(String[] args) {
        BedRoom r1 = new BedRoom(5, 4, 3);
        r1.volume();
    }
}
