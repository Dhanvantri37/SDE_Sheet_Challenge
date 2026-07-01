class Solution {
    
    public int romanToInt(String s) {
        int total = 0;           // This keeps track of our final score
        int n = s.length();      // This tells us exactly how many letters are in the word
        
        // Loop through the letters one by one
        for (int i = 0; i < n; i++) {
            
            // Get the value of the letter we are currently standing on
            int currentVal = getValue(s.charAt(i));
            
            // Peek at the NEXT letter (if there is one) and compare sizes
            if (i + 1 < n && currentVal < getValue(s.charAt(i + 1))) {
                // The tricky rule! Current is smaller than the next.
                total = total - currentVal; 
            } else {
                // The normal rule! 
                total = total + currentVal; 
            }
        }
        
        return total;
    }
    
    // --- OUR HELPER TOOL ---
    // This just translates a Roman letter into a regular number
    private int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}