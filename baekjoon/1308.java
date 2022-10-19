import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int startYear = Integer.parseInt(st.nextToken());
		int startMonth = Integer.parseInt(st.nextToken());
		int startDay = Integer.parseInt(st.nextToken());

		LocalDate startDate = LocalDate.of(startYear, startMonth, startDay);

		st = new StringTokenizer(br.readLine());

		int endYear = Integer.parseInt(st.nextToken());
		int endMonth = Integer.parseInt(st.nextToken());
		int endDay = Integer.parseInt(st.nextToken());

		LocalDate endDate = LocalDate.of(endYear, endMonth, endDay);
		LocalDate limitDate = ChronoUnit.YEARS.addTo(startDate, 1000);
		
		if(endDate.isAfter(limitDate) || endDate.isEqual(limitDate)) {
			System.out.println("gg");
			return;
		}
		
		Duration duration = Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay());
		System.out.print("D-" + duration.toDays());
	}
}
