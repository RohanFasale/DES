
import java.util.ArrayList;
import java.util.List;


// Abstraction
abstract class Movie {
    protected String title;
    protected int duration;

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    

    // Abstract method 
    public abstract String getGenre();

    // Getter and Setter methods 
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

// Encapsulation
class MovieTicket {
    private Movie movie;
    int ticketPrice;
    private String seatNumber;
    
    public MovieTicket() {
    	
    }

    public MovieTicket(Movie movie, int ticketPrice, String seatNumber) {
        this.movie = movie;
        this.ticketPrice = ticketPrice;
        this.seatNumber = seatNumber;
        Revenue(ticketPrice);
    }
    

    private void Revenue(int ticketPrice2) {
		// TODO Auto-generated method stub
		
	}

	public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

   
    public void displayTicketInfo() {
        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Duration: " + movie.getDuration() + " minutes");
        System.out.println("Ticket Price: Rs" + ticketPrice);
        System.out.println("Seat Number: " + seatNumber);
    }
}

class Revenue {
	
  static int total;
  Revenue(){
	  
  }
  Revenue(int tp){
	  
     total +=tp;
 }
  public void displayRevenue() {
	  System.out.println("Total Revenue of PVR: "+total);
  }
}



// Polymorphism
class ActionMovie extends Movie {
    public ActionMovie(String title, int duration) {
        super(title, duration);
    }

    @Override
    public String getGenre() {
        return "Action";
    }
}

class ComedyMovie extends Movie {
    public ComedyMovie(String title, int duration) {
        super(title, duration);
    }

    @Override
    public String getGenre() {
        return "Comedy";
    }
}

// Inheritance
class DramaMovie extends Movie {
    public DramaMovie(String title, int duration) {
        super(title, duration);
    }

    @Override
    public String getGenre() {
        return "Drama";
    }
}

// Interface
interface TicketBooking {
    void bookTicket(Movie movie, int ticketPrice, String seatNumber);
}

// Exception Handling
class TicketBookingException extends Exception {
    public TicketBookingException(String message) {
        super(message);
    }
}


class MovieTicketBooking implements TicketBooking {
    private List<MovieTicket> bookedTickets;

    public MovieTicketBooking() {
        bookedTickets = new ArrayList<>();
    }

    
    @Override
    public void bookTicket(Movie movie, int ticketPrice, String seatNumber) {
       try{
        if (ticketPrice == 0) {
        throw new TicketBookingException("Invalid ticket price!");
        }
       }catch (TicketBookingException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
       
       try{
         
        if (seatNumber == null || seatNumber.isEmpty()){
        throw new TicketBookingException("Invalid seat number!");
        }
       }catch (TicketBookingException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

       
        
        MovieTicket ticket = new MovieTicket(movie, ticketPrice, seatNumber);
        bookedTickets.add(ticket);
       
    }


    private void Revenue(MovieTicket ticket) {
		// TODO Auto-generated method stub
		
	}
    Revenue r = new Revenue();

	public void displayAllBookedTickets() {
        System.out.println("----- Booked Movie Tickets -----");
        for (MovieTicket ticket : bookedTickets) {
            ticket.displayTicketInfo();
            System.out.println("-------------------------");
        }
        r.displayRevenue();
    }
}

class MovieTicketBookingApp {
    public static void main(String[] args)throws TicketBookingException  {
        System.out.println("-----------Welcome TO PVR--------------");
        System.out.println("\n\n *****Today's Movies*****\n 1.  Pushpa-2\n 2.  Bahubali-3\n 3.  Avengers: Endgame\n");
        
        
    
        Movie actionMovie = new ActionMovie("Avengers: Endgame", 180);
        Movie comedyMovie = new ComedyMovie("Pushpa-2", 100);
        Movie dramaMovie = new DramaMovie("Bahubali-3", 142);

        MovieTicketBooking ticketBooking = new MovieTicketBooking();

            ticketBooking.bookTicket(actionMovie, 120, "A1");
            ticketBooking.bookTicket(comedyMovie, 150, "B7");
            ticketBooking.bookTicket(dramaMovie, 150, "C3");
            ticketBooking.bookTicket(dramaMovie, 170, "D2"); 
            
        
        ticketBooking.displayAllBookedTickets();
    }
}
