package cn.design.pattern20160604FlyWeightPattern;

public class ExamRoom {

	private String roomId;
	
	private String location;
	
	private String subject;

	// 类的标识
	private String key;
	
	public ExamRoom(String key) {
		super();
		this.key = key;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "ExamRoom [roomId=" + roomId + ", location=" + location
				+ ", subject=" + subject + ", key=" + key + "]";
	}
	
}
