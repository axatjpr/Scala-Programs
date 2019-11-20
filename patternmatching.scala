// Scala program to illustrate 
// the pattern matching 

object gg { 
	
	// main method 
	def main(args: Array[String]) { 
		
	// calling test method 
	println(test(1)); 
	} 


// method containing match keyword 
def test(x:Int): String = x match { 
		
	// if value of x is 0, 
	// this case will be executed 
	case 0 => "Hello, Gg!!"
		
	// if value of x is 1, 
	// this case will be executed 
	case 1 => "AScala?"
		
	// if x doesnt match any sequence, 
	// then this case will be executed 
	case _ => "Gk!!"
} 
} 
