package racetrack

class RaceController {

    def scaffold = Race
    // to create CRUD (create/read/update/delete) routes
    //can also do:
    //def scaffold = true (looks at name of controller class to see what to scaffold)

    def index() { }
    // def like Ruby
}

//controllers dictate the URLs that the end users see in their browser
//def index = {
  //render "Hello World"
//}
//"Hello World" will show in your browser at localhost:8080/racetrack/race (race aka index)
//Routes!!!