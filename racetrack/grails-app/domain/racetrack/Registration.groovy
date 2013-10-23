package racetrack

class Registration {

    static belongsTo = [race:Race, runner:Runner]
    //Grails will auto fill in the value when the instance is saved for the first time.

    //domain classes hold the data
    //To disable dateCreated/lastUpdated:
    //static mapping = {
      //autoTimestamp false
    //}

    //static mapping is for mapping class names to alterate table names and field names to alternate column names
    //also for:
    //static mapping = {
      //sort "startDate"
    //}

    //To create own:
    //def beforeInsert = {
      //add code here
    //}
    static constraints = {
      race()
      runner()
      paid()
      dateCreated()
    }

    Boolean paid
    Date dateCreated
}
