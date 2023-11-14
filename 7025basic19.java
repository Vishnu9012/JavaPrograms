class nineteen {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int seconds;

        try {
            System.out.print("Enter seconds: ");
            seconds = Integer.parseInt(input.readLine());
            
            int hours = seconds / 3600;
            int remainingSeconds = seconds % 3600;
            int minutes = remainingSeconds / 60;
            remainingSeconds %= 60;
            
            System.out.println("Hours: " + hours);
            System.out.println("Minutes: " + minutes);
            System.out.println("Seconds: " + remainingSeconds);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input, please enter a valid integer.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
