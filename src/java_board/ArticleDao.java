package java_board;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArticleDao {

	private ArrayList<Article> articles;
	private int no = 4;

	public ArticleDao() {
		articles = new ArrayList<>();
		Article a1 = new Article(1, "안녕하세요", "내용1", 1, Util.getCurrentDate(), 100, 30);
		Article a2 = new Article(2, "반갑습니다.", "내용2", 2, Util.getCurrentDate(), 30, 20);
		Article a3 = new Article(3, "안녕", "내용3", 3, Util.getCurrentDate(), 50, 40);

		insertArticle(a1);
		insertArticle(a2);
		insertArticle(a3);
		
//		for(int i = 1; i <= 50 ; i++) {
//			Article a4 = new Article();
//			a4.setId(i);
//			a4.setTitle("제목" + i);
//			a4.setBody("내용" + i);
//			a4.setMid(1);
//			
//			articles.add(a4);
//		}
	}
	
	public void writeJsonFile(JSONObject jobj) {
		try{
            //파일 객체 생성
			int id = (int)jobj.get("id");
			String filePath = "C:/test/article_"+ id + ".json";
			
			String jsonText = jobj.toString();
			
            File file = new File("C:test/article1.json");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            
            if(file.isFile() && file.canWrite()){
                //쓰기
                bufferedWriter.write(jsonText);                
                bufferedWriter.close();
            }
        }catch (IOException e) {
            System.out.println(e);
        }
	}
	
	public void readJsonFile(JSONObject jobj) {
		 String result = "";
	      try{
	            //파일 객체 생성
	            File file = new File("C:test/article1.json");
	            //입력 스트림 생성
	            FileReader filereader = new FileReader(file);
	            //입력 버퍼 생성
	            BufferedReader bufReader = new BufferedReader(filereader);
	            String line = "";
	            while((line = bufReader.readLine()) != null){
	                System.out.println(line);
	            }
	            //.readLine()은 끝에 개행문자를 읽지 않는다.            
	            bufReader.close();
	        }catch (FileNotFoundException e) {
	            // TODO: handle exception
	        }catch(IOException e){
	            System.out.println(e);
	        }
	      System.out.println("json 파일 읽기 완료");
	      System.out.println(result);
	      
	      JSONObject jobj = (JSONObject)JSONValue.parse();
	      
	      String title = (String)jobj.get("title");
	      String body = (String)jobj.get("bodty");
	      
	      System.out.println(title);
	      System.out.println(body);
	}
	
	public String articleToJsonFile(Article article) {
		
	      JSONObject obj = new JSONObject();
	      
	      obj.put("id", new Integer(article.getId()));
	      obj.put("title", article.getTitle());
	      obj.put("body", article.getBody());
	      obj.put("mid", article.getMid());
	      obj.put("hit", article.getHit());
	      obj.put("likeCnt", article.getLikeCnt());
	      obj.put("regDate", article.getRegDate());
	      
	      return obj;
	}

	public void insertArticle(Article a) {
		a.setId(no);
		no++;
		a.setRegDate(Util.getCurrentDate());

		JSONObject jobj = articleToJsonFile(a);
		writeJsonFile(jobj);
		//파일 저장
	}

	public void removeArticle(Article a) {
		articles.remove(a);
	}
	
	public ArrayList<Article> getSearchedArticlesByFlag(int flag, String keyword) {

		ArrayList<Article> searchedArticles = new ArrayList<>();

		for(int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
			String str = article.getPropertiesByFlag(flag);
			if (str.contains(keyword)) {
				searchedArticles.add(article);
			}	
		}

		return searchedArticles;

	}
	
	// Article 버전
	public Article getArticleById(int targetId) {
		for (int i = 0; i < articles.size(); i++) {
			int id = articles.get(i).getId();
			if (id == targetId) {
				return articles.get(i);
			}
		}

		return null;
	}
	
	public ArrayList<Article> getArticles() {
		return articles;
	}
}
