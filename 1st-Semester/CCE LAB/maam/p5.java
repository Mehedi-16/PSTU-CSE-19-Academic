 class Reactangle {
    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int Area() 
    {
        return length * width;
    }

    int Perimeter() 
    {
        return 2 * (length + width);
    }
    void display()
    {
        System.out.println(Area());
        System.out.println(Perimeter());
    }

    class Square extends p5{

        public Square(int side) {
            super(side, side);
        }
    }



    }
