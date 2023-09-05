package project;


	
	import javax.swing.JFrame;

	
	public class BrickPanel {
	
	    public static void main(String[] args) {
	        JFrame obj = new JFrame();
	        BrickGame gameplay = new BrickGame();
	        obj.setBounds(10,10,700,600); //top, bottom, right,left
	        obj.setTitle("BrickBreaker");
	        obj.setResizable(false);
	        obj.setVisible(true);
	        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        obj.add(gameplay);
	        obj.setVisible(true);
	    }
	    
	}


