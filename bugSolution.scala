```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    try {
      if (newAge < 0) {
        throw new IllegalArgumentException("Age cannot be negative")
      }
      _age = newAge
    } catch {
      case e: IllegalArgumentException => println(s"Error setting age: ${e.getMessage}")
      // Or: Handle the exception more robustly, e.g., by using a default value or logging.
    }
  }
}

val myObj = new MyClass("John")
try{
  myObj.age = -5 // This will now print an error message instead of crashing.
} catch{
  case e: IllegalArgumentException => println(s"Caught exception: ${e.getMessage}")
}
```