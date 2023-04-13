package src;

import java.util.Comparator;
import java.util.Scanner;

class SimpleObjectInt {
	static final int NO		= 1; // 번호를 읽어 들일까요?

	private String no;		// 회원번호

	// --- 문자열 표현을 반환 ---//
	public int getNo() {
		return Integer.parseInt(no);
	}

	// --- 데이터를 읽어 들임 ---//
	void scanData(String guide, int sw) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println(guide + "할 데이터를 입력하세요."+ sw);

		if ((sw & NO) == NO) { //& 는 bit 연산자임 
			System.out.print("번호: ");
			no = Integer.toString(stdIn.nextInt());
		}
	}
}


class Node {
	SimpleObjectInt data;
	Node link;
	
	public Node(SimpleObjectInt element) {
		this.data = element;
		this.link = null;
	}
}


class LinkedListInt {
	Node first;
	int size;
	public LinkedListInt() {
		first	= null;
		size	= 0;
	}
	
	public void Delete(SimpleObjectInt data) { //delete List's head Node
		Node p = first;
		Node q = first;
		while(p != null) {
			if(data.getNo() == p.data.getNo()) {
				if(p == first) {
					first = p.link;
					return;
				}
				else {
					q.link = p.link;
				}

				System.out.println(p.data.getNo() +"  삭제");
				return;
			}
			else { // 순회
				q = p;
				p = p.link;
			}
		}
		System.out.println("삭제 실패");
	}
	
	public void Show() { // 전체 리스트를 순서대로 출력한다.
		Node p = first;
		if(p == null) System.out.println("데이터 없음");
		else {
			while(p != null) {
				System.out.print(p.data.getNo() + " -> ");
				p = p.link;
			}
		}System.out.println();
	}
	
	//임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다 
	public void Add(SimpleObjectInt element) {
		Node newNode = new Node(element);
		
		Node p = first, q = null;

		if(p == null) { // first null
			first = newNode;
			return;
		}

		while(p != null) { // fitst not null
			// p < newNode && p.link == null
			if(p.link == null && p.data.getNo() < newNode.data.getNo()) {
				p.link = newNode;
			}
			// p > newNode : check q
			else if(p.data.getNo() > newNode.data.getNo()){
				// p == head
				if(q == null) {
					first = newNode;
					first.link = p;
					return;
				}
				if(q.data.getNo() < newNode.data.getNo()) {
					newNode.link = p;
					q.link = newNode;
				}
			}
			// p < newNode && p.link != null
			q = p;
			p = p.link;
		}
		System.out.println(element.getNo() +" 저장");
	}
	
	public boolean Search(SimpleObjectInt data) { // 회원 번호 검색
		Node p = first;
		while(p != null) {
			if(data.getNo() == p.data.getNo())
				return true;
			p = p.link;
		}
		return false;
	}
}

public class Test_SimpleObjectIntList {

	enum Menu {
		   Add( "삽입"),
		   Delete( "삭제"),
		   Show( "인쇄"),
		   Search( "검색"),
		   Exit( "종료");

		   private final String message;                // 표시할 문자열

		   static Menu MenuAt(int idx) {                // 순서가 idx번째인 열거를 반환
			   for (Menu m : Menu.values())
				   if (m.ordinal() == idx)
					   return m;
			   return null;
		   }
		   
		   // 생성자(constructor)
		   Menu(String string) { message = string; }
		   
		   // 표시할 문자열을 반환
		   String getMessage() { return message; }
	   }

	   //--- 메뉴 선택 ---//
	   static Menu SelectMenu() {
		   Scanner sc = new Scanner(System.in);
		   int key;
		   System.out.println();
		   do {
			   for (Menu m : Menu.values()) {
				   System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				   if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					   System.out.println();
			   }
			   System.out.print(" : ");
			   key = sc.nextInt();
		   } while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		   return Menu.MenuAt(key);
	   }


   public static void main(String[] args) {
	  Menu menu;                                // 메뉴
	  System.out.println("Linked List");
	  LinkedListInt l = new LinkedListInt();
	  Scanner sc = new Scanner(System.in);
	  SimpleObjectInt data = null;
	  System.out.println("inserted");
	  l.Show();		
	  
	  do {
		  switch (menu = SelectMenu()) {	             
				  case Add :				// 머리노드 삽입
					  data = new SimpleObjectInt();
					  if(l.first == null)
						   data.scanData("머리에 삽입", SimpleObjectInt.NO);
					  else data.scanData("꼬리에 삽입", SimpleObjectInt.NO);
					  l.Add(data);
					  break;
				case Delete :			// 머리 노드 삭제
					data = new SimpleObjectInt();
					data.scanData("삭제", SimpleObjectInt.NO);
					l.Delete(data);
					break;
				case Show :			// 꼬리 노드 삭제
					l.Show();
					break;
				case Search :			// 회원 번호 검색
					data = new SimpleObjectInt();
					data.scanData("검색", SimpleObjectInt.NO);
					boolean result = l.Search(data);
					if (result == false) System.out.println("검색 값 = " + data.getNo() + "데이터가 없습니다.");
					else {
						System.out.print("검색 값 = " + data.getNo() + "데이터가 존재합니다");
					}
					break;
				case Exit : break;			// 꼬리 노드 삭제
					   
			   }
		   } while (menu != Menu.Exit);
	   }
}