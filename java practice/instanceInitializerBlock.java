public class instanceInitializerBlock {
    int speed;
    //instanceInitializerBlock(){
      //  System.out.println("the speed is "+speed);
    //}
    {speed=100;}   //instance initalizer block

    public static void main(String[] args) {
        instanceInitializerBlock iib1=new instanceInitializerBlock();
        System.out.println(iib1.speed);
    }
}
//instance initalizer block is used to inialize the instance data member
//it runs each time object is created
//chronology of invocation first constructor of parent class then instance block then constructor