package cn.design.pattern20160518DecoratorPattern;

public class UserDao implements Dao{

	@Override
	public void saveUser(String user) {
		System.out.println("保存用户基本信息：" + user);
	}

	@Override
	public void saveHeadImages(String[] images) {
		String imageInfo = "";
		int index = 1;
		for (String image : images) {
			if(index == 1){
				imageInfo += "index:"+ index + ""+ image;
			}else{
				imageInfo += "——index:"+ index + ""+ image;
			}
			index ++;
		}
		// ----->上面步骤打印辅助操作
		System.out.println("保存用户头像：" + imageInfo);
	}

	@Override
	public void saveAll(String user, String[] images) {
		this.saveUser(user);
		this.saveHeadImages(images);
	}

	
}
