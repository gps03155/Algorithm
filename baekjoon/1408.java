import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String start = br.readLine();
		String end = br.readLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime startDate = LocalTime.parse(start, formatter);
		LocalTime endDate = LocalTime.parse(end, formatter);
		
		
		Duration duration;
		
		if(startDate.compareTo(endDate) > 0) {
			duration = Duration.between(endDate, startDate);
			duration = Duration.ofHours(24).minus(duration);
		}
		else {
			duration = Duration.between(startDate, endDate);
		}
		
		long hours = duration.toHours();
		long minutes = duration.minusHours(hours).toMinutes();
		long seconds = duration.minusHours(hours).minusMinutes(minutes).toSeconds();
		
		String answer = String.format("%02d:%02d:%02d", hours, minutes, seconds);
		System.out.println(answer);
	}
}
