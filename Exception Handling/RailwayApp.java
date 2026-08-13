class RailwayApp {
    public static void main(String[] args) {
        
        String[] trainCodes = {"TR101", "TR102", "TR103", "TR104"};

        int requestedIndex = 5; 

        try {
            
            System.out.println("Train Code: " + trainCodes[requestedIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Error: Invalid train index requested!");
            System.out.println("Available indices range from 0 to " + (trainCodes.length - 1));
        }
    }
}