public class Data implements Comparable<Data>{
  String word;
  int spamTotal;
  int notTotal;
 
  public Data(String word, int spamTotal, int notTotal){
    this.word = word;
    this.spamTotal = spamTotal;
    this.notTotal = notTotal;
  } 
   
  public int compareTo(Data d){
    if (this.spamTotal < d.spamTotal)
      return 1;
    else if (this.spamTotal > d.spamTotal)
      return -1;
    return 0;
  }
  
  public String toString() {
	  return word + "," + spamTotal + "," + notTotal;
  }
}