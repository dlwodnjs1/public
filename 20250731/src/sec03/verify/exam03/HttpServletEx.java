package sec03.verify.exam03;

abstract class HttpServlet {
	public abstract void service();
}

class LoginServlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("로그인 합니다.");		
	}
	
}

class FileDownloadservlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("파일 다운로드합니다.");		
	}
	
}

public class HttpServletEx {
	
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadservlet());
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
