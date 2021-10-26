package jspproject.ch11;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitialMembers implements ServletContextListener {
	/*  (non Javadoc)
		@see javax.servlet.ServletContextListener#contextDestroyed(javax.serlet)
	*/
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}
	/*  (non Javadoc)
		@see javax.servlet.ServletContextListener#contextInitialized(javax.serlet)
	*/
	@Override
	public void contextInitialized(ServletContextEvent arg0) { // 초기화 데이터는 이곳에서 기술함
		// TODO Auto-generated method stub
		ServletContext context = arg0.getServletContext();
		ArrayList<Member> datas = new ArrayList<Member>();
		
		// JSTL 예제를 위해 0~4 까지의 샘플 데이터를 생성
		for(int i=0; i<5; i++) {
			Member data = new Member("두원이"+i, "test"+i+"@test.net");
			datas.add(data);
		}
		// email이 빠진 2개 샘플 데이터 추가
		datas.add(new Member("갑순이",null));
		datas.add(new Member("갑순이",null));
		// 기본 생성자를 이용한 2개의 샘플 데이터 추가
		datas.add(newMember());
		datas.add(newMember());
		// application scope 에 members 및 member 객체 저장
		// 6개의 자료를 갖는 datas를 이용하여 만든 members
		context.setAttribute("members", datas);
		// 기본 생성자를 이용("홍길동", "test@test.net")하여 만든 member
		context.setAttribute("member", new Member());
	}
}
