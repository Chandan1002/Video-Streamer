package chandan.visualization.topic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	private List<Topic> topics = new ArrayList<>(Arrays.asList(

			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Spring1", "Spring Frameworks", "Spring Framework Descriptions"),
			new Topic("Spring2", "Spring Framework2", "Spring Framework Description2")));

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		// return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);

	}

	public void deleteTopic(String id) {
		// topics.removeIf(t ->t.getId().equals(id));
		topicRepository.deleteById(id);
	}

	@SuppressWarnings("resource")
	public String getTopicIframe(String id) throws FileNotFoundException, UnsupportedEncodingException {

		 //PrintWriter writer = new PrintWriter("/Users/ChandanKumar/Desktop/log.txt", "UTF-8");
		PrintWriter writer = new PrintWriter("/home/nvidia/Desktop/log.txt", "UTF-8");
		writer.println("Debug start File Read");

		//File file = new File("/Users/ChandanKumar/Desktop/CameraDisplaySystem.txt");
		File file = new File("/home/nvidia/Desktop/CameraDisplaySystem.txt");
		if (file.length() > 0) {
			writer.println("File Length:" + file.length());
			writer.println("**********************************");
			writer.println("");
			writer.println("");
			
		}

		Scanner sc = new Scanner(file);

		while (sc.hasNextLine())

		{
			String temp = sc.nextLine();
			writer.println(temp);
			String deviceId = temp.substring(76,78);
			String camId = temp.substring(79,87);
			writer.println("");
			writer.println("");
			writer.println("Device Name:" + id + "      CAN_DeviceId:" + deviceId + "      Camera ID:" + camId);
			writer.println("");
			writer.println("");
			
			if(id.equals("ipad1") && deviceId.equals("01")) {
				if(camId.equals("01 00 00")) {
					writer.close();
					return "1";
					
				}
				if(camId.equals("04 00 00")) {
					writer.close();
					return "2";
				}
				if(camId.equals("10 00 00")) {
					writer.close();
					return "3";
				}
				if(camId.equals("40 00 00")) {
					writer.close();
					return "4";
				}
				if(camId.equals("00 01 00")) {
					writer.close();
					return "5";
				}
				if(camId.equals("00 04 00")) {
					writer.close();
					return "6";
				}
				if(camId.equals("00 10 00")) {
					writer.close();
					return "7";
				}
				if(camId.equals("00 40 00")) {
					writer.close();
					return "8";
				}
				if(camId.equals("00 00 01")) {
					writer.close();
					return "9";
				}
				if(camId.equals("00 00 04")) {
					writer.close();
					return "10";
				}
				if(camId.equals("00 00 10")) {
					writer.close();
					return "11";
				}
			}
			
			if(id.equals("ipad2") && deviceId.equals("02")) {
				if(camId.equals("01 00 00")) {
					writer.close();
					return "1";
					
				}
				if(camId.equals("04 00 00")) {
					writer.close();
					return "2";
				}
				if(camId.equals("10 00 00")) {
					writer.close();
					return "3";
				}
				if(camId.equals("40 00 00")) {
					writer.close();
					return "4";
				}
				if(camId.equals("00 01 00")) {
					writer.close();
					return "5";
				}
				if(camId.equals("00 04 00")) {
					writer.close();
					return "6";
				}
				if(camId.equals("00 10 00")) {
					writer.close();
					return "7";
				}
				if(camId.equals("00 40 00")) {
					writer.close();
					return "8";
				}
				if(camId.equals("00 00 01")) {
					writer.close();
					return "9";
				}
				if(camId.equals("00 00 04")) {
					writer.close();
					return "10";
				}
				if(camId.equals("00 00 10")) {
					writer.close();
					return "11";
				}
			}
			
			if(id.equals("ipad3") && deviceId.equals("03")) {
				if(camId.equals("01 00 00")) {
					writer.close();
					return "1";
					
				}
				if(camId.equals("04 00 00")) {
					writer.close();
					return "2";
				}
				if(camId.equals("10 00 00")) {
					writer.close();
					return "3";
				}
				if(camId.equals("40 00 00")) {
					writer.close();
					return "4";
				}
				if(camId.equals("00 01 00")) {
					writer.close();
					return "5";
				}
				if(camId.equals("00 04 00")) {
					writer.close();
					return "6";
				}
				if(camId.equals("00 10 00")) {
					writer.close();
					return "7";
				}
				if(camId.equals("00 40 00")) {
					writer.close();
					return "8";
				}
				if(camId.equals("00 00 01")) {
					writer.close();
					return "9";
				}
				if(camId.equals("00 00 04")) {
					writer.close();
					return "10";
				}
				if(camId.equals("00 00 10")) {
					writer.close();
					return "11";
				}
			}
			
			if(id.equals("ipad4") && deviceId.equals("04")) {
				if(camId.equals("01 00 00")) {
					writer.close();
					return "1";
					
				}
				if(camId.equals("04 00 00")) {
					writer.close();
					return "2";
				}
				if(camId.equals("10 00 00")) {
					writer.close();
					return "3";
				}
				if(camId.equals("40 00 00")) {
					writer.close();
					return "4";
				}
				if(camId.equals("00 01 00")) {
					writer.close();
					return "5";
				}
				if(camId.equals("00 04 00")) {
					writer.close();
					return "6";
				}
				if(camId.equals("00 10 00")) {
					writer.close();
					return "7";
				}
				if(camId.equals("00 40 00")) {
					writer.close();
					return "8";
				}
				if(camId.equals("00 00 01")) {
					writer.close();
					return "9";
				}
				if(camId.equals("00 00 04")) {
					writer.close();
					return "10";
				}
				if(camId.equals("00 00 10")) {
					writer.close();
					return "11";
				}
			}
			
		}

		writer.close();
		return "false";
	}

}
