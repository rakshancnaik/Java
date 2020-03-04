import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

importjava.time.LocalDate;
importjava.time.LocalDateTime;
importjava.time.LocalTime;
importjava.time.format.DateTimeFormatter;
public 
class Test4 {
	public static void main(String[] args) {
		LocalDate date= LocalDate,now();
		System.out.println("Default format o LocalDate" +date);
		System.out.println("Pattern"+date.format(DateTimeFormatter.ofPattern"d::MMM::uuuu")));
		Local time lt=LocalTime.now();
		System.out.println("Time:"+lt);
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("Default format of LocalDateTime=")
	}
}
