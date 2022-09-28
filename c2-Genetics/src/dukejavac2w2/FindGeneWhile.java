package dukejavac2w2;

public class FindGeneWhile {

	public FindGeneWhile() {
		// TODO Auto-generated constructor stub
	}

	public static int findStopCodon(String str, int startIndex,String codon){
		// There are actually three stop codons TAA + 2 more
		
		return 0;
		
		
		
	}
	
	public static String findGeneOneCondonStop(String dna) {
		
		//Find first ocurrence of "ATG" 
		// call its index "startIndex"
		int startIndex=dna.indexOf("ATG");
		
		// Find the "TAA" starting from startIndex+3
		int currIndex = dna.indexOf("TAA", startIndex +3);
		
		// As long as currIndex is not equal -1
		while(currIndex !=1) {
			// Check if (currIndex-startIndex is mod3
						
			if((currIndex-startIndex)%3 == 0) {
				// If so process text in between startIndex, currIndex + 3
				return dna.substring(startIndex, currIndex+3);
			}else {
				// If not, update currIndex
				currIndex = dna.indexOf("TAA", currIndex +1);
			}	
		}
		return "not valid dna";	
	}	
	
public static String findGeneThreeCondonStop(String dna) {
		
		//Find first ocurrence of "ATG" 
		// call its index "startIndex"
		int startIndex=dna.indexOf("ATG");
		if(startIndex==-1) return "Not valid DNA- ATG missing";
		
		// Find one of the stoppers  "TAA", "TAG" or "TGA"
		// starting from startIndex+3
		
		int taaIndex = findStopCodon(dna,startIndex,"TAA");
		int tagIndex = findStopCodon(dna,startIndex,"TAG");
		int tgaIndex = findStopCodon(dna,startIndex,"TGA");
		
		//find the smallest stop index and call it minIndex
		
		int minIndex = taaIndex;
		if(tagIndex<minIndex) minIndex=tagIndex;
		if (tgaIndex<minIndex) minIndex=tgaIndex;
		
		if(minIndex == dna.length()) return "Not valid DNA- STopper missing";
				
		
		
		// As long as currIndex is not equal -1
		while(minIndex !=1) {
			// Check if (currIndex-startIndex is mod3
						
			if((minIndex-startIndex)%3 == 0) {
				// If so process text in between startIndex, currIndex + 3
				return dna.substring(startIndex, minIndex+3);
			}else {
				// If not, update currIndex
				minIndex = dna.indexOf("TAA", minIndex +1);
			
			}
			
		}
		
		return "not valid dna";

	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String dna= "AATGCGTAATTAATCG";
			System.out.println(findGeneOneCondonStop(dna));
	
			String dna2= "CGATGGTTGATAAGCCTAAGCT";
			System.out.println(findGeneOneCondonStop(dna2));
			String dna3= "ATGGTTGATAAGCCTAAGCTATAA";
			System.out.println(findGeneOneCondonStop(dna3));
	// "CCATGCGCTTAATGATAGATTAA" for 3stops testing
	}

}
