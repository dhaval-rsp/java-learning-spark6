class P8_BreakAndContinue {
    public static void main(String[] args) {

        for(int i = 1; i<=20; i++){
			
			if(i==7) continue; // 7 skipped
			if(i==15) break; // 15 skipped and rest of code too

			System.out.println(i);
		}
    }
}