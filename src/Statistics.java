public class Statistics {
	public static double[] sort(double[] thearray) {
		for (int i = 0; i < thearray.length - 1; i++) {
            int location = i;
            for (int j = i + 1; j < thearray.length; j++) {
                if (thearray[j] < thearray[location]) {
                    location = j;
                }
            double smallerNumber = thearray[location]; 
            thearray[location] = thearray[i];
            thearray[i] = smallerNumber;
            }
		}
		return thearray;		
	}
	public static double min(double[] thearray) {
		sort(thearray);
		return thearray[0];
	}
	public static double max(double[] thearray) {
		sort(thearray);
		return thearray[thearray.length - 1];
	}
	public static double mean(double[] thearray) {
		double mean;
		double sum = 0;
		for (int x = 0; x < thearray.length; x++) {
			sum = sum + thearray[x];
		}
		mean = sum/(thearray.length);
		return mean;
	}
	public static double median(double[] thearray) {
		sort(thearray);
	    int middle = thearray.length/2;
	    if (thearray.length%2 == 1) {
	        return thearray[middle];
	    } else {
	        return (thearray[middle-1] + thearray[middle]) / 2.0;
	    }
	}
	
	public static double mode(double[] thearray) {
		sort(thearray);
		    
		int count1 = 0;
		int count2 = 0;
		double popular1 = 0;
		double popular2 = 0;
		for (int x = 0; x < thearray.length; x++) {
			popular1 = thearray[x];
			count1 = 1;
			for (int y = x + 1; y < thearray.length; y++) {
				if (popular1 == thearray[y]) {
					count1++;
				}
			}
		    if (count1 > count2) {
		    	popular2 = popular1;
		    	count2 = count1;
		    }
		    
	    }
		return popular2;
		
	}
	public static double sd(double[] thearray) {
		double mean = mean(thearray);
		double sumofsquares = 0;
		for (int x = 0; x < thearray.length; x++) {
			sumofsquares = sumofsquares + (thearray[x] - mean) * (thearray[x] - mean);
		}
		double variance = sumofsquares/(thearray.length - 1);
		return Math.sqrt(variance);
	}
	public static double range(double[] thearray) {
		sort(thearray);
		double range = (thearray[thearray.length - 1] - thearray[0]);
		return range;

	} 
}
