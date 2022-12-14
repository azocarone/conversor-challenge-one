package controlador;

import java.net.URL;
import java.net.HttpURLConnection;
import java.util.Scanner;

import modelo.Tasa;
import org.json.JSONObject;

/**
 * @author José AZÓCAR (azocarone)
 *
 */
public class ConsumoAPI {

	public StringBuilder getTipoCambio() {
		try {
			// Solicitar petición
			URL url = new URL("https://s3.amazonaws.com/dolartoday/data.json");
			HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
			conexion.setRequestMethod("GET");
			conexion.connect();

			// ¿Petición correcta?
			int codigoRespuesta = conexion.getResponseCode();
			if (codigoRespuesta != 200) {
				throw new RuntimeException("Ocurrio un error: " + codigoRespuesta);
			} else {
				// Abrir scanner para leer flujo de datos
				StringBuilder infoTipoCambio = new StringBuilder();
				Scanner scanner = new Scanner(url.openStream());
				while (scanner.hasNext()) {
					infoTipoCambio.append(scanner.nextLine());
				}
				scanner.close();
				return infoTipoCambio;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Tasa[] setTipoCambio(StringBuilder infoTipoCambio, String tipoDivisa) {
		/**
		 * @param tipoDivisa: "USD", "EUR"
		 *   
		 */
		Tasa[] divisa = new Tasa[5];
		String[] infoEtiqueta = { "dolartoday", "efectivo_cucuta", "sicad2", "sicad1", "cencoex" };
		String[] tasaNombre = { "DólarToday", "Cucuta", "Dólar BCV", "Dólar Bitcoin", "Petro (PTR)" };
		
		// La información de la API consumida es una implementacion de tipo objeto
		JSONObject objetoJson = new JSONObject(infoTipoCambio.toString());

		// Recorrido de JSON, extración de datos e instanciación de clase
		for (int i = 0; i < 5; i++) {
			double tasaValor = objetoJson.getJSONObject(tipoDivisa).getDouble(infoEtiqueta[i]);
			divisa[i] = new Tasa(tasaNombre[i], tasaValor);
		}
		return divisa;
	}
}
