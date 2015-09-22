/**
 * 
 */
package session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/**
 * @author Anjita
 *
 */
public class VehicalParsing {
	static final String ROW = "row";
	static final String TYPE = "type";
	static final String ID = "id";
	static final String MAKE = "make";
	static final String MODEL = "model";
	static final String ENGINEINCC = "engineInCC";
	static final String FUELCAPACITY = "fuelCapacity";
	static final String MILAGE = "milage";
	static final String PRICE = "price";
	static final String ROADTAX = "roadTax";
	static final String CREATEDBY = "createdBy";
	static final String CREATEDTIME = "createdTime";
	static final String AC = "AC";
	static final String POWERSTEERING = "powerSteering";
	static final String ACCESSORYKIT = "accessoryKit";
	static final String SELFSTART = "selfStart";
	static final String HELMETPRICE = "helmetPrice";

	public List<Vehicle> readConfig(String configFile) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		try {
			// First, create a new XMLInputFactory
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			// Setup a new eventReader
			InputStream in = new FileInputStream(configFile);
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
			// read the XML document
			Vehicle vehicle = null;

			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();

				if (event.isStartElement()) {
					StartElement startElement = event.asStartElement();
					// If we have an item element, we create a new item
					if (startElement.getName().getLocalPart() == (ROW)) {
						// We read the attributes from this tag and add the date
						// attribute to our object
						Iterator<Attribute> attributes = startElement
								.getAttributes();
						while (attributes.hasNext()) {
							Attribute attribute = attributes.next();
							if (attribute.getName().toString().equals(TYPE)) {
								if(attribute.getValue().equalsIgnoreCase("car")){
									vehicle = new Car();
								}
								else if(attribute.getValue().equalsIgnoreCase("bike")){
									vehicle = new Bike();
								}
							}

						}
					}

					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(ID)) {
							event = eventReader.nextEvent();
							vehicle.setId(Integer.parseInt(event.asCharacters().getData()));
							continue;
						}
					}
					if (event.asStartElement().getName().getLocalPart()
							.equals(MAKE)) {
						event = eventReader.nextEvent();
						vehicle.setMake(event.asCharacters().getData());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(MODEL)) {
						event = eventReader.nextEvent();
						vehicle.setModel(event.asCharacters().getData());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(ENGINEINCC)) {
						event = eventReader.nextEvent();
						vehicle.setEngineInCC(Integer.parseInt(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equals(FUELCAPACITY)) {
						event = eventReader.nextEvent();
						vehicle.setFuelCapacity(Integer.parseInt(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equals(MILAGE)) {
						event = eventReader.nextEvent();
						vehicle.setMilage(Integer.parseInt(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equals(PRICE)) {
						event = eventReader.nextEvent();
						vehicle.setPrice(Integer.parseInt(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equals(ROADTAX)) {
						event = eventReader.nextEvent();
						vehicle.setRoadTax(Integer.parseInt(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equals(CREATEDBY)) {
						event = eventReader.nextEvent();
						vehicle.setCreatedBy(event.asCharacters().getData());
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equals(CREATEDTIME)) {
						event = eventReader.nextEvent();
						vehicle.setCreatedTime(event.asCharacters().getData());
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equals(AC)) {
						event = eventReader.nextEvent();
						((Car)vehicle).setAC(Boolean.parseBoolean(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equals(POWERSTEERING)) {
						event = eventReader.nextEvent();
						((Car)vehicle).setPowerSteering(Boolean.parseBoolean(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equals(ACCESSORYKIT)) {
						event = eventReader.nextEvent();
						((Car)vehicle).setAccessoryKit(event.asCharacters().getData());
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equals(SELFSTART)) {
						event = eventReader.nextEvent();
						((Bike)vehicle).setSelfStart(Boolean.parseBoolean(event.asCharacters().getData()));
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart()
							.equals(HELMETPRICE)) {
						event = eventReader.nextEvent();
						((Bike)vehicle).setHelmetPrice(Double.parseDouble(event.asCharacters().getData()));
						continue;
					}
					
				}
				// If we reach the end of an item element, we add it to the list
				if (event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					if (endElement.getName().getLocalPart() == (ROW)) {
						vehicles.add(vehicle);
					}
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		return vehicles;
	}
}
