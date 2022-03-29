val placesToVisit = Map(
  "CA" -> "California",
  "CO" -> "Colorado",
  "FL" -> "Florida",
  "SD" -> "South Dakota"
)

val visitedStates = List("SD", "FL", "CA", "CO", "masf")

visitedStates.flatMap(code => placesToVisit.get(code))

visitedStates.map(code => placesToVisit.getOrElse(code, "Doesn't Exist"))

visitedStates.map(code => {
  val placeImaybevisited: Option[String] = placesToVisit.get(code)
  placeImaybevisited match {
    case Some(thing) => "I visited " + thing
    case None => "I didn't visit :("
  }
})

