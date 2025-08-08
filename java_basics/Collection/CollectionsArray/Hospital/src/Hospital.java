import java.text.DecimalFormat;

public class Hospital {
    private final static DecimalFormat FORMAT_1 = new DecimalFormat("#0.0");
    private final static DecimalFormat FORMAT_2 = new DecimalFormat("#0.00");

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemperature = new float[patientsCount];
        for (int i = 0; i < patientsTemperature.length; i++) {
            float temperature = (float) Math.random() * ((40 - 32)) + 32;
            patientsTemperature[i] = temperature;
        }
        return patientsTemperature;
    }


    public static String getReport(float[] temperatureData) {
        String patientsTemperature = "";
        float averageTemperature = 0;
        int healthyCount = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            patientsTemperature += " " + FORMAT_1.format(temperatureData[i]);
            averageTemperature += temperatureData[i] / temperatureData.length;
            if (temperatureData[i] >= 36.2f && temperatureData[i] <= 36.9f) {
                healthyCount++;
            }
        }
        String report =
                "Температуры пациентов: " + patientsTemperature.trim() +
                        "\nСредняя температура: " + FORMAT_2.format(averageTemperature) +
                        "\nКоличество здоровых: " + healthyCount;
        return report;
    }
}
