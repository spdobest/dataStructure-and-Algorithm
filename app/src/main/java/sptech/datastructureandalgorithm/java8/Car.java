package sptech.datastructureandalgorithm.java8;

import java.util.function.Supplier;

public  class Car {
    public static Car create( final Supplier< Car > supplier ) {

        return supplier.get();

    }             

         

    public static void collide( final Car car ) {

        System.out.println( "Collided " + car.toString() );

    }

         

    public void follow( final Car another ) {

        System.out.println( "Following the " + another.toString() );

    }

         

    public void repair() {  

        System.out.println( "Repaired " + this.toString() );

    }

    public static void main(String...args){

   //     final Car car = Car.create( Car::new );
  //      final List< Car > cars = Arrays.asList( car );
 //        cars.forEach( Car::collide );

    }

}
