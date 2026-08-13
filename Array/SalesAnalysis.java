class SalesAnalysis {
    public static void main(String[] args) {
        
        double[] sales = {12000, 15000, 9500, 18200, 11000, 21000, 17500, 8900, 14300, 16000, 19800, 13400};

        
        double maxSales = sales[0];
        double minSales = sales[0];


        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
            }
            if (sales[i] < minSales) {
                minSales = sales[i];
            }
        }

        
        System.out.println("Highest Monthly Sales: " + maxSales);
        System.out.println("Lowest Monthly Sales : " + minSales);
    }
}