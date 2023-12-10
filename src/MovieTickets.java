public class MovieTickets
{
	int number_of_tickets; //class variable
   static int total_number_of_tickets;//static variable
  MovieTickets(int n)
  {
	  number_of_tickets=n;
	  total_number_of_tickets=n;
  }
  void printticket() 
  {
	  System.out.println("thank you !! you have booked tickets are"+number_of_tickets);
  }
   static void totaltickets()
  {
	  System.out.println("thank you !! you have booked tickets are"+total_number_of_tickets);
  }
	public static void main(String[] args)
	{
    MovieTickets ram=new MovieTickets(4);
    MovieTickets lakshman=new MovieTickets(3);
    ram.printticket();
    lakshman.printticket();
    MovieTickets.totaltickets();
	}
	}
