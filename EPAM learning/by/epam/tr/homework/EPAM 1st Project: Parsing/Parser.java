package by.epam.tr.main;

import by.epam.tr.main.model.Appliances;
import by.epam.tr.main.model.Coffeemachines;
import by.epam.tr.main.model.Fridges;
import by.epam.tr.main.model.Kettles;
import by.epam.tr.main.model.Microwaves;
import by.epam.tr.main.model.Stoves;
import by.epam.tr.main.model.TVs;
import by.epam.tr.main.model.Washingmachines;

//import by.epam.tr.main.model.People;
//import by.epam.tr.main.model.Root;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Appliances appliances = new Appliances();
		
		Document doc;
		try {
			doc = buildDocument();
		} catch(Exception e){
			System.out.println("Open parsing error " + e.toString());
			return;
		}
		
		Node applianceNode = doc.getFirstChild();
		
		NodeList applianceChilds = applianceNode.getChildNodes();
		
		Node microwavesNode = null;
		Node fridgesNode = null;
		Node coffeemachinesNode = null;
		Node stovesNode = null;
		Node TVsNode = null;
		Node kettlesNode = null;
		Node washingmachinesNode = null;
		
		for(int i = 0; i < applianceChilds.getLength(); i++) {
			if(applianceChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
		switch(applianceChilds.item(i).getNodeName()){
			case "microwaves":{
				microwavesNode = applianceChilds.item(i);
				break;
			}
			case "fridges":{
				fridgesNode = applianceChilds.item(i);
				break;
			}
			case "coffeemachines":{
				coffeemachinesNode = applianceChilds.item(i);
				break;
			}
			case "stoves":{
				stovesNode = applianceChilds.item(i);
				break;
			}
			case "TVs":{
				TVsNode = applianceChilds.item(i);
				break;
			}
			case "kettles":{
				kettlesNode = applianceChilds.item(i);
				break;
			}
			case "washingmachines":{
				washingmachinesNode = applianceChilds.item(i);
				break;
			}
	}	
		}
		
		if(microwavesNode == null) {
			System.out.println("tuporylaya programma");
			return;
		}
		
		List<Microwaves> microwavesList = new ArrayList<>();
		NodeList microwavesChilds = microwavesNode.getChildNodes();
		for(int y = 0; y < microwavesChilds.getLength(); y++) {
			
			if(microwavesChilds.item(y).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!microwavesChilds.item(y).getNodeName().equals("element")) {
				continue;
			}
			
			int power = 0;
			int volume = 0;
			String cameracover = "";
			String functionality = "";
			
			NodeList microwaveChilds = microwavesChilds.item(y).getChildNodes();
			for(int j = 0; j < microwaveChilds.getLength(); j++) {
				if(microwaveChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}
			
			switch(microwaveChilds.item(j).getNodeName()){
				case "cameracover":{
					cameracover = microwaveChilds.item(j).getTextContent();
					break;
				}
				case "functionality":{
					functionality = microwaveChilds.item(j).getTextContent();
					break;
				}
				case "power":{
					power = Integer.valueOf(microwaveChilds.item(j).getTextContent());
					break;
				}
				case "volume":{
					volume = Integer.valueOf(microwaveChilds.item(j).getTextContent());
					break;
				}
			}
		}
			Microwaves microwaves = new Microwaves(cameracover, functionality, power, volume);
			microwavesList.add(microwaves);
	}
		appliances.setMicrowaves(microwavesList);
		
		
		if(fridgesNode == null) {
			System.out.println("tuporylaya programma");
			return;
		}
		
		List<Fridges> fridgesList = new ArrayList<>();
		NodeList fridgesChilds = fridgesNode.getChildNodes();
		for(int y = 0; y < fridgesChilds.getLength(); y++) {
			
			if(fridgesChilds.item(y).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!fridgesChilds.item(y).getNodeName().equals("element")) {
				continue;
			}
			
			String energyconsumption = "";
			double height = 0.0;
			double width = 0.0;
			int depth = 0;
			int noiselevel = 0;
			
			NodeList fridgeChilds = fridgesChilds.item(y).getChildNodes();
			for(int j = 0; j < fridgeChilds.getLength(); j++) {
				if(fridgeChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}
			
			switch(fridgeChilds.item(j).getNodeName()){
				case "energyconsumption":{
					energyconsumption = fridgeChilds.item(j).getTextContent();
					break;
				}
				case "height":{
					height = Double.valueOf(fridgeChilds.item(j).getTextContent());
					break;
				}
				case "width":{
					width = Double.valueOf(fridgeChilds.item(j).getTextContent());
					break;
				}
				case "depth":{
					depth = Integer.valueOf(fridgeChilds.item(j).getTextContent());
					break;
				}
				case "noiselevel":{
					noiselevel = Integer.valueOf(fridgeChilds.item(j).getTextContent());
					break;
				}
			}
		}
			Fridges fridges = new Fridges(energyconsumption, height, width, depth, noiselevel);
			fridgesList.add(fridges);
	}
		appliances.setFridges(fridgesList);
		
		if(coffeemachinesNode == null) {
			System.out.println("tuporylaya programma");
			return;
		}
		
		List<Coffeemachines> coffeemachinesList = new ArrayList<>();
		NodeList coffeemachinesChilds = coffeemachinesNode.getChildNodes();
		for(int y = 0; y < fridgesChilds.getLength(); y++) {
			
			if(coffeemachinesChilds.item(y).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!coffeemachinesChilds.item(y).getNodeName().equals("element")) {
				continue;
			}
			
			String controltype = "";
			String cappuccino = "";
			String type = "";
			int power = 0;
			
			NodeList coffeemachineChilds = coffeemachinesChilds.item(y).getChildNodes();
			for(int j = 0; j < coffeemachineChilds.getLength(); j++) {
				if(coffeemachineChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}
				
			
			switch(coffeemachineChilds.item(j).getNodeName()){
				case "controltype":{
					controltype = coffeemachineChilds.item(j).getTextContent();
					break;
				}
				case "cappuccino":{
					cappuccino = coffeemachineChilds.item(j).getTextContent();
					break;
				}
				case "type":{
					type = coffeemachineChilds.item(j).getTextContent();
					break;
				}
				case "power":{
					power = Integer.valueOf(coffeemachineChilds.item(j).getTextContent());
					break;
				}
			}
		}
			Coffeemachines coffeemachines = new Coffeemachines(controltype, cappuccino, type, power);
			coffeemachinesList.add(coffeemachines);
	}
		appliances.setCoffeemachines(coffeemachinesList);
		
		if(stovesNode == null) {
			System.out.println("tuporylaya programma");
			return;
		}
		
		List<Stoves> stovesList = new ArrayList<>();
		NodeList stovesChilds = stovesNode.getChildNodes();
		for(int y = 0; y < stovesChilds.getLength(); y++) {
			
			if(stovesChilds.item(y).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!stovesChilds.item(y).getNodeName().equals("element")) {
				continue;
			}
			
			String type = "";
			String cleaning = "";
			int burners = 0;
			int volume = 0;
			
			NodeList stoveChilds = stovesChilds.item(y).getChildNodes();
			for(int j = 0; j < stoveChilds.getLength(); j++) {
				if(stoveChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}
				
			
			switch(stoveChilds.item(j).getNodeName()){
				case "type":{
					type = stoveChilds.item(j).getTextContent();
					break;
				}
				case "cleaning":{
					cleaning = stoveChilds.item(j).getTextContent();
					break;
				}
				case "burners":{
					burners = Integer.valueOf(stoveChilds.item(j).getTextContent());
					break;
				}
				case "volume":{
					volume = Integer.valueOf(stoveChilds.item(j).getTextContent());
					break;
				}
			}
		}
			Stoves coffeemachines = new Stoves(type, cleaning, burners, volume);
			stovesList.add(coffeemachines);
	}
		appliances.setStoves(stovesList);
		
		if(TVsNode == null) {
			System.out.println("tuporylaya programma");
			return;
		}
		
		List<TVs> TVsList = new ArrayList<>();
		NodeList TVsChilds = TVsNode.getChildNodes();
		for(int y = 0; y < stovesChilds.getLength(); y++) {
			
			if(TVsChilds.item(y).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!TVsChilds.item(y).getNodeName().equals("element")) {
				continue;
			}
			
			String screentype = "";
			String OS = "";
			int diagonal = 0;
			
			NodeList TVChilds = TVsChilds.item(y).getChildNodes();
			for(int j = 0; j < TVChilds.getLength(); j++) {
				if(TVChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}
				
			
			switch(TVChilds.item(j).getNodeName()){
				case "screentype":{
					screentype = TVChilds.item(j).getTextContent();
					break;
				}
				case "OS":{
					OS = TVChilds.item(j).getTextContent();
					break;
				}
				case "diagonal":{
					diagonal = Integer.valueOf(TVChilds.item(j).getTextContent());
					break;
				}
			}
		}
			TVs television = new TVs(screentype, OS, diagonal);
			TVsList.add(television);
	}
		appliances.setTVs(TVsList);
		
		if(kettlesNode == null) {
			System.out.println("tuporylaya programma");
			return;
		}
		
		List<Kettles> kettlesList = new ArrayList<>();
		NodeList kettlesChilds = kettlesNode.getChildNodes();
		for(int y = 0; y < kettlesChilds.getLength(); y++) {
			
			if(kettlesChilds.item(y).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!kettlesChilds.item(y).getNodeName().equals("element")) {
				continue;
			}
			
			int volume = 0;
			int power = 0;
			String material = "";
			
			NodeList kettleChilds = kettlesChilds.item(y).getChildNodes();
			for(int j = 0; j < kettleChilds.getLength(); j++) {
				if(kettleChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}
				
			
			switch(kettleChilds.item(j).getNodeName()){
				case "volume":{
					volume = Integer.valueOf(kettleChilds.item(j).getTextContent());
					break;
				}
				case "power":{
					power = Integer.valueOf(kettleChilds.item(j).getTextContent());
					break;
				}
				case "material":{
					material = kettleChilds.item(j).getTextContent();
					break;
				}
			}
		}
			Kettles kettles = new Kettles(volume, power, material);
			kettlesList.add(kettles);
	}
		appliances.setKettles(kettlesList);
		
		if(washingmachinesNode == null) {
			System.out.println("tuporylaya programma");
			return;
		}
		
		List<Washingmachines> washingmachinesList = new ArrayList<>();
		NodeList washingmachinesChilds = washingmachinesNode.getChildNodes();
		for(int y = 0; y < washingmachinesChilds.getLength(); y++) {
			
			if(washingmachinesChilds.item(y).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			if(!washingmachinesChilds.item(y).getNodeName().equals("element")) {
				continue;
			}
			
			String loadtype = "";
			String installationtype = "";
			double depth = 0.0;
			
			NodeList washingmachineChilds = washingmachinesChilds.item(y).getChildNodes();
			for(int j = 0; j < washingmachineChilds.getLength(); j++) {
				if(washingmachineChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}
				
			
			switch(washingmachineChilds.item(j).getNodeName()){
				case "loadtype":{
					loadtype = washingmachineChilds.item(j).getTextContent();
					break;
				}
				case "installationtype":{
					installationtype = washingmachineChilds.item(j).getTextContent();
					break;
				}
				case "depth":{
					depth = Double.valueOf(washingmachineChilds.item(j).getTextContent());
					break;
				}
			}
		}
			Washingmachines washingmachines = new Washingmachines(loadtype, installationtype, depth);
			washingmachinesList.add(washingmachines);
	}
		appliances.setWashingmachines(washingmachinesList);
		
		System.out.println(appliances.toString());
}
		
	private static Document buildDocument() throws Exception {
		File file = new File("XML for project1.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			return dbf.newDocumentBuilder().parse(file);
		}
	}
