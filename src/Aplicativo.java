import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Aplicativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date data = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(data));

		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		data = cal.getTime();
		System.out.println(sdf.format(data));

		int minutos = cal.get(Calendar.MINUTE);
		System.out.println(minutos);

		int mes = 1 + cal.get(Calendar.MONTH);
		System.out.println(mes);
	}

}
