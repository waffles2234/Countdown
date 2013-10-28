class Countdown{
        public static void main(String[]args){
                int s;
                s = 99;
		countdown(99);
	}

	public static void countdown(int s){
		if (s == 0){
			System.out.println(0);
		} else {
			System.out.println(s);
			countdown(s-1);
		}
        }
}




