import javax.swing.JOptionPane;

public class season {
		public enum monthType{ December,Novermber, October,September,August,July,June,May,April,March,Febuary,January
				}

			public static void main(String[] args) {
						 
				monthType [] choices = {monthType.December, monthType.Novermber, monthType.October, monthType.September, monthType.August, monthType.July,
					monthType.June,monthType.May, monthType.April, monthType.March, monthType.Febuary,monthType.January
				};
			
				monthType input = (monthType) JOptionPane.showInputDialog(null, "Select the Season.", "Season Type",															 JOptionPane.INFORMATION_MESSAGE,null, choices, choices[4]);
						
				
				while(input!=null){
					
					switch(input){
						
						case December: case January: case Febuary:
							JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
							break;
						
						case March: case April: case May:
							JOptionPane.showMessageDialog(null, "Happy Spring days!");									
							break;
						
						case June: case July: case August:
							JOptionPane.showMessageDialog(null,"It’s a summer time.");
							break;
						
						case September: case October: case Novermber:
							JOptionPane.showMessageDialog(null, " Welcome to the foliage season!");
							break;
					}
					
					input = (monthType) JOptionPane.showInputDialog(null, "Select the Season.", "Season Type", JOptionPane.INFORMATION_MESSAGE,null, choices, choices[4]);
				}
			}
}
	
