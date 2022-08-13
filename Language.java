public class Language {
    //variables
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
  
    Language(String langName, int speakers, String regions, String wdOrder){
      this.name = langName;
      this.numSpeakers = speakers;
      this.regionsSpoken = regions;
      this.wordOrder = wdOrder;
  
    }
  
    public void getInfo(){
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
      System.out.println("The language follows the word order: " + this.wordOrder + ".");
  
    }
  
    public static void main (String[] args){
      Language mandarin = new Language("Mandarin", 1300000000, "China, Singapore and Malaysia", "subject–verb–object");
      mandarin.getInfo();
      
      Mayan kiche = new Mayan("Ki'che'", 2330000);
      kiche.getInfo();
  
      SinoTibetan chinese = new SinoTibetan("Mandarin Chinese", 1110000000);
      chinese.getInfo();
  
      SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
      burmese.getInfo();
      
    }
  }
