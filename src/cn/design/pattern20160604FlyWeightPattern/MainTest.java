package cn.design.pattern20160604FlyWeightPattern;

public class MainTest {

	public static void main(String[] args) {
		String key = null;
		String subject = null;
		for(int i = 0; i < 2; i++){
			
			subject = "科目" + i;
			
			for(int j = 0; j < 2; j++){
				key = subject + "考试地点" + j;
				SignUpFactory.getExamRoomInfo(key);
			}
		}
		
		ExamRoom room = SignUpFactory.getExamRoomInfo("科目1考试地点0");
		System.out.println(room);
	}
}
