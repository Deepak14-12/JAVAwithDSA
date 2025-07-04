package mypack;
class Event{
    //Implement your code here
  private  String eventName;
  private  String participantName;
    private double registrationFee;
    
    public Event(String eventName, String participantName){
        this.eventName = eventName;
        this.participantName = participantName;
    }
    
 public void registerEvent(){
         if(eventName.equals("Singing")){
           registrationFee = 8;}
         else if(eventName.equals("Dancing")){
           registrationFee = 10;}
         else if(eventName.equals("DigitalArt")){
           registrationFee= 12;}
         else if(eventName.equals("Acting")){
           registrationFee = 15;}
          else{
           registrationFee = 0;}
        }
   
    
    public void setEventName(String eventName){
        this.eventName = eventName;
    } 
    public String getEventName(){
        return eventName;
    }
    
    public void setParticipantName(String participantName){
        this.participantName = participantName;
    } 
    public String getParticipantName(){
        return participantName;
    }
    
    public void setRegistrationFee(double registrationFee){
        this.registrationFee = registrationFee;
    } 
    public double getRegistrationFee(){
        return registrationFee;
    }
    
}

class SoloEvent extends Event {
    private int participantNo;

    public SoloEvent(String eventName, String participantName, int participantNo) {
        super(eventName, participantName);
        this.participantNo = participantNo;
    }

    @Override
    public void registerEvent() {
        if (getEventName().equals("Singing")){
            setRegistrationFee(8);}
        else if (getEventName().equals("Dancing")){
            setRegistrationFee(10);}
        else if (getEventName().equals("DigitalArt")){
            setRegistrationFee(12);}
        else if (getEventName().equals("Acting")){
            setRegistrationFee(15);}
        else{
            setRegistrationFee(0);}
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    public int getParticipantNo() {
        return participantNo;
    }
}


class TeamEvent extends Event {
    private int noOfParticipants;
    private int teamNo;

    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
        super(eventName, participantName);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    @Override
    public void registerEvent() {
        if (getEventName().equals("Singing"))
            setRegistrationFee(4 * noOfParticipants);
        else if (getEventName().equals("Dancing"))
            setRegistrationFee(6 * noOfParticipants);
        else if (getEventName().equals("DigitalArt"))
            setRegistrationFee(8 * noOfParticipants);
        else if (getEventName().equals("Acting"))
            setRegistrationFee(10 * noOfParticipants);
        else
            setRegistrationFee(0);
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    public int getTeamNo() {
        return teamNo;
    }
}


class TesterEvent{

      public static void main(String[] args) {
            
        SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
		soloEvent.registerEvent();
		if (soloEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + soloEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
			System.out.println("Your participant number is " + soloEvent.getParticipantNo());

		} else {
			System.out.println("Please enter a valid event");
		}
		System.out.println();
		TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
		teamEvent.registerEvent();
		if (teamEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + teamEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
			System.out.println("Your team number is " + teamEvent.getTeamNo());
		} else {
			System.out.println("Please enter a valid event");
		}
	}
}
