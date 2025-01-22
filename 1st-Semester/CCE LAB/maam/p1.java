class Parentclass {
  void parentmethod() {
    System.out.println("This is parent class");
  }
}

class Childclass extends Parentclass {
  void childmethod() {
    System.out.println("This is child class");
  }
}

class sol {
  public static void main(String[] args) {
    Parentclass m = new Parentclass();
    Childclass n = new Childclass();
    m.parentmethod();
    n.childmethod();
    n.parentmethod();
  }
}