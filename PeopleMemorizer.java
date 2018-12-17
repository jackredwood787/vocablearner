package com.cbestc.util.others.memorytrainer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PeopleMemorizer {
	public static void main(String[] args) {
		doTrain();
	}
	
	private static void doTrain() {
		String[] localCNStars = localCNs.split("，");
		System.out.println("localCNStars.length = " + localCNStars.length);
		for (int i = 0; i < localCNStars.length; i++) {
			localCNStars[i] = localCNStars[i].trim();
		}
		
		List<String> allStars = new LinkedList<String>();
		for (String star : localCNStars) {
			allStars.add(star);
		}
		for (String star : foreignStars) {
			allStars.add(star);
		}
		
		Random rand = new Random();
		for (int i = 0; i < 32; i++) {
			String starName = allStars.get(rand.nextInt(allStars.size()));
			if (i % 8 == 0) {
				System.out.println();
			}
			System.out.print(starName + "      ");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static String[] foreignStars = new String[] {
			"Anne Hathaway", "Arian Brody", "Angelina Jolie", "Arnold Schwarzenegger", "Ariyon Bakare", "Annabelle Wallis", "Al Pacino", "Aaron Eckhart", "Anthony Hopkins", 
			"Adam Sandler", "Alec Baldwin", "Amy Adams", "Alicia Vikander", "Audrey Hepburn", 
			"Benedict Wong", "Barbara Streisand", "Ben Affleck", "Brian Cox", "Bill Pullman", "Bradley Cooper", "Brad Pitt", "Blake Lively", "Bruce Willis", 
			"Benecio Del Toro", "Ben Stiller", "Bridget Moynahan",
			"Christian Bane", "Catherine Keener", "Cilian Murphy", "Charlize Theron", "Courteney Fox", "Colin Salmon", "Chris Pine", "Carrie Ann Moss", "Clint Eastwood", 
			"Colin Firth", "Cate Blanchett", "Catherine Zeta-Jones", "Chris Pratt", "Colin Farrell", "Cameron Diaz", "Carey Mulligan", 
			"David Arquette", "Drew Barrymore", "Daisy Ridley", "Dustin Hoffman", "Daniel Dae Kim", "Daniel Radcliffe", "Dominic Monaghan", "Diane Kruger", "Demi Moore", 
			"Don Cheadle", "Dwayne Johnson", "Denzel Washington", "Daniel Crag", 
			"Ed Harris", "Elizabeth Banks", "Evan Rachel Wood", "Emma Watson", "Ellen Page", "Evan McGregor", "Eric Bana", "Emma Stone", "Evangeline Lilly", "Edward Norton", 
			"Elisha Cuthbert", "Emily Blunt", "Eva Green", 
			"Gary Oldman", "Gabrielle Anwar", "Gwyneth Paltrow", "Gal Gadot", "Gerard Butler", "Giovanni Ribisi", "George Clooney", 
			"Hiroyuki Sanada", "Hugo Weaving", "Hugh Jackman", "Harrison Ford", "Hilary Swank", "Heath Ledger", "Henry Ian Cusick", "Halle Berry", "Hugh Grant", 
			"Idris Elba", "Ian Holm", 
			"Jessica Chastain", "James Franco", "Jessica Alba", "Judy Foster", "Julia Roberts", "Josh Hartnett", "Jeff Daniels", "James Marsden", "Jeffrey Wright", "Judy Law", 
			"Jennifer Garner", "Joseph Gordon-Levitt", "Jonah Hill", "Jennifer Aniston", "Jake Gyllenhaal", "James Gandolfini", "John Krasinski", "Jorge Garcia", "Josh Holloway", 
			"James Cameron", "Jimmi Simpson", "Jack Nicholson", "Josh Brolin", "Jennifer Lawrence", "Jennifer Connelly", "Jeremy Renner", "Jonathan Rhys Meyers", "Jason Statham", 
			"John Travolta", "Judi Dench", "Julianne Moore", 
			"Kate Winslet", "Ken Watanabe", "Kristen Bell", "Katie Holmes", "Keanu Reeves", "Kiefer Sutherland", "Kevin Bacon", "Kristen Wilg", "Kate Mara", "Kate Beckinsale", 
			"Keira Knightly", "Kevin Costner", "Kristen Stewart", "Kurt Russell", "Kevin Spacey", 
			"Leonardo Dicaprio", "Liam Neeson", "Laurence Fishburne", 
			"Matthew McConaughey", "Michael Cain", "Matt Damon", "Maggie Gyllenhaal", "Morgan Freeman", "Marion Cotillard", "Milla Jovovich", "Michael Fassbender", 
			"Michelle Rodriguez", "Mireille Enos", "Matthew Fox", "Maggie Grace", "Michael Emerson", "Mark Wahlberg", "Meg Ryan", "Mackenzie Davis", "Mila Kunis", 
			"Mark Ruffalo", "Mel Gibson", "Martin Freeman", "Maggie Q", "Meryl Streep", 
			"Neve Campbell", "Naomi Watts", "Nicolas Cage", "Naveen Andrews", "Natalie Portman", "Natalie Dormer", "Natasha Liu Bordizzo",
			"Paul Rodd", "Patrick Wilson", "Pierce Brosnan", "Philip Seymour Hoffman", "Paul Bettany", "Peter Dinklage", "Penelope Cruz", 
			"Romany Malco", "Rachel McAdams", "Rose Byrne", "Ryan Reynolds", "Ridley Scott", "Rebecca Hall", "Robin Williams", "Russel Crowe", "Robert Downey Jr", 
			"Rebecca Ferguson", "Rachel Weisz", "Ryan Gosling", "Robert De Niro", "Reese Witherspoon", "Richard Gere", 
			"Sarah Michell Gellar", "Sarah Jessica Parker", "Seth Rogen", "Steve Carell", "Sam Neil", "Sigourney Weaver", "Scarlett Johansson", "Shia LaBeouf", 
			"Steven Spielberg", "Samuel L.Jackson", "Sean Bean", "Sam Rockwell", "Sylvester Stallone", 
			"Tom Cruise", "Tom Hardy", "Teresa Palmer", "Terry O Quinn", "Tom Hanks", 
			"Uma Thurman",
			"Vera Farmiga", "Vin Diesel", 
			"Willa Fitzgerald", "William Fichtner", "Woody Harrelson", "Winona Ryder", "Will Smith", 
			"Zach Efron", "Zachary Quinto"
	};
	
	private static String localCNs =
			"安以轩，" + 
			"白百何，鲍国安，八两金，" + 
			"蔡国庆，蔡康永，蔡明，曹颖，车晓，池华琼，" + 
			"陈思成，陈佩斯，陈凯歌，陈晓东，陈意涵，陈冲，陈冠希，陈慧琳，陈羽凡，陈数，陈好，陈豪，陈百祥，陈瑾，陈紫函，陈宝国，陈道明，陈赫，陈坤，陈法蓉，陈汉典，" + 
			"陈宝莲，陈伟霆，陈锦鸿，陈乔恩，陈百强，陈奕迅，陈红，陈小艺，陈小春，陈柏霖，陈晓旭，蔡卓妍，成龙，成方圆，成奎安，崔永元，崔健，蔡少芬，程煜，" + 
			"邓超，窦文涛，杜鹃，杜淳，大鹏，迪丽热巴，董卿，董洁，董勇，杜海涛，杜雨露，杜汶泽，杜源，狄龙，丁勇岱，丁海峰，丁嘉丽，丁志诚，段奕宏，窦骁，" + 
			"范晓萱，范伟，范明，费翔，范文芳，冯巩，冯小刚，冯远征，傅晓田，傅艺伟，范冰冰，樊少皇，方中信，方青卓，傅彪，" + 
			"郭富城，郭京飞，郭德纲，郭冬临，郭晋安，郭蔼明，郭晓冬，郭可盈，巩俐，巩汉林，古月，古天乐，古巨基，古力娜扎，桂纶镁，高露，高虎，高圆圆，高仓健，高明，葛优，耿乐，归亚蕾，谷德昭，" + 
			"葛文辉，关咏荷，关秀媚，关之琳，甘婷婷，" + 
			"胡海泉，胡军，胡可，黄海波，胡歌，胡慧中，惠英红，何赛飞，何润东，何家劲，何炅，何冰，何琳，何晴，何勇，侯耀华，海清，韩雨芹，" + 
			"黄磊，黄轩，黄志忠，黄宏，黄渤，黄秋生，黄日华，黄圣依，黄子韬，黄沾，黄一山，黄晓明，韩雪，韩童生，韩磊，洪金宝，霍建华，郝蕾，华子，华少，" + 
			"金城武，金钟国，金泰熙，金喜善，金士杰，金巧巧，景甜，井柏然，井冈山，蒋梦婕，蒋勤勤，姜文，姜武，蒋雯丽，蒋欣，江珊，江一燕，江疏影，焦恩俊，贾静雯，焦晃，靳东，" + 
			"寇振海，柯蓝，孔琳，" + 
			"李沁，李冰冰，李嘉欣，李丽珍，李修贤，李子雄，李立群，李若彤，李乃文，李小璐，李明启，李孝利，李琦，李敖，李强，李幼斌，李宗翰，李连杰，李易峰，李成儒，李力持，李思思，李克勤，李雪健，李亚鹏，李小冉，" + 
			"梁朝伟，梁咏琪，梁博，梁天，梁静，梁家辉，吕中，吕良伟，廖凡，罗海琼，雷佳音，黎耀祥，吕颂贤，李光洁，廖京生，李晓峰，陆毅，卢靖姗，" + 
			"林家栋，林熙蕾，林依晨，林心如，林永健，林更新，林允儿，林忆莲，林雪，林子祥，林嘉欣，林志玲，林青霞，林志颖，凌潇肃，吕丽萍，吕齐，" + 
			"刘雪华，刘诗诗，刘金山，刘莉莉，刘青云，刘涛，刘敏涛，刘恺威，刘德华，刘蓓，刘亦菲，刘欢，刘烨，刘孜，刘威，刘嘉玲，刘斌，刘佩琦，利智，黎明，罗嘉良，罗家英，" + 
			"莫文蔚，莫少聪，买红妹，梅婷，梅艳芳，马景涛，马伊利，马未都，马蓉，马苏，马德钟，马少骅，明道，毛舜筠，苗侨伟，苗苗，莫小棋，米雪，蒙嘉慧，孟广美，" + 
			"那英，牛莉，牛萌萌，宁静，聂远，倪大红，" + 
			"欧阳震华，" + 
			"潘长江，潘虹，濮存昕，" + 
			"秦岚，秦沛，秦海璐，齐秦，邱淑贞，千叶真一，瞿颖，戚薇，" + 
			"阮经天，任贤齐，任达华，任重，" + 
			"宋祖德，宋祖英，宋佳，宋丹丹，宋春丽，松岛菜菜子，邵兵，孙淳，孙涛，孙楠，孙海英，孙俪，孙红雷，孙宁，沈佳妮，史可，邵美琪，苏有朋，萨日娜，沙溢，申军谊，佘诗曼，斯琴高娃，" + 
			"谭晶，谭咏麟，佟大为，佟丽娅，唐嫣，唐杰忠，唐一菲，陶大宇，陶虹，田海蓉，陶泽如，陶红，童蕾，童正维，" + 
			"王家卫，王晶，王丽坤，王鸥，王菲，王祖贤，王志飞，王敏德，王志文，王宝强，巍子，王学圻，王庆祥，王耀庆，王刚，王艳，王思懿，王奎荣，王学兵，王千源，王珞丹，王祖蓝，" + 
			"汪明荃，文章，文兴宇，汪涵，万绮雯，万茜，巫刚，温碧霞，翁虹，邬君梅，王雅捷，王姬，王子文，吴若浦，吴毅将，吴倩莲，王劲松，王冰，王黎雯，魏大勋，王黎雯，" + 
			"吴孟达，吴刚，吴京，吴镇宇，吴彦祖，吴大维，吴君如，吴奇隆，吴亦凡，吴越，吴卓羲，吴秀波，伍咏薇，午马，伍宇娟，" + 
			"萱萱，辛芷蕾，辛柏青，夏雨，谢娜，谢霆锋，萧蔷，萧敬腾，徐少华，徐少强，徐静蕾，奚美娟，" + 
			"于荣光，于谦，于和伟，于娜，余少群，余文乐，元彪，元华，杨紫琼，杨童舒，杨子，杨采妮，杨恭如，杨立新，杨立青，杨采钰，杨新鸣，杨颖，杨幂，杨怡，杨洋，叶子楣，印小天，伊一，伊能静，殷桃，颜仟汶，袁弘，" + 
			"英达，袁立，袁泉，徐帆，徐子珊，徐若瑄，徐克，徐峥，徐锡锑，徐熙媛，徐锦江，熊黛林，许亚军，闫妮，叶德娴，姚笛，姚晨，姚芊羽，叶童，袁咏仪，游本昌，俞飞鸿，严晓频，于月仙，" + 
			"张卫健，张学友，张俪，张国荣，张国立，张曼玉，张歆艺，张嘉译，张家辉，张瞳，张静初，张柏芝，张敏，张艺谋，张耀扬，张一山，张凯丽，张智霖，张耀扬，张天爱，张铁林，张艾嘉，张芷溪，张震岳，张丰毅，张震，张涵予，张钧甯，" + 
			"朱丹，朱琳，朱茵，朱时茂，朱雨辰，周立波，周迅，周一围，周慧敏，周星驰，周海媚，周润发，周杰伦，周冬雨，周杰，曾华倩，曾志伟，曾江，左小青，邹兆龙，张榕容，甄志丹，甄妮，祖峰，左翎，赵立新，张丰毅，张铎，" + 
			"郑中基，郑少秋，郑凯，郑裕玲，郑佩佩，郑爽，郑秀文，郑则仕，郑少秋，郑伊健，章子怡，赵凯丽，赵文瑄，赵本山，赵亮，赵薇，赵文卓，赵子琪，赵丽颖，钟欣桐，钟楚红，钟镇涛，钟汉良，钟丽缇，曾黎，钟楚曦";
	
	
}
