package garbages;

public class Garbages {

		String obj_name;
		
		public Garbages(String name) {
			obj_name = name;
		}
		
		public static void main(String[] args) {
			Garbages object1 = new Garbages("t1");
			Garbages object2 = new Garbages("t2");
			// Reassigning the references
			object1 = object2;
			
			
			// Null references
			Garbages object3 = new Garbages("t3");
			object3 = null;
			
			
			// Anonymous Objects
			new Garbages("t4");
			System.gc();
		}
			@Override
			protected void finalize() throws Throwable {
				System.out.println(this.obj_name);
			}
		
	}

/* 
 Garbage Collection: 
 - Unreferanced objects = garbage.
 - All objects are stored in Heap memory. 
 - Clean unused memory automatically by JVM to keep clean heap memory. 
 - Increase memory efficient and decrease the memory leak. 
 
 Garbage object means : if an object 
 - Null the referance  ==> 's= null;' --> s is garbage
 - Assign a referance to another ==> 's1=s2;' --> s1 is garbage
 - Anonymous object ==> 'new Student();'  -->  garbage.
 
 'gc()' method:
 - System.gc() ==> calling garb. coll. but doesn't guarantee will perform. 
 
 'finalize()' method : 
 - This method shows what is happenennig when garbage coll. is working.
 - Working like a constructor. 
 
 - When we run 'gc()', so 'finalize()' start to run, and we can see how many object is get cleaned.
 - Every class has 'finalize()' method since it comes Object class. 
 - If you override 'finalize()' method, so use 'try-catc- finally'. 
 
 
 
 
 
 */
