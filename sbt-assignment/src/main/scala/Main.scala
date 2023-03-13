import org.joda.time.DateTime

object Main {
  def main(args: Array[String]): Unit = {
    val currentDateTime = DateTime.now()
    println(s"The current time is: $currentDateTime")
  }
}
