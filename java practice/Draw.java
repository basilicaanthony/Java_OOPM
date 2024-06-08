public interface Draw {
    void draws();
    default void msg(){
        System.out.println("default methods are only allowed for interfaces");
    }
}


/*
interface has static constants and abstract methods and variables only
it can have non abstract methods also but they have to be default like in line 3
you cannot use the keyword abstract as it is the only thing for interface
fields are public static and final
class implements interface a,interface b      interface a extends interface b
interface cannot be intantiated(objects cannot be mode) but it can be derefferenced
 Bank b = new SBI();
 here back is interface and sbi is class
 so it is like "Class SBI inplements Bank"
 go to java class rectange for the complete code
 */