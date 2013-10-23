import racetrack.Runner

class BootStrap {

    def init = { servletContext ->
      def jane = new Runner(
        firstName:"Jane",
        lastName:"Doe",
        dateOfBirth:(new Date() - 365*30),
        gender:"F",
        address:"123 Main St",
        city:"Goose",
        state:"NC",
        zipcode:"12345",
        email:"jane@whereever.com"
        )
      jane.save()
      if(jane.hasErrors()){
        println jane.errors
      }
    }
    def destroy = {}
}
