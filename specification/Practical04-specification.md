## A Complete Application with Objects

### Aims and Objectives

This laboratory has been designed to help you

- learn how to define classes which are instantiated in the main method of an application;
- gain further practice with defining methods which are only used within a class (object) and those which are intended
  to be invoked using an object reference.

### Task 1 - Checkpoint 17

On completion of this task you will have demonstrated the ability to construct

- a simple class definition containing instance variables, constructors and methods, and
- a class containing only a main method which creates an instance of a class (an object) and invokes methods, through a
  reference to the object.  <br /><br />

#### Part A

In IntelliJ add the following to the files `Boat.java` (the Java class file) and `BoatMaker.java` (the Java main
class):


1. **Boat** – this class contains:
	1. an instance variable `name` of type `String` which is initialised to "**unknown**",
	2. an instance variable, `boatClass`, of type `String` initialised to "**unknown**",
	3. an instance variable, `regNum`, of type `int` initialised to **-1**,
	4. an instance variable, `yardstick`, of type `double` - not initialised,
	5. a constructor which takes no parameters and sets the value of the instance variable `yardstick` to 100.0,
	6. a public method `toString` which returns a `String`, has no formal parameters and
	   returns the boat’s _name_, _class_ and _registration number_. in the following format:<br><br>

	   **Boat _name_, Class = _boatClass_, Registration # = KA _regNum_**  <br /><br />
	   where the words in _italics_ should be replaced with the values of the corresponding instance variables.
	   <br><br>**Note:** all instance variables should have `private` visibility  <br /><br />
2. **BoatMaker** – this class contains a main method which performs the following actions:
	1. Prints the message “_Starting boat application_”
	2. Defines a variable called `myBoat` of type `Boat` and which is initialised to a new `Boat` object.
	3. Invokes (calls) the `toString` method from `myBoat` (You will need to wrap the 
       call to the `toString` method in a `System.out.println()` call)

Run the application. The following output should be produced:  <br><br>
**<tt>Starting boat application  
Boat unknown, Class = unknown, Registration # = KA -1  
</tt>**

#### Part B
Modify the current program in the following ways.
1. Add the following to the `Boat` class
	1. **another** _constructor_ with the following formal parameters:
		1. `initName` of type `String`
		2. `initBoatClass` of type `String`
		3. `initRegNum` of type `int`
		4. `initYardstick` of type `double`

   The constructor should assign each of the class’s instance variables to the respective formal parameter.

2. Modify the **main** method in the definition of the class `BoatMaker` to perform only the following:
	1. Print the message “_Starting boat application_”
	2. Define a variable called `myBoat` of type `Boat` and initialise it to a new Boat object using the _**default
	   constructor**_ (from Task 1 - Part A).
	3. Define a variable called `myBoat1` of type `Boat` and initialise it to a new `Boat` object constructed with the
	   second constructor using the actual parameters "_Harmony Blue_", "_International 505_", _6467_ and _95_
	4. Invoke (call) the `toString` method from `myBoat`
	5. Invoke (call) the `toString` method from `myBoat1`
3. Run the application. The following output should be produced:<br>   
   **<tt>Starting boat application  
   Boat unknown, Class = unknown, Registration # = KA -1  
   Boat Harmony Blue, Class = International 505, Registration # = KA 6467  </tt>**

---

### Task 2 - Checkpoint 18

Modify the program developed in Task 1 as directed below.

1. The class `Boat` should be extended/modified to include the following:
	1. Getter methods **for all instance variables**, for example a method called `getName` which gets the instance
	   variable `name` and returns it to the calling code
	2. Setter methods **for all instance variables**, for example a method called `setName` which sets the instance
	   variable `name` to a value which is passed as a parameter
2. Add statements to the end of the **main** method to do the following:
	1. Change the name of `myBoat` to "_Australia II_" (invoke the `setName` method in the object referred to
	   by `myBoat`).
	2. Invoke (call) the `toString` method from `myBoat`.
	3. Print the names of `myBoat` and `myBoat1` (invoke the `getName` method in both of the objects referred to
	   by `myBoat` and `myBoat` and print out the results).
3. Run the application. The following output should be produced:<br>    
   **<samp>Starting boat application  
   Boat unknown, Class = unknown, Registration # = KA -1  
   Boat Harmony Blue, Class = International 505, Registration # = KA 6467    
   Boat Australia II, Class = unknown, Registration # = KA -1   
   Australia II  
   Harmony Blue  
   </samp>**
   <br>
4. Experiment by setting values for the other instance variable - check your results by printing (using the getters as
   above)

---

### Task 3 - Checkpoint 19

Modify the program developed in Task 2 as directed below.

1. The class `Boat` should be extended/modified to include the following:
	1. a count of the total number of `Boat` objects created. This should be incremented by 1 each time a `Boat` is
	   created.  <br />  **Hint:** there are two ways to create a `Boat`
	2. a _**static** method_ called `getTotal` which returns the total number of boats created, as a `String` message. For
	   example, if 4 boats have been created the return value when printed would be:    
	   **<tt>Total number of boats created = 4</tt>**
	3. the sequence number (starting at 1 for the first boat object created and incremented by 1 each time) of each boat 
       should be stored and a getter method called `getSeqNum` should be created to return it.
	4. To test that the sequence number and total boats methods work as expected add the following code to the end of
	   the `main` method.  <br />The code creates 4 Boats, prints their sequence number and then their information.
	   Finally, it prints the total number of boats created.
	   ```        
	   int i = 4;
	   while (i > 0) {
		   Boat testBoat = new Boat();
		   System.out.println("Sequence #: " + testBoat.getSeqNum());
		   System.out.println(testBoat);
		   i--;
	   }
	   System.out.println();
	   System.out.println(Boat.getTotal());
	   ```  
   The output after adding the code to main should be:  <br /><br />

   **<tt>Starting boat application  
   Boat unknown, Class = unknown, Registration # = KA -1  
   Boat Harmony Blue, Class = International 505, Registration # = KA 6467    
   Boat Australia II, Class = unknown, Registration # = KA -1   
   Australia II  
   Harmony Blue   
   Sequence #: 3  
   Boat unknown, Class = unknown, Registration # = KA -1  
   Sequence #: 4  
   Boat unknown, Class = unknown, Registration # = KA -1  
   Sequence #: 5  
   Boat unknown, Class = unknown, Registration # = KA -1  
   Sequence #: 6  
   Boat unknown, Class = unknown, Registration # = KA -1  <br /><br />
   Total number of boats created = 6
   </tt>**

---

### Task 4 - Checkpoint 20 (Challenging)

Modify the program developed in Task 3 as directed below.

1. The class `Boat` should be extended/modified to include the following:
	1. a method called `adjustedRaceTime` that takes 2 formal parameters named `start` and `end`, both of type `int`,
	   which are the start time and end time in 24-hour format, i.e. _1030, 1350_ etc.
	   and returns a `String` which is the adjusted time (in minutes) it took to complete the race. <br /> The
	   method should perform as follows:
		1. Check to ensure that the start time is before the end time, if not return **"Incorrect time keeping"**
		2. calculate the elapsed time in minutes - you will have think carefully about how to do this with a 24 hr clock
		3. calculate the adjusted time (as a `double`) using the following formula:  <br><tt>(elapsed time /
		   yardstick) * 100</tt>
		4. return the adjusted time formatted to a _maximum_ of 2 decimal places
	6. The class `BoatMaker` should be extended to include the following:
		1. a method with the following header:   <br>`public static int getCorrectedTime(int min, int max)`  <br>
		   which produces a random number in the range of min to max. This number must be in correct 24 hr format, so
		   you
		   may have to check and make adjustments for it to comply.  <br>
		   This will only happen for the minutes section. For example,

		   | Generated Number | Adjusted Number |
		   		                   |------------------|-----------------|
		   | 1078             | 1118            |
		   | 1196             | 1236            |
		   | 963              | 1003            |
			2. Add the following code to the `main` method, and fill in the missing sections:

		    ```java
			   System.out.println("Boat #\tStart\tEnd\tYdstk\tAdjusted Time (mins)");
			   System.out.println("--------------------------------------------------");
  
			   // generate a corrected start time between 900 and 1145
     
			   // set up variables you will need to calculate the best time
			   int index = 0;
     
			   while (index < 8){
			       // Yardstick in the range 91 to 100
		 
			       // create a new Boat with the default constructor
		 
			       // set the yardstick to the one generated above
  
			       // generate a corrected end time between 1030 and 1230
		 
			       // call the adjustedRaceTime method in the Boat class on the corrected start and end time
	 
			       // Print out the Boat sequence number, start time, end time, yardstick and adjusted time
			       // these should be separated with the \t (tab) character
				
			       // determine the best time
  
			       index++;
			   }
			   System.out.println("--------------------------------------------------");
			   System.out.println("The winner of the race is: Boat " + (boatNum + 1) +
			   " with a time of " + bestTime + " minutes");
		   ```  

If the start time was corrected to 1118 your code may produce output similar to the following:  <br /><br />
**<tt>
Boat # Start End Ydstk Adjusted Time (mins)  
`--------------------------------------------------`  
Boat 1 1118 1056 98 &emsp; Incorrect time keeping  
Boat 2 1118 1222 92 &emsp; 69.57  
Boat 3 1118 1204 99 &emsp; 46.46  
Boat 4 1118 1110 100 &emsp;Incorrect time keeping  
Boat 5 1118 1211 91 &emsp; 58.24  
Boat 6 1118 1216 91 &emsp; 63.74  
Boat 7 1118 1225 93 &emsp; 72.04  
Boat 8 1118 1205 100 &emsp;47  
`--------------------------------------------------`  
The winner of the race is: Boat 3 with a time of 46.46 minutes  
</tt>**
---
