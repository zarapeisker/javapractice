package racetrack

class Race {

    static hasMany = [registrations:Registration]
    //could add more relationships after Registration, separated by commas
    //ActiveRecord knows what the singular is, but here we must specify
    //name (of field) :value (datatype)

    String toString(){
      return "${name}, ${startDate.format('MM/dd/yyyy')}"
    }

    //in Groovy and Java, creates a string representation of the objects associated with race

    static constraints = {
      name(blank:false, maxSize:50)
      startDate(validator: {return (it > new Date())})
      //"it" is the date being submitted
      city()
      state(inList:["GA", "NC", "SC", "VA"])
      distance(min:0.0)
      cost(min:0.0, max:100.0)
      maxRunners(min:0, max:100000)
    }
    //this puts the fields in the order you want
    //also validates your fields
    //see page 27 for a full list of validations
    //multilingual messages stored in i18n

    String name
    Date startDate
    String city
    String state
    BigDecimal distance
    BigDecimal cost
    Integer maxRunners = 100000
    //Groovy: No semicolons / BigDecimal instead of Float or Double ... more accurate

    BigDecimal inMiles() {
      return distance * 0.6214
    }
}