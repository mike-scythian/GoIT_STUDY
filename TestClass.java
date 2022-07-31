public class TestClass {
	
	public String encode(String name){
        name = name.replace("e","1")
        			.replace("u","2")
        			.replace("i","3")
        			.replace("o","4")
        			.replace("a","5");
        return String.join("","NOTFORYOU",name,"YESNOTFORYOU");
	}
	public String decode(String name){
			name = name.replace("1","e")
						.replace("2","u")
						.replace("3","i")
						.replace("4","o")
						.replace("5","a")
						.replace("YESNOTFORYOU", "")
						.replace("NOTFORYOU", "");
			return name;
	}
	
	public String getMyPrizes(int ticket){
        String prize = new String();
        if(ticket % 10 == 0)
            prize = "crystall";
        if(ticket % 10 == 7)
            prize = "chip";
        if(ticket > 200)
            if(prize.isEmpty())
                prize ="coin";
            else
                prize +=" coin";
        /*else
            prize.concat("");*/
        return prize;

    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass robot = new TestClass();

        //System.out.println(robot.encode("Crob"));
        //System.out.println(robot.decode("NOTFORYOUCr5bYESNOTFORYOU"));
        
		System.out.println(robot.getMyPrizes(2));
        
    }

}
