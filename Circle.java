package coreJava;

class Circle{
    double redious;
    double area;
Circle(double x){
    redious =x;
     area=3.1416*redious*redious;
}
void display(){
    System.out.println("redious  "+redious);
    System.out.println("area  "+area);

}
Circle(){
    redious =1;
}
double getArea(){
     area=3.1416*redious*redious;
    return area;
}

    public static void main(String[] args) {
      Circle obj1= new Circle(2.0);
      Circle obj2= new Circle(12);
      Circle obj3= new Circle(24);

      obj1.display();
      obj2.display();
      obj3.display();

       Circle obj4= new Circle();
      Circle obj5= new Circle();
      Circle obj6= new Circle();


      double arear= obj4.getArea();
       double arear2= obj5.getArea();
        double arear3= obj6.getArea();

       System.out.println("arear  "+arear);
        System.out.println("arear2  "+arear2);
         System.out.println("arear3  "+arear3);
    }

}

