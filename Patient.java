public class Patient{
  
  // Instance Variables
  private String name;
  private String appType;
  private int brushNum;
  private String floss;
  private String lastBrush;
  private String newBrush;
  private String toothpaste;
  private String pain;

  public Patient(String patientName, String appointmentType, int brushAmt, String flossN, String brushChange, String nBrush, String toothpasteFlavor, String anyPain) {
    name = patientName;
    appType = appointmentType;
    brushNum = brushAmt;
    floss = flossN;
    lastBrush = brushChange;
    newBrush = nBrush;
    toothpaste = toothpasteFlavor;
    pain = anyPain;
  }

  public String toString(){
    return "Name: " + name + "\nAppointment Type: " + appType + "\nTimes brush teeth per day:  " + brushNum + "\nFloss at least once per day? " + floss + "\nReplaced brush within past 3-4 months? " + lastBrush + "\nProvide new toothbrush? " + newBrush + "\nPreferred toothpaste flavor: " + toothpaste + "\nExperienced recent mouth pain? " + pain;     
  }

}