public class Singleton{

private static Singleton firstInstance;

//To test if the class is Singleton
int i;
private Singleton(){

}

public static Singleton getSingletonInstance(){

if(firstInstance==null){
Singleton s = new Singleton();
firstInstance = s;
}
return firstInstance;

}

public static void main(String[] args){
	
	//First Instance	
	Singleton k = getSingletonInstance();
	//Setting i value for the object k -the first Instance to '100'.
	k.i=100;
	Singleton l = getSingletonInstance();
	
	//To check k.i is equal to l.i
	/*Since a Singleton patterned class allows only one Instance and returns the same everytime getSingletonInstance 
	  is called, the value of "l.i" is equal to k.i(the first instance).
	*/
	System.out.println(l.i);
	
	Singleton.getSingletonInstance();
}


}