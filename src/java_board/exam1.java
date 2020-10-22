package java_board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class exam1 {

		static ArrayList<Article> articles;

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			String datestr = sdf.format(cal.getTime());
			
			articles = new ArrayList<>();
			Article a1 = new Article(1, "제목1", "내용1", "익명",datestr, 30);
			Article a2 = new Article(2, "제목2", "내용2","익명",datestr, 20);
			Article a3 = new Article(3, "제목3", "내용3","익명",datestr, 10);

			articles.add(a1);
			articles.add(a2);
			articles.add(a3);

			int no = 4;

			while (true) {
				System.out.print("명령어 입력 : ");
				String cmd = sc.next();
				if (cmd.equals("exit")) {
					System.out.println("종료");
					break;
				}
				if (cmd.equals("add")) {
				
					Article a = new Article();

					a.setId(no);
					no++;
					
					System.out.println("게시물 제목을 입력해주세요 :");
					String title = sc.next();
					a.setTitle(title);
					
					System.out.println("게시물 내용을 입력해주세요 :");
					String body = sc.next();
					a.setBody(body);
					
					System.out.println("게시물 작성자을 입력해주세요 :");
					String name = sc.next();
					a.setName(name);
					
					a.setDatestr(datestr);
					
					articles.add(a);
					System.out.println("게시물이 등록되었습니다.");

				}
				if (cmd.equals("list")) {
					for (int i = 0; i < articles.size(); i++) {
						Article article = articles.get(i);
						System.out.println("번호 : " + article.getId());
						System.out.println("제목 : " + article.getTitle());
						System.out.println("작성자 :" + article.getName());
						System.out.println("등록날짜 :" + article.getDatestr());
						System.out.println("조회수 :" + article.getViews());
						System.out.println("===================");
					}

				}
				if (cmd.equals("update")) {

	// index 버전
//					System.out.println("수정할 게시물 선택 : ");
//					int targetId = sc.nextInt();
//					if (targetId == -1) {
//						System.out.println("없는 게시물입니다.");
//					} else {
//						System.out.println("게시물 제목을 입력해주세요 :");
//						String newTitle = sc.next();
	//
//						System.out.println("게시물 내용을 입력해주세요 :");
//						String newBody = sc.next();
	//
//						Article newArticle = new Article();
//						newArticle.setId(targetId);
//						newArticle.setTitle(newTitle);
//						newArticle.setBody(newBody);
	//
//						articles.set(targetId, newArticle);
//						break;
//					}
					
					System.out.println("수정할 게시물 선택 : ");
					int targetId = sc.nextInt();
					Article target = getArticleById(targetId);
					if (target == null) {
						System.out.println("없는 게시물입니다.");
					} else {
						System.out.println("게시물 제목을 입력해주세요 :");
						String newTitle = sc.next();

						System.out.println("게시물 내용을 입력해주세요 :");
						String newBody = sc.next();

						target.setTitle(newTitle);
						target.setBody(newBody);

//						if (id == targetId) {
//							System.out.println("게시물 제목을 입력해주세요 :");
//							String newTitle = sc.next();
//
//							System.out.println("게시물 내용을 입력해주세요 :");
//							String newBody = sc.next();
//
//							Article newArticle = new Article();
//							newArticle.setId(id);
//							newArticle.setTitle(newTitle);
//							newArticle.setBody(newBody);
//
//							articles.set(i, newArticle);
//							break;
//						}
						break;
					}
				}
				if (cmd.equals("delete")) {
					System.out.println("삭제할 게시물 선택 : ");
					int targetId = sc.nextInt();
//					int existFlag = 2;// 1. 있음 2. 없음
//
//					for (int i = 0; i < articles.size(); i++) {
//						int id = articles.get(i).getId();
//						if (id == targetId) {
//							existFlag = 1;
//							articles.remove(i);
//							break;
//						} 
					Article target = getArticleById(targetId);
					if (target == null) {
						System.out.println("게시물이 존재하지 않습니다.");
					} else {
						articles.remove(target);
					}				
				}
				if (cmd.equals("read")) {
					System.out.println("상세보기할 게시물 선택 : ");
					int targetId = sc.nextInt();
					Article target = getArticleById(targetId);
					if (target == null) {
						System.out.println("게시물이 존재하지 않습니다.");
					} else {				
						System.out.println("==== " + target.getId() + " ====");
						System.out.println("번호 : " + target.getId());
						System.out.println("제목 : " + target.getTitle());
						System.out.println("내용 : " + target.getBody());
						System.out.println("작성자 :" + target.getName());
						System.out.println("등록날짜 :" + target.getDatestr());
						System.out.println("조회수 :" + target.getViews());
						System.out.println("===============");
					}
				}
			}
		}
//		// index 버전
//		private static int getArticleIndexById(int targetId) {
//			for (int i = 0; i < articles.size(); i++) {
//				int id = articles.get(i).getId();
//				if (id == targetId) {
//					return i;
//				}
//			}
//
//			return -1;
//		}

		// Article 버전
		private static Article getArticleById(int targetId) {
			for (int i = 0; i < articles.size(); i++) {
				int id = articles.get(i).getId();
				if (id == targetId) {
					return articles.get(i);
				}
			}

			return null;
		}
	}
