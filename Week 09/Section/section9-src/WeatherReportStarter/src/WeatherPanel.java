import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Displays weather information for a particular city
 */
public class WeatherPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	// The sub-components of this panel
	private JLabel title;
	private JLabel cityTimeLabel;
	private Thermometer thermometer;
	private WeatherIcon weatherIcon;

	/**
	 * Constructs a WeatherPanel
	 */
	public WeatherPanel() {

		// TODO: Set up the sub-components of this panel
		// For now, we will create a JLabel to stand-in for this component
		JLabel replaceMe = new JLabel("WeatherPanel Goes Here");
		replaceMe.setPreferredSize(new Dimension(250, 150));
		this.add(replaceMe);
		
	}

	/**
	 * Displays the weather information for a particular city
	 * 
	 * @param city
	 *            the name of the city to display
	 * @param model
	 *            the model to use when fetching weather information
	 */
	public void displayCity(String city, WeatherReportModel model) {
		// TODO: Implement this method
	}
}
